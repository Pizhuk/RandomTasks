package main.com;

import java.util.Random;

public class Task4 {

    public static void main(String[] args) {
        int min = 20;
        int max = 50;

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int x = random.nextInt(max-min+1);
            x += min;
            System.out.print(x+" ");
        }

    }

}

