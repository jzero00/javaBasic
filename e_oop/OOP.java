package e_oop;

public class OOP {

	public static void main(String[] args) { // 메인 메서드는 메모리에 이미 올라와있다.
		/*
		 * <<OOP (Object Oriented Programming) : 객체지향 프로그래밍>> - 프로그래밍을 단순히 코드의 연속으로 보는
		 * 것이 아니라 객체간의 상호작용으로 보는 것 - 코드의 재사용성이 높고 유지보수가 용이하다.
		 * 
		 * << 객체 생성 (인스턴스화) >> - 클래스를 사용하기 위해 메모리 (heap영역)에 올려놓은 것. - new 클래스 명 (); →
		 * 객체가 저장된 메모리 주소 변환. - 객체 뒤에 참조연산자(.)를 붙여 객체의 변수와 메서드에 접근할 수 있다. - 객체는 생성될때 마다
		 * 새로운 객체가 생성되고, 여러개의 객체가 동시에 존재할 수 있다.
		 */

		SampleClass sc = new SampleClass();

		sc.method1();

		sc.method2(5);

		String returnString = sc.method3(); // String 타입이라 String 타입에 저장
		System.out.println(returnString);

		int returnInt = sc.method4(7, 15);
		System.out.println(returnInt);

		// test1() 호출시 출력되는 문장에 번호를 붙여주세요.
		sc.test1();

		// 방금 만든 클래스의 객체를 생성하고 변수에 저장해주세요.
		ClassMaker cm = new ClassMaker();
		// 객체가 저장된 변수를 통해 메서드들을 호출해주세요/
		// 파라미터가 있는 메서드는 타입에 맞는 값을 넘져주시고,
		// 리턴타입ㅇ ㅣ있는 메서드는 리턴받은 값을 출력해주세요.

		cm.method1();

//		int method2 = cm.method2();
		System.out.println(cm.method2());

		cm.method3("클롭");

		int returnInt2 = cm.multiple(12, 5);
		System.out.println(returnInt2);

		// 다음을 한줄씩 계산해서 최종 결과값을 출력해주세여
		// 1. 123456 + 654321
		Calculator cal = new Calculator();
		double result1 = cal.plus(123456, 654321);

		// 2. 1번의 결과값 * 123456
		double result2 = cal.multiplication(result1, 123456);

		// 3. 2번의 결과값 / 123456
		double result3 = cal.division(result2, 123456);

		// 4. 3번의 결과값 - 654321
		double result4 = cal.difference(result3, 654321);

		// 5. 4번의 결과값 % 123456
		double result5 = cal.remainder(result4, 123456);

		System.out.println(result5);

	}

}
