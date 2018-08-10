package random.refactor.input;

public class 文字列判定に使うもの {

    private final ランダムな文字列 ランダムな文字列;

    private final 入力された文字列 入力された文字列;

    public 文字列判定に使うもの(ランダムな文字列 ランダムな文字列, 入力された文字列 入力された文字列) {
        this.ランダムな文字列 = ランダムな文字列;
        this.入力された文字列 = 入力された文字列;
    }

    public boolean 判定する() {
        return ランダムな文字列.判定する(入力された文字列);
    }

}
