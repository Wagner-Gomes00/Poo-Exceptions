package com.poo.demo;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.springframework.jmx.access.InvalidInvocationException;

public class Nomes {
    public void ex3() {
        Scanner sc = new Scanner(System.in);
        String[] nomes = { "wagner", "Pedro", "Patrick" };

        System.out.println("Lista de nomes:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(i + " - " + nomes[i]);
        }

        try {
            System.out.println("Escolha o indice do nome desejado");
            int indice = sc.nextInt();

            if (indice < 0 || indice >= nomes.length) {
                throw new IndiceInvalidoException("Erro , indice invalido");

            }
            System.out.println("voce escolheu: " + nomes[indice]);
        } catch (InputMismatchException e) {
            System.out.println("erro, insira um numero inteiro valido");
        } catch (IndiceInvalidoException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}

class IndiceInvalidoException extends Exception {
    public IndiceInvalidoException(String message) {
        super(message);
    }
}