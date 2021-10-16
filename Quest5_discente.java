public class Quest5_discente {

    String nome, CPF;
    double n1, n2, n3;

    public Quest5_discente(String nome, String cpf){

        this.nome = nome;
        this.CPF = cpf;

    }
    public double M(){
       return (this.n1 + this.n2 + this.n3)/3;
    }
}
