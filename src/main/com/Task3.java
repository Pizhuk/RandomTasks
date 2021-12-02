package main.com;

import java.util.Random;

public class Task3 {

    public static void main(String[] args) {
        int min = 0;
        int max = 10;

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int x = random.nextInt(max-min+1);
            x += min;
            System.out.print(x+" ");
        }
    }

}

