
public class CastingBasic {
		public static void main(String[] args) {
			
//		형변환(casting)이란?
//		변수 또는 상수의 타입을 다른 타입으로 변환하는 것

//		형변환 방법
//		(타입)피연산자
		
//		자동 형변환의 규칙
//		기존의 값을 최대한 보존할 수 있는 타입으로 자동 형변환한다
		
//		1		2		4		8		4		 8byte		
//		byte -> short -> int -> long -> float -> double
//				char  -> int
//		기본형의 자동 형변환이 가능한 방향
		
//		1. boolean을 제외한 나머지 7개의 기본형은 서로 형변환이 가능하다
//		2. 기본형과 참조형은 서로 형변환할 수 없다
//		3. 서로 다른 타입의 변수 간의 연산은 형변환을 하는 것이 원칙이지만,
//			값의 범위가 작은 타입에서 큰 타입으로의 형변환은 생략할 수 있다
		
//		명시적(explicit) vs 묵시적(implicit)	
//		수동				  자동
//		자신이 직접 작성		  컴파일러가 알아서 작성
			
		double d = 8.13;
		int score = 0;
		
//		타입 캐스팅 연산자		
//		score = d; 만 입력하면 큰애가 작은애한테 들어가는 거라 안 들어가서 에러 띄움
		score = (int)d; // 나머지는 다 날아가도 상관없으니 정수값만 줘. 강제로 맞추는 개념임
		
		System.out.println(d);
		System.out.println(score);
		
			
			
			
			
			
			
			
			
			
		}
}
