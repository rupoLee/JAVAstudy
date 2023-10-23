package ex03;

public class O4_while {

	public static void main(String[] args) throws Exception {
		//1~10 출력
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		
		//1~100 합
		int sum = 0;
		int j = 1;
		while(j<=100) {
			sum += j;
			j++;
		}
		System.out.println("1~" + (j-1) + " 합 : " + sum);
		
		
		//while문 제어
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode != 13 && keyCode !=10) {
				System.out.println("------------------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("------------------------------");
				System.out.println("선택 : ");
			}
			keyCode = System.in.read();
			
			if(keyCode == 49) { //1입력
				speed++;
				System.out.println("현재속도 = " + speed);
			} else if(keyCode == 50) { //2입력
				speed--;
				System.out.println("현재속도 = " + speed);
			} else if(keyCode == 51) { //3입력
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
