package lineoops;

import java.util.Scanner;

public class CreatingLine {

	Scanner s = new Scanner(System.in);

	int x = s.nextInt();
	int y = s.nextInt();
	int a = s.nextInt();
	int b = s.nextInt();

	double lengthOfPoints() {
		System.out.print("(" + x + "," + y + ")");
		System.out.println("(" + a + "," + b + ")");
		double l;
		l = Math.sqrt((int) Math.pow((a - x), 2) + (int) Math.pow((b - y), 2));
		return l;
	}

	public static void main(String[] args) {
		CreatingLine uc1 = new CreatingLine();
		System.out.println("Length is: " + uc1.lengthOfPoints());
	}
}
