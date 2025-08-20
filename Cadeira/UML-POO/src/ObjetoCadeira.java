import java.util.Scanner;
public class ObjetoCadeira {
    public static void main (String [] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println ("----------Cadeira 01----------");
        System.out.println ("Qual a cor da primeira cadeira?:");
        String cor= ler.nextLine();
        System.out.println ("Qual a altura da primeira cadeira? (Ex: 120cm) :");
        int altura= ler.nextInt();
        System.out.println ("Qual a largura da primeira cadeira?: (Ex: 40cm)" );
        int largura= ler.nextInt();
        System.out.println ("Qual a durabilidade da primeira cadeira? (Ex: 1 ano ):");
        int durabilidade= ler.nextInt();

        Cadeira cadeira1 = new Cadeira ();
        cadeira1.setCor (cor);
        cadeira1.setAltura (altura);
        cadeira1.setLargura (largura);
        cadeira1.setDurabilidade (durabilidade);

        ler.nextLine();
        System.out.println ("----------Cadeira 02----------");
        System.out.println ("Qual a cor da segunda cadeira?:");
        String cor2= ler.nextLine();
        System.out.println ("Qual a altura da segunda cadeira? (Ex: 120cm) :");
        int altura2= ler.nextInt();
        System.out.println ("Qual a largura da segunda cadeira?: (Ex: 40cm)" );
        int largura2= ler.nextInt();
        System.out.println ("Qual a durabilidade da segunda cadeira? (Ex: 1 ano ):");
        int durabilidade2= ler.nextInt();

        Cadeira cadeira2 = new Cadeira ();
        cadeira2.setCor (cor2);
        cadeira2.setAltura (altura2);
        cadeira2.setLargura (largura2);
        cadeira2.setDurabilidade (durabilidade2);

        ler.nextLine();
        System.out.println ("----------Cadeira 03----------");
        System.out.println ("Qual a cor da terceira cadeira?:");
        String cor3= ler.nextLine();
        System.out.println ("Qual a altura da terceira cadeira? (Ex: 120cm) :");
        int altura3= ler.nextInt();
        System.out.println ("Qual a largura da terceira cadeira?: (Ex: 40cm)" );
        int largura3= ler.nextInt();
        System.out.println ("Qual a durabilidade da terceira cadeira? (Ex: 1 ano ):");
        int durabilidade3= ler.nextInt();

        Cadeira cadeira3 = new Cadeira ();
        cadeira3.setCor (cor3);
        cadeira3.setAltura (altura3);
        cadeira3.setLargura (largura3);
        cadeira3.setDurabilidade (durabilidade3);

        System.out.println ("----------Cadeira 01----------");
        System.out.println ("Cor: " + cadeira1.getCor());
        System.out.println ("Altura da cadeira: " + cadeira1.getAltura() + " cm");
        System.out.println ("Largura da cadeira: " + cadeira1.getLargura() + " cm");
        System.out.println ("Durabilidade da cadeira: " + cadeira1.getDurabilidade() + " anos");

        System.out.println ("----------Cadeira 02----------");
        System.out.println ("Cor: " + cadeira2.getCor());
        System.out.println ("Altura da cadeira: " + cadeira2.getAltura() + " cm");
        System.out.println ("Largura da cadeira: " + cadeira2.getLargura() + " cm");
        System.out.println ("Durabilidade da cadeira: " + cadeira2.getDurabilidade() + " anos");

        System.out.println ("----------Cadeira 03----------");
        System.out.println ("Cor: " + cadeira3.getCor());
        System.out.println ("Altura da cadeira: " + cadeira3.getAltura() + " cm");
        System.out.println ("Largura da cadeira: " + cadeira3.getLargura() + " cm");
        System.out.println ("Durabilidade da cadeira: " + cadeira3.getDurabilidade() + " anos");
    }
}
