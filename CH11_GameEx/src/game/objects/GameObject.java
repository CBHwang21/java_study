package game.objects;

public class GameObject {
	private int id;			// 가위바위보를 위한 id
	private String name;	// 이름
	private int[][] comparison = {
			       // 가위(0)  바위(1)   보(2)
		/* 가위(0) */	{   0,     -1,      1 },
		/* 바위(1) */	{   1,      0,     -1 },
		/* 보(2)  */	{  -1,      1,      0 }
	};
	
	
	public int compare(GameObject ob) {
		return comparison[id][ob.id];
	}
	
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "GameObject [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
