package custom_HashSet;

import java.util.HashSet;
import java.util.Objects;

class Creature {
	private int id;
	private String name;
	
	public Creature(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return id + " : " + name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {	
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Creature other = (Creature) obj;
		return id == other.id; // 객체의 id가 같으면 같으면 true 리턴
	}
	
}

public class App {

	public static void main(String[] args) {
		// 커스텀 클래스 Creature 타입 셋 리스트 생성
		HashSet<Creature> creatures = new HashSet<>();
		
		// 셋 형에서 중복의 비교는 객체의 equals 메소드를 사용해 같으면 제외
		creatures.add(new Creature(0, "고양이"));
		creatures.add(new Creature(1, "개"));
		creatures.add(new Creature(2, "돼지"));
		creatures.add(new Creature(2, "돼지"));
		creatures.add(new Creature(3, "소"));
		creatures.add(new Creature(4, "말"));
		creatures.add(new Creature(4, "비둘기"));
		
		System.out.println(creatures.contains(new Creature(0, "고양이")));
		
		creatures.forEach(System.out::println);
		

	}

}
