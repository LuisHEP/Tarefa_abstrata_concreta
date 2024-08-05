// Exemplo de utilização das classes
public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("João", "123.456.789-01");
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa XYZ", "12.345.678/0001-90");

        pessoaFisica.exibirDados();
        System.out.println();
        pessoaJuridica.exibirDados();
    }
}