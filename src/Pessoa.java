// Classe abstrata Pessoa
abstract class Pessoa {
    // Variável de instância comum a todas as subclasses
    protected String nome;

    // Construtor da classe abstrata
    public Pessoa(String nome) {
        this.nome = nome;
    }

    // Método abstrato que deve ser implementado pelas subclasses
    public abstract void exibirDados();
}