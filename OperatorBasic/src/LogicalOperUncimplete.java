
public class LogicalOperUncimplete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 5;
		int n = 150;
		
//		5는 0보다 크고 9보다는 작은가?		
		System.out.println(num > 0 && num < 9);		//변수는 무조건 앞에 적는다 
//		n은 0보다 작거나 100보다 큰가?		
		System.out.println(n < 0 || n > 100);
		
//		**한 줄에 때려넣는 경우에는 뒤쪽 논리연산이 문자화 되지 않도록 소괄호로 묶어준다		
		System.out.println("5는 0보다 크고 9보다는 작은가? " + (num > 0 && num < 9));

		
//		치환		
		int a = 5;
		int b = 0;
		System.out.printf("a=%d, b=%d%n", a, b);
//		십진수 치환, 처음 퍼디는 첫번째 숫자, 두번째 퍼디는 두번째 숫자, 퍼엔 또는 역슬래시엔은 줄바꿈, 퍼비는 불린(t/f 가림)

//		**or(||)은 앞의 값이 맞으면 뒤의 값은 계산도 하지 않는다. 증감 연산자도 씹어버린다.
//		**and(&&)도 앞의 값이 틀리면 뒤의 값을 계산하지 않는다. 마찬가지로 증감 연산자도 무시한다.
//		*하나짜리 |나 &는 앞의 것이 맞든 틀리든 뒤의 계산까지 수행한다. 연산속도에 영향을 미치니까 알고만 있고, 기본적으로는 두개짜리 쓰자.
		
		
		
		
		
	}

}
