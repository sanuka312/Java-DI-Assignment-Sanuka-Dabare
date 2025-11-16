public class Student {
    //This is a class which depend on Course class
    private final Course course;

    //injecting the course object using a constructor
    public Student(Course course){
        this.course=course;
    }

    public void startLearning(){
        course.displayCourse();
        System.out.println("Student has started learning");
    }
}
