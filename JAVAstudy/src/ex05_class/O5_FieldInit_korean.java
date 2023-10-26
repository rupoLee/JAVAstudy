package ex05_class;

public class O5_FieldInit_korean {

	public static void main(String[] args) {

		O5_1_Korean k1 = new O5_1_Korean("박자바", "011225-1234567");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		O5_1_Korean k2 = new O5_1_Korean("박자바", "011225-1234567");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
	}

}
