// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.   

import java.util.Scanner; 
    
public class Allowance {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int allowance = 50;
        
        System.out.println("Por quantos meses você vai guardar sua mesada?");
        int entry = reader.nextInt();

        int result = entry * 50;
        System.out.println("Você terá " + result + " reais.");
        
        /* TODO: Crie a condição necessária para que o sobrinho saiba quanto dinheiro irá juntar
        * nos meses da entrada
        */

    }
}
