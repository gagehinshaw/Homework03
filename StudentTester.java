//P3.7 Pt.2 Add a tester class for Student

public class StudentTester {
    public static void main(String[] args){
        Student gage = new Student("Gage");
        System.out.println(gage.getName());
        gage.addQuiz(90);
        gage.addQuiz(20);
        System.out.println("Total Score: " + gage.getTotalScore());
        System.out.println("Average Score: " + gage.getAverageScore());
    }
}
