package day4_SOLID_principles.student;

public class Student {
    private String name;
    private double score;
    private StudentReportPrinter reportPrinter;
    private StudentGradeCalculator gradeCalculator;

    public Student(String name) {
        this.name = name;
        this.reportPrinter = new StudentReportPrinter();
        this.gradeCalculator = new StudentGradeCalculator();
    }

    public void calculateGrade(double score) {
        gradeCalculator.calculateGrade(score);
    }
    public void printReport(double score) {
        reportPrinter.printStudentReport();
    }
}
