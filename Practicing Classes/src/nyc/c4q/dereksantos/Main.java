package nyc.c4q.dereksantos;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StudentResults aStudent = new StudentResults();

        String sName = aStudent.fullName("Bill Gates");
        String exam = aStudent.examName("VB");

        System.out.println(sName);
        System.out.println(exam);
    }
}
