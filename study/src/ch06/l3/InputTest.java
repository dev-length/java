package ch06.l3;

public class InputTest {
    public static void main(String[] args) {
        String str = Input.read("문자열 입력: ");
        System.out.println("문자열: " + str);

        String str2 = Input.read("문자열 입력", "defaultValue");
        System.out.println("입력한 문자열 or DefaultValue : " + str2);

        int integer = Input.readInt("int 입력: ");
        System.out.println("int: " + integer);

        boolean isStudent = Input.confirm("Are you a student?");
        System.out.println("Is student: " + isStudent);

        boolean likesCoffee = Input.confirm("Do you like coffee?", false);
        System.out.println("Likes coffee: " + likesCoffee);
    }
}
