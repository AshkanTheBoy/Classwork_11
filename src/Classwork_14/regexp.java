package Classwork_14;
/*
//Строка содержит только один символ

        //Строка содержит одну или более букву "a", а за ней одну букву "b"

        //Строка содержит несколько или ни одной буквы "a", а за ней одну букву "b"

        //Слово состоит из двух букв, первая из которых "a"

        //Строка начинается на букву "a"

        //Строка заканчивается на букву "a"

        //Строка заканчивается на "as"

        //Строка содержит "as"

        //Строка не содержит "a"

        //Слово содержит букву "a"

        ///////
        //строке содержатся цифры

        //Строка содержит только цифры

        //Строка является вещественным числом с фиксированной точкой

        //Содержит ни одного или более сочетаний "ab", а затем "c"

        //Содержит одно или более сочетаний "ab", а затем "c"

        //Проверить написание номера телефона в формате 8(123)-123-45-67

        //Строка не должна начинаться с букв a,b

        //Строка является "end."
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexp {
    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("\\w\\s");
//        Matcher matcher = pattern.matcher("a ");
//        boolean b = matcher.matches();
//        System.out.println(b);
//
//        boolean b1 = Pattern
//                .compile("\\w\\s")
//                .matcher("a ")
//                .matches();
//        System.out.println(b1);
//
//        System.out.println(Pattern.matches("\\w\\s","a "));

        check(".","a","aa");
        check("a+b", "aaaaaaab","bb");
        check("a*b", "ab","abb");
        check("a?[a-zA-Z]", "ab","abb");
        check("[A].*", "Abbbb","bbbb");
        check(".*a", "ba","bbbb");
        check(".*as", "fdghas","bbbb");
        check(".*as.*", "asasas","bdbdbd");
        check("[^a]*", "bbbbb","bbabb");
        check("[a-zA-Z]*a[a-zA-Z]*", "sdfbabbb","bbbb");
        check("[0-9]*", "123213123","bbdf123hcvbb");
        check("\\d+", "123213123","bbdf123hcvbb");
        check("[+-]?\\d+\\.?\\d+", "+1232.13123","123123123a");
        check(".*(ab)*c*", "asdabc","abbcgcgcgc");
        check("(ab)+c", "abc","abcc");
        check("[8]\\(\\d{3}\\)-\\d{3}-\\d{2}-\\d{2}", "8(123)-123-45-67","bbdf123hcvbb");





    }

    static void check(String regexp, String sTrue, String sFalse){
        boolean bTrue = Pattern.matches(regexp,sTrue);
        boolean bFalse = Pattern.matches(regexp,sFalse);
        System.out.printf("%b %b\n", bTrue,bFalse);
    }
}
