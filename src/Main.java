import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
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
        Student student11 = new Student(11, "Nguyễn Hải Nhật Huy", 25, "nhathuynguyenhai@gmail.com");
        Student student12 = new Student(12, "Ngô Sỹ Hoàng", 24, "ngohoang8320@gmail.com");
        Student student13 = new Student(13, "Nguyễn Nhật Minh", 18, "nhatminh14092005@gmail.com");
        Student student14 = new Student(14, "Quang Tiên Phú", 27, "phuqtp@gmail.com");
        Student student15 = new Student(15, "Lê Hữu Sử", 29, "huusu.9316@gmail.com");
        Student student16 = new Student(16, "Trương Trác Văn", 27, "truongtracvan@gmail.com");

        manager.addStudent(student1);
        manager.addStudent(student2);
        manager.addStudent(student3);
        manager.addStudent(student4);
        manager.addStudent(student5);
        manager.addStudent(student6);
        manager.addStudent(student7);
        manager.addStudent(student8);
        manager.addStudent(student9);
        manager.addStudent(student10);
        manager.addStudent(student11);
        manager.addStudent(student12);
        manager.addStudent(student13);
        manager.addStudent(student14);
        manager.addStudent(student15);
        manager.addStudent(student16);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Thêm sinh viên");
            System.out.println("3. Sửa thông tin sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Tìm kiếm theo tên");
            System.out.println("6. Tìm kiếm theo ID");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    manager.displayAllStudents();
                    break;
                case 2:
                    manager.addStudentFromInput(scanner);
                    break;
                case 3:
                    manager.updateStudentFromInput(scanner);
                    break;
                case 4:
                    manager.deleteStudentFromInput(scanner);
                    break;
                case 5:
                    manager.searchByNameFromInput(scanner);
                    break;
                case 6:
                    manager.searchByIdFromInput(scanner);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        } while (choice != 0);

        scanner.close();
    }
}

