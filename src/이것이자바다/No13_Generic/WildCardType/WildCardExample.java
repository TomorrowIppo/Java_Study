package 이것이자바다.No13_Generic.WildCardType;

import com.sun.source.tree.UsesTree;

import java.util.Arrays;

public class WildCardExample {
    // 이 자리에 올 수 있는 Course 객체의 타입 패러미터는 어떤 타입이어도 상관 없다.
    public static void registerCourse(Course<?> course) {
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
    }
    // extends는 상위 클래스 제한이기 때문에 Student 클래스 포함 하위 클래스만 올 수 있다. 즉, Student 자신과 Student를 상속한 객체
    public static void registerCourseStudent(Course<? extends Student> course) {
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
    }
    // super는 하위 클래스 제한이기 때문에 Worker 클래스 포함 상위 클래스만 올 수 있다. 즉, Worker 자신과 Worker가 상속한 객체
    public static void registerCourseWorker(Course<? super Worker> course) {
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
    }

//    public static void main(String[] args) {
//        registerCourse(new Course<Person>("일반인 과정", 5));
//        registerCourse(new Course<Student>("학생 과정", 5));
//        registerCourse(new Course<Worker>("근로자 과정", 5));
//        registerCourse(new Course<HighStudent>("고등학생 과정", 5));
//
//        //registerCourseStudent(new Course<Person>("일반인 과정", 5));               Student의 상위 클래스
//        registerCourseStudent(new Course<Student>("학생 과정", 5));
//        //registerCourseStudent(new Course<Worker>("근로자 과정", 5));               Student와 관계없는 클래스
//        registerCourseStudent(new Course<HighStudent>("고등학생 과정", 5));
//
//        registerCourseWorker(new Course<Person>("일반인 과정", 5));
//        registerCourseWorker(new Course<Student>("학생 과정", 5));
//        //registerCourseWorker(new Course<Worker>("근로자 과정", 5));                Student와 관계없는 클래스
//        //registerCourseWorker(new Course<HighStudent>("고등학생 과정", 5));          Student의 하위 클래스
//    }

    public static void main(String[] args) {
        Course<Person> personCourse = new Course<Person>("일반인 과정", 5);
        personCourse.add(new Person("일반인"));
        personCourse.add(new Person("직장인"));
        personCourse.add(new Person("학생"));
        personCourse.add(new Person("고등학생"));

        Course<Worker> workerCourse = new Course<>("직장인 과정", 5);
        workerCourse.add(new Worker("직장인"));

        Course<Student> studentCourse = new Course<>("학생 과정", 5);
        studentCourse.add(new Student("학생"));
        studentCourse.add(new HighStudent("고등학생"));

        Course<HighStudent> highstudentCourse = new Course<>("고등학생 과정", 5);
        highstudentCourse.add(new HighStudent("고등학생"));

        registerCourse(personCourse);
        registerCourse(workerCourse);
        registerCourse(studentCourse);
        registerCourse(highstudentCourse);
        System.out.println();

        //registerCourseStudent(personCourse);
        //registerCourseStudent(workerCourse);
        registerCourseStudent(studentCourse);
        registerCourseStudent(highstudentCourse);
        System.out.println();

        registerCourseWorker(personCourse);
        registerCourseWorker(workerCourse);
        //registerCourseWorker(studentCourse);
        //registerCourseWorker(highstudentCourse);
        System.out.println();
    }

}
