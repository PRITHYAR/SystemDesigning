public class Student {
    private int rollno;
    private String name;
    private String grade;

    public Student(int rollno,String name,String grade){
        this.rollno=rollno;
        this.name=name;
        this.grade=grade;
    }

    public int getRollno(){
        return rollno;
    }

    public String getName(){
        return name;
    }

    public String getGrade(){
        return grade;
    }
}