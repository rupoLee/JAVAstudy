package ex07_Inheritance;

public class O4_Airplane {

	public static void main(String[] args) {

		O4_2_SupersonicAirplane sa = new O4_2_SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.fiyMode = sa.SUPERSONIC;
		sa.fly();
		sa.fiyMode = sa.NORMAL;
		sa.fly();
		sa.land();
	}

}
