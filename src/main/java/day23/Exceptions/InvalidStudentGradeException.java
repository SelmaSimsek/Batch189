package day23.Exceptions;

public class InvalidStudentGradeException extends Exception {

    public InvalidStudentGradeException(String message) {
        super(message);
    }

    /*
    1) Custom Exception class olusturmak icin, Exception class a extend etmeliyiz
        Exception class a extend ederek olusturdugumuz Costom Exception "CompileTime Exception" olur
        Eger Runtime Custom Exception olusturmak isterseniz RunTimeException Class a extends etmelisiniz

    2) Costom Exception Class olustururken eger mesaj verebilen obje üretmek isterseniz constructor
     */
}
