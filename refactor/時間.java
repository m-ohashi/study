package random.refactor;

import java.util.concurrent.TimeUnit;

public class 時間 {
    private final Long value;

    public 時間() {
        this.value = System.currentTimeMillis();
    }

    public かかった時間 かかった時間を計算する(時間 時間) {
        if(value - 時間.value < 0) {
            throw new RuntimeException("計算できません");
        }
        return new かかった時間(TimeUnit.MILLISECONDS.toSeconds(value - 時間.value));
    }

}
