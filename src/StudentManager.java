import java.util.Scanner;

public class StudentManager {
    private StudentService studentService;


    public StudentManager() {
        studentService = new StudentService();

    }
    public void initData(){
        Student student1 = new Student(1, "Nguyễn Văn Bình", 30, "binhrobbin.ace@gmail.com");
        Student student2 = new Student(2, "Lê Huy Hoàng", 24, "hoangle71200@gmail.com");
        Student student3 = new Student(3, "Dương Minh Hiếu", 25, "hieuchieuhien@gmail.com");
        Student student4 = new Student(4, "Trịnh Lưu Khoa", 22, "khoatrinh2909@gmail.com");
        Student student5 = new Student(5, "Nguyễn Công Lộc", 34, "congloc15689@gmail.com");
        Student student6 = new Student(6, "Đặng Mỹ Duyên", 21, "myd55312@gmail.com");
        Student student7 = new Student(7, "Lưu Gia Huy", 26, "sanbang4567@gmail.com");
        Student student8 = new Student(8, "Lê Thành Nhơn", 26, "lethanhnhon113@gmail.com");
        Student student9 = new Student(9, "Huỳnh Đình Việt Toàn", 21, "huynhdinhviett@gmail.com");
        Student student10 = new Student(10, "Nguyễn Văn Công", 24, "cn247123@gmail.com");

        studentService.addStudent(student1);
        studentService.addStudent(student2);
        studentService.addStudent(student3);
        studentService.addStudent(student4);
        studentService.addStudent(student5);
        studentService.addStudent(student6);
        studentService.addStudent(student7);
        studentService.addStudent(student8);
        studentService.addStudent(student9);
        studentService.addStudent(student10);

    }


    public void displayAllStudents() {
        Student [] students = studentService.getStudents();
        System.out.println("List of all students:");
        for (int i = 0; i < studentService.getSize(); i++) {
            System.out.println(students[i]);
        }
    }

//    public void searchByName(String name) {
//        System.out.println("Search results for name '" + name + "':");
//        for (int i = 0; i < size; i++) {
//            if (students[i].getName().equalsIgnoreCase(name)) {
//                System.out.println(students[i]);
//            }
//        }
//    }
//
//    public boolean searchById(int id) {
//        System.out.println("Search results for ID " + id + ":");
//        for (int i = 0; i < size; i++) {
//            if (students[i].getId() == id) {
//                System.out.println(students[i]);
//                return true;
//            }
//        }
//        System.out.println("Student with ID " + id + " not found.");
//        return false;
//    }

    // Add other CRUD operations (update, delete) as needed


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
        studentService.addStudent(newStudent);
    }


        public void deleteStudentFromInput(Scanner scanner) {
        System.out.print("Nhập ID của sinh viên cần xóa: ");
        int id = scanner.nextInt();

            for (int i = 0; i < studentService.getSize(); i++) {
                Student student = studentService.getStudent(i);
                int idToDelete = 0;
                if (student.getId() == idToDelete){
                    studentService.deleteStudent(i);
                    System.out.println("Sinh viên có ID:" + idToDelete + " đã được xóa.");
                    return;
                }
            }
    }

    public void updateStudentFromInput(Scanner scanner) {
        System.out.print("Nhập ID của sinh viên cần sửa: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer

        // Kiểm tra xem sinh viên có tồn tại không
        Student student = studentService.findStudent(id);
        if (student!=null) {
            // Sinh viên tồn tại, cho phép sửa thông tin
            System.out.print("Nhập tên mới: ");
            String newName = scanner.nextLine();
            System.out.print("Nhập tuổi mới: ");
            int newAge = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer
            System.out.print("Nhập email mới: ");
            String newEmail = scanner.nextLine();

            // Gọi phương thức cập nhật của đối tượng sinh viên
            Student newStudent = new Student();
            newStudent.setName(newName);
            newStudent.setAge(newAge);
            newStudent.setEmail(newEmail);

            studentService.updateStudent(student.getId(), newStudent);
            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Sinh viên không tồn tại.");
        }
    }
    public void searchByNameFromInput(Scanner scanner){
        System.out.println("Nhập tên sinh viên cần tìm:");
        String nameToSearch = scanner.nextLine();
        Student[] foundStudents = studentService.searchByName(nameToSearch);

        if(foundStudents.length > 0){
            System.out.println("Danh sách sinh viên có tên '" + nameToSearch + "':");
            for(Student student : foundStudents){
                System.out.println(student);
            }
        } else{
            System.out.println("Không tìm thấy sinh viên có tên '" + nameToSearch + "'.");
        }
    }
    public void searchByIdFromInput(Scanner scanner) {
        System.out.print("Nhập ID của sinh viên cần tìm: ");
        int idToSearch = scanner.nextInt();

        Student foundStudent = studentService.searchById(idToSearch);

        if (foundStudent != null) {
            System.out.println("Sinh viên có ID '" + idToSearch + "':");
            System.out.println(foundStudent);
        } else {
            System.out.println("Không tìm thấy sinh viên có ID '" + idToSearch + "'.");
        }
    }



//    public void searchByNameFromInput(Scanner scanner) {
//        System.out.print("Nhập tên sinh viên cần tìm: ");
//        String nameToSearch = scanner.next();
//
//        Student[] foundStudents = studentService.searchByName(nameToSearch);
//
//        if (foundStudents.length > 0) {
//            System.out.println("Danh sách sinh viên có tên '" + nameToSearch + "':");
//            for (Student student : foundStudents) {
//                System.out.println(student);
//            }
//        } else {
//            System.out.println("Không tìm thấy sinh viên có tên '" + nameToSearch + "'.");
//        }
//    }

//    public void searchByIdFromInput(Scanner scanner) {
//        System.out.print("Nhập ID của sinh viên cần tìm: ");
//        int idToSearch = scanner.nextInt();
//
//        Student foundStudent = studentService.searchById(idToSearch);
//
//        if (foundStudent != null) {
//            System.out.println("Sinh viên có ID '" + idToSearch + "':");
//            System.out.println(foundStudent);
//        } else {
//            System.out.println("Không tìm thấy sinh viên có ID '" + idToSearch + "'.");
//        }
//    }

//        // Kiểm tra xem sinh viên có tồn tại không
//        if (searchById(id)) {
//            // Sinh viên tồn tại, cho phép xóa
//            deleteStudent(id);
//            System.out.println("Student deleted successfully.");
//        } else {
//            System.out.println("Sinh viên không tồn tại.");
//        }
//
//    private void updateStudent(int id, String newName, int newAge, String newEmail) {
//        // Implement logic for updating student details
//    }
//

//
//    private void deleteStudent(int id) {
//        // Implement logic for deleting a student
//    }
//
//    public void searchByNameFromInput(Scanner scanner) {
//        scanner.nextLine(); // Clear the buffer
//        System.out.print("Nhập tên sinh viên cần tìm kiếm: ");
//        String name = scanner.nextLine();
//        searchByName(name);
//    }
//
//    public void searchByIdFromInput(Scanner scanner) {
//        System.out.print("Nhập ID sinh viên cần tìm kiếm: ");
//        int id = scanner.nextInt();
//        searchById(id);
//    }
}

    public Student getStudent(int i) {
        return students[i];
    }

}
