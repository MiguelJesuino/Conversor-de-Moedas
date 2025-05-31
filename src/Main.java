import Controller.ConversorDeMoedas;
import Models.ConversionRate;
import Service.ExchangeRateApi;
import View.MenuCLI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ExchangeRateApi exchangeRateApi = new ExchangeRateApi();

        // Exibe o menu na linha de comando
        MenuCLI.exibirMenu();

        System.out.println("Você pode digitar 'SAIR' para sair do programa");
        String moedaBase;

        do {
            System.out.println("Qual a moeda base que quer converter? ");
            moedaBase = input.nextLine().trim().toUpperCase();

            if (moedaBase.equalsIgnoreCase("SAIR")) {
                return; 
            }

            ConversionRate conversionRate = exchangeRateApi.buscaMoeda(moedaBase);

            System.out.println("Para qual moeda quer converter? ");
            String moedaDeConversao = input.nextLine().trim().toUpperCase();

            if (!conversionRate.conversion_rates().containsKey(moedaDeConversao)) {
                System.out.println("Moeda de conversão inválida.");
                continue;
            }
            System.out.println("Quanto quer converter? ");
            double valorBase = input.nextDouble();
            input.nextLine();


            Double taxa = conversionRate.conversion_rates().get(moedaDeConversao);
            double valorConvertido = ConversorDeMoedas.converter(valorBase, taxa);
            System.out.printf("%n%s %.2f é equivalente a  %s %.2f%n",
                    moedaBase, valorBase, moedaDeConversao, valorConvertido);



        } while (!moedaBase.equalsIgnoreCase("SAIR"));
        System.out.println("Programa encerrado. Obrigado por usar o conversor!");
    }
}
