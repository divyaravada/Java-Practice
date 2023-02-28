package Practice;

public class LoopingStatement {
	/*execute the block of code repeatedly till the condition gets satisfied(true)*/
	
public static void main(String[] args) {
	
	//while loop
	int i=0;
	while(i<=5) {
		System.out.println("The number is: " +i);
		i++;
	}
	//for loop
	int sum=0;
	for(int j=1; j<=5; j++) {
		sum = j + sum;
	}
	System.out.println("The sum of first 5 natural no's is: " +sum);
	
	//do while
	do {
		System.out.println("The number is not less than 5 : " +i);
		i++;
	}while(i<=5);
}
}
