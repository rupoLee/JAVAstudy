package ex04_enum;

import java.util.Calendar;

public class EnumCalendar {

	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);

		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WEDNESDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATURDAY; break;
		}
		
		System.out.println("오늘 요일 : " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부를 합니다.");
		}
		
		System.out.println("-------------------------------");
		
		//열거 객체 메소드
		//name() 메소드 - 열거 객체의 문자열 리턴
		Week toDay = Week.SUNDAY;
		String name = toDay.name();
		System.out.println(name);
		
		System.out.println("-------------------------------");
		
		//ordinal() 메소드 - 열거 객체 중 몇번째인지 
		int ordinal = toDay.ordinal();
		System.out.println(ordinal);
		
		System.out.println("-------------------------------");
		
		//compareTo() 메소드 - 열거 객체 기중으로 몇번째에 위치 하는지
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		System.out.println("-------------------------------");
		
		//valueOf() 메소드 - 매개값의 문자열과 동일한 문자열을 갖는 열거 객체 리턴
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말이군요");
			} else {
				System.out.println("평일이군요");
			}
		}

		System.out.println("-------------------------------");
		
		//values() 메소드 - 열거 타입의 모든 객체들을 배열로 리턴
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}

	}

}
