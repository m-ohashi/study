package time_check.refactoring.input;

//TODO名前を考える
public class ATime {

    private final StartDate startDate;

    private final EndDate endDate;

    public StartDate getStartDate() {
        return startDate;
    }

    public EndDate getEndDate() {
        return endDate;
    }

    public ATime(StartDate startDate, EndDate endDate) {
        if (endDate.isBefore(startDate)) {
            throw new RuntimeException("終了時刻より開始時刻が前です。");
        }
        this.startDate = startDate;
        this.endDate = endDate;
    }

}
