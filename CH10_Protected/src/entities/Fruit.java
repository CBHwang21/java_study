package entities;

public class Fruit {
	// 프로텍티드 접근 지정자 (상속받은 클래스에서 사용가능)
	protected int id;

	@Override
	public String toString() {
		return "Fruit [id=" + id + "]";
	}
}

