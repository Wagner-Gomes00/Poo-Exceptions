package com.poo.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public void ex2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("1 - Primeira opção");
        System.out.println("2 - Segunda opção");
        System.out.println("3 - Terceira opção");

        try {
            System.out.println("Escolha uma opção: ");
            int opcao = sc.nextInt();

            if (opcao < 1 || opcao > 3) {
                throw new OpcaoInvalidaException("Erro, tente uma das opções informadas");
            }
            System.out.println("Você escolheu a opção " + opcao);

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira um número.");
        } catch (OpcaoInvalidaException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }

}

class OpcaoInvalidaException extends Exception {
    public OpcaoInvalidaException(String message) {
        super(message);
    }
}
