// Subclasse concreta PessoaFisica
class PessoaFisica extends Pessoa {
    // Variável de instância específica da subclasse
    private String cpf;

    // Construtor da subclasse
    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    // Implementação do método abstrato da classe pai
    @Override
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }
}