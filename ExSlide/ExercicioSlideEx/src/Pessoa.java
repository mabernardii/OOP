public class Pessoa {

    String nome;
    int idade;
    String endereco;
    String profissao;

    // Getter e Setter para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter para idade
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Getter e Setter para endereço
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Getter e Setter para profissão
    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    // Classe com o método main
    public static void main(String[] args) {
        // Criando objetos da classe Pessoa
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        // OBJETO 1
        pessoa1.setNome("Tom Cruise");
        pessoa1.setIdade(60);
        pessoa1.setEndereco("California, USA");
        pessoa1.setProfissao("Ator");

        // OBJETO 2
        pessoa2.setNome("Messi");
        pessoa2.setIdade(35);
        pessoa2.setEndereco("Miami, USA");
        pessoa2.setProfissao("Jogador de Futebol");

        // Apresentando objetos
        System.out.println("-- OBJETO 1 ----");
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        System.out.println(pessoa1.getEndereco());
        System.out.println(pessoa1.getProfissao());

        System.out.println("-- OBJETO 2 ----");
        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.getIdade());
        System.out.println(pessoa2.getEndereco());
        System.out.println(pessoa2.getProfissao());
    }
}
