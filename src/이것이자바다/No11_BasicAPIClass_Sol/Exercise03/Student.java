package 이것이자바다.No11_BasicAPIClass_Sol.Exercise03;

import java.util.Objects;

public class Student {
    public String studentNum;

    public Student(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getStudentNum() {
        return studentNum;
    }

    //여기서 코드를 작성하세요.


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student student = (Student) obj;
            if(studentNum.equals(student.studentNum)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentNum.hashCode();
    }
}
