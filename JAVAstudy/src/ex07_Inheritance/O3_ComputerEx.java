package ex07_Inheritance;

public class O3_ComputerEx {

	public static void main(String[] args) {
		int r= 10;
		
		O3_1_Calculator calculator = new O3_1_Calculator();
		System.out.println("원면적 : " + calculator.areaCircle(r));
		System.out.println();
		
		O3_2_Computer computer = new O3_2_Computer();
		System.out.println("원면적 : " + computer.areaCircle(r));	//재정의된 메소드 호출
	}

}
