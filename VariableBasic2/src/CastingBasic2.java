
public class CastingBasic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte bNum = 1; //바이트의 1
		byte otherBNum = 1;
		int intNum = 1;	//인트의 1
		long longNum = 1;	//롱의 1
		//얘네들은 우리가 보기엔 같은 1이지만 컴퓨터가 보기에는 다름
		
		System.out.println("본인 타입?");
		System.out.println(bNum);
		System.out.println(intNum);
		System.out.println(longNum);
		
//		bNum = intNum;			에러메시지 한번씩 읽어봐라
		
		bNum = (byte)intNum; //원래 인트의 1이었는데 바이트의 1로 형변환이 되었다. ()는 convert...변환
		bNum = otherBNum;
//								묵시적 형변환과 명시적 형변환. 지금 하는 거는 명시적 형변환
//								나중에는 컴이 알아서 바꾸는 묵시적 형변환을 막아야 내가 하고자하는 것을 할 수도 있음
		
		intNum = 128;
		bNum = (byte)intNum;
		
		System.out.println("int의 자료형을 byte형에 대입한다");
		System.out.println(bNum);
		System.out.println(intNum);
		System.out.println(longNum);
		
		
		
		
	}

}
