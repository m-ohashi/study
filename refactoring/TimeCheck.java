package time_check.refactoring;

import time_check.refactoring.input.ATime;
import time_check.refactoring.input.BTime;

public class TimeCheck {
    public static boolean check(ATime aTime, BTime bTime) {

        if (bTime.isBの開始時間とAの終了時間が同じorBの終了時間とAの開始時間が同じ(aTime)) {
            return false;
        }
        return (bTime.isBの開始時間がAの終了時間より前(aTime))
                && (bTime.isBの終了時間はAの開始時間より後(aTime));
    }
}
