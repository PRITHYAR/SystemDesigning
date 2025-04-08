import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        StudentViewModel studentVm=new StudentViewModel();
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("1.Add Students\n2.View All Students\n3.View Students by Grade\n4.Delete Students\n5.Exit");
            System.out.println("Enter your Choice:");
            int choice=sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter RollNo:");
                    int rollno=sc.nextInt();
                    System.out.println("Enter Name:");
                    String name=sc.next();
                    System.out.println("Enter Grade:");
                    String grade=sc.next();
                    studentVm.addStudent(rollno,name,grade);
                    break;
                case 2:
                    System.out.println("The Students are:");
                    for(Student s:studentVm.getAllStudents()){
                        System.out.println("RollNo:"+s.getRollno()+ " Name:"+s.getName()+" Grade:"+s.getGrade());
                    }
                    break;
                case 3:
                    System.out.println("Enter grade to filter:");
                    String filter=sc.next();
                    for(Student s:studentVm.getStudentsByGrade(filter)){
                        System.out.println("RollNo:"+s.getRollno()+ " Name:"+s.getName()+" Grade:"+s.getGrade());
                    }
                    break;
                case 4:
                    System.out.println("Enter RollNo to delete:");
                    int rno=sc.nextInt();
                    studentVm.deleteStudent(rno);
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}