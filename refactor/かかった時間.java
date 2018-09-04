package random.refactor;

public class かかった時間 implements Comparable<かかった時間> {

    private final Long value;

    public かかった時間(Long value) {
        this.value = value;
    }

    public void 表示する(){
        System.out.println("かかった時間:" + value + "秒");
    }


    @Override
    public int compareTo(かかった時間 o) {
        return (int) (this.value - o.value);
    }
}
