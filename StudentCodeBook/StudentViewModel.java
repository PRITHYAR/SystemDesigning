import java.util.*;
import java.util.stream.Collectors;

public class StudentViewModel {
    private List<Student> sList=new ArrayList<>();

    public void addStudent(int rollno,String name, String grade){
        Student stu=new Student(rollno,name,grade);
        sList.add(stu);
        System.out.println("Added Successfully....!");
    }

    public List<Student> getAllStudents(){
        return sList;
    }

    public List<Student> getStudentsByGrade(String filter){
        return sList.stream().filter(stu-> stu.getGrade().equalsIgnoreCase(filter)).collect(Collectors.toList());
    }

    public void deleteStudent(int rollno){
        sList.removeIf(stu->stu.getRollno()==rollno);
        System.out.println("Deleted Successfully....!");

    }
}