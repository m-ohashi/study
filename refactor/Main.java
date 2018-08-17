package random.refactor;

import random.refactor.input.UserName;
import random.refactor.input.文字列;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boolean loop = false;
        正しかった人の記録 正しかった人の記録 = new 正しかった人の記録();
        do {
            //ユーザー名を入力する
            Scanner userNameInput = new Scanner(System.in);
            System.out.println("ユーザー名を入力してください >");
            UserName userName = new UserName(userNameInput.nextLine());

//            ランダムな文字列.順位を表示する();
            文字列 文字列 = new 文字列();
            文字列.表示する();

            //入力を受け取る
            Long start = System.currentTimeMillis();
            Scanner scanner = new Scanner(System.in);
            System.out.println("入力してください >");
            文字列 input = new 文字列(scanner.nextLine());
            Long end = System.currentTimeMillis();

            かかった時間 かかった時間 = new かかった時間(start,end);

            //入力の正誤判断をする
            if (文字列.判定する(input)) {
                //正しい場合タイムを表示する
                かかった時間.表示する();

                //順位・達成日時・タイム・ユーザー名を記録する
                記録するもの 記録するもの = new 記録するもの(かかった時間,userName);
                //ランキングに追加する
                正しかった人の記録.登録する(記録するもの);
            } else {
                //間違っている場合残念表示する
                System.out.println("残念");
            }


            Scanner loopInputScanner = new Scanner(System.in);
            System.out.println("続けますか？ はい:y, いいえ:n >");
            String loopInput = loopInputScanner.nextLine();
            loop = loopInput.equals("y");

            //順位を表示する
            正しかった人の記録.順位を表示する();
        } while (loop);
    }
}
