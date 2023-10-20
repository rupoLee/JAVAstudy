package ex03;

public class O2_switch {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;
		
		switch(num) {
			case 1:
				System.out.println("1번 나왔습니다.");
				break;
			case 2:
				System.out.println("2번 나왔습니다.");
				break;
			case 3:
				System.out.println("3번 나왔습니다.");
				break;
			case 4:
				System.out.println("4번 나왔습니다.");
				break;
			case 5:
				System.out.println("5번 나왔습니다.");
				break;
			default:
				System.out.println("6번 나왔습니다.");
				break;
		}
		
		//break 없을 경우 - 다음 case가 값과 상관없이 실행된
		int time = (int)(Math.random()*4) + 8;
		System.out.println("[현재시간: " + time + " 시]");
		
		switch(time) {
			case 8:
				System.out.println("출근합니다.");
			case 9:
				System.out.println("회의를 합니다.");
			case 10:
				System.out.println("업무를 봅니다.");
			default:
				System.out.println("외근을 나갑니다.");
		}
		
		
		//char 타입
		char grade = 'B';
		
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println("우수 회원입니다.");
				break;
			case 'B':
			case 'b':
				System.out.println("일반 회원입니다.");
				break;
			default:
				System.out.println("손님입니다.");
		}
		
		
		//String 타입
		String position = "과장";
		
		switch(position) {
			case "부장":
				System.out.println("700만원");
				break;
			case "과장":
				System.out.println("500만원");
				break;
			default:
				System.out.println("300만원");
		}
	}

}
