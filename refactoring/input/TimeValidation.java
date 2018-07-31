package time_check.refactoring.input;

public class TimeValidation {

    public static void validate(int hour, int minute){
        if( !(isValidationForHour(hour)|| isValidationForMinute(minute))) {
            throw new RuntimeException("時間の形式がおかしいです");
        }

    }

    private static boolean isValidationForHour(int hour) {
        return 0 <= hour || hour < 24;
    }

    private static boolean isValidationForMinute(int minute) {
        return 0 <= minute  || minute < 60;
    }
}
