package ex04;

public class O1_String {

	public static void main(String[] args) {
		String srtVar1 = "신민철";
		String srtVar2 = "신민철";
		
		if(srtVar1 == srtVar2) {
			System.out.println("srtVar1과 srtVar2는 참조가 같음");
		} else {
			System.out.println("srtVar1과 srtVar2는 참조가 다름");
		}
		
		if(srtVar1.equals(srtVar2)) {
			System.out.println("srtVar1과 srtVar2는 문자열이 같음");
		}
		
		String srtVar3 = new String("신민철");
		String srtVar4 = new String("신민철");
		
		if(srtVar3 == srtVar4) {
			System.out.println("srtVar3과 srtVar4는 참조가 같음");
		} else {
			System.out.println("srtVar3과 srtVar4는 참조가 다름");
		}
		
		if(srtVar3.equals(srtVar4)) {
			System.out.println("srtVar3과 srtVar4는 문자열이 같음");
		}
	}
}
