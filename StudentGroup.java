import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    public String name;
    public List<Student> students;

    private static final int MAX_GROUP_SIZE = 15;

    StudentGroup() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (students.contains(student)) {
            throw new IllegalStateException("This student exists in group.");
        }

        if (students.size() == MAX_GROUP_SIZE) {
            throw new IllegalStateException("Group is full.");
        }

        students.add(student);
    }
}
