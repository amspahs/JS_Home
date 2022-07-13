
public class StringBasic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 		문자타입 캐릭터타입
		char ch = 'j'; 	// 2byte
		
		//		문자열타입 스트링타입		
		String str = "java";	// 4byte
			
		System.out.println("====처음 값 출력====");
		System.out.println(str);
		
//		ch = 'j'; // 한글자만 써야 에러가 안 뜸
		str = str + " Study" + ch;
//		+?: concatenation
		
		System.out.println("====값 변경함====" + str);
//		System.out.println(ch);
		System.out.println(str);
		
	
		
		
		
		
		
		
		
		
		
	}

}
