package question1;

public class Student {
    //This is a class which depend on question1.Course class
    private final Course course;

    //injecting the course object using a constructor
    public Student(Course course){
        this.course=course;
    }

    public void startLearning(){
        course.displayCourse();
        System.out.println("question1.Student has started learning");
    }
}
