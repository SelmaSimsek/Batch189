package day23.Exceptions;

public class ExceptionRunner {

    /*Exceptionlar disinda bizim eror diye adlandirdigimiz ve handla edilemeyen bazi problemler vardir
    mesela application larda Memory nin dolmasi bir erordur
        iki tür memory eror vardir
        a) Stack memory dolarsa "StackOverFlow Eror" alirsiniz
        b)Heap memory dolarsa "OutOfMemory Eror" alirsiniz

        finalize:
        Garbage Collector memory yi temiz tutmak icin sürekli memory yi tarar ve silinmesi gerekenleri siler
        Garbage collector silmeden önce silecegi datalari "finalize" yapar sonra siler
        yani Garbage collactor sadece finalized yapilmis objeleri toplar ve yok eder


     */




    public static void main(String[] args) {
        getStudentGrade(77);
        getStudentGrade(-7);
        getStudentGrade(777);

        getTheNumberOfStudents(15);
        getTheNumberOfStudents(-15);

    }
    public static void getTheNumberOfStudents(int numOfStudents) {
        if (numOfStudents < 0) {
            throw new InvalidNumberException("Student number cannot be negative");
        } else {
            System.out.println(numOfStudents);
        }


    }


    public static void getStudentGrade (int grade){
        if (grade<0 || grade>100){
            try {
                throw new InvalidStudentGradeException("Student's grades cannot be less than zero or grader than 100");
            } catch (InvalidStudentGradeException e) {
                e.printStackTrace();
            }
        }else
        System.out.println(grade);
    }
}
