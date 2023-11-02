package ex06;

public class O4_Annotation_service {
	//어노테이션 적용
	
	@O4_Annotation_interface //엘리먼트 기본값 적용
	public void method1() {
		System.out.println("실행 1");
	}
	
	@O4_Annotation_interface("*") //엘리먼트 value값 *적용
	public void method2() {
		System.out.println("실행 2");
	}
	
	@O4_Annotation_interface(value = "#", number = 20)
	public void method3() {
		System.out.println("실행 3");
	}
}
