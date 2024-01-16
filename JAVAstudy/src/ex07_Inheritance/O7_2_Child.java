package ex07_Inheritance;

public class O7_2_Child extends O7_1_Parent {
	
	@Override
	public void method2() {
		System.out.println("Child-method2");
	}	//재정의
	
	public void method3() {
		System.out.println("Child-method3");
	}
}
