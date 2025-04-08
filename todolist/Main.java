package todolist;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Taskviewmodel viewmodel=new Taskviewmodel();
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("1.Add the task:");
		System.out.println("2.Remove the task");
		System.out.println("3.view all the task:");
		System.out.println("4.Exit");
		System.out.println("Enter your choice:");
	
		int choice = sc.nextInt();
		switch(choice) {
		    case 1:
		    	System.out.println("enter the title:");
		    	String title= sc.next();
		    	viewmodel.addTask(title);
		    	break;
		    case 2:
		    	System.out.println("Enter the taskid to be removed:");
		    	int id =sc.nextInt();
		    	viewmodel.removeTask(id);
		    	break;
		    case 3:
		    	for (Task task:viewmodel.getAllTask())
		    	System.out.println(task.getId()+"."+task.getTitle());
		    	break;
		    case 4:
		    	System.exit(0);
		}
		}
		
		
		
		
	}

}

