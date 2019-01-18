package jp.ac.uryukyu.ie.e185719;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

class Janken extends JFrame implements ActionListener {
    String MyHand;
    String EnemyHand;

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
        setTitle("JButtonを使ってボタンを表示");
        setSize(600, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        MyHand = ((JButton)e.getSource()).getText();
        System.out.println(MyHand);

        Enemy();
        Jagement();
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

    public void Jagement(){
        if(MyHand == EnemyHand){
            System.out.println("DRAW");
        }else if(MyHand == "グー" && EnemyHand == "チョキ") {
            System.out.println("WIN");
        }else if(MyHand == "チョキ" && EnemyHand == "パー") {
            System.out.println("WIN");
        }else if(MyHand == "パー" && EnemyHand == "グー") {
            System.out.println("WIN");
        }else{
            System.out.println("LOOSE");
        }
    }
}

