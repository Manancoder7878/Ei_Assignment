import java.util.ArrayList;
import java.util.List;

public class TaskList implements Task{

	private String title;
    private List<Task> tasks;
 
    public TaskList(String title) {
        this.title = title;
        this.tasks = new ArrayList<>();
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
		System.out.println("Task List: " + title);
        for (Task task : tasks) {
            task.display();
        }
	}
	public void addTask(Task task) {
        tasks.add(task);
    }
 
    public void removeTask(Task task) {
        tasks.remove(task);
    }

}
