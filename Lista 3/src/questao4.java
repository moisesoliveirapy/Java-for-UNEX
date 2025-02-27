/*Durante o natal é uma tradição entre muitas famílias decorar a casa com uma árvore. Vamos
então desenhar uma árvore como esta abaixo:
*
**
***
****
*****
******
*******
********
*********
**********
************
***************
*/

public class questao4 {

    public static void main(String[] args) {
        int altura = 13;

        // Loop para desenhar cada linha da árvore
        for (int i = 1; i <= altura; i++) {
            // Imprime espaços antes dos asteriscos para centralizar
            for (int j = i; j < altura; j++) {
                System.out.print(" ");
            }
            // Imprime os asteriscos
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Nova linha após cada linha da árvore
            System.out.println();
        }
    }
}