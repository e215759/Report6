package jp.ac.uryukyu.ie.e215759;

import java.rmi.Naming;
import java.util.Scanner;

public class Janken {
    String robottoOfJanken;
    String playerOfJanken;
    String result;

    public static String start() {
        System.out.println("ロボット「僕はジャンケンロボット！君の名前を教えて！」");
        String PlayerName = new java.util.Scanner(System.in).nextLine();
        System.out.println("ロボット「よろしくね！" + PlayerName + "さん！」");
        return PlayerName;
    }

    public static String jankenOfJanken() {
        String[] kindOfJanken = {"グー", "チョキ", "パー"};
        int num = new java.util.Random().nextInt(3);
        String robottoOfJanken = kindOfJanken[num];
        return robottoOfJanken;
    }

    public static String playerOfJanken() {
        System.out.println("ロボット「それでは勝負だ！最初はグー！ジャンケン...」");
        String[] kindOfJanken = {"グー", "チョキ", "パー"};
        System.out.println("何を出しますか？ \n1:グー \n2:チョキ \n3:パー");
        int imput = new java.util.Scanner(System.in).nextInt();
        String playerOfJanken = kindOfJanken[imput - 1];
        return playerOfJanken;
    }

    public static void match() {
        String result;
        String robottoOfJanken = jankenOfJanken();
        String playerOfJanken = playerOfJanken();
        System.out.println("ロボット「ポン！！！」 \nロボット：" +robottoOfJanken + "\nあなた：" + playerOfJanken);
        switch (robottoOfJanken) {
            case "グー":
                if (playerOfJanken == "グー") {
                    System.out.println("あいこです！");
                    result = "あいこ";
                } else if (playerOfJanken == "チョキ"){
                    System.out.println("あなたの負けです！");
                    result = "負け";
                } else {
                    System.out.println("あなたの勝ちです！");
                    result = "勝ち";
                }
                break;
            case "チョキ":
                if (playerOfJanken == "グー") {
                    System.out.println("あなたの勝ちです！");
                    result = "勝ち";
                } else if (playerOfJanken == "チョキ"){
                    System.out.println("あいこです！");
                    result = "あいこ";
                } else {
                    System.out.println("あなたの負けです！");
                    result = "負け";
                }
                break;
            case "パー":
                if (playerOfJanken == "グー") {
                    System.out.println("あなたの負けです！");
                    result = "負け";
                } else if (playerOfJanken == "チョキ"){
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
