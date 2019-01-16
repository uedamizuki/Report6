package jp.ac.uryukyu.ie.e185719;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Janken extends JFrame implements ActionListener {

    /**
     * じゃんけんの手を表示
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
        System.out.println("ボタンを押下");
    }
}

