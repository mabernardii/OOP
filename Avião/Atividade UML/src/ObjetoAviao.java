import java.util.Scanner;
public class ObjetoAviao {
    public static void main (String [] args){
        Scanner ler = new Scanner (System.in);

        System.out.println ("-------Avião 01------");
        System.out.println ("Digite o tipo do avião:");
        String tipo= ler.nextLine();
        System.out.println ("Qual a cor do avião?:");
        String cor = ler.nextLine();
        System.out.println ("Qual a velocidade do avião? (km/h):");
        int velocidade= ler.nextInt ();
        System.out.println ("Quantos assentos o avião tem?");
        int qtdeAssentos = ler.nextInt ();

        Aviao aviao1 = new Aviao ();
        aviao1.setTipo (tipo);
        aviao1.setCor (cor);
        aviao1.setVelocidade (velocidade);
        aviao1.setQtdeAssento (qtdeAssentos);

        System.out.println ("O cadastro do primeiro avião foi realizado com sucesso!");
        System.out.println ("-------Avião 01------");
        System.out.println ("Tipo do avião: " + aviao1.getTipo());
        System.out.println ("Cor do avião: " + aviao1.getCor());
        System.out.println ("Velocidade em km/h: " + aviao1.getVelocidade() + "Km/h");
        System.out.println ("Quantidade de assentos que o avião possui:" + aviao1.getQtdeAssento());

        ler.nextLine();
        System.out.println ("\n-------Avião 02------");
        System.out.println ("Digite o tipo do avião:");
        String tipo2= ler.nextLine();
        System.out.println ("Qual a cor do avião?:");
        String cor2 = ler.nextLine();
        System.out.println ("Qual a velocidade do avião? (km/h):");
        int velocidade2= ler.nextInt ();
        System.out.println ("Quantos assentos o avião tem?");
        int qtdeAssentos2 = ler.nextInt ();

        Aviao aviao2 = new Aviao ();
        aviao2.setTipo (tipo2);
        aviao2.setCor (cor2);
        aviao2.setVelocidade (velocidade2);
        aviao2.setQtdeAssento (qtdeAssentos2);

        System.out.println ("O cadastro do segundo avião foi realizado com sucesso!");
        System.out.println ("-------Avião 02------");
        System.out.println ("Tipo do avião: " + aviao2.getTipo());
        System.out.println ("Cor do avião: " + aviao2.getCor());
        System.out.println ("Velocidade em km/h: " + aviao2.getVelocidade() + "Km/h");
        System.out.println ("Quantidade de assentos que o avião possui:" + aviao2.getQtdeAssento());

        ler.nextLine();
        System.out.println ("\n-------Avião 03------");
        System.out.println ("Digite o tipo do avião:");
        String tipo3= ler.nextLine();
        System.out.println ("Qual a cor do avião?:");
        String cor3 = ler.nextLine();
        System.out.println ("Qual a velocidade do avião? (km/h):");
        int velocidade3= ler.nextInt ();
        System.out.println ("Quantos assentos o avião tem?");
        int qtdeAssentos3 = ler.nextInt ();

        Aviao aviao3 = new Aviao ();
        aviao3.setTipo (tipo3);
        aviao3.setCor (cor3);
        aviao3.setVelocidade (velocidade3);
        aviao3.setQtdeAssento (qtdeAssentos3);

        System.out.println ("O cadastro do terceiro avião foi realizado com sucesso!");
        System.out.println ("-------Avião 03------");
        System.out.println ("Tipo do avião: " + aviao3.getTipo());
        System.out.println ("Cor do avião: " + aviao3.getCor());
        System.out.println ("Velocidade em km/h: " + aviao3.getVelocidade() + "Km/h");
        System.out.println ("Quantidade de assentos que o avião possui:" + aviao3.getQtdeAssento());



    }
}
