package ex06;

import java.lang.reflect.*;
import java.util.*;

public class O4_Annotation {

	public static void main(String[] args) {
		/*
		 * 용도
		 * 컴파일러에게 코드문법 에러 체크용 정보 제공
		 * 개발 툴이이 빌드나 배치 시 코드를 자동 샹성하도록 정보 제공
		 * 실행 시 특정 기능 실행하도록 정보 제공
		 * 
		 * */
		
		/*
		 * Reflection : 런타임 시점에서 구체적인 클래스의 타입을 몰라도 메소드, 속성 등 여러작업을 하게 해주는 API
		 * Reflection을 이용헤
		 * O4_Annotation_service에 적용된
		 * 어노테이션 정보를 읽고 엘리먼트 값에 따라
		 * 출력할 문자와 횟수를 콘솔에 출력 후 해당 메소드 호출
		 * */
		
		//service 클래스로부터 메소드 정보 얻음
		Method[] declaredMethod = O4_Annotation_service.class.getDeclaredMethods();
		
		//Method 객체 하나씩 처리
		for (Method method : declaredMethod) {
			//어노테이션 적용됐는지 확인
			if(method.isAnnotationPresent(O4_Annotation_interface.class)) {
				//O4_Annotation_interface 객체 얻기
				O4_Annotation_interface annotation = method.getAnnotation(O4_Annotation_interface.class);
				
				//메소드 이름 출력
				System.out.println("[" + method.getName() + "]");
				//value로 구분선 출력
				for(int i=0; i<annotation.number(); i++) {
					System.out.print(annotation.value());
				}
				System.out.println();
				
				try {
					//메소드 호출
					method.invoke(new O4_Annotation_service());
				} catch (Exception e) {
					
				}
				System.out.println();
			}
		}
	}

}
