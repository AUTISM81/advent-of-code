import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.Math.round;

public class day1 {
    public static void main(String[] args) {
        Scanner in = null;
        try {
            in = new Scanner(new File("inputs/input2.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int totalfuel = 0;
            for (int i = 0; i <= 99; i++) {
                int mass = in.nextInt();
                int fuel = mass / 3;
                Math.round(fuel);
                fuel = fuel - 2;
                System.out.println(fuel);
                totalfuel += fuel;

                for (int x = fuel; x >= 0; ) {
                    fuel = fuel / 3;
                    Math.round(fuel);
                    fuel -= 2;
                    if (fuel >= 0) {
                        totalfuel += fuel;
                        System.out.println(fuel);
                    }
                    x = fuel;
                }
            }
        System.out.println(totalfuel);
        }
}
