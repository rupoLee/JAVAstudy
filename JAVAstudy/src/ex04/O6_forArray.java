package ex04;

public class O6_forArray {

	public static void main(String[] args) {
		//for문 배열 복사
		int[] oldArray = {1, 2, 3};
		int[] newArray = new int[5];
		
		for(int i=0; i<oldArray.length; i++) {
			newArray[i] = oldArray[i];
		}
		
		for(int i=0; i<newArray.length; i++) {
			System.out.print(newArray[i] + ", ");
		}
		
		System.out.println();
		System.out.println("-------------------------------");
		
		//배열 복사
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
		
		System.out.println();
		System.out.println("-------------------------------");
		
		//향상된 for문
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double)sum/scores.length;
		System.out.println("점수 평균 = " + avg);

	}

}
