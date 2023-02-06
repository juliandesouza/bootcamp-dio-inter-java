import java.util.Scanner; 
    
public class Mesada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Por quantos meses você quer guardar o dinheiro?");
        int entrada = leitor.nextInt();
        int mesada = 50;
        
        int resultado = entrada * mesada;
        System.out.println("Você terá " + resultado + " reais.");
    }
}