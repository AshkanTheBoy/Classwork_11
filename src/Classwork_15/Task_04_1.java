package Classwork_15;

import com.github.moneytostr.MoneyToStr;

public class Task_04_1 {
    public static void main(String[] args) {
        MoneyToStr moneyToStr = new MoneyToStr(MoneyToStr.Currency.RUR, MoneyToStr.Language.RUS, MoneyToStr.Pennies.NUMBER);
        System.out.println(moneyToStr.convert(777.77D));
    }
}
