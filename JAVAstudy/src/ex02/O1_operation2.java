package ex02;

public class O1_operation2 {

	public static void main(String[] args) {
		//산술 연산자
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1 = "+ result1);
		
		int result2 = v1 - v2;
		System.out.println("result2 = "+ result2);
		
		int result3 = v1 * v2;
		System.out.println("result1 = "+ result3);
		
		int result4 = v1 / v2;
		System.out.println("result4 = "+ result4);
		
		int result5 = v1 % v2;
		System.out.println("result5 = "+ result5);
		
		double result6= (double)v1 / v2;
		System.out.println("result6 = "+ result6);
		
		
		char c1 = 'A' + 1;
		char c2 = 'A';
//		char c3 = c2 + 1;	//에러 > 게산을 int로 하기 때문
		int c3 = c2 + 1;
		System.out.println("c1 = "+ c1);
		System.out.println("c2 = "+ c2);
		System.out.println("c3 = "+ c3);
		
		char c4 = (char)(c2 + 1);
		System.out.println("c4 = "+ c4);
		
		
		//오버플로우
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z);
		//해결
		long xx = 1000000;
		long yy = 1000000;
		long zz = xx * yy;
		System.out.println(zz);
		
		
		//연산 전 오버플로우 탐지
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
		}
	}

	private static int safeAdd(int left, int right) {
		if(right > 0) {
			if(left > (Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		} else {
			if(left < (Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}
		return left + right;
	}

}
