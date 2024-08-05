// Subclasse concreta PessoaJuridica
class PessoaJuridica extends Pessoa {
    // Variável de instância específica da subclasse
    private String cnpj;

    // Construtor da subclasse
    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    // Implementação do método abstrato da classe pai
    @Override
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CNPJ: " + cnpj);
    }
}