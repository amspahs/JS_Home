import java.util.Scanner;

public class ConditionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		삼항연산자 ?, :를 사용하여 음수와 양수를 판별하는 프로그램을 만드시오
		
//		출력형태
//		입력한 숫자가 4				입력한 숫자는 -1
//		4는 양수입니다				-1은 음수입니다
		
		
//		String a = "양수";
//		String b = "음수";
//				
//		int num = -1;
//		String resultNum = ((num >= 0) ? a : b);
//		
//		System.out.println("입력한 숫자는 " + num);
//		System.out.println(num + "은 " + resultNum + "입니다");	
//		
//		println의 ln 역할을 하는 것은 + "\n"
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		String numText = "";
		
		System.out.println("숫자를 입력하세요");
		num = scan.nextInt();
		
		numText = (num > 0) ? "양수" : "음수";
			
		String aStr = "양수";
		String bStr = "음수";
				
		String resultNum = ((num > 0) ? aStr : bStr);
		
		
		System.out.println("입력한 숫자는 " + num);
		System.out.println(num + "은 " + resultNum + "입니다");	
		
//		이거 미완성임 듀플리케이트컨디션베이직1이 선생님께서 보내주신 것임.
		
		
	}

}
