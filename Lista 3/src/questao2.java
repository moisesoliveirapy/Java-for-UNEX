/*Par ou ímpar é uma forma tradicional de resolver alguns problemas quando você é criança, seja
numa brincadeira ou em algum conflito. Como as duas mãos juntas temos dez dedos, como cada
pessoa pode usar as duas mãos, vamos ter o máximo de 20 dedos. Então, vamos ensinar as
crianças a contarem todos os números pares e ímpares entre 0 e 20.*/

public class questao2 {
    public static void main(String[] args) {
        System.out.println("Contando até 20 apenas Impar");
        for (int i = 1; i <= 20; i += 2){
            System.out.println(i);
        }
        System.out.println("Contando até 20 apenas Par");
        for (int i = 2; i <= 20; i += 2){
            System.out.println(i);
        }
    }
}
