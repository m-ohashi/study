package time_check.no_refactor;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

//とりあえず書いたほう
public class Main {
    public static void main(String[] args) {
        System.out.println();
        //false
        System.out.println("1" + timeDuplicationCheck(
                Arrays.asList(1, 0, 5, 30),
                Arrays.asList(9, 0, 23, 0)
        ));

        //false
        System.out.println("2" + timeDuplicationCheck(
                Arrays.asList(1, 0, 2, 0),
                Arrays.asList(2, 0, 3, 0)
        ));

        //true
        System.out.println("3" + timeDuplicationCheck(
                Arrays.asList(1, 0, 2, 1),
                Arrays.asList(1, 59, 3, 0)
        ));

        //true
        System.out.println("4" + timeDuplicationCheck(
                Arrays.asList(1, 0, 2, 1),
                Arrays.asList(0, 0, 1, 1)
        ));

        //時刻がおかしいエラー
        timeDuplicationCheck(Arrays.asList(1, 200, 3, 4), Arrays.asList(1, 2, 3, 4));
        timeDuplicationCheck(Arrays.asList(25, 2, 3, 4), Arrays.asList(1, 2, 3, 4));

        //長さが足りないエラー
        timeDuplicationCheck(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3, 4));



    }

    private static boolean timeDuplicationCheck(
            List<Integer> input,
            List<Integer> input2
    ) {
        if (!(input.size() == 4) || !(input2.size() == 4)) {
            throw new RuntimeException("長さが足りない");
        }

        int startTimeHour = input.get(0);
        int startTimeMinute = input.get(1);
        int endTimeHour = input.get(2);
        int endTimeMinute = input.get(3);

        int startTime2Hour = input2.get(0);
        int startTime2Minute = input2.get(1);
        int endTime2Hour = input2.get(2);
        int endTime2Minute = input2.get(3);

        if (0 > startTimeHour || startTimeHour > 24 || 0 > startTimeMinute || startTimeMinute > 59
                || 0 > endTimeHour || endTimeHour > 24 || 0 > endTimeMinute || endTimeMinute > 59
                || 0 > startTime2Hour || startTime2Hour > 24 || 0 > startTime2Minute || startTime2Minute > 59
                || 0 > endTime2Hour || endTime2Hour > 24 || 0 > endTime2Minute || endTime2Minute > 59
                ) {
            throw new RuntimeException("時刻の形式がおかしい");
        }

        LocalTime startTime = LocalTime.of(startTimeHour, startTimeMinute);
        LocalTime endTime = LocalTime.of(endTimeHour, endTimeMinute);
        LocalTime startTime2 = LocalTime.of(startTime2Hour, startTime2Minute);
        LocalTime endTime2 = LocalTime.of(endTime2Hour, endTime2Minute);


        if (startTime.equals(endTime2) || endTime.equals(startTime2)) {
            return false;
        }
        return !(startTime.isAfter(endTime2) || endTime.isBefore(startTime2));
    }
}

