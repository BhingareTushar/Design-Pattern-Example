import java.util.ArrayList;
import java.util.List;
public class Student {

    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
        return "Student [Student id=" + id + ", Student name=" + name + "]";
    }
}


class StudentDAO implements Cloneable{

    private static List<Student> studentList;

    static {
        studentList = new ArrayList<>();

        Student student1 = new Student();
        student1.setId(10);
        student1.setName("Aadesh");

        Student student2 = new Student();
        student2.setId(20);
        student2.setName("Snehraj");

        studentList.add(student1);
        studentList.add(student2);
    }


    public List<Student> getAllStudents(){
        return studentList;
    }


    @Override
    public List<Student> clone() throws CloneNotSupportedException {

        List<Student> dummyStudentList = new ArrayList<>();
        for (Student student : studentList) {
            dummyStudentList.add(student);
        }
        return dummyStudentList;
    }
}




 class Test {

    public static void main(String[] args) throws CloneNotSupportedException  {

        StudentDAO studentDAO = new StudentDAO();


        List<Student> allStudents = studentDAO.getAllStudents();


        List<Student> updatedStudentList = studentDAO.clone();
        Student student = new Student();
        student.setId(30);
        student.setName("Tushar");


        updatedStudentList.add(student);

        System.out.println("Original Student List::");
        allStudents.forEach(System.out::println);

        System.out.println("Updated Student List::");
        updatedStudentList.forEach(System.out::println);
    }
}
