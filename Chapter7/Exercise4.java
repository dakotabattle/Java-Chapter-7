package Chapter7;

public class Exercise4{

			public static void main(String[] args) {
				factorial(14);
			}
		public static void factorial(int a) 
		{
			int outcome = 1;
			int i = 1;
			
			while(i <= a) 
			{
			outcome *= i;
			i++;
			System.out.println(outcome);
			}
			
			}

	}
