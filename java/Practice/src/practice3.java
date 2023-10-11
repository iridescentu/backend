import java.util.Scanner;
public class practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int kor, mat, eng, total;
        double avg;

        System.out.println("Enter your score of Korean exam: ");
        kor = s.nextInt();

        System.out.println("Enter your score of Math exam: ");
        mat = s.nextInt();

        System.out.println("Enter your score of English exam: ");
        eng = s.nextInt();

        total = kor + mat + eng;
        avg = (kor + mat + eng) / 3;

        if (kor >= 40 &&  mat >= 40 &&  eng >= 40 && avg >= 60) {
                System.out.println("Your score of Korean exam: " + kor);
                System.out.println("Your score of Math exam: " + mat);
                System.out.println("Your score of English exam: " + eng);
                System.out.println("Your total score is: " + total);
                System.out.println("Your average of exam score is: " + avg);
                System.out.println("Congratulations! You passed!");

        } else {
                System.out.println("Your score of Korean exam: " + kor);
                System.out.println("Your score of Math exam: " + mat);
                System.out.println("Your score of English exam: " + eng);
                System.out.println("You failed on your exam.");
        }

        s.close();

	}

}
