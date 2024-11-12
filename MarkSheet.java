// Package Name
package marksheet;

// Interface
interface IMarkSheetGenerator {
    void generateMarkSheet();
}

// Class
public class MarkSheet implements IMarkSheetGenerator {

    // Constants
    private static final double MAX_GPA = 4.0;
    private static final double PASSING_PERCENTAGE = 40.0;
    
    // Variables
    private String studentName;
    private int totalMarks;
    private int obtainedMarks;

    // Constructor
    public MarkSheet(String studentName, int totalMarks, int obtainedMarks) {
        this.studentName = studentName;
        this.totalMarks = totalMarks;
        this.obtainedMarks = obtainedMarks;
    }

    // Method to generate mark sheet
    @Override
    public void generateMarkSheet() {
        double percentage = calculatePercentage();
        double gpa = calculateGPA(percentage);
        String grade = calculateGrade(percentage);
        
        displayMarkSheet(percentage, gpa, grade);
    }

    // Method to calculate percentage
    private double calculatePercentage() {
        return ((double) obtainedMarks / totalMarks) * 100;
    }

    // Method to calculate GPA
    private double calculateGPA(double percentage) {
        return (percentage / 100) * MAX_GPA;
    }

    // Method to determine grade
    private String calculateGrade(double percentage) {
        if (percentage >= 85) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 55) return "C";
        else if (percentage >= PASSING_PERCENTAGE) return "D";
        else return "F";
    }

    // Method to display the mark sheet
    private void displayMarkSheet(double percentage, double gpa, String grade) {
        StringBuilder markSheet = new StringBuilder();
        markSheet.append("---------- Mark Sheet ----------\n")
                 .append("Student Name   : ").append(studentName).append("\n")
                 .append("Total Marks    : ").append(totalMarks).append("\n")
                 .append("Obtained Marks : ").append(obtainedMarks).append("\n")
                 .append("Percentage     : ").append(String.format("%.2f", percentage)).append("%\n")
                 .append("Grade          : ").append(grade).append("\n")
                 .append("GPA            : ").append(String.format("%.2f", gpa)).append("\n")
                 .append("--------------------------------");
        System.out.println(markSheet.toString());
    }

    // Main method
    public static void main(String[] args) {
        // Example inputs
        String studentName = "Hanawasi";
        int totalMarks = 500;
        int obtainedMarks = 420;

        MarkSheet markSheet = new MarkSheet(studentName, totalMarks, obtainedMarks);
        markSheet.generateMarkSheet();
    }
}

