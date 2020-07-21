package exercicio04;

public class Exercicio04 {
    public static void main(String[] args) {
        Cliente c = new Cliente("Carlos",21,"Sao Paulo","219837129");
        Funcionario f = new Funcionario("Luciano",22,"Rio de Janeiro", "20951129");
        Pessoa p = new Pessoa("Joao",20,"Fortaleza");
        c.exibirDados();
        System.out.println("---------------------");
        f.exibirDados();
        System.out.println("---------------------");
        p.exibirDados();
    }

}
