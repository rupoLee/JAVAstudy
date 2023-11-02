package ex06;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface O4_Annotation_interface {
	//어노테이션 타입 정의
	
	String value() default "-";
	int number() default 15;
}
