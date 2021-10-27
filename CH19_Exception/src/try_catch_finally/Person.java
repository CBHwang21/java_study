package try_catch_finally;

public class Person {

	void setName(String name) throws Exception {
		if(name == null) {
			throw new Exception("이름에 null값을 입력할 수 없습니다.");
		}
		System.out.println("이름은 : " + name);
	}
}
