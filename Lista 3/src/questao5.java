/*Calcular a área de uma casa, ou um apartamento, pode ser uma tarefa complicada,
principalmente, quando a área construída não é parecida com um quadrado ou retângulo. Por isso,
um modo mais fácil é somar as áreas de cada cômodo da casa e então ter a área total. Faça um
programa que pede a área por cômodo, até que a área informada seja igual a zero. Quando a área
for nula, você deve informar a área total da casa, ou apartamento.*/

import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double valor = leia.nextDouble();
        double total = 0;
      while (valor !=0 ){
          System.out.println("Digite o tamanho do comodo: ");
          valor = leia.nextDouble();
          total = valor + valor;
          System.out.println("V"+total);
      }

    }
}
