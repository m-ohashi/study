package random.refactor.input;

import org.apache.commons.lang3.RandomStringUtils;

public class ランダムな文字列 {

    private final String value = RandomStringUtils.randomAlphanumeric(20);

    public void 表示する() {
        System.out.println(this.value);
    }

    public boolean 判定する(入力された文字列 入力された文字列) {
        return value.equals(入力された文字列.getValue());
    }
}
