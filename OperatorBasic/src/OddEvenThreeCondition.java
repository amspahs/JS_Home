import java.util.Scanner;

public class OddEvenThreeCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		홀짝 판별 프로그램 삼항연산자로
		
		int userInputNum = 0;
		String resultStr = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		userInputNum = scan.nextInt();
		
		resultStr = (userInputNum % 2 == 0) ? "짝" : "홀";
//								/ 안됨. %여야 됨. 해보셈
		
		System.out.println(resultStr);
		
//		숫자 변수는 마지막에 Num 붙이고 글자 변수는 마지막에 Str 붙여라. 회사 가서는 회사에 따르고
		
		
		
		
		
		
		
	}

}
