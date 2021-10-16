public class Quest1_Paciente {

    int codigo;
    String nome, dataNascimento, sexo, planoSaude, alergia, tipoSanguineo;

    public Quest1_Paciente(String nome, int cod, String dataNascimento, String sexo, String alergia, String saude, String tipoSanguineo){

        this.codigo = cod;
        this.planoSaude = saude;
        this.alergia = alergia;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.tipoSanguineo = tipoSanguineo;
        this.sexo = sexo;

    }
}
