package Classwork_13;
/*
char c1 = '2', c2 = '\u00B7', c3 = '\u03C0', c4 = '=', c5 = '1',
                c6 = '8', c7 = '0', c8 = '\u00B0';
//Проверить, содержит ли строковое значение только цифры
 */
public class Strings {
    public static void main(String[] args) {
        String s = "1234";
        System.out.println(s.charAt(s.length()-1));
        char c1 = '2', c2 = '\u00B7', c3 = '\u03C0', c4 = '=', c5 = '1',
                c6 = '8', c7 = '0', c8 = '\u00B0';
        String result = ""+c1+c2+c3+c4+c5+c6+c7+c8;
        System.out.println(result);

        String s1 = "12e34";
        boolean result1 = true;
        for (int i = 0; i < s1.length(); i++) {
            if (!Character.isDigit(s1.charAt(i))){
                result1 = false;
            }
        }
        System.out.println(result1);

        /*
    Проверить, содержит ли строка данную последовательность символов
        s = "good";
        s2 = "oo";
     */
        s = "good";
        String s2 = "oo";
        System.out.println(s.contains(s2));

        //Проверить, одинаковы ли строки
        s = "good";
        s2 = "good";
        //s2 = new String("good");
        boolean answer = s == s2 ? true : false;
        //answer = s.equals(s2) ? true : false;
        System.out.println("Строки одинаковы: " + answer);

        //Заменить символ в строке (точку на вопросительный знак
        s = "Why is garbage collection necessary in Java.";
        int p = s.indexOf('.');
        StringBuilder sb = new StringBuilder(s);
        sb.setCharAt(p,'?');
        s = sb.toString();
        System.out.println(s);

        //Заменить подстроку в строке
        s = "JVM is a %s virtual machine.";
        s = s.replace("%s","Java");
        System.out.println(s);

        //Извлечь из строки подстроку JRE
        s = "JDK vs JRE vs JVM";
        int i = s.indexOf("JRE");
        System.out.println(i);
        s2 = s.substring(i,i+"JRE".length());
        System.out.println(s2);

        //Удалить все скобки из выражения
        s = "What are the {wrapper} {classes} in Java?";
        s = s.replaceAll("[{}]","");
        System.out.println(s);

        //Заменить первую букву на прописную
        s = "what is JIT compiler in Java?";
        s2 = s.substring(0,1);
        s = s.replace(s2,s2.toUpperCase()); //заменит все буквы
        System.out.println(s);

        //Разбить строку на подстроки
        s = "Access modifiers in Java are: \nDefault\nPrivate\nProtected\nPublic";
        String[] sArr = s.split("\n");
        s = s.replace("\n"," ");
        System.out.println(s);

        //Удалить концевые пробелы
        s = " Object-Oriented Programming or OOPs is a programming style that is associated with concepts like: "
                + "innheritance, encapsulation, polymorphism, abstraction. ";
        result = s.trim();
        System.out.println(result);


    }



}
