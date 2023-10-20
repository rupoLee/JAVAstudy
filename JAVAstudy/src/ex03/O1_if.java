package ex03;

public class O1_if {

	public static void main(String[] args) {
		//if
		int score = 93;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		
		if(score < 90)
			System.out.println("점수가 90보다 작습니다."); 
			System.out.println("등급은 B 입니다.");	//{}가 없으면 한 문장만 가능
		
			
		//if-else
		int score0 = 85;
		
		if(score0 >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		} else {
			System.out.println("점수가 90보다 작습니다."); 
			System.out.println("등급은 B 입니다.");
		}
		
		
		//if-else if-else
		int score1 = 75;
		
		if(score1 >= 90) {
			System.out.println("점수가 100~90 입니다.");
			System.out.println("등급은 A 입니다.");
		} else if(score1 >= 80) {
			System.out.println("점수가 80~89 입니다."); 
			System.out.println("등급은 B 입니다.");
		} else if(score1 >= 70) {
			System.out.println("점수가 70~79 입니다."); 
			System.out.println("등급은 C 입니다.");
		} else {
			System.out.println("점수가 70미만 입니다."); 
			System.out.println("등급은 D 입니다.");
		}
		
		
		//주사위 예제
		int num = (int)(Math.random()*6) + 1;
		
		if(num == 1) {
			System.out.println("1번 나왔습니다.");
		} else if(num == 2) {
			System.out.println("2번 나왔습니다.");
		} else if(num == 3) {
			System.out.println("3번 나왔습니다.");
		}else if(num == 4) {
			System.out.println("4번 나왔습니다.");
		} else if(num == 5) {
			System.out.println("5번 나왔습니다.");
		} else {
			System.out.println("6번 나왔습니다.");
		}
		
		
		//중첩 if
		int score2 = (int)(Math.random()*20) + 81;
		System.out.println("점수 : " + score2);
		
		String grade;
		
		if(score2 >= 90) {
			if(score2 >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if(score2 >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		System.out.println("학점 : " + grade);
	}

}
