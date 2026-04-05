import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diegite 3 numeros ai");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3){
            System.out.println("esse numero e o maior" + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("esse e o maior = " + num2);
        }else
            System.out.println(" esse e o maior numero = " + num3);

    }
}