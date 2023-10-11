import java.util.Scanner;
public class practice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

        int grade, examGrade = 0;

        System.out.println("What grade are you in?(1 to 4): ");
        grade = s.nextInt();

        switch(grade) {
        case 1:
               	System.out.println("What was your midterm grade?: ");
                examGrade = s.nextInt();

                if (examGrade >= 60 && examGrade <= 100) {
                        System.out.println("Pass!");
                } else if (examGrade <= 60 && examGrade >= 0) {
                        System.out.println("Fail.");
                } else if (examGrade < 0 || examGrade > 100) {
                        System.out.println("Please enter your grade between 0 to 100.");
                }
                break;

        case 2:
               	System.out.println("What was your midterm grade?: ");
                examGrade = s.nextInt();

                if (examGrade >= 60 && examGrade <= 100) {
                        System.out.println("Pass!");
                } else if (examGrade <= 60 && examGrade >= 0) {
                        System.out.println("Fail.");
                } else if (examGrade < 0 || examGrade > 100) {
                        System.out.println("Please enter your grade between 0 to 100.");
                }
                break;

        case 3:
           	System.out.println("What was your midterm grade?: ");
            examGrade = s.nextInt();

            if (examGrade >= 60 && examGrade <= 100) {
                    System.out.println("Pass!");
            } else if (examGrade <= 60 && examGrade >= 0) {
                    System.out.println("Fail.");
            } else if (examGrade < 0 || examGrade > 100) {
                    System.out.println("Please enter your grade between 0 to 100.");
            }
            break;
            
        case 4:
           	System.out.println("What was your midterm grade?: ");
            examGrade = s.nextInt();

            if (examGrade >= 70 && examGrade <= 100) {
                    System.out.println("Pass!");
            } else if (examGrade <= 60 && examGrade >= 0) {
                    System.out.println("Fail.");
            } else if (examGrade < 0 || examGrade > 100) {
                    System.out.println("Please enter your grade between 0 to 100.");
            }
            break;

        }

		
		s.close();
		
	}

}
