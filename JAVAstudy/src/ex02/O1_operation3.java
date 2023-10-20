package ex02;

public class O1_operation3 {

	public static void main(String[] args) {
		
		//정확한 계산 정수 사용
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		
		System.out.println("사과 한개에서 ");
		System.out.println("0.7조각을 빼면, ");
		System.out.println(result + "조각이 남는다");
		
		
		int totalPieces = apple * 10;
		int number0 = 7;
		int temp = totalPieces - number0;
		
		double result0 = temp / 10.0;
		
		System.out.println("사과 한개에서 ");
		System.out.println("0.7조각을 빼면, ");
		System.out.println(result0 + "조각이 남는다");
	}

}
