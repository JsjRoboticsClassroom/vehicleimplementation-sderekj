package nyc.c4q.dereksantos;

public class Classroom {
    Teacher teacher = new Teacher();
    Student[] students = new Student[30];

    public static void main(String[] args) {
//        Classroom classroom = new Classroom();
//        Student student = new Student(1234, 26, "Derek");
//
//        classroom.add(student);

//        int age = 26;
//        int teacherId = 1234;
//        String name = "Derek";

        Teacher mathTeacher = new Teacher(); // teacher age == 20
        System.out.println(mathTeacher.getId() + " and " + mathTeacher.getAge() + " and " + mathTeacher.getName());

        Teacher englishTeacher = new Teacher(876, 45, "Mr. Smith"); // teacher age == 20
        System.out.println(englishTeacher.getId() + " and " + englishTeacher.getAge() + " and " + englishTeacher.getName());

        Teacher spanishTeacher = new Teacher(); // teacher age == 20
        System.out.println(spanishTeacher.getId() + " and " + spanishTeacher.getAge() + " and " + spanishTeacher.getName());

    }

    private void add(Student student) {
        students[0] = student;
    }
}
