package Practice;

public class JumpStatement {
	/*break statement and continue statement*/
	public static void main(String[] args) {
	/*break statement: break the current flow of the program and transfer the control to the next statement
	 outside a loop or switch statement*/	
		for(int i=0; i<=10; i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("Hello");
		/*continue statement: doesn't break the loop, whereas, it skips the specific part of the loop
		 and jumps to the next iteration of the loop*/	
		for(int i=0; i<=10; i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Hello");
		
	}

}
