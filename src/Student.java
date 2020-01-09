public class Student {
    private String firstName;
    private static int id = 0;
    private Student [] courses = new Student[8];

    //Constructor
    Student(String firstName){
        this.firstName = firstName;
        this.courses = new Student[courses.length];
        id++;
    }
    public int getId(){
        return id;
    }

    public Student[] courseAdd(Student[] courses, Student add){
        Student[] courseAdded = new Student[courses.length+1];
        for(int i = 0;i<courseAdded.length;i++){
            courseAdded[i] = courses[i];
            if(i==courseAdded.length-1){
                courseAdded[i] = add;
            }
        }
        return courseAdded;
    }
    public String toString(){
        return "id: " + id + " Name: " + firstName;
    }
}

