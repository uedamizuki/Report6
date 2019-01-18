package jp.ac.uryukyu.ie.e185719;

import java.awt.*;
import java.awt.event.*;

/**
 * 画像を表示するためのクラス
 */
public class SampleApp extends Frame {
    Image img;

    public SampleApp(){
        this.setSize(new Dimension(750,1000));
        this.addWindowListener(new WindowMyAdapter());
        img = Toolkit.getDefaultToolkit().getImage("remchan.jpg");
    }

    public void paint(Graphics g){
        if (img != null){
            g.drawImage(img,-50,-50,this);
        }
    }

    class WindowMyAdapter extends WindowAdapter {

        public void windowClosing(WindowEvent arg0) {
            System.exit(0);
        }
    }
}
