package ex07_Inheritance;

public class O1_Phone {
	public static void main(String[] args) {
		
		//O1_2_DmbCellPhone 객체 생성
		O1_2_DmbCellPhone dmb = new O1_2_DmbCellPhone("자바폰", "검정", 10);
		
		//O1_1_CellPhone에게 상속받은 필드
		System.out.println("모델: " + dmb.model);
		System.out.println("모델: " + dmb.color);
		
		//O1_2_DmbCellPhone의 필드
		System.out.println("채널: " + dmb.channel);
		
		//O1_1_CellPhone에게 상속받은 메소드 호출
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("여보세요");
		dmb.receiveVoice("안녕하세요. 홍길동인데요");
		
	}
}
