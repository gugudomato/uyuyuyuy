public class Quest2_medico {

    int codigo; String nome, sexo, especialidade; Quest2_endereco end;

    public Quest2_medico(int cod, String nome, String sexo, String especialidade, Quest2_endereco end){

        this.codigo = cod;
        this.nome = nome;
        this.sexo = sexo;
        this.especialidade = especialidade;
        this.end = end;
    }
}