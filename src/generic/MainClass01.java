package generic;

import java.util.ArrayList;

public class MainClass01 {
	public static void main(String[] args) {
		int num = 100;
		Integer num2 = 200;
		num = num2;
		double do1 = 1.123;
		Double do2 = 2.222;
		ArrayList<Boolean> arr;
	}
}
/*
 generic
- 유동적으로 자료형을 부여해 사용할 수 있다.
- wrapper자료형으로 부여해야한다.
wrapper	(클래스 형태로 변경함)
- int : Integer, double : Double, char : Character ... 
- boolean, byte, char, short, int, long, float, double
(int와 char 제외하고 나머지는 앞자리 대문자로 변경해서 쓰면 됨)
 */