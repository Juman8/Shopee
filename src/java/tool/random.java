/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tool;

import java.util.Random;

/**
 *
 * @author HP
 */
public class random {

    Random r = new Random();

    public int random() {
        int value = 0;
        for (int i = 500000; i < 10000000; i++) {
            value = r.nextInt(i);
            break;
        }
        return value;
    }

    public static void main(String[] args) {
        System.out.println(new random().random());
    }
}
