package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final int EXCELLENT = 9;
    private static final int VERY_GOOD = 8;
    private static final int GOOD = 7;
    private static final int PASS = 5;
    public static void main(String[] args) {

        int[][] studentMarks = {
                {88, 92, 79, 95, 91}, // Student 1
                {65, 72, 58, 64, 70}, // Student 2
                {45, 52, 48, 55, 40}, // Student 3
                {96, 98, 94, 90, 100}, // Student 4
                {78, 82, 85, 74, 80}  // Student 5
        };
        displayResult(studentMarks);
    }

        public static double averageResult (int [] stMarks){
            if (stMarks != null && stMarks.length != 0){
                int sum = 0;
                for (int i=0; i<stMarks.length; i++){
                    sum += stMarks[i];
                }
                return (double) sum / stMarks.length;
            }
            else {
                return 0.0;
            }
        }

        public static String performanceResults (double averageScore){
            int scoreResult = (int) averageScore / 10;

            if (scoreResult >= EXCELLENT) {
                return "A (Excellent)";
            } else if (scoreResult >= VERY_GOOD) {
                return "B (Very Good)";
            } else if (scoreResult >= GOOD) {
                return "C (Good)";
            } else if (scoreResult >= PASS) {
                return "D (Pass)";
            } else {
                return "F (Needs Improvement)";
            }
        }

        public static void displayResult (int[][] allStudentsMarks){
            for (int index = 0; index < allStudentsMarks.length; index++) {
                int studentId = index + 1;
                int[] marks = allStudentsMarks[index];
                double average = averageResult(marks);
                String grade = performanceResults(average);

                System.out.println("Student ID: " + studentId);
                System.out.print("Marks: ");
                for (int i = 0; i < marks.length; i++) {
                    System.out.print(marks[i] + (i < marks.length - 1 ? ", " : ""));
                }
                System.out.println();
                System.out.println("Average: " + average);
                System.out.println("Grade: " + grade);
            }
        }
}