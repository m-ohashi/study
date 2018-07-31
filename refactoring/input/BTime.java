package time_check.refactoring.input;

//TODO名前を考える
public class BTime {

    private final StartDate startDate;

    private final EndDate endDate;

    public BTime(StartDate startDate, EndDate endDate) {
        if (endDate.isBefore(startDate)) {
            throw new RuntimeException("終了時刻より開始時刻が前です。");
        }
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public boolean isBの開始時間とAの終了時間が同じorBの終了時間とAの開始時間が同じ(ATime aTime) {
        return isBの開始時間とAの終了時間が同じ(aTime) || isBの終了時間とAの開始時間が同じ(aTime);
    }

    public boolean isBの開始時間がAの終了時間より前(ATime aTime) {
        return startDate.isBefore(aTime.getEndDate());
    }

    public boolean isBの終了時間はAの開始時間より後(ATime aTime) {
        return endDate.isAfter(aTime.getStartDate());
    }

    private boolean isBの開始時間とAの終了時間が同じ(ATime aTime) {
        return startDate.isEqual(aTime.getEndDate());
    }

    private boolean isBの終了時間とAの開始時間が同じ(ATime aTime) {
        return endDate.isEqual(aTime.getStartDate());
    }

}
