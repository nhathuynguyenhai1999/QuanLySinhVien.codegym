import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.initData();


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
//                case 3:
//                    manager.updateStudentFromInput(scanner);
//                    break;
               case 4:
                   manager.deleteStudentFromInput(scanner);
                   break;
//                case 5:
//                    manager.searchByNameFromInput(scanner);
//                    break;
//                case 6:
//                    manager.searchByIdFromInput(scanner);
//                    break;
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
