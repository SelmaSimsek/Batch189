package day26_lambda;

public class Course {

     /*
    Icinde
    1) private variablelar
    2) parametreli ve parametresiz constructorlar
    3) getterlar
    4) setterlar
    5) toString() methodu barindiran classlara POJO class denir
    POJO==>Plain Old Java Object
     */

    private String season;
    private String coursName;
    private int avarageScore;
    private int numberOfStudents;

    public Course(String season, String coursName, int avarageScore, int numberOfStudents) {
        this.season = season;
        this.coursName = coursName;
        this.avarageScore = avarageScore;
        this.numberOfStudents = numberOfStudents;
    }

    public Course() {
    }

    public String getSeason() {
        return season;
    }

    public String getCoursName() {
        return coursName;
    }

    public int getAvarageScore() {
        return avarageScore;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setCoursName(String coursName) {
        this.coursName = coursName;
    }

    public void setAvarageScore(int avarageScore) {
        this.avarageScore = avarageScore;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public String toString() {
        return "Course{" +
                "season='" + season + '\'' +
                ", coursName='" + coursName + '\'' +
                ", avarageScore=" + avarageScore +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }
}

