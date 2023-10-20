package ex02;

public class O1_operation {

	public static void main(String[] args) {

		//부호 연산자
		int x1 = -100;
		int result1 = +x1;
		int result2 = -x1;
		System.out.println("result1 =" + result1);
		System.out.println("result2 =" + result2);
		
		short s = 100;
//		short result3 = -s;	//에러
		int result3 = -s;
		System.out.println("result3 =" + result3);
		
		
		//증감 연산자
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("--------------------");
		x++;
		++x;
		System.out.println("x = " + x);	//12
		
		System.out.println("--------------------");
		y--;
		--y;
		System.out.println("y = " + y);	//8
		
		System.out.println("--------------------");
		z = x++;
		System.out.println("z = " + z);	//12
		System.out.println("x = " + x);	//13
		
		System.out.println("--------------------");
		z = ++x;
		System.out.println("z = " + z);	//14
		System.out.println("x = " + x);	//14
		
		System.out.println("--------------------");
		z = ++x + y++;
		System.out.println("z = " + z);	//24 > 23
		System.out.println("x = " + x);	//15
		System.out.println("y = " + y);	//9
		
		
		//논리 부정 연산자
		boolean play = true;
		System.out.println(play);	//true
		
		play = !play;
		System.out.println(play);	//false
		
		play = !play;
		System.out.println(play);	//true
		
		
		//비트 반전 연산자
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 + 1;
		System.out.println(toBinaryString(v1) + "(십진수 : " + v1 + ")");
		System.out.println(toBinaryString(v2) + "(십진수 : " + v2 + ")");
		System.out.println(toBinaryString(v3) + "(십진수 : " + v3 + ")");
		System.out.println();
		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4 + 1;
		System.out.println(toBinaryString(v4) + "(십진수 : " + v4 + ")");
		System.out.println(toBinaryString(v5) + "(십진수 : " + v5 + ")");
		System.out.println(toBinaryString(v6) + "(십진수 : " + v6 + ")");
	}

	private static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}

}
