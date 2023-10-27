package ex05_class;

public class O9_1_Singleton {
	
	private static O9_1_Singleton singleton = new O9_1_Singleton();
	
	private O9_1_Singleton() {}
	
	static O9_1_Singleton getInstance() {
		return singleton;
	}
}
