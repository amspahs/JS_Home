import java.util.Scanner;

public class DuplicateConditionBasic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//			ctrl + shift + f = 들여쓰기 정렬
//		삼항연산자
//		조건식 ? 식1 : 식2
//		중첩삼항연산자
//		조건식 ? 식1 : 조건식 : 식2 : 식3
		Scanner scan = new Scanner(System.in);
		int num = 0;
		String numText = "";

		System.out.println("숫자를 입력하세요");
		num = scan.nextInt();

	
//		numText = (num > 0) ? "양수" : "음수";						//삼항연산자
		numText = (num > 0) ? "양수" : (num < 0) ? "음수" : "0";	//중첩삼항연산자
		
		System.out.print("입력한 숫자는 " + num + "\n");
		System.out.println(num + "(은/)는 " + numText + "입니다");

	}

}
