package main.com;

import java.util.Random;

public class Task6 {

    public static void main(String[] args) {
        Random random = new Random();
        int min1 = 3;
        int max1 = 15;

        int count = random.nextInt(max1-min1+1);

        int min2 = -10;
        int max2 = 35;

        for (int i = 0; i < count; i++) {
            int x = random.nextInt(max2-min2+1);
            x += min2;
            System.out.print(x+" ");
        }

    }

}

