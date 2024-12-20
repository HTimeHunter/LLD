public class Student {
    private int age;
    private String name;

    private Student(StudentBuilder studentBuilder){
        this.age=studentBuilder.age;
        this.name=studentBuilder.name;
    }

    public static StudentBuilder builder(){
        return new StudentBuilder();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){

        return "name: ["+name+"]\nage: ["+age+"]";
    }

    public static class StudentBuilder{
        private int age;
        private String name;

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}
