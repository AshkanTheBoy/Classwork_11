package Classwork_15;

import org.efaps.number2words.Converter;
import org.efaps.number2words.IConverter;
import java.util.Locale;

public class Task_04 {
    public static void main(String[] args) {
        IConverter converter = Converter.getMaleConverter(Locale.FRENCH);
        String text = converter.convert(1000000000);
        System.out.println(text);
    }
}