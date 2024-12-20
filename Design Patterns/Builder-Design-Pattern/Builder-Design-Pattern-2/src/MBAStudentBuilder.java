import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects=new ArrayList<>();
        subjects.add("accounts");
        subjects.add("micro economics");
        subjects.add("business management");
        this.subjects=subjects;
        return this;
    }
}
