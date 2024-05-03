import java.util.ArrayList;
import java.util.Scanner;

// Класс, представляющий студента
class Student {
    private String name;
    private int age;
    private String id;

    // Конструктор
    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    // Метод для получения имени студента
    public String getName() {
        return name;
    }

    // Метод для получения возраста студента
    public int getAge() {
        return age;
    }

    // Метод для получения идентификатора студента
    public String getId() {
        return id;
    }

    // Метод для установки имени студента
    public void setName(String name) {
        this.name = name;
    }

    // Метод для установки возраста студента
    public void setAge(int age) {
        this.age = age;
    }

    // Метод для установки идентификатора студента
    public void setId(String id) {
        this.id = id;
    }

    // Метод для отображения информации о студенте
    public void displayInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age + ", ID: " + id);
    }
}

// Класс, представляющий группу студентов
class StudentGroup {
    private String groupName;
    private ArrayList<Student> students;

    // Конструктор
    public StudentGroup(String groupName) {
        this.groupName = groupName;
        students = new ArrayList<>();
    }

    // Метод для добавления студента в группу
    public void addStudent(Student student) {
        students.add(student);
    }

    // Метод для удаления студента из группы
    public void removeStudent(Student student) {
        students.remove(student);
    }

    // Метод для отображения информации о группе студентов
    public void displayGroupInfo() {
        System.out.println("Група: " + groupName);
        System.out.println("Студенты:");
        for (Student student : students) {
            student.displayInfo();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем несколько студентов
        Student student1 = new Student("Осипов Пётр Александрович", 20, "S001");
        Student student2 = new Student("Гусева Аделина Никитична", 20, "S002");
        Student student3 = new Student("Голиков Артур Давидович", 19, "S003");
        Student student4 = new Student("Козырев Савелий Лукич", 20, "S004");
        Student student5 = new Student("Жукова Вера Глебовна", 19, "S005");
        Student student6 = new Student("Кузьмин Артём Вадимович", 20, "S006");
        Student student7 = new Student("Игнатов Султан", 19, "S007");
        Student student8 = new Student("Калинина Алиса Германовна", 20, "S008");
        Student student9 = new Student("Булгакова Александра Михайловна", 19, "S009");
        Student student10 = new Student("Медведев Владислав Сергеевич", 19, "S010");


        // Создаем группу студентов
        StudentGroup group = new StudentGroup("ПИ-1-22");

        // Добавляем студентов в группу
        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);
        group.addStudent(student4);
        group.addStudent(student5);
        group.addStudent(student6);
        group.addStudent(student7);
        group.addStudent(student8);
        group.addStudent(student9);
        group.addStudent(student10);

        // Отображаем информацию о группе студентов
        group.displayGroupInfo();
        System.out.println("Что вы хотите сделать? \n1) удалить 2) добавить 3) выйти");
        Scanner scanner = new Scanner(System.in);
        String userDo = scanner.nextLine();

        if (userDo.equals("удалить")) {
            System.out.println("Кого вы хотите удалить?");
            Scanner scanner1 = new Scanner(System.in);
            String whom = scanner.nextLine();
            if (whom.equals("1")) {
                group.removeStudent(student1);
                group.displayGroupInfo();
            }
            if (whom.equals("2")) {
                group.removeStudent(student2);
                group.displayGroupInfo();
            }
            if (whom.equals("3")) {
                group.removeStudent(student3);
                group.displayGroupInfo();
            }
            if (whom.equals("4")) {
                group.removeStudent(student4);
                group.displayGroupInfo();
            }
            if (whom.equals("5")) {
                group.removeStudent(student5);
                group.displayGroupInfo();
            }
            if (whom.equals("6")) {
                group.removeStudent(student6);
                group.displayGroupInfo();
            }
            if (whom.equals("7")) {
                group.removeStudent(student7);
                group.displayGroupInfo();
            }
            if (whom.equals("8")) {
                group.removeStudent(student8);
                group.displayGroupInfo();
            }
            if (whom.equals("9")) {
                group.removeStudent(student9);
                group.displayGroupInfo();
            }
            if (whom.equals("10")) {
                group.removeStudent(student10);
                group.displayGroupInfo();
            }
        }
        if (userDo.equals("выйти")) {
            scanner.close();
        }
    }
}
