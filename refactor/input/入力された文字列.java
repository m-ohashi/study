package random.refactor.input;

public class 入力された文字列 {

    private final String value;

    public 入力された文字列(String value) {
        this.value = value;
    }

    @Deprecated
    public String getValue() {
        return value;
    }
}
