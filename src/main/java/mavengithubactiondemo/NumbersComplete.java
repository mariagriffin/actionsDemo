package mavengithubactiondemo;

public class NumbersComplete {

	//1
	public static int sum(int num1, int num2){
		int result;
		result = num1 + num2;
		return result;
	}
	
	public static int subtract(int num1, int num2){
		int result;
		result = num1 - num2;
		return result;
	}

	public static int multiply(int num1, int num2){
		return num1 * num2;
	}

	public static int divide(int num1, int num2){ 
		return num1 / num2;
	}
	
	public static int largest(int num1, int num2){
		if (num1 > num2)
			return num1;
		else
			return num2;
	}

	public static int smallest(int num1, int num2){
		if (num1 < num2)
			return num1;
		else
			return num2;
	}
	
	public static void main(String[] args) {
		// TODO
	}

}
