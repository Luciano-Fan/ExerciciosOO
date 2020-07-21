package exercicio01;

public class Pessoa {
    private String nome;
    private String cpf;
    private double altura;

    public Pessoa(String nome, String cpf, double altura) {
        this.nome = nome;
        this.cpf = cpf;
        this.altura = altura;
    }


    public void gritar(){
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAA");
    }

    public void crescer (){
        System.out.println("Altura antes: " + this.altura + "\nAltura dps: " + (this.altura += 0.1));
    }

}
