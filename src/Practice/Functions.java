package Practice;
import java.util.Scanner;

public class Functions {
	/*A function is a block of code which only perform certain actions. 2types; pre & user defined
	 */
	static int printAdd(int x, int y) {
		System.out.println("The sume is: " +(x+y));
		return x+y;
	}
public static void main(String[] args) {
	int a= 10, b=20;
	printAdd(a,b);
	//scanner
	System.out.println("Enter your inputs c & d :");
	Scanner sc= new Scanner(System.in);
	int c=sc.nextInt(), d=sc.nextInt();

	
	printAdd(c,d);
}

}
