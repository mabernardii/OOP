import java.util.Scanner;
public class ObjetoComputador {
    public static void main (String []args){
        Scanner ler=new Scanner (System.in);
        System.out.println ("----------Computador 01----------");
        System.out.println ("Qual a marca do computador?:");
        String marca= ler.nextLine();
        System.out.println ("Qual o modelo do computador?:");
        String modelo= ler.nextLine();
        System.out.println ("Qual a cor do computador?:" );
        String cor= ler.nextLine();
        System.out.println ("Para qual uso específico serio o computador?:");
        String usoEspecifico= ler.nextLine();

        Computador computador1 = new Computador ();
        computador1.setMarca(marca);
        computador1.setModelo(modelo);
        computador1.setCor(cor);
        computador1.setUsoEspecifico(usoEspecifico);

        ler.nextLine();

        System.out.println ("----------Computador 02----------");
        System.out.println ("Qual a marca do computador?:");
        String marca2= ler.nextLine();
        System.out.println ("Qual o modelo do computador?:");
        String modelo2= ler.nextLine();
        System.out.println ("Qual a cor do computador?:" );
        String cor2= ler.nextLine();
        System.out.println ("Para qual uso específico serio o computador?:");
        String usoEspecifico2= ler.nextLine();

        Computador computador2 = new Computador ();
        computador2.setMarca(marca2);
        computador2.setModelo(modelo2);
        computador2.setCor(cor2);
        computador2.setUsoEspecifico(usoEspecifico2);

        ler.nextLine();

        System.out.println ("----------Computador 03----------");
        System.out.println ("Qual a marca do computador?:");
        String marca3= ler.nextLine();
        System.out.println ("Qual o modelo do computador?:");
        String modelo3= ler.nextLine();
        System.out.println ("Qual a cor do computador?:" );
        String cor3= ler.nextLine();
        System.out.println ("Para qual uso específico serio o computador?:");
        String usoEspecifico3= ler.nextLine();

        Computador computador3 = new Computador ();
        computador3.setMarca(marca3);
        computador3.setModelo(modelo3);
        computador3.setCor(cor3);
        computador3.setUsoEspecifico(usoEspecifico3);

        System.out.println ("\n----------Computador 01----------");
        System.out.println ("Marca: " + computador1.getMarca());
        System.out.println ("Modelo: " + computador1.getModelo());
        System.out.println ("Cor: " + computador1.getCor());
        System.out.println ("Finalidade: " + computador1.getUsoEspecifico());

        System.out.println ("\n----------Computador 02----------");
        System.out.println ("Marca: " + computador2.getMarca());
        System.out.println ("Modelo: " + computador2.getModelo());
        System.out.println ("Cor: " + computador2.getCor());
        System.out.println ("Finalidade: " + computador2.getUsoEspecifico());

        System.out.println ("\n----------Computador 03----------");
        System.out.println ("Marca: " + computador3.getMarca());
        System.out.println ("Modelo: " + computador3.getModelo());
        System.out.println ("Cor: " + computador3.getCor());
        System.out.println ("Finalidade: " + computador3.getUsoEspecifico());
    }
}
