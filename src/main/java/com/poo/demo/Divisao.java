package com.poo.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {
    public void ex1() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Informe o numero que deseja dividir: ");
            double numero = sc.nextDouble();

            System.out.print("Informe o divisor: ");
            double divisor = sc.nextDouble();

            if (divisor == 0) {
                throw new DivisaoPorZeroException("Erro: Divisão por zero não é permitida.");
            }

            double resultado = numero / divisor;
            System.out.println("Resultado: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira um número.");
        } catch (DivisaoPorZeroException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

class DivisaoPorZeroException extends Exception {
    public DivisaoPorZeroException(String message) {
        super(message);
    }
}
