import java.util.Scanner;

/*
 * Author: Amy Gomez
 * Course: Programming Assignment 3 for COP2210 - Fall 2024
 * Date: 09/29/2024
 */

public class GradeBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //User enters points for each category
        System.out.print("Enter In class assignments score: ");
        double inClassAssignments = scanner.nextDouble();

        System.out.print("Enter Programming assignments score: ");
        double programmingAssignments = scanner.nextDouble();

        System.out.print("Enter Exam 1 score: ");
        double exam1 = scanner.nextDouble();

        System.out.print("Enter Exam 2 score: ");
        double exam2 = scanner.nextDouble();

        System.out.print("Enter Final exam score: ");
        double finalExam = scanner.nextDouble();

        //Weight for grade from each category

        int inClassWeight = 20;
        int programmingWeight = 20;
        int exam1Weight = 20;
        int exam2Weight = 20;
        int finalExamWeight = 20;

        // Calculate weighted points for each category separately
        double weightedInClassPoints = (inClassAssignments * inClassWeight) / 100;
        double weightedProgrammingPoints = (programmingAssignments * programmingWeight) / 100;
        double weightedExam1Points = (exam1 * exam1Weight) / 100;
        double weightedExam2Points = (exam2 * exam2Weight) / 100;
        double weightedFinalExamPoints = (finalExam * finalExamWeight) / 100;

        /* Manually add them up step by step, finalScore = finalScore adds the current
        value of finalScore to the weighted point and updates the finalScore with the new
        value */
        double finalScore = weightedInClassPoints;
        finalScore = finalScore + weightedProgrammingPoints;
        finalScore = finalScore + weightedExam1Points;
        finalScore = finalScore + weightedExam2Points;
        finalScore = finalScore + weightedFinalExamPoints;

        // Output final score and letter grade
        System.out.printf("Numeric grade: %.2f%n", finalScore / 100);
        System.out.println("Letter grade: " + letterGradeEquivalent(finalScore));

    }

    /**
     * Converts a numeric score to a letter grade according to the grading
     * guidelines for COP2210. For example, the numericScore of 97 will return
     * "A".
     */
    public static String letterGradeEquivalent(double numericScore) {
        if (numericScore >= 95) {
            return "A";
        } else if (numericScore >= 90) {
            return "A-";
        } else if (numericScore >= 87) {
            return "B+";
        } else if (numericScore >= 83) {
            return "B";
        } else if (numericScore >= 80) {
            return "B-";
        } else if (numericScore >= 77) {
            return "C+";
        } else if (numericScore >= 70) {
            return "C";
        } else if (numericScore >= 60) {
            return "D";
        }
        return "F";
    }
}

/* Writing attributes that will go into the grade book */
class GradeBookCategory {
    private String label;
    private int weight;
    private double maxPoints;
    private double pointsEarned;

    //Constructor
    public GradeBookCategory(String label, int weight) {
        this.label = label;
        this.weight = weight;
        this.maxPoints = maxPoints;
        this.pointsEarned = pointsEarned;
    }

    //Getters and Setters
    public String getLabel() {
        return label;
    }

    public String setLabel() {
        return label = label;
    }

    public int getWeight() {
        return weight;
    }

    public int setWeight() {
        return weight;
    }

    public double getMaxPoints() {
        return maxPoints;
    }

    public double setMaxPoints() {
        return maxPoints;
    }

    public double getPointsEarned() {
        return pointsEarned;
    }

    public double setPointsEarned() {
        return pointsEarned;
    }

    //getScore returns the product of dividing points earned by the student to the maximum
    public double getScore() {
        return pointsEarned / maxPoints;
    }

    //getWeightScore returns numeric value and weight divided by 100
    public double getWeightedScore() {
        return getScore() * (weight / 100.0);
    }

    //String method to provide string representation of an object
    public String toSting() {
        return label + ": weight = " + weight + "%, points " +
                String.format("%.2f", pointsEarned) + "/" + maxPoints;
    }

}