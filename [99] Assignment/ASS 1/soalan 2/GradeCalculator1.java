// */ What's wrong with this program? /*
public class GradeCalculator1 {
 public static void main(String[] argz){
 int score = 85; // set initial value of score
 if (score >= 90)
 System.out.println("Grade: A");
 else if (score >= 80)
 System.out.println("Grade: B");
 else if (score >= 70)
 System.out.println("Grade: C");
 else if (score >= 60)
 System.out.println("Grade: D");
 else
 System.out.println("Grade: F");
 int bonus = 10;
 	score = score + bonus;
 System.out.println("Total Score is: " + score);
 }
}
