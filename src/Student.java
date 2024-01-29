public class Student {
    private int id;
    private String name;
    private int age;
    private String email;

    public Student(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Student(int id) {
    }
    public Student() {
    }

    // Constructors, getters, setters, and toString method
    // ...

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    public int getId() {
        return 0;
    }

    public String getName() {
        if (name.length() > 10) { // Add a condition to stop recursion
            return name;
        }
        return getName();
    }
    public static void main(String[] args) {
        Student student = new Student(1);
        System.out.println(student.getName());
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
