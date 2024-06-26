package ch12.sec03.exam02;

public class Student {
    private int no;
    private String name;
    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }
    public int getNo() { return no; }
    public String getName() { return name; }

    @Override
    public int hashCode() {
//        name의 hashCode인 54150062 + 1 이라는 뜻
        int hashCode = no + name.hashCode();
        return hashCode;
    }
    @Override
    public boolean equals(Object obj) {
        // obj가 Student 타입인지 체크 후 형변환해서 target에 저장
        if(obj instanceof Student target) {
            // 받아온 obj와 target에 no와 name이 같은지 체크
            if(no == target.getNo() && name.equals(target.getName())) {
                return true;
            }
        }
        return false;
    }
}
