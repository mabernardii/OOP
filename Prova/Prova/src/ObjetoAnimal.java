import java.util.Scanner;
public class ObjetoAnimal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o nome do animal: ");
        String nome = ler.nextLine();

        System.out.print("Digite a espécie do animal: ");
        String especie = ler.nextLine();

        System.out.print("Digite a idade do animal: ");
        int idade = ler.nextInt();

        System.out.print("Digite o peso do animal (ex: 8.5): ");
        double peso = ler.nextDouble();

        Animal animal = new Animal();
        animal.setNome(nome);
        animal.setEspecie(especie);
        animal.setIdade(idade);
        animal.setPeso(peso);

        System.out.println("\nAnimal cadastrado com sucesso!");
        System.out.println("Nome: " + animal.getNome());
        System.out.println("Espécie: " + animal.getEspecie());
        System.out.println("Idade: " + animal.getIdade() + " anos");
        System.out.println("Peso: " + animal.getPeso() + " kg");
    }
}
