package ex02;

public class O6_operation {

	public static void main(String[] args) {
		//논리 연산자
		int charCode = 'A';
		
		if((charCode >= 65) & (charCode <= 90)) {
			System.out.println("대문자 이군요");
		}
		
		if((charCode >= 97) && (charCode <= 122)) {
			System.out.println("소문자 이군요");
		}
		
		if(!(charCode >= 48) && !(charCode <= 57)) {
			System.out.println("0~9 숫자 이군요");
		}
		
		int value = 6;
		
		if((value%2 == 0) | (value%3 == 0)) {
			System.out.println("2 또는 3의 배수 이군요");
		}
		
		if((value%2 == 0) || (value%3 == 0)) {
			System.out.println("2 또는 3의 배수 이군요");
		}
		
		
		//비트 논리 연산자
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 = " + (45 | 25));
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("~ 45 = " + (~45));

		
		//비트 이동 연산자
		System.out.println("1 << 3 = " + (1<<3));
		System.out.println("-8 >> 3 = " + (-8>>3));
		System.out.println("-8 >>> 3 = " + (-8>>>3));
	}

}
