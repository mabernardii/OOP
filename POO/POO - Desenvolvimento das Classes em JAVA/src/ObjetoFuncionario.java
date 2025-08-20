import java.util.Scanner;

public class ObjetoFuncionario {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);

        Funcionario f1 = new Funcionario();

        String nome;
        String endereco;
        String cpf;
        String telefone;
        String cargo;
        String dataAdmissao;
        String dataDeDemissao;
        String email;
        String sexo;
        String nivelDeEscolaridade;

        System.out.print("Insira o nome do funcionário: ");
        nome = ler.nextLine();

        System.out.print("Insira o endereço do funcionário: ");
        endereco = ler.nextLine();

        System.out.print("Insira o CPF do funcionário: ");
        cpf = ler.nextLine();

        System.out.print("Insira o telefone do funcionário: ");
        telefone = ler.nextLine();

        System.out.print("Insira o cargo do funcionário: ");
        cargo = ler.nextLine();

        System.out.print("Insira a data de admissão do funcionário (dd/mm/aaaa): ");
        dataAdmissao = ler.nextLine();

        System.out.print("Insira a data de demissão do funcionário (caso exista, senão deixe em branco): ");
        dataDeDemissao = ler.nextLine();

        System.out.print("Insira o email do funcionário: ");
        email = ler.nextLine();

        System.out.print("Insira o sexo do funcionário (M/F/Outro): ");
        sexo = ler.nextLine();

        System.out.print("Insira o nível de escolaridade do funcionário: ");
        nivelDeEscolaridade = ler.nextLine();

        // Setando valores no objeto
        f1.setNome(nome);
        f1.setEndereco(endereco);
        f1.setCpf(cpf);
        f1.setTelefone(telefone);
        f1.setCargo(cargo);
        f1.setDataAdmissao(dataAdmissao);
        f1.setDataDeDemissao(dataDeDemissao);
        f1.setEmail(email);
        f1.setSexo(sexo);
        f1.setNivelDeEscolaridade(nivelDeEscolaridade);

        // Exibindo resultados formatados
        System.out.println("\n---- Os dados inseridos são: ----");
        System.out.println("Nome: " + f1.getNome());
        System.out.println("Endereço: " + f1.getEndereco());
        System.out.println("CPF: " + f1.getCpf());
        System.out.println("Telefone: " + f1.getTelefone());
        System.out.println("Cargo: " + f1.getCargo());
        System.out.println("Data de Admissão: " + f1.getDataAdmissao());
        System.out.println("Data de Demissão: " + f1.getDataDeDemissao());
        System.out.println("Email: " + f1.getEmail());
        System.out.println("Sexo: " + f1.getSexo());
        System.out.println("Nível de Escolaridade: " + f1.getNivelDeEscolaridade());

    }
}