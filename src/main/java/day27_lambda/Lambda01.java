package day27_lambda;

import day26_lambda.Course;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) {

        Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
        Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
        Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);

        List<Course> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        //1)Average score'u en yuksek olan kursun ismini console yazdiran kodu yaziniz.

        String name1 = coursesList.stream().
                sorted(Comparator.comparing(Course::getAvarageScore).
                        reversed()).findFirst().get().getCoursName();
        System.out.println(name1);
//2) Tum course object'lerini average score'a gore kucukten buyuge diziniz ve ilk ikisi haric liste halinde console'a yazdiriniz.

        List<Course> myList = coursesList.stream().
                sorted(Comparator.comparing(Course::getAvarageScore)).
                skip(2).collect(Collectors.toList());
        System.out.println(myList);

//3)Tum course object'lerini average score'a gore kucukten buyuge diziniz ve ilk ucunu liste halinde console'a yazdiriniz.

        List<Course> yourList = coursesList.stream().
                sorted(Comparator.comparing(Course::getAvarageScore)).
                limit(3).collect(Collectors.toList());
        System.out.println(yourList);

// 4) Kursta bulunan ogrenci sayilarina gore buyukten kucuge sirali bir sekilde listin icinde  veren  kodu yaziniz.

    List<Course> list =coursesList.stream().
            sorted(Comparator.comparing(Course::getNumberOfStudents).
                    reversed()).collect(Collectors.toList());

        System.out.println(list);

        //5.kursta bulunan ingilizce bölümlerinin sayisini veren kodu yaziniz


        long ingilizceBölümSayisi =
                coursesList.stream().
                filter(t-> t.getCoursName().
                        contains("English")).count();

        System.out.println(ingilizceBölümSayisi);


        //6)Ogrenci sayisi 140 tan az olan kurslari bir liste halinde veren kodu yaziniz

                List<Course> ogrenciSayisi =
                coursesList.stream().
                        filter(t-> t.getNumberOfStudents()<140).
                        collect(Collectors.toList());
                 System.out.println(ogrenciSayisi);

    }



}
