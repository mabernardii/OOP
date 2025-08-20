import java.util.Scanner;

public class ObjetoConvenio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Convenio c1 = new Convenio();

        String nome;
        String plano;
        String tarifa;

        System.out.print("Insira o nome do convênio: ");
        nome = ler.nextLine();

        System.out.print("Insira o plano: ");
        plano = ler.nextLine();

        System.out.print("Insira a tarifa: ");
        tarifa = ler.nextLine();

        c1.setNome(nome);
        c1.setPlano(plano);
        c1.setTarifa(tarifa);

        System.out.println("\n---- Os dados inseridos são: ----");
        System.out.println("Nome: " + c1.getNome());
        System.out.println("Plano: " + c1.getPlano());
        System.out.println("Tarifa: " + c1.getTarifa());
    }
}