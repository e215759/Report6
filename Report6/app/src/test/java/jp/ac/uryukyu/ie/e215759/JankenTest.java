package jp.ac.uryukyu.ie.e215759;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JankenTest {
    @Test
    String jankenOfRobotto() {
        String[] kindOfJanken = {"グー", "チョキ", "パー"};
        int num = new java.util.Random().nextInt(3);
        String jankenOfRobotto = kindOfJanken[num];
        assertEquals(kindOfJanken[num], jankenOfRobotto);
        boolean possible;
        if (jankenOfRobotto == "グー" || jankenOfRobotto == "チョキ" || jankenOfRobotto == "パー") {
            possible = true;
        } else {
            possible = false;
        }
        return jankenOfRobotto;
    }

    @Test
    String jankenOfPlayer() {
        System.out.println("ロボット「それでは勝負だ！最初はグー！ジャンケン...」");
        String[] kindOfJanken = {"グー", "チョキ", "パー"};
        System.out.println("何を出しますか？ \n1:グー \n2:チョキ \n3:パー");
        int imput = new java.util.Scanner(System.in).nextInt();
        String jankenOfPlayer = kindOfJanken[imput - 1];
        assertEquals(kindOfJanken, jankenOfPlayer);
        boolean possible;
        if (jankenOfPlayer == "グー" || jankenOfPlayer == "チョキ" || jankenOfPlayer == "パー") {
            possible = true;
        } else {
            possible = false;
        }
        return jankenOfPlayer;
    }
}
