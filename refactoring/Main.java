package time_check.refactoring;

import time_check.refactoring.input.ATime;
import time_check.refactoring.input.BTime;
import time_check.refactoring.input.EndDate;
import time_check.refactoring.input.StartDate;

//リファクタしたほう
public class Main {
    public static void main(String[] args) {

        //false
        System.out.println(
                TimeCheck.check(
                        new ATime(
                                new StartDate(1, 0),
                                new EndDate(5, 30)
                        ),
                        new BTime(
                                new StartDate(9, 0),
                                new EndDate(23, 0)
                        )
                )
        );

        //true
        System.out.println(
                TimeCheck.check(
                        new ATime(
                                new StartDate(1, 0),
                                new EndDate(2, 1)
                        ),
                        new BTime(
                                new StartDate(1, 59),
                                new EndDate(3, 0)
                        )
                )
        );

        //時間がかぶるからfalse
        System.out.println(
                TimeCheck.check(
                        new ATime(
                                new StartDate(1, 0),
                                new EndDate(2, 0)
                        ),
                        new BTime(
                                new StartDate(2, 0),
                                new EndDate(3, 0)
                        )
                )
        );
    }
}
