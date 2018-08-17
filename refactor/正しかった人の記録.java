package random.refactor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class 正しかった人の記録 {
    private final List<記録するもの> value = new ArrayList<>();

    public void 登録する(記録するもの 記録するもの) {
        value.add(記録するもの);
    }

    public void 順位を表示する(){
        AtomicInteger i = new AtomicInteger();
        順位をつける().forEach(v -> v.表示する(i.getAndIncrement() + 1));
//        value.forEach(v -> System.out.println(String.valueOf(i.getAndIncrement() + 1) + ":" + v));

    }

    private List<記録するもの> 順位をつける(){
        value.sort(Comparator.comparing(記録するもの::getかかった時間));
        return value;
    }

}
