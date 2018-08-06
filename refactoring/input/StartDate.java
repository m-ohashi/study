package time_check.refactoring.input;

import java.time.LocalTime;

public class StartDate {

    private final LocalTime value;

    public  StartDate(int hour, int minute) {
        TimeValidation.validate(hour, minute);
        if(hour == 24) {
            hour = 0;
        }
        this.value = LocalTime.of(hour, minute);
    }

    public LocalTime getValue() {
        return value;
    }

    public boolean isEqual(EndDate endDate) {
        return value.equals(endDate);
    }

    public boolean isBefore(EndDate endDate) {
        return value.isBefore(endDate.getValue());
    }
}
