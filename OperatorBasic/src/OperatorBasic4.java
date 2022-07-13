
public class OperatorBasic4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		단항 연산자
//		증감 연산자
//		
//		++연산자: 피연산자의 값을 1 증가시킨다(n=n+1)
//		--연산자: 피연산자의 값을 1 감소시킨다
//		
//		전위형: 값이 참조되기 전에 증가시킨다
//		ex: ++i
//		후위형: 값이 참조된 후에 증가시킨다
//		ex: i++
		
		int n = 0;
		int i = 5;
		
		n = i++; 				//n = i 먼저 수행 후에 ++로 1 증가시켜 준다, 후위를 주로 쓴다
		System.out.println(n);
		
		n=5;
		n = ++i;				//i = i + 1 먼저 수행 후에 n으로 초기화한다
		System.out.println(n);
		
//		출력문에도 선적용/후적용 되어 출력되기 때문에 다음 저장되는 값에 대한 주의가 필요함
		
		
		
		
		
		
		
		
		
	}

}
