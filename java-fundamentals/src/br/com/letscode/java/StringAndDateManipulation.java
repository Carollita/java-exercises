package br.com.letscode.java;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalDateTime;

public class StringAndDateManipulation {
    public static void main(String[] args) throws Exception {
        String name = "Carolina";

        // ISO 8601 - LocalDate
        LocalDate today = LocalDate.now();
        Locale brazil = new Locale("pt", "br");
        String weekday = today.getDayOfWeek().getDisplayName(TextStyle.FULL, brazil);

        String greeting;
        LocalDateTime currentTime = LocalDateTime.now();
        if (currentTime.getHour() >= 0 && currentTime.getHour() < 12) {
            greeting = "Bom dia";
        }
        else if (currentTime.getHour() >= 12 && currentTime.getHour() < 18) {
            greeting = "Boa tarde";
        }
        else if (currentTime.getHour() >= 18 && currentTime.getHour() < 24) {
            greeting = "Boa noite";
        }
        else {
            greeting = "";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s!%n", name, weekday, greeting.toLowerCase());
    }
}