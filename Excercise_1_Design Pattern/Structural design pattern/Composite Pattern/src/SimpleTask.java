
public class SimpleTask implements Task {
	private String title;
	
	public SimpleTask(String title) {
		super();
		this.title = title;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}

	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		this.title = title;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Simple Task: " + title);
	}

}
