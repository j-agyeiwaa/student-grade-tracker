# Student Grade Tracker

A simple command-line Java application that tracks grades for multiple students, computes individual averages and letter grades, and generates an overall class summary.

## Features
* **Multi-Student Tracking:** Enter grades for any number of students in a single session.
* **Input Validation:** Automatically filters out invalid grades outside the `0–100` range.
* **Individual Summaries:** Calculates total score, grade count, average score, and letter grade (`A` through `F`) for each student.
* **Class Summary:** Displays total students processed, pass/fail counts (passing average `>= 60.0`), and the overall class average.

## Project Structure
* **`Student.java`** — Model class that stores a student's name, running grade total, and grade count, and computes their average and letter grade.
* **`GradeTracker.java`** — Main entry point that handles console input/output and aggregates class-wide statistics.

## Prerequisites
* **Java Development Kit (JDK)** 8 or higher installed on your machine. You can verify your installation by running:
  ```bash
  java -version
  javac -version
  ```

## How to Clone and Run

### 1. Clone the Repository
```bash
git clone https://github.com
cd student-grade-tracker
```

### 2. Compile the Java Files
```bash
javac Student.java GradeTracker.java
```

### 3. Run the Program
```bash
java GradeTracker
```

## Example Usage
```text
How many students? 2

Student 1
Enter full name: Ama
Enter grade or -1 to quit: 85
Enter grade or -1 to quit: 78
Enter grade or -1 to quit: -1
Ama: 2 grades, total 163, average 81.50, letter grade A

Student 2
Enter full name: Kwame
Enter grade or -1 to quit: 55
Enter grade or -1 to quit: -1
Kwame: 1 grades, total 55, average 55.00, letter grade F

========== Class Summary ==========
Students processed: 2
Passed: 1
Failed: 1
Overall average of all grades: 72.67
```