
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int num = sc.nextInt();
        int i;
        int fat = 0;
        int soma = 0;

        for(i=0; num > 0; i++){
            fat += num*(num-1);
            //soma = soma+fat;
            num--;
        }
        System.out.println("O fatorial do numero e: "+fat);
    }
    
}
