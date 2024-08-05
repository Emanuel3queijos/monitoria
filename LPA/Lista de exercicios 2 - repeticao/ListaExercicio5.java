import java.util.Scanner;

public class ListaExercicio5 {
}
class q1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i<n; i++){
            a = b;
            b = c;
            c = a + b;
            System.out.println(c);
        }
    }
}
class q2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
// aqui ele vai cobrir Todas as possibilidades de um numero ser primo ou nao
        if(n <=1 || n % 2 == 0 && n!= 2|| n % 5 == 0 && n!= 5|| n % 3 == 0&& n!= 3 || n % 7 == 0 && n!= 7 ){
            System.out.println("Nao primo");
        }else {
            System.out.println("primo");

        }

    }
}
class q3{
    //ele vai verificar se eh primo, caso for vai printar na tela. Caso nao for primo, eh adicionado mais uma casa numerica para a verificacao
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (!(i <= 1 || i % 2 == 0 && i != 2 || i % 5 == 0 && i != 5 || i % 3 == 0 && i != 3 || i % 7 == 0 && i != 7)) {
                System.out.println(i);
            } else {
                n++;
            }
        }

    }
}

class q4{
    public static void main(String[] args) {
        int seg = 0;
        int min = 0;
        int hora = 0;
        do {
            System.out.println(hora+":"+min+":"+seg);
            seg++;
            if (seg == 60){
                min++;
                seg = 0;
            }
            if (min == 60){
                hora ++;
                min = 0;
            }
        }while (hora != 24);

    }

}
class q5{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        int aux = n;
        int fat = 0;

        for (int i = n-1; i >1 ; i--){
            fat = 0;
            fat +=(aux*(i));
            aux = fat;
            System.out.println(fat);
            }

        System.out.println(fat);


    }
}
class q6{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int fat;
        int aux = a;
        for (int i = a-1; i >b; i--){
            fat = 0;
            if (i % 2 == 0){
                fat +=(aux*(i));
                aux = fat;
                System.out.println(fat);
            }
            System.out.println(fat);
        }



    }

}

class q7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        int i = 0;
        int mdc;
        do {
            i++;
            if (numA % i == 0 && numB % i == 0){
                mdc = i;
                System.out.println(mdc);

            }
        }while ( i< numA && i<numB);


    }
}
class q8{

}