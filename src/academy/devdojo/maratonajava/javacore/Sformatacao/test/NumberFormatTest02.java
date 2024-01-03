package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeJp = Locale.JAPAN;
        Locale localePt = new Locale("pt", "BR");
        Locale localeIt = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localePt);
        nfa[2] = NumberFormat.getCurrencyInstance(localeJp);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIt);
        double valor = 1000.2131;
        for (NumberFormat numberFormat : nfa) {
            numberFormat.setMaximumFractionDigits(4);
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }
        String valorString = "R$ 1.000,2131";
        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
