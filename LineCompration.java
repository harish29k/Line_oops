package lineoops;

//importing scanner class
import java.util.Scanner;

//creating method
public class LineCompration {
	// creating scanner object
	Scanner s = new Scanner(System.in);
	// creating varables
	int x = s.nextInt();
	int y = s.nextInt();
	int a = s.nextInt();
	int b = s.nextInt();
	int X = s.nextInt();
	int Y = s.nextInt();
	int A = s.nextInt();
	int B = s.nextInt();

	// creating a method
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

	// creating main method
	public static void main(String[] args) {
		// creating class object
		LineCompration uc3 = new LineCompration();
		double o1 = uc3.lengthOfPoints1();
		System.out.println(o1);
		double o2 = uc3.lengthOfPoints2();
		System.out.println(o2);
		if (o1 == o2) {
			System.out.println("both lines are equal");
		} else if (o1 >= o2) {
			System.out.println("line one is grater than line two");
		} else {
			System.out.println("line one is smailler than line two");
		}
	}
}
