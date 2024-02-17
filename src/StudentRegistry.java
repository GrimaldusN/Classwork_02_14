import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentRegistry {
    private Map<Integer, Student> map;

    public StudentRegistry() {
        this.map = new HashMap<>();
    }

    public void addStudent(Student student) {
        map.put(student.getId(), student);
    }

    public void removeStudent(int id) {
        map.remove(id);
    }

    public List<Student> findStudentsByMajor(String major) {
        return map.values().stream()
                .filter(student -> student.getMajor().name().equals(major))
                .toList();
    }

    public double calculateAverageGrade() {
        return map.values().stream()
                .mapToDouble(Student::getGrade)
                .average()
                .orElse(0.0);
    }

    public List<Student> listStudentsByYear(int year) {
        return map.values().stream()
                .filter(student -> student.getYear() == year)
                .collect(Collectors.toList());
    }

    public Student getStudent(int id) {
        return map.get(id);
    }

    public int getTotalNumberOfStudents() {
        return map.size();
    }

    public List<Student> getStudentsWithGradeAbove(double grade) {
        return map.values().stream()
                .filter(student -> student.getGrade() > grade)
                .collect(Collectors.toList());
    }

    public double getAverageGradeByMajor(String major) {
        return map.values().stream()
                .filter(student -> student.getMajor().toString().equalsIgnoreCase(major))
                .mapToDouble(Student::getGrade)
                .average()
                .orElse(0.0);
    }

    public boolean isStudentPresent(String email) {
        return map.values().stream()
                .anyMatch(student -> student.getEmail().equalsIgnoreCase(email));
    }
}