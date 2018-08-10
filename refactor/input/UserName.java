package random.refactor.input;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserName {

    private final String value;

    public UserName(String value) {
        if(!(英数字である(value) && 十文字以内である(value))) {
            throw new RuntimeException("ユーザー名は英数字10文字以内で入力してください" + value);
        }
        this.value = value;
    }

    private boolean 英数字である(String value){
        Pattern pattern = Pattern.compile("^[0-9a-zA-Z]+$");
        Matcher matcher = pattern.matcher(value);
        return matcher.find();
    }

    private boolean 十文字以内である(String value){
        return value.length() <= 10;
    }

    @Deprecated
    public String getValue() {
        return value;
    }
}
