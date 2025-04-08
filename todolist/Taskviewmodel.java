package todolist;

import java.util.*;

public class Taskviewmodel {
	private List <Task> taskList=new ArrayList<>();
	private int currentid=1;
	public void addTask(String title) {
		Task task =new Task(currentid++,title);
		taskList.add(task);
		System.out.println("Added Successfully");
		
	}
	public void removeTask(int id) {
		taskList.removeIf(task->task.getId()==id);
		System.out.println("removed Successfully");
	}
	public List<Task> getAllTask() {
		return taskList;
	}
	

}