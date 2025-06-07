import java.util.*;

public class StudentManager {
    private Map<String, Student> studentMap = new HashMap<>();

    public void addStudent(Student student) {
        studentMap.put(student.getId(), student);
        System.out.println("✅ Student added.");
    }

    public void removeStudent(String id) {
        if (studentMap.containsKey(id)) {
            studentMap.remove(id);
            System.out.println("🗑️ Student removed.");
        } else {
            System.out.println("❌ Student not found.");
        }
    }

    public void updateStudent(String id, String name, int age) {
        Student student = studentMap.get(id);
        if (student != null) {
            student.setName(name);
            student.setAge(age);
            System.out.println("✏️ Student updated.");
        } else {
            System.out.println("❌ Student not found.");
        }
    }

    public void viewAllStudents() {
        if (studentMap.isEmpty()) {
            System.out.println("📭 No students available.");
        } else {
            System.out.println("📋 Student Records:");
            for (Student student : studentMap.values()) {
                System.out.println(student);
            }
        }
    }
}
