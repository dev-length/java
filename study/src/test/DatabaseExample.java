package test;

public class DatabaseExample {
    public static void main(String[] args) {
        Database db = new Database();
        System.out.println("데이터베이스: " + db.connect());
        db.close();
    }
}
