package ex05_class;

public class O7_2_Comouter {

	int sum1(int[] valuses) {
		int sum = 0;
		for(int i=0; i<valuses.length; i++) {
			sum += valuses[i];
		}
		return sum;
	}
	
	int sum2(int ... valuses) {
		int sum = 0;
		for(int i=0; i<valuses.length; i++) {
			sum += valuses[i];
		}
		return sum;
	}
}
