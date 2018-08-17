package random.refactor.input;

import org.apache.commons.lang3.RandomStringUtils;

public class 文字列 {

    private final String value;

    public 文字列 (){
        this.value = RandomStringUtils.randomAlphanumeric(20);
    }

    public 文字列(String value) {
        this.value = value;
    }

    public void 表示する() {
        System.out.println(this.value);
    }

    public boolean 判定する(文字列 input) {
        return value.equals(input.value);
    }
}
