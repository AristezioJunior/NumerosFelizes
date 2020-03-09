package ivia;


import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class NumerosFelizes {
    
    public static void main(String args[]) {
        //Solicitando um número para realizar o teste
        System.out.println("Informe um Número : ");
        //Recebendo entrada
        int entradaNumero = new Scanner(System.in).nextInt();
        
        //Testando se o numero é Feliz
        Boolean resultado = eNumeroFeliz(entradaNumero);
        if (resultado == true)
            System.out.print(entradaNumero + " é um Número FELIZ =D ");
        else    
            System.out.print(entradaNumero + " É um Número INFELIZ :´|");
    }

    public static boolean eNumeroFeliz(int numero) {
        Set<Integer> verNumero = new HashSet<>();
        while(verNumero.add(numero)){
            int digitsSum = 0;
            while(numero > 0) {
                digitsSum += Math.pow(numero % 10 , 2);
                numero /= 10;
            }
            numero = digitsSum;
            if(numero == 1)
                return true;
        }
        return false;
    }  
}