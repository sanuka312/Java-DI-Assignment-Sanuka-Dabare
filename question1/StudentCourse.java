package question1;

public class StudentCourse {
    public static void main(String[] args){
        //creating a course object
        Course course=new Course();

        //Creating a student object which injects the course object
        Student student=new Student(course);
        //calling startLearning() method
        student.startLearning();

    }
}
