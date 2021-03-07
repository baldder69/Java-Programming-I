
import java.util.ArrayList;

public class GradeStatistics {

    private double average;
    private double passingAverage;
    private double passPercentage;
    private int[] gradeArray;
    private ArrayList<Double> grades;

    public GradeStatistics() {
        this.grades = new ArrayList<>();
        this.gradeArray = new int[6];
    }

    public void add(double number) {
        if (number >= 0 && number <= 100) {
            this.grades.add(number);
        }
    }

    public void average() {
        double sum = 0;
        for (Double grade : grades) {
            sum += grade;
        }
        this.average = sum / grades.size();
    }

    public double getAverage() {
        return average;
    }

    public void passingGradesAverage() {
        double sum = 0;
        double counter = 0;
        for (Double grade : grades) {
            if (grade >= 50) {
                sum += grade;
                counter++;
            }
        }
        if (counter == 0) {
            counter = 1;
        }

        this.passingAverage = sum / counter;

    }

    public String getPassingAverage() {
        if (passingAverage == 0) {
            return " -";
        } else {
            return Double.toString(passingAverage);
        }

    }

    public void passPercentage() {
        double counter = 0;
        for (Double grade : grades) {
            if (grade >= 50) {
                counter++;
            }
        }

        this.passPercentage = 100 * counter / grades.size();
    }

    public double getPassPercentage() {
        return this.passPercentage;
    }

    public String toStars(int number) {
        String stars = "";
        for (int i = 0; i < number ; i++){
            stars += "*";
        }
        return stars;
    }

    public String getGradeDistribution() {
        for (Double grade : grades) {
            if (grade < 50) {
                this.gradeArray[0] += 1;
            } else if (grade < 60) {
                this.gradeArray[1] += 1;
            } else if (grade < 70) {
                this.gradeArray[2] += 1;
            } else if (grade < 80) {
                this.gradeArray[3] += 1;
            } else if (grade < 90) {
                this.gradeArray[4] += 1;
            } else if (grade >= 90) {
                this.gradeArray[5] += 1;
            }
        }

        return "\n"
                + "5: " + this.toStars(this.gradeArray[5]) + "\n"
                + "4: " + this.toStars(this.gradeArray[4]) + "\n"
                + "3: " + this.toStars(this.gradeArray[3]) + "\n"
                + "2: " + this.toStars(this.gradeArray[2]) + "\n"
                + "1: " + this.toStars(this.gradeArray[1]) + "\n"
                + "0: " + this.toStars(this.gradeArray[0]);
                
    }

    public String toString() {
        return "Point average (all): " + this.getAverage() + "\n"
                + "Point average (passing): " + this.getPassingAverage() + "\n"
                + "Pass percentage: " + this.getPassPercentage() + "\n"
                + "Grade Distribution: " + this.getGradeDistribution();
    }
}
