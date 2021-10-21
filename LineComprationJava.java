package lineoops;

import java.util.Scanner;

public class LineComprationJava {
    Scanner s = new Scanner(System.in);
    int x = s.nextInt();
    int y = s.nextInt();
    int a = s.nextInt();
    int b = s.nextInt();
    int X = s.nextInt();
    int Y = s.nextInt();
    int A = s.nextInt();
    int B = s.nextInt();

    double lengthOfPoints1() {
        System.out.print("(" + x + "," + y + ")");
        System.out.println("(" + a + "," + b + ")");
        double l;
        l = Math.sqrt((int) Math.pow((a - x), 2) + (int) Math.pow((b - y), 2));
        return l;
    }

    double lengthOfPoints2() {
        System.out.print("(" + X + "," + Y + ")");
        System.out.println("(" + A + "," + B + ")");
        double l;
        l = Math.sqrt((int) Math.pow((A - X), 2) + (int) Math.pow((B - Y), 2));
        return l;
    }

    public static void main(String[] args) {
    	LineComprationJava uc3 = new LineComprationJava();
        String s1= Double.toString(uc3.lengthOfPoints1());
        System.out.println(s1);
        String s2 =Double.toString(uc3.lengthOfPoints2());
        System.out.println(s2);
        System.out.println(s1.compareTo(s2));

    }
}
