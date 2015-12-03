package question2;

public class JobTitle {
	private int id;
	private String title;
	private String level;
	private String description;
	
//	constractor
	public JobTitle(int id, String title, String level, String description) {
		super();
		this.id = id;
		this.title = title;
		this.level = level;
		this.description = description;
	}

//	Getter and setter method
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
