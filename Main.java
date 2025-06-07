import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n🎓 Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Update Student");
            System.out.println("4. View All Students");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    manager.addStudent(new Student(id, name, age));
                    break;

                case 2:
                    System.out.print("Enter ID to remove: ");
                    String removeId = scanner.nextLine();
                    manager.removeStudent(removeId);
                    break;

                case 3:
                    System.out.print("Enter ID to update: ");
                    String updateId = scanner.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter New Age: ");
                    int newAge = scanner.nextInt();
                    manager.updateStudent(updateId, newName, newAge);
                    break;

                case 4:
                    manager.viewAllStudents();
                    break;

                case 0:
                    System.out.println("👋 Exiting...");
                    break;

                default:
                    System.out.println("❗ Invalid choice.");
            }

        } while (choice != 0);

        scanner.close();
    }
}
