package cn.com.zuo.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitColor {
	public enum Color {
		BLUE, GREEN, RED
	}
	
	Color fruitColor() default Color.RED;
}
