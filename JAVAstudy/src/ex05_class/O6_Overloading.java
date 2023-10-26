package ex05_class;

public class O6_Overloading {
	public static void main(String[] args) {
		
		O6_1_Car car1 = new O6_1_Car();
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		O6_1_Car car2 = new O6_1_Car("자가용");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		O6_1_Car car3 = new O6_1_Car("자가용", "빨강");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		O6_1_Car car4 = new O6_1_Car("택시", "검정", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		System.out.println();
	}
}
