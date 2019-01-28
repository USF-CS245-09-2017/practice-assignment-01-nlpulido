
public class Fibonacci{
	
	public int fibonacci(int n, String type){
		if (type.equals("recursive")){
			return fibonacciRecursive(n);
		}

		if (type.equals("iterative")){
			return fibonacciIterative(n);
		}
		return 0;
	}

	public int fibonacciRecursive(int n){
		if (n == 0){
			return 0;
		} else if (n == 1){
			return 1;
		}
		return (fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2));
	}

	public int fibonacciIterative(int n){
		int prev = 0;
		int b = 1;
		int result = 0;		

		if (n <= 1){
			return n;
		}

		for (int i = 1; i < n; i++){
			result = b + prev;
			prev = b;
			b = result;
		}

		return result;
	}
}