package Practice;

public class Operators {
	public static void main(String[] args) {
		/* arithmetic operators
		 + *  - / % 
		 binary operators
		*/ 
		int a = 9, b = 8;
		float c = a/b;
		System.out.println(a+b); //17
		System.out.println(a-b); //1
		System.out.println(a*b); //72
		System.out.println(c); //1.0 Quotient
		System.out.println(a%b); //1 remainder
		
		/* arithmetic operators
		 - + ++ -- ~() !()
		 unary operators
		*/ 
		int d = 9,e= 2,f=-50;
		boolean g=true;		
		System.out.println(d++); //post increment result is 9 
		System.out.println(d); //10
		System.out.println(d--); //post decrement result is 10
		System.out.println(++d); // pre-increment result is 10 
		System.out.println(--d); // pre-decrement result is 9
		System.out.println(-f); //-9
		System.out.println(!g); /*not operator returns
		boolean value so result is false*/		
		System.out.println(~e); //complement 2 -(2+1) = -3
		
		
		//shift Operator
		
		int h =10;		
		System.out.println(h << 2); //10 = 001010 --> left side 2 means 001010 00= 40 or 10*2^2=10*4=40
		System.out.println(h>>2); //10 = 001010 --> right side 2 means 000010 = 2		or 10/2^2=10/4=2
		System.out.println(h>>>2); //10 = 001010 --> right side 2 means 000010 = 2
		
		int i =-10;		
		System.out.println(i << 2); //10 = 001010 --> left side 2 means 001010 00= 40 or 10*2^2=10*4=40
		System.out.println(i>>2); //10 = 001010 --> right side 2 means 000010 = 2		or 10/2^2=10/4=2
	
		//relational operator
		int j=10, k=5,l=2,m=3;
		System.out.println(j >= k); //true
		System.out.println(j == l); //false
		System.out.println(j != m); //true
		System.out.println(k < l); //false
		
		//Assignment operator
				int n,o;
				System.out.println(n=5); //5
				System.out.println(n+=1); //n = n+1=5+1=6
				System.out.println(n*=3); //n = n*3=6*3=18
				System.out.println(k < l); //false
				System.out.println(o=1); //5
				System.out.println(o&=2); //o =o&2
		
				//logical operator
				int p = 10, q = 5, r = 3;
				System.out.println(p>q && p<r); //true & false = false
				System.out.println(p>q || p<r); //true or false = true				

				//bitwise operator
				System.out.println(p|r); //1010 0011=1011=11
				System.out.println(p&r); //1010 0011=0010=2
				//bitwise operator and logical operator
				System.out.println(p<q && p++ >q); //false true = false
				System.out.println(p);//10
				System.out.println(p<q & p++ >q); //false true = false
				System.out.println(p);//11
				//bitwise operator and logical operator || or |
				System.out.println(p>q || p++ <q); //true false = true
				System.out.println(p);//10
				System.out.println(p>q | p++ <q); // true false= true
				System.out.println(p);//11
				/*
				 Bitwise XOR(^) This operator is a binary operator, denoted by '^'. corresponding
				 bits are different, it gives 1 else it gives 0.
				 
				 Bitwise complement (~) This operator is unary operator, denoted by ~ . it returns 
				 the one's complement representation of the input value, i.e., it makes every 0 to 1, 
				 and every 1 to 0
				 */
				
				//ternary Operator
				int s=26, t=24;
				int max=(s>t)?s:t;
				System.out.println(max);
				
		}

	}


