/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.*;

/**
 *
 * @author aluno
 */
public class Aula {

    public static void main(String[] args) {
        Stack<Character> pilha1 = new Stack<Character>();
        Stack<Character> pilha2 = new Stack<Character>();
        String equacao = "−{[b×b−(4×a×c)]/(2×a)[    }";
        for (int i = 0; i < equacao.length(); i++) {
            char c = equacao.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                pilha1.push(c);
            } else if (c == '}' || c == ']' || c == ')') {
                char ultimoCaracter = pilha1.pop();
                pilha2.push(c);

                if (ultimoCaracter == '(' && c == ')') {
                    pilha2.pop();
                } else if (ultimoCaracter == '[' && c == ']') {
                    pilha2.pop();
                } else if (ultimoCaracter == '{' && c == '}') {
                    pilha2.pop();
                } else {
                    System.out.println("Não fechado: " + ultimoCaracter);
                }
            }
        }

        for (int i = 0; i < pilha1.size(); i++) {
            System.out.println(pilha1.pop());
        }

    }

}
