import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {
    private final Student[] students;
    private int size;

    public StudentService() {
        students = new Student[100];
        size = 0;
    }

    public Student[] getStudents() {
        return students;
    }

    public int getSize() {
        return size;
    }

    public void addStudent(Student student) {
        students[size] = student;
        size++;
    }

    public void updateStudent(int idStudent, Student updatedStudent) {
        Student student = findStudent(idStudent);
        if (student == null) {
            throw new RuntimeException("KHONG TIM THAY");
        }else{
            student.setAge(updatedStudent.getAge());
            student.setEmail(updatedStudent.getEmail());
            student.setName(updatedStudent.getName());
        }
    }

    public void deleteStudent(int idStudent) {
        // [100....]
        // [ {1, "quang"}, {5, "huy"}, {7, "Phu"}, {2, "Phu"}]
        int indexStudent = findIndexStudent(idStudent);
        if(indexStudent != -1){
            throw new RuntimeException("KHONG TIM THAY");
        }else{
            for(int i = indexStudent; i< size-1;i++){
                students[i] = students[i +1];
            }
            students[size-1] = null;
            size--;
        }
    }

    public int findIndexStudent(int id){
        for(int i= 0; i< size;i++){
            if(students[i].getId() == id){
                return i;
            }
        }
        return -1;
    }
    public Student findStudent(int id){
        for(int i= 0; i< size;i++){
            if(students[i].getId() == id){
                return students[i];
            }
        }
        return null;
    }

    public Student getStudent(int i) {
        return students[i];
    }
    public Student[] searchByName(String nametoSearch){
        List<Student> foundStudents = new ArrayList<>();
        String nameToSearch = null;
        for (int i = 0; i < size; i++) {
            students[i].getName();
        }

        throw new RuntimeException("Không tìm thấy sinh viên có tên '" + null + "'.");
    }

    public Student searchById(int idToSearch) {
        for (int i = 0; i < size; i++) {
            if (students[i].getId() == idToSearch) {
                return students[i];
            }
        }

        throw new RuntimeException("Không tìm thấy sinh viên có ID '" + idToSearch + "'.");
    }
}
