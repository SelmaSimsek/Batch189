package day26_lambda;

import java.util.ArrayList;
import java.util.List;

public class CourseRunner {
    public static void main(String[] args) {
        Course courseTurkishDay = new Course("Summer","Turkish Day",97,128);
        Course courseTurkishNight = new Course("Winter","Turkish Night",98,154);
        Course courseEnglishDay = new Course("Spring","English Day",95,132);
        Course courseEnglishNight = new Course("Winter","English Night",93,144);

        List<Course > coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        //System.out.println(coursesList);
        //[Course{season='Summer', courseName='Turkish Day', avarageScore=97, numberOfStudents=128},
        // Course{season='Winter', courseName='Turkish Night', avarageScore=98, numberOfStudents=154},
        // Course{season='Spring', courseName='English Day', avarageScore=95, numberOfStudents=132},
        // Course{season='Winter', courseName='English Night', avarageScore=93, numberOfStudents=144}]

        //1)Tum "averageScore" larin 91 den buyuk olup olmadigini kontrol kodu yaziniz
        boolean result1 =coursesList.stream().allMatch(t-> t.getAvarageScore()>91);

//2)Tum kurslardaki ögrenci sayilarinin larin 100 den buyuk olup olmadigini kontrol kodu yaziniz

        boolean result2 = coursesList.stream().allMatch(t-> t.getNumberOfStudents()>100);

//3)Kurs isimlerinden en az birinin "Turkish" kelimesini icerip icermedigini kontrol eden kodu yaziniz.

        boolean result3 = coursesList.stream().anyMatch(t-> t.getCoursName().contains("TÜrkish"));

//4)dönem isimlerinden en az birinin "Summer" kelimesini icerip icermedigini kontrol eden kodu yaziniz.

        boolean result4 = coursesList.stream().anyMatch(t-> t.getSeason().contains("Summer"));

//6) Kurs isimleri icinde "German" isminin hic bulunmadigini kontrol eden kodu yaziniz.
        boolean result5 = coursesList.stream().noneMatch(t-> t.getCoursName().contains("German"));
    }
    }

