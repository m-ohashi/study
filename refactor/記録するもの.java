package random.refactor;

import random.refactor.input.UserName;

import java.time.LocalDateTime;

//順位・達成日時・タイム・ユーザー名を記録する
public class 記録するもの {

    private final かかった時間 かかった時間;

    public random.refactor.かかった時間 getかかった時間() {
        return かかった時間;
    }

    private final UserName userName;

    private final LocalDateTime localDateTime;

    public 記録するもの(random.refactor.かかった時間 かかった時間, UserName userName) {
        this.かかった時間 = かかった時間;
        this.userName = userName;
        this.localDateTime = LocalDateTime.now();
    }

    public void 表示する(int i){
        System.out.print(i + ":");
        userName.表示する();
        かかった時間.表示する();
        System.out.println(localDateTime);
    }
}
