package ex01;

public class O4_typeCasting {

	public static void main(String[] args) {
		
		//강제타입 변환
		
		int intValue = 44032;
		char charValue = (char)intValue;	//유니코드에 해당하는 문자로 변환
		System.out.println(charValue);

		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		//소수점 이하 출력안됨
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
		
		
		//변환 시 데이터 손실
		int i = 128;
		if((i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)) {
			System.out.println("byte 타입으로 변환할 수 없습니다.");
		} else {
			byte b = (byte)i;
			System.out.println(b);
		}
		
		//변환 시 정밀도 손실
		int num1 = 123456780;
		int num2 = 123456780;
		
//		float num3 = num2;
//		num2 = (int)num3;
//		
//		int result = num1 - num2;	//0 예상
//		System.out.println(result);	//-4
		
		double num3 = num2;	//int보다 크기때문에 정밀도 손실없이 안전하게 변환
		num2 = (int)num3;
		
		int result = num1 - num2;
		System.out.println(result);
	}

}
