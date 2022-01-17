package jp.ac.uryukyu.ie.e215759;

import java.rmi.Naming;
import java.util.Scanner;

/**
 * このクラスはプレイヤーとロボットがジャンケンをするために作ったクラス。
 * 基本的に必要なメソッドはここのクラスに記述されている。
 */
public class Janken {
    /**
     * このメソッドは最初に実行されるメソッドで、ロボットと自己紹介する。
     */
    public static void start() {
        System.out.println("ロボット「僕はジャンケンロボット！君の名前を教えて！」");
        String PlayerName = new java.util.Scanner(System.in).nextLine();
        System.out.println("ロボット「よろしくね！" + PlayerName + "さん！」");
    }

    /**
     * このメソッドはロボット側がジャンケンで何出すのかを決めるメソッド。
     * @return jankenOfRobotto ロボットがジャンケンで出す手。
     */
    public static String jankenOfRobotto() {
        String[] kindOfJanken = {"グー", "チョキ", "パー"};
        int num = new java.util.Random().nextInt(3);
        String jankenOfRobotto = kindOfJanken[num];
        return jankenOfRobotto;
    }

    /**
     * このメソッドはプレイヤー側がジャンケンで何出すのかを決めるメソッド。
     * @return jankenOfPlayer プレイヤーがジャンケンで出す手。
     */
    public static String jankenOfPlayer() {
        System.out.println("ロボット「それでは勝負だ！最初はグー！ジャンケン...」");
        String[] kindOfJanken = {"グー", "チョキ", "パー"};
        System.out.println("何を出しますか？ \n1:グー \n2:チョキ \n3:パー");
        int imput = new java.util.Scanner(System.in).nextInt();
        String jankenOfPlayer = kindOfJanken[imput - 1];
        return jankenOfPlayer;
    }

    /**
     * このメソッドが実際にジャンケンをして結果を出力してくれるメソッド。
     */
    public static void match() {
        String result;
        String jankenOfRobotto = jankenOfRobotto();
        String jankenOfPlayer = jankenOfPlayer();
        System.out.println("ロボット「ポン！！！」 \nロボット：" + jankenOfRobotto + "\nあなた：" + jankenOfPlayer);
        switch (jankenOfRobotto) {
            case "グー":
                if (jankenOfPlayer == "グー") {
                    System.out.println("あいこです！");
                    result = "あいこ";
                } else if (jankenOfPlayer == "チョキ"){
                    System.out.println("あなたの負けです！");
                    result = "負け";
                } else {
                    System.out.println("あなたの勝ちです！");
                    result = "勝ち";
                }
                break;
            case "チョキ":
                if (jankenOfPlayer == "グー") {
                    System.out.println("あなたの勝ちです！");
                    result = "勝ち";
                } else if (jankenOfPlayer == "チョキ"){
                    System.out.println("あいこです！");
                    result = "あいこ";
                } else {
                    System.out.println("あなたの負けです！");
                    result = "負け";
                }
                break;
            case "パー":
                if (jankenOfPlayer == "グー") {
                    System.out.println("あなたの負けです！");
                    result = "負け";
                } else if (jankenOfPlayer == "チョキ"){
                    System.out.println("あなたの勝ちです！");
                    result = "勝ち";
                } else {
                    System.out.println("あいこです！");
                    result = "あいこ";
                }
                break;
        }
    }
}
