package ex06_2;

public class O3_car {
	//필드
	private int speed;
	private boolean stop;
	
	
	//메소드
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() { //boolean은 is로 시작
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
