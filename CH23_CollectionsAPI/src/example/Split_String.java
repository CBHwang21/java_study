package example;

public class Split_String {

	public static void main(String[] args) {
		// 문자열.split(" ") => 문자열을 공백(space)로 쪼개서 배열로 리턴
		String text1 = "When Joe Manchin stepped to the podium in the US Capitol on Monday afternoon, the hope among Democrats was that he was going to announce that he supported the $1.75 trillion social safety net bill -- a moment that would virtually ensure passage of the bulk of President Joe Biden's first-term domestic agenda.";
		String text2 = "지난달 소비자물가가 9년 9개월 만에 3%를 넘었습니다. 국제유가가 상승한 데다 지난해 통신비 지원 정책이 상승률을 견인했다는 분석입니다.";

		//String[] words = text1.split("[^a-zA-Z]+");	// 정규표현식[], ^는 시작문자 
		String[] words = text2.split("[^가-힣]+");
		//정규표현식은 인터넷에 '자바 정규표현식'을 검색하면 나옴
		
		for(String w : words) {
			
			if(w.length()<2) continue;	// 철자 한개 이하는 빼기
			
			System.out.println(w.toLowerCase()); // 전부 소문자로 출력
		}
	}

}
