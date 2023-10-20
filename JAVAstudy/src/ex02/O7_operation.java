package ex02;

public class O7_operation {

	public static void main(String[] args) {
		//대입 연산자
		int result = 0;
		result +=10;
		System.out.println("result = " + result);
		result -= 5;
		System.out.println("result = " + result);
		result *= 3;
		System.out.println("result = " + result);
		result /= 5;
		System.out.println("result = " + result);
		result %= 3;
		System.out.println("result = " + result);
		
		
		//삼항 연산자
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");
	}

}
