package lineoops;
//importing scanner class
import java.util.Scanner;
//creating class
public class CreatingLine {
       //initiaton of scanner object
	Scanner s = new Scanner(System.in);
      //initiating varables
	int x = s.nextInt();
	int y = s.nextInt();
	int a = s.nextInt();
	int b = s.nextInt();
    //creating method
	double lengthOfPoints() {
		System.out.print("(" + x + "," + y + ")");
		System.out.println("(" + a + "," + b + ")");
		double l;
		l = Math.sqrt((int) Math.pow((a - x), 2) + (int) Math.pow((b - y), 2));
		return l;
	}
        //creating main methid
    	public static void main(String[] args) {
		//creating class object
		CreatingLine uc1 = new CreatingLine();
		//calling method and printing method results
		System.out.println("Length is: " + uc1.lengthOfPoints());
	}
}
