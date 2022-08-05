package 이것이자바다.No13_Generic.WildCardType;

public class Course<T> {
    private String name;
    private T[] students;

    public Course(String name, int capacity) {
        this.name = name;
        //students = new T[capacity];   Course 객체가 생성되기 전까지 T가 결정된 상태가 아니기 때문에
        //                              자바 문법에선 허용되지 않는 방식이다.
        //                              그렇기 때문에 Object 배열로 만든 뒤 강제로 T 타입으로 캐스팅 한다.
        students = (T[]) new Object[capacity];
    }

    public String getName() { return name; }
    public T[] getStudents() { return students; }

    // 학생 수강 목록 중에서 비어있는 공간을 채울 메소드
    public void add(T t) {
         for(int i=0; i<students.length; i++) {
             if(students[i] == null) {
                 students[i] = t;
                 break;
             }
         }
    }
}
