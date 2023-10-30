package ex06;

import ex06_1.*;
import ex06_2.*;

public class O1_Car_import {
	//필드
	Engine engine = new Engine();
	SnowTire snowTire = new SnowTire();
	BigWidthTire bigTire = new BigWidthTire();
	
	/*
	 * 서로 다른 패키지에 같은 class 이름이 존재
	 * 두 패키지가 import 되어 있음
	 * 에러
	 * 
	 * 패키지 전체 기술
	 * */
//	Tire tire = new Tire();
	ex06_1.Tire tire1 = new ex06_1.Tire();
	ex06_2.Tire tire2 = new ex06_2.Tire();
}
