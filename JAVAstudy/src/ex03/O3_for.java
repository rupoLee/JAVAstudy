package ex03;

public class O3_for {

	public static void main(String[] args) {
		//1~10 출력
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		
		//1~100 합
		int sum = 0;
		int i = 0;
		for (i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println("1~100 합 : " + sum);
		System.out.println("1~" + (i-1) + " 합 : " + sum);
		
		
		//float 타입
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
		}
		
		
		//구구단
		for(int m=2; m<=9; m++) {
			System.out.println("*** " + m + "단 ***");
			for(int n=1; n<=9; n++) {
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		}
	}

}
