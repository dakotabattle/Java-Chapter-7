package Chapter7;

public class Exercise3{

	public static void main(String[] args) {
		// Initiates the power method, and is assigned the parameters.
		System.out.println(power(4.0, 3));
		}		

		//calculates double first to the power of int second
		public static double power(double first, int second) 
		{
int outcome = 1;
		
		// Verifies whether int second is zero, and returns the value of first if so. It'll continue on otherwise.
		if(second == 0) 
		{
			return first;
		// If the program is still running at this point, it multiplies double first by the result while it isn't zero.
		}
		
		else 
		{
		while(second != 0) 
		{
		outcome *= second;
		--second;
		}
		return outcome;		
			}
		
			}	

	}
