package ex07_Inheritance;

public class O1_2_DmbCellPhone extends O1_1_CellPhone {
	//자식 클래스
	
	//필드
	int channel;
	
	//생성자
	O1_2_DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		//위는 상속받은 필드
		this.channel = channel;
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
