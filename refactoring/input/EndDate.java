package time_check.refactoring.input;

import java.time.LocalTime;

public class EndDate {

    private final LocalTime value;

    public EndDate(int hour, int minute) {
        TimeValidation.validate(hour, minute);
        if(hour == 24) {
            hour = 0;
        }
        this.value = LocalTime.of(hour, minute);
    }

    public LocalTime getValue() {
        return value;
    }

    public boolean isEqual(StartDate startDate) {
        return value.equals(startDate.getValue());
    }

    public boolean isBefore(StartDate startDate){
        return value.isBefore(startDate.getValue());
    }

    public boolean isAfter(StartDate startDate){
        return value.isAfter(startDate.getValue());
    }

}
