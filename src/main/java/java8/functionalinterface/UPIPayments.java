package main.java.java8.functionalinterface;

import org.jetbrains.annotations.NotNull;

import java.text.SimpleDateFormat;
import java.util.Date;

@FunctionalInterface
public interface UPIPayments {
    String doPayment(String src, String dest);

    default String getScratchCard() {
        return "You've received a scratch card!";
    }

    @NotNull
    static String datePatterns(String patterns) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patterns);
        return simpleDateFormat.format(new Date());
    }
}
