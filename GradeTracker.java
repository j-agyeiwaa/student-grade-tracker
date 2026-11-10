import java.util.Scanner;

public class GradeTracker {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

          int passed = 0;
          int failed = 0;
          int allTotal = 0;
          int allCount = 0;

          System.out.print("How many students? ");
          int numberOfStudents = input.nextInt();

          int studentCounter = 1;
          while (studentCounter <= numberOfStudents) {
               System.out.printf("%nStudent %d%n", studentCounter);
               System.out.print("Enter full name: ");
               String name = input.nextLine();
               input.nextLine();

               Student student = new Student(name);

               System.out.print("Enter grade or -1 to quit: ");
               int grade = input.nextInt();

               while (grade != -1) {
                    if (grade < 0 || grade > 100) {
                         System.out.println("Invalid grade, ignored.");
                    } else {
                         student.addGrade(grade);
                    }

                    System.out.print("Enter grade or -1 to quit: ");
                    grade = input.nextInt();
               }

               if (student.getGradeCount() != 0) {
                    System.out.printf("%s: %d grades, total %d, average %.2f, letter grade %s%n", student.getName(), student.getGradeCount(), student.getTotal(), student.getAverage(), student.getLetterGrade());

                    if (student.getAverage() >= 60.0) {
                         passed++;
                    } else {
                         failed++;
                    }

                    allTotal += student.getTotal();
                    allCount += student.getGradeCount();
               } else {
                    System.out.printf("%s: No grades were entered%n", student.getName());
               }

               studentCounter++; 
          }

          System.out.printf("%n========== Class Summary ==========%n");
          System.out.printf("Students processed: %d%n", numberOfStudents);
          System.out.printf("Passed: %d%n", passed);
          System.out.printf("Failed: %d%n", failed);

          if (allCount != 0) {
               double overallAverage = (double) allTotal / allCount;
               System.out.printf("Overall average of all grades: %.2f%n", overallAverage);
          } else {
               System.out.println("No grades were entered");
          }

          input.close();
     }
}