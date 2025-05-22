package View;

import java.util.HashMap;
import java.util.Map;

public class MenuCLI {

        private static final Map<String, String> currencyNames = new HashMap<>();
        static {
            currencyNames.put("USD", "Dólar americano");
            currencyNames.put("EUR", "Euro");
            currencyNames.put("BRL", "Real Brasileiro");
            currencyNames.put("JPY", "Yen Japonês");
            currencyNames.put("GBP", "Libra Esterlina Britânica\n");
            currencyNames.put("AUD", "Dólar Australiano");
            currencyNames.put("CAD", "Dólar Canadence");
            currencyNames.put("CHF", "Franco Suíço");
            currencyNames.put("CNY", "Yuan Chinês");
            currencyNames.put("ARS", "Peso Argentino");
            currencyNames.put("MXN", "Peso mexicano");
            currencyNames.put("INR", "Rupee Indiano");
            currencyNames.put("RUB", "Rublo Russo");
            currencyNames.put("ZAR", "Rand Sul Africano");
            currencyNames.put("KRW", "Won Sul Coreano");
            currencyNames.put("NZD", "Dólar da Nova Zelandia");
            currencyNames.put("TRY", "Lira Turca");
            currencyNames.put("SEK", "Coroa Sueca");
            currencyNames.put("NOK", "Coroa Norueguesa");
            currencyNames.put("DKK", "Coroa Dinamarquesa");
            currencyNames.put("PLN", "Zloty Polonês");
            currencyNames.put("THB", "Baht Tailandês");
            currencyNames.put("HKD", "Dólar de Hong Kong");
            currencyNames.put("SGD", "Dólar de Singapura");
            currencyNames.put("EGP", "Libra Egípcia");
            currencyNames.put("ILS", "hekel Israelense");
            currencyNames.put("SAR", "Rial Saudita");
            currencyNames.put("AED", "Dirham dos Emirados Árabes");
            currencyNames.put("CLP", "Peso Chileno");
            currencyNames.put("COP", "Peso Colombiano");
            currencyNames.put("VND", "Dong Vietnamita");
            currencyNames.put("IDR", "Rupia Indonésia");
            currencyNames.put("MYR", "Ringgit da Malásia");
            currencyNames.put("PKR", "Rupia Paquistanesa");
            currencyNames.put("CZK", "Coroa Tcheca");
            currencyNames.put("HUF", "Florim Húngaro");
            currencyNames.put("RON", "Leu Romeno");
            currencyNames.put("UAH", "Hryvnia Ucraniana");
            currencyNames.put("KZT", "enge Cazaque");
            currencyNames.put("NGN", "Naira Nigeriana");
            currencyNames.put("DZD", "Dinar Argelino");
            currencyNames.put("TWD", "Novo Dólar Taiwanês");
        }

    public static void exibirMenu() {
        System.out.println("=== SIGLAS DE MOEDAS DISPONÍVEIS ===");
        int count = 0;
        for (Map.Entry<String, String> entry : currencyNames.entrySet()) {
            System.out.printf("%-6s - %-30s", entry.getKey(), entry.getValue().trim());
            count++;
            if (count % 2 == 0) System.out.println();
            else System.out.print("   ");
        }
        System.out.println();
    }

    public static Map<String, String> getCurrencyNames() {
        return currencyNames;
    }
}
