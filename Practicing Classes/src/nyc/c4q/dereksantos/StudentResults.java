package nyc.c4q.dereksantos;

public class StudentResults {

    private String Full_Name;
    private String Exam_Name;
    private String Exam_Score;
    private String Exam_Grade;

    StudentResults() {

        Full_Name = "No Name Given";
        Exam_Name = "Unknown";
        Exam_Score = "No Score";
        Exam_Grade = "Unknown";
    }

    String fullName (String aName) {

        Full_Name = aName;
        return Full_Name;
    }

    String examName (String examCode) {
        if (examCode.equals("VB")) {
            Exam_Name = "Visual Basic .NET";
        } else if (examCode.equals("JV")) {
            Exam_Name = "Java";
        } else if (examCode.equals("C#")) {
            Exam_Name = "C# .NET";
        } else if (examCode.equals("PH")) {
            Exam_Name = "PHP";
        } else {
            Exam_Name = "No Exam Selected";
        }
        return Exam_Name;
    }

}
