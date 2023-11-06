import java.util.Scanner;

public class Grading {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("กรอกคะแนนรวม:");
        int score = in.nextInt();
        System.out.println("กรอกคะแนนสอบรวม");
        int scoreExam = in.nextInt();
        System.out.println("สถานะการทำโปรเจค (true คือสำเร็จ/false คือไม่เสร็จ):");
        boolean projectStatus = in.nextBoolean();
        System.out.println("จำนวนครั้งการขาดเรียน:");
        int numAbsent = in.nextInt();
        System.out.println("Your grade:" + getGrade(score, scoreExam, projectStatus, numAbsent));

    }

    public static String getGrade(int totalScore, int examScore, boolean projectStatus, int numAbsent) {

        // check absent amount and exam score
        if (numAbsent > 3 || examScore < 40) {
            return "F";
        }

        // check if the project is finish
        if (!projectStatus) {
            return "I";
        }

        // calculate grade
        if (totalScore >= 80) {
            return "A";
        } else if (totalScore >= 75) {
            return "B+";
        } else if (totalScore >= 70) {
            return "B";
        } else if (totalScore >= 65) {
            return "C+";
        } else if (totalScore >= 60) {
            return "C";
        } else if (totalScore >= 55) {
            return "D+";
        } else if (totalScore >= 50) {
            return "D";
        } else {
            return "F";
        }


    }
}