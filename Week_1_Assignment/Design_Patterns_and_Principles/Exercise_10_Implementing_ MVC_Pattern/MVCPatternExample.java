//package practise.Design_Pattern.Architectural_Patterns.MVC_pattern;

class student{
    private String name;
    private int id;
    private String grade;

    public student(String name, int id, String grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String getName(){
        return name;
    }

    public int getId() {
        return id;
    }
    public String getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }

}

class StudentView{

    public void display(String name, int id, String grade){
        System.out.println("Student Name: " + name + " Student ID: " + id +" Student Grade: " + grade );
    }

}

class StudentController{
    private student m;
    private StudentView v;

    public StudentController(student model, StudentView view) {
        this.m = model;
        this.v = view;
    }

    public void setStudentName(String name) {
        m.setName(name);
    }

    public void setStudentGrade(String grade) {
        m.setGrade(grade);
    }

    // read m
    public String getStudentName() {
        return m.getName();
    }

    public String getStudentGrade() {
        return m.getGrade();
    }

    public int getStudentId() {
        return m.getId();
    }

    // show view
    public void updateView() {
        v.display(m.getName(), m.getId(), m.getGrade());
    }






}

public class MVCPatternExample {
    public static void main(String[] args) {
        student student = new student("Soumodeep", 101, "A");

        
        StudentView view = new StudentView();

        
        StudentController controller = new StudentController(student, view);

       
        System.out.println("Initial Details:");
        controller.updateView();

        
        controller.setStudentName("Soumodeep Shee");
        controller.setStudentGrade("A+");

        
        System.out.println("\nAfter Update:");
        controller.updateView();
    }
}
