import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

public class Student {
    public String fname;
    public String lname;
    public Integer indexNumber;
    public String email;
    public String address;
    public List<Double> grades;

    private static final int MIN_MEAN = 2;
    private static final int MAX_MEAN = 5;
    private static final int MAX_GRADES_SIZE = 20;

    public Student() {
        grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        if (grades.size() == MAX_GRADES_SIZE) {
            throw new IllegalStateException("Cannot add more grades");
        }

        grades.add(grade);
    }

    public double calculateMean() {
        if (isNull(grades) || grades.isEmpty()) {
            throw new IllegalArgumentException("Student has no grades.");
        }

        double sum = 0;
        for (double grade : grades) {
            sum = sum + grade;
        }

        double mean = sum / grades.size();

        if (mean < MIN_MEAN) {
            return MIN_MEAN;
        } else if (mean > MAX_MEAN) {
            return MAX_MEAN;
        } else {
            return (double) Math.round(mean * 2) / 2;
        }
    }
}
