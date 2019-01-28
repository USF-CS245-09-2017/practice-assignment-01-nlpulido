
public class Factorial{

	public int factorial(int n, String type){
		if (type.equals("recursive")){
			return (recursiveFactorial(n));
		}

		if (type.equals("iterative")){
			return (iterativeFactorial(n));
		}
		return 0;
	}

	public int recursiveFactorial(int n){
		if (n <= 1){
			return 1;
		}
		return (n * recursiveFactorial(n - 1));
	}

	public int iterativeFactorial(int n){
		int total = 1;
		for (int i = 1; i <= n; i++){
			total *= i;
		}
		return total;
	}

}