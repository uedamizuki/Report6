package jp.ac.uryukyu.ie.e185719;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

class Janken extends JFrame implements ActionListener {
    String MyHand;
    String EnemyHand;

    /**
     * win_num 勝った回数
     * loose_num 負けた回数
     * draw_num 引き分けの回数
     * janken_num じゃんけんをした回数
     */
    int win_num;
    int loose_num;
    int draw_num;
    int janken_num;

    boolean win = false;
    /**
     * じゃんけんの手を表示
     * 左からグー、チョキ、パーを表示する
     */
    Janken() {
        getContentPane().setLayout(null);

        JButton goo = new JButton("グー");
        goo.setFont(new Font("SansSerif", Font.ITALIC, 20));
        goo.setBounds(100, 50, 100, 50);
        goo.addActionListener(this);
        getContentPane().add(goo);

        JButton choki = new JButton("チョキ");
        choki.setFont(new Font("SansSerif", Font.ITALIC, 20));
        choki.setBounds(250, 50, 100, 50);
        choki.addActionListener(this);
        getContentPane().add(choki);

        JButton par = new JButton("パー");
        par.setFont(new Font("SansSerif", Font.ITALIC, 20));
        par.setBounds(400, 50, 100, 50);
        par.addActionListener(this);
        getContentPane().add(par);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("最初はグー、じゃんけんぽん");
        setSize(600, 200);
        setVisible(true);
    }

    /**
     * ボタンを押された時に処理する内容
     * @param e　ボタンの
     */
    public void actionPerformed(ActionEvent e) {
        setTitle("じゃんけんぽん");
        System.out.println(getLabel());

        MyHand = ((JButton)e.getSource()).getText();
        System.out.println(MyHand);

        Enemy();
        Jagement();
        if(win == true) {
            new SampleApp().setVisible(true);
            win = false;
            //new SampleApp().setVisible(false);
        }

        System.out.println("今　"+janken_num+"回勝負しています");
        System.out.println("ただいまの勝利回数　"+win_num+"回");
        System.out.println("ただいまの負け回数　"+loose_num+"回");
        System.out.println("ただいまの引き分け回数　"+draw_num+"回");

        //行間を空けるため
        System.out.println("");
    }

    public String getLabel(){
        String label = getTitle();
        return label;
    }

    /**
     * 相手の手をランダムで決める。
     */
    public void Enemy(){
        String[] hands = { "グー", "チョキ", "パー" };
        Random r = new Random();
        EnemyHand = hands[r.nextInt(3)];
        System.out.println(EnemyHand);
    }

    /**
     *
     */
    public void Jagement(){
        janken_num += 1;
        if(MyHand == EnemyHand){
            System.out.println("DRAW");
            draw_num += 1;
        }else if(MyHand == "グー" && EnemyHand == "チョキ") {
            System.out.println("WIN");
            win = true;
            win_num += 1;
        }else if(MyHand == "チョキ" && EnemyHand == "パー") {
            System.out.println("WIN");
            win = true;
            win_num += 1;
        }else if(MyHand == "パー" && EnemyHand == "グー") {
            System.out.println("WIN");
            win_num += 1;
            win = true;
        }else{
            System.out.println("LOOSE");
            loose_num += 1;
        }
    }
}

