import java.util.Date;
import java.util.Scanner;


class ListExercicios{
}
class ex1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe uma temperatura em centigrados para converte-la em Fahrenheit");
        int numero = sc.nextInt();
        System.out.println(numero * 1.8 + 32);



    }

}

class ex2{
    // eu tentei complicar isso aqui mas nao consegui nem sair do scratch
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Informe a hora ");
            int hora = scanner.nextInt();
            System.out.println("Informe os minutos e segundos");
            int minutos = scanner.nextInt();
            System.out.println("Informe os segundos segundos");
            int segundos = scanner.nextInt();

            System.out.println(segundos+ (minutos *60) + (hora*3600));



    }
}

class ex3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor gasto");
        int gorjeta = scanner.nextInt();
        System.out.println("Gorjeta para ser paga vai ser: " + gorjeta* 10/100 );

    }



}

class ex4{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("informe o seu salario atual");
        int salario = scan.nextInt();
        System.out.println("Voce ganha APROXIMADAMENTE :" + salario/1412 +" Salarios minimos" );
        }
}
class ex5{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
           System.out.println("Informe sua idade");
            int idade = scanner.nextInt();
            System.out.println("Informe que mes eh hoje ");
            int mes = scanner.nextInt();
            System.out.println("Informe que dia eh hoje");
            int dia = (scanner.nextInt());

            System.out.println("Voce viveu aproximadamente: " + (dia + (mes * 30) + (idade * 360)) + "Dias");
        }

}
class ex6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe a nota A");
        int notaA = scanner.nextInt();
        System.out.println("informe a nota B");
        int notaB = scanner.nextInt();
        System.out.println("informe a nota C");
        int notaC = scanner.nextInt();

        System.out.println("Sya nedia eh: "+ (notaB+notaA+notaC)/3);
    }
}
class ex7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro termo da PA");
        int a = scanner.nextInt();
        System.out.println("Informe o segundo termo da PA");
        int b = scanner.nextInt();
        System.out.println("Qual termo da PA que deseja receber");
        int t = scanner.nextInt();

        System.out.println("O termo da PA que se refere eh: " + (a + (t-1)* (b-a)));

    }
}
class ex8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um valor monetario");

                int valor = scanner.nextInt();

                int qtdNotas50 = valor / 50;
                valor %= 50;

                int qtdNotas10 = valor / 10;
                valor %= 10;

                int qtdNotas5 = valor / 5;
                valor %= 5;

                int qtdNotas1 = valor;

                System.out.println("Notas de R$50,00: " + qtdNotas50);
                System.out.println("Notas de R$10,00: " + qtdNotas10);
                System.out.println("Notas de R$5,00: " + qtdNotas5);
                System.out.println("Notas de R$1,00: " + qtdNotas1);

    }




}

class ex9{

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Informe a quantidade de fitas que a locadora de video possui");
        int qtdFitas = scanner.nextInt();
        System.out.println("Informe o valor cobrado por cada aluguel");
        int valorCobradoAluguel = scanner.nextInt();
        System.out.println("Faturamento anual da locadoura: " + ((qtdFitas/3)*12) * valorCobradoAluguel);
        System.out.println("Valor ganho com multas por mes: " + ((qtdFitas/3)/10)* valorCobradoAluguel*10/100);
        System.out.println("Quantidade de fitas no final do ano" +  (qtdFitas - ((qtdFitas * 2/100)  + ( qtdFitas/10))) );

    }

}
class ex10{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a hora ");
        int hora = scanner.nextInt();
        System.out.println("Informe os minutos e segundos");
        int minutos = scanner.nextInt();
        System.out.println("Informe os segundos segundos");

        int segundos = scanner.nextInt();

     int segHoraInicio =  segundos+ (minutos *60) + (hora*3600);
        System.out.println("Informe a hora de fim  ");
        int horaFim = scanner.nextInt();
        System.out.println("Informe os minutos e segundos");
        int minutosFim = scanner.nextInt();
        System.out.println("Informe os segundos segundos");
        int segundosFim = scanner.nextInt();

  int segHoraFim = segundosFim+ (minutosFim *60) + (horaFim*3600);

  System.out.println("Tempo de duracao da atividade" +  ((segHoraFim - segHoraInicio)/ 60)/60 );






    }

}
