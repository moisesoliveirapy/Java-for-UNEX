/*Quando crianças aprendemos as tabuadas dos números 2, 3, 4, assim em diante. Vamos criar a
tabuada do número que quisermos. O usuário deve informar o número que ele deseja a tabuada e
você deve imprimir a tabuada tal como abaixo:
Número da tabula: 5
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50*/

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o número da tabuada: ");
        int valor = leia.nextInt();

        for(int i = 1; i <= 10; i++){
            int total = valor * i;
            System.out.println(valor +" x "+ i+ " = "+ total);
        }
    }
}
