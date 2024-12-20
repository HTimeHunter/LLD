public class Main {
    public static void main(String[] args) {
        Student harsh=Student.builder().setAge(22).setName("harsh").build();
        System.out.println(harsh.toString());
    }
}