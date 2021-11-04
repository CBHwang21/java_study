package operators;

public class And_Or {

	public static void main(String[] args) {
		// 비트연산 AND, OR
		
		//System.out.println(toBinary(15));
		
		int value1 = 0b01010011;
		int value2 = 0b11010110;
		
		int result1 = value1 & value2;	// 비트 AND 연산
		
		System.out.println(toBinary(value1));
		System.out.println(toBinary(value2));
		System.out.println(toBinary(result1));
		System.out.println();
		
		int result2 = value1 | value2;	// 비트 OR 연산
		System.out.println(toBinary(value1));
		System.out.println(toBinary(value2));
		System.out.println(toBinary(result2));


	}

	private static String toBinary(int n) {
		// 8자리 이진수로 보여주기 위한 메소드
		return String.format("%8s", Integer.toBinaryString(n)).replace(" ", "0");
	}

}
