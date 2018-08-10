package random.refactor;

import random.refactor.input.UserName;
import random.refactor.input.ランダムな文字列;
import random.refactor.input.入力された文字列;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Boolean loop = false;
        List<List<String>> ranking = new ArrayList<>();
        do {
            //ユーザー名を入力する
            Scanner userNameInput = new Scanner(System.in);
            System.out.println("ユーザー名を入力してください >");
            UserName userName = new UserName(userNameInput.nextLine());
//            Pattern pattern = Pattern.compile("^[0-9a-zA-Z]+$");
//            Matcher matcher = pattern.matcher(userName);
//            if (!matcher.find() || userName.length() > 10) {
//                throw new RuntimeException("ユーザー名は英数字10文字以内で入力してください" + userName);
//            }

            //ランダムな文字列を表示する
            ランダムな文字列 ランダムな文字列 = new ランダムな文字列();
            ランダムな文字列.表示する();

            //入力を受け取る
            Long start = System.currentTimeMillis();
            Scanner scanner = new Scanner(System.in);
            System.out.println("入力してください >");
            入力された文字列 入力された文字列 = new 入力された文字列(scanner.nextLine());
            Long end = System.currentTimeMillis();
            Long time = TimeUnit.MILLISECONDS.toSeconds(end - start);

            //入力の正誤判断をする
            List<String> dateAndTimeAndUserName = new ArrayList<>();
            if (ランダムな文字列.判定する(入力された文字列)) {
                //正しい場合タイムを表示する
                //入力が正しいか判定する
                System.out.println("かかった時間" + time + "秒");
                //順位・達成日時・タイム・ユーザー名を記録する
                dateAndTimeAndUserName = Arrays.asList(
                        LocalDateTime.now().toString(),
                        time.toString(),
                        userName.getValue()
                );
            } else {
                //間違っている場合残念表示する
                System.out.println("残念");
            }

            Scanner loopInputScanner = new Scanner(System.in);
            System.out.println("続けますか？ はい:y, いいえ:n >");
            String loopInput = loopInputScanner.nextLine();
            loop = loopInput.equals("y");

            dateAndTimeAndUserName.forEach(System.out::println);
            //順位を表示する
            AtomicInteger i = new AtomicInteger();
            if (dateAndTimeAndUserName.isEmpty()) {
                ranking.sort(Comparator.comparing(a -> a.get(1)));
                ranking.forEach(v -> System.out.println(String.valueOf(i.getAndIncrement() + 1) + ":" + v));
            } else {
                ranking.add(dateAndTimeAndUserName);
                ranking.sort(Comparator.comparing(a -> Long.parseLong(a.get(1))));
                ranking.forEach(v -> System.out.println(String.valueOf(i.getAndIncrement() + 1) + ":" + v));
            }
        } while (loop);
    }
}
