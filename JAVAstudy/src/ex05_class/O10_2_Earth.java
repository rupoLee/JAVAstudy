package ex05_class;

public class O10_2_Earth {
	/*
	 * 상수 : 원주율 등 불변의 값을 저장하는 필드
	 * static이면서 final이여야 함
	 * 한번 초기값이 저장되면 변경 불가
	 * 상수 이름은 대문자 작성, (_) 사용 가능
	 * 
	 * */
	
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
	
}
