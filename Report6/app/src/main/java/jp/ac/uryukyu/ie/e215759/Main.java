package jp.ac.uryukyu.ie.e215759;

public class Main {
    /**
     * このメソッドは基本的にJanken.classのメソッドを呼び出すメソッド。
     * 繰り返しジャンケンをするかどうかを判断するのもこのメソッドに追加した。
     * @param args
     */
    public static void main(String[] args) {
        var janken = new Janken();
        janken.start();
        janken.match();
        System.out.println("ロボット「対戦ありがとう！まだ続ける？」 \n1:続ける \n2:やめる");
        int oneOrTwo = new java.util.Scanner(System.in).nextInt();
        if (oneOrTwo == 1) {
            System.out.println("ロボット「わかった！じゃあ次の勝負行くよ！」");
            janken.match();
        } else {
            System.out.println("ロボット「わかった！対戦ありがとう」");
        }
    }
}
