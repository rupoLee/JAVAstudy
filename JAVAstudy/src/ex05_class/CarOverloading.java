package ex05_class;

public class CarOverloading {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	CarOverloading() {
	}
	
	CarOverloading(String model) {
//		this.model = model;
		
		//중복코트 줄이기
//		this.model = model;
//		this.color = "은색";
//		this.maxSpeed = 250;
		this(model, "은색", 250); //마지막 생성자 호출
	}
	
	CarOverloading(String model, String color) {
//		this.model = model;
//		this.color = color;
		
		//중복코트 줄이기
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = 250;
		this(model, color, 250);
		
	}
	
	CarOverloading(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		//공통 실행코드
	}
	
}
