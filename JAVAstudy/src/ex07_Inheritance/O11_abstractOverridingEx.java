package ex07_Inheritance;

public class O11_abstractOverridingEx {
	public static void main(String[] args) {
		
		O11_Dog dog = new O11_Dog();
		O11_Cat cat = new O11_Cat();
		dog.sound();
		cat.sound();
		
		System.out.println("-------------");
		
		O11_Animal animal = null;
		animal = new O11_Dog();
		animal.sound();
		animal = new O11_Cat();	//자동 타입 변환
		animal.sound();			//재정의된 메소드 호출
		
		System.out.println("-------------");
		
		//메소드의 다향성
		animalSound(new O11_Dog());
		animalSound(new O11_Cat());	//자동 타입 변환
	}
	
	public static void animalSound(O11_Animal animal) {
		animal.sound();	//재정의된 메소드 호출
	}

}
