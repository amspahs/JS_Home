
public class OperatorBasic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//		반올림하여 소수 2번째까지 구하는 프로그램
//		반올림: 0.5 이상의 숫자에 올림처리, 0.4 이하의 숫자에 내림처리
//		달리 말하면 그 아래 자릿수에 5를 더해준다는 것

		double pi = 3.149592d;
//		3141.592		
		double shortPi = 0.0;
//		314/1000
		shortPi = pi + 0.005;
		
		System.out.println(shortPi);
		
		shortPi = (int)(shortPi*100)/100.0;		
		
		System.out.println(pi);
		System.out.println(shortPi);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
