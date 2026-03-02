import java.util.Scanner;

public class Ex2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int[] num = new int[3];

        for (int i=0; i<3; i++){
            System.out.println("Digite 3 numeros: ");
            num[i]= sc.nextInt();
        }
        int aux;
        for (int i=0; i<3; i++){
            aux = 0;
            if (num[i] > aux){
                aux = num[i];
            }
        }
        System.out.println("O maior numero e o: "+aux);

        for (int i=0; i<3; i++){
            aux = 0;
            if (i = 0){
                aux = num[i];}
            if (num[i] > aux){
                aux = num[i];
            }
        }
        System.out.println("O menor numero e o: "+aux);



    }
}
