package calculator;

public class Calculator {
	
	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 6;
		int num3 = 12;
		System.out.println(calcMultiply(num1, num2, num3));
		System.out.println(calcAddition(num1, num2, num3));		
		System.out.println(calcDivide(num1, num2, num3));
		System.out.println(calcSub(num1, num2, num3));
	}
	
	public static String calcAddition(int num1, int num2, int num3) {
		String addition = "";
		if (num1 + num2 == num3) {
			addition =addition.valueOf(num1 + "+" + num2 + "=" + num3);		
		}
		
		else if(num2 + num3 == num1) {
			addition =addition.valueOf(num2 + "+" + num3 + "=" + num1);
		
		}
		
		else if(num3 + num1 == num2) {
			addition =addition.valueOf(num3 + "+" + num1 + "=" + num2);
			
		}
		
		return addition;
	}

	
	public static String calcMultiply(int num1, int num2, int num3) {
		String multiply = "";
		if (num1 * num2 == num3) {
			multiply =multiply.valueOf(num1 + "*" + num2 + "=" + num3);		
		}
		
		else if(num2 * num3 == num1) {
			multiply =multiply.valueOf(num2 + "*" + num3 + "=" + num1);
		
		}
		
		else if(num3 * num1 == num2) {
			multiply =multiply.valueOf(num3 + "*" + num1 + "=" + num2);
			
		}
		
		return multiply;
	}
	
	public static String calcDivide(int num1, int num2, int num3) {
		String divide = "";
		if (num1 / num2 == num3) {
			String divide1=";"
			divide1 =divide.valueOf(num1 + "/" + num2 + "=" + num3);
		}
		
		else if(num2 / num3 == num1) {
			String divide2="";
			divide2 =divide.valueOf(num2 + "/" + num3 + "=" + num1);
		}
		
		else if(num3 / num1 == num2) {
			String divide3="";
			divide3 =divide.valueOf(num3 + "/" + num1 + "=" + num2);
			
		}
		
		else if(num3 / num2 == num1) {
			String divide4="";
			divide4 = divide.valueOf(num3 + "/" + num2 + "=" + num1);
		}
		divide = divide1,
		return divide;
	}
	
	public static String calcSub(int num1, int num2, int num3) {
		String sub = "";
		if (num1 - num2 == num3) {
			sub =sub.valueOf(num1 + "-" + num2 + "=" + num3);		
		}
		
		else if(num2 - num3 == num1) {
			sub =sub.valueOf(num2 + "-" + num3 + "=" + num1);
		
		}
		
		else if(num3 - num1 == num2) {
			sub =sub.valueOf(num3 + "-" + num1 + "=" + num2);
			
		}
		
		return sub;
	}


}

