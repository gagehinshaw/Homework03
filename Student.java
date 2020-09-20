//P3.7 Create a student class
public class Student {
    private int totalQuizScore = 0;
    private String name;
    private int quizzes = 0;

    public Student(String newName){
        this.name = newName;
    }

    public String getName(){
        return this.name;
    }

    public void addQuiz(int score){
        this.totalQuizScore += score;
        this.quizzes += 1;
    }

    public int getTotalScore(){
        return this.totalQuizScore;
    }

    public int getAverageScore(){
        return this.totalQuizScore/this.quizzes;
    }
}
