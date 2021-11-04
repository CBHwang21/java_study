package operators;

public class XOR_NOT {

	public static void main(String[] args) {
		// 비트연산 XOR, NOT
		
		int value1 = 0b01010011;
		int value2 = 0b11010110;
		
		int result1 = value1 ^ value2;	// 비트 XOR 연산 : 같으면 0, 다르면 1
		
		System.out.println(toBinary(value1));
		System.out.println(toBinary(value2));
		System.out.println(toBinary(result1));
		System.out.println();

		// NOT 연산 ~ : 0 -> 1, 1 -> 0 으로 반전
		
		System.out.println(toBinary(~result1));
		
	}

	private static String toBinary(int n) {
		// 8자리 이진수로 보여주기 위한 메소드
		return String.format("%8s", Integer.toBinaryString(n)).replace(" ", "0");
	}
}
