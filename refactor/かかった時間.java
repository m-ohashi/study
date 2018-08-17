package random.refactor;

import java.util.concurrent.TimeUnit;

public class かかった時間 implements Comparable<かかった時間> {

    private final Long value;

    public かかった時間(Long start, Long end) {
        this.value = TimeUnit.MILLISECONDS.toSeconds(end - start);
    }

    public void 表示する(){
        System.out.println("かかった時間:" + value + "秒");
    }


    @Override
    public int compareTo(かかった時間 o) {
        return this.value - o.value;
    }
}
