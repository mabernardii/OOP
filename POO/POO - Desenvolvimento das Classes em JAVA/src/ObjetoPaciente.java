import java.util.Scanner;

public class ObjetoPaciente {
    public static void main (String [] args){
        Scanner ler = new Scanner(System.in);

        String nome;
        String endereco;
        String cpf;
        String sexo;
        String nivelDeEscolaridade;
        String email;
        String dataDeNascimento;
        String telefone;

        System.out.print("Insira o nome do paciente: ");
        nome = ler.nextLine();

        System.out.print("Insira o endereço do paciente: ");
        endereco = ler.nextLine();

        System.out.print("Insira o CPF do paciente: ");
        cpf = ler.nextLine();

        System.out.print("Insira o sexo do paciente (M/F/Outro): ");
        sexo = ler.nextLine();

        System.out.print("Insira o nível de escolaridade do paciente: ");
        nivelDeEscolaridade = ler.nextLine();

        System.out.print("Insira o email do paciente: ");
        email = ler.nextLine();

        System.out.print("Insira a data de nascimento do paciente (dd/mm/aaaa): ");
        dataDeNascimento = ler.nextLine();

        System.out.print("Insira o telefone do paciente: ");
        telefone = ler.nextLine();

        Paciente p1 = new Paciente();
        p1.setNome(nome);
        p1.setEndereco(endereco);
        p1.setCpf(cpf);
        p1.setSexo(sexo);
        p1.setNivelDeEscolaridade(nivelDeEscolaridade);
        p1.setEmail(email);
        p1.setDataDeNascimento(dataDeNascimento);
        p1.setTelefone(telefone);

        System.out.println("\n---- Os dados inseridos são: ----");
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Endereço: " + p1.getEndereco());
        System.out.println("CPF: " + p1.getCpf());
        System.out.println("Sexo: " + p1.getSexo());
        System.out.println("Escolaridade: " + p1.getNivelDeEscolaridade());
        System.out.println("Email: " + p1.getEmail());
        System.out.println("Data de Nascimento: " + p1.getDataDeNascimento());
        System.out.println("Telefone: " + p1.getTelefone());

    }
}