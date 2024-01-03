package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeJp = Locale.JAPAN;
        Locale localePt = new Locale("pt", "BR");
        Locale localeIt = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getNumberInstance();
        nfa[1] = NumberFormat.getNumberInstance(localePt);
        nfa[2] = NumberFormat.getNumberInstance(localeJp);
        nfa[3] = NumberFormat.getNumberInstance(localeIt);
        double valor = 1_000.2131;
        for (NumberFormat numberFormat : nfa) {
            numberFormat.setMaximumFractionDigits(4);
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }
        String valorString = "1000,2131";
        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
