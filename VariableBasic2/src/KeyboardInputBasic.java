import java.util.Scanner;

public class KeyboardInputBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int num = 0;
		String name = "";
		
		System.out.println("숫자를 하나 입력해주세요");
		num = scan.nextInt();
		
		scan.nextLine();
		
		System.out.println("여기는 문장을 입력하시면 돼요");
		name = scan.nextLine();
		
		System.out.print("사용자님이 입력하신 숫자는" ); //그냥 프린트는 라인을 넘기지 않는다
		System.out.println(num + " 입니다");		//프린트 ln은 라인을 넘긴다
		
		System.out.println("사용자님이 입력하신 글자는" + name + " 입니다");

		
		
		
		
		
		
		
		
		
		
		
	}

}
