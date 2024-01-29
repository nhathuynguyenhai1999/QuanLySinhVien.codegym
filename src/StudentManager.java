import java.util.Scanner;

public class StudentManager {
    private Student[] students;
    private int size;

    public StudentManager() {
        students = new Student[100];
        size = 0;
    }

    public void addStudent(Student student) {
        if (size < 100) {
            students[size++] = student;
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Cannot add more students. Array is full.");
        }
    }

    public void displayAllStudents() {
        System.out.println("List of all students:");
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
    }

    public void searchByName(String name) {
        System.out.println("Search results for name '" + name + "':");
        for (int i = 0; i < size; i++) {
            if (students[i].getName().equalsIgnoreCase(name)) {
                System.out.println(students[i]);
            }
        }
    }

    public boolean searchById(int id) {
        System.out.println("Search results for ID " + id + ":");
        for (int i = 0; i < size; i++) {
            if (students[i].getId() == id) {
                System.out.println(students[i]);
                return true;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
        return false;
    }

    // Add other CRUD operations (update, delete) as needed

    public void initializeStudents(StudentManager manager) {
        // Thêm sinh viên mẫu vào StudentManager
        // ...
    }

    public void addStudentFromInput(Scanner scanner) {
        System.out.print("Nhập ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer
        System.out.print("Nhập email: ");
        String email = scanner.nextLine();

        Student newStudent = new Student(id, name, age, email);
        addStudent(newStudent);
    }

    public void updateStudentFromInput(Scanner scanner) {
        System.out.print("Nhập ID của sinh viên cần sửa: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer

        // Kiểm tra xem sinh viên có tồn tại không
        if (searchById(id)) {
            // Sinh viên tồn tại, cho phép sửa thông tin
            System.out.print("Nhập tên mới: ");
            String newName = scanner.nextLine();
            System.out.print("Nhập tuổi mới: ");
            int newAge = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer
            System.out.print("Nhập email mới: ");
            String newEmail = scanner.nextLine();

            // Gọi phương thức cập nhật của đối tượng sinh viên
            updateStudent(id, newName, newAge, newEmail);
            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Sinh viên không tồn tại.");
        }
    }

    private void updateStudent(int id, String newName, int newAge, String newEmail) {
        // Implement logic for updating student details
    }

    public void deleteStudentFromInput(Scanner scanner) {
        System.out.print("Nhập ID của sinh viên cần xóa: ");
        int id = scanner.nextInt();

        // Kiểm tra xem sinh viên có tồn tại không
        if (searchById(id)) {
            // Sinh viên tồn tại, cho phép xóa
            deleteStudent(id);
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Sinh viên không tồn tại.");
        }
    }

    private void deleteStudent(int id) {
        // Implement logic for deleting a student
    }

    public void searchByNameFromInput(Scanner scanner) {
        scanner.nextLine(); // Clear the buffer
        System.out.print("Nhập tên sinh viên cần tìm kiếm: ");
        String name = scanner.nextLine();
        searchByName(name);
    }

    public void searchByIdFromInput(Scanner scanner) {
        System.out.print("Nhập ID sinh viên cần tìm kiếm: ");
        int id = scanner.nextInt();
        searchById(id);
    }
}
