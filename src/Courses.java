public class Courses {
    private String subjectName;
    private int studentGrade;

    Courses(String subjectName, int studentGrade){
        this.subjectName = subjectName;
        this.studentGrade = studentGrade;
    }

    public String toString(){
        return subjectName;
    }
}
