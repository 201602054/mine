package OOP自学;

public class Door {
	private String id;
	private String doorName;
	private String tel;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id= id;
	}

	public Door(String id, String doorName, String tel) {
		super();
		this.id = id;
		this.doorName = doorName;
		this.tel = tel;
		char c=1000;
	}
}
