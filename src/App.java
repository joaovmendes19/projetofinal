import java.util.Scanner;

import models.*;
public class App {
    public static void main(String[] args) throws Exception {
       
        
        


    }

    public static Scanner scanner = new Scanner(System.in);

    public void cadatrarAviao(){
        System.out.println("Digite a marca do aviao: ");
        String marca = scanner.next();
        System.out.println("Digite o modelo do aviao: ");
        String modelo = scanner.next();
        System.out.println("Digite a cor do aviao: ");
        String cor = scanner.next();
        System.out.println("Digite a capacidade do aviao: ");
        int capacidade = scanner.nextInt();
        scanner.nextLine();
        Aviao aviao = new Aviao(marca, modelo, cor, capacidade, capacidade);
        System.out.println(aviao.toString());

    }

    public void 
}
