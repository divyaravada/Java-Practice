package Practice;

public class ConditionalStatement {
	public static void main(String[] args) {
		//if else if
		int a = 25;
		if(a>0) {
		
			System.out.println("Its a positive no.");
		}else if(a==0) {
			System.out.println("Its a neutral no.");
		}
		else {
		System.out.println("Its a negative no.");
		}
		
		
		//Switch case
		int b = 4;
		switch(b) {
		case 1: System.out.println("ur in case 1");
		break;
		case 2: System.out.println("ur in case 2");
		break;
		case 3: System.out.println("ur in case 3");
		break;
		case 4: System.out.println("ur in case 4");
		break;
		default:
			System.out.println("not avalable");
		}
	}

}
