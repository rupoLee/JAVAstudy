package ex02;

public class O4_NaN_infinity {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		double z = x / y;
		double z0 = x % y;
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		System.out.println(Double.isInfinite(z0));
		System.out.println(Double.isNaN(z0));
		
		System.out.println(z + 2);
		System.out.println(z0 + 2);
		
		
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val)) {
			System.out.println("NaN이 입력되어 처리할 수 없음");
			val = 0.0;
		}//추가함
		
		currentBalance += val;
		System.out.println(currentBalance);
	}

}
