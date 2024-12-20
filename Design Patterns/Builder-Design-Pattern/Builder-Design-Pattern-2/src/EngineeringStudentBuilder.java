import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects=new ArrayList<>();
        subjects.add("DBMS");
        subjects.add("OS");
        subjects.add("High Level Design");
        this.subjects= subjects;
        return this;
    }
}
