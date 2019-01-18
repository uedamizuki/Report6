package jp.ac.uryukyu.ie.e185719;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JankenTest {

    @Test
    public void EnemyTest(){
        int n = 1;
        int num = 0;
        Janken jkn = new Janken();
        jkn.Enemy();
        if(jkn.getEnemyHand()=="グー" ||jkn.getEnemyHand()=="チョキ"||jkn.getEnemyHand()=="パー"){
            num += 1;
        }

        assertEquals(n,num);
    }
}