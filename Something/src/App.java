public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Database data = new Database("students");

        Student gabe = new Student("gabe", "Virginia", "Latino", 3.41);



        data.getDatabase().add(gabe);
        



    }
}
