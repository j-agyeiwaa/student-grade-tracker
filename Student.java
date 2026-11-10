public class Student {
     private String name;
     private int total;
     private int gradeCount;

     public Student(String name) {
          this.name = name;
     }

     public void addGrade(int grade) {
          if (grade >= 0 && grade <= 100) {
               total += grade;
               gradeCount++;
          }
     }

     public String getName() {
          return name;
     }

     public int getTotal() {
          return total;
     }

     public int getGradeCount() {
          return gradeCount;
     }

     public double getAverage() {
          if (gradeCount != 0) {
               return (double) total / gradeCount;
          }
          else {
               return 0.0;
          }
     }

     public String getLetterGrade() {
          double average = getAverage();
          String letterGrade = "";

          if (average >= 70.0) {
               letterGrade = "A";
          } else if (average >= 60.0) {
               letterGrade = "B";
          } else if (average >= 50.0) {
               letterGrade = "C";
          } else if (average >= 40.0) {
               letterGrade = "D";
          } else {
               letterGrade = "F";
          }

          return letterGrade;
     }
}