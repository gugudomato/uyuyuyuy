public class Quest1_ClinicaPaciente {

    public static void main(String[] args){

        System.out.println(" ");
        Quest1_Paciente paciente = new Quest1_Paciente("Gustavo", 2, "12/08/2004", "Masculino", "Nenhuma", "Nenhum", "AB+");
        System.out.println("Codigo: "+paciente.codigo);
        System.out.println("Nome: "+ paciente.nome);
        System.out.println("Data de Nascimento: "+ paciente.dataNascimento);
        System.out.println("Sexo: "+ paciente.sexo);
        System.out.println("Plano de saude: "+ paciente.planoSaude);
        System.out.println("Alergia: "+ paciente.alergia);
        System.out.println("Tipo Sanguíneo: "+ paciente.tipoSanguineo);

        paciente.nome = "Anna Thercia";
        paciente.dataNascimento = "04/01/1978";
        paciente.sexo = "Feminino";
        paciente.alergia = "Barata";
        paciente.planoSaude = "Nenhum";
        paciente.tipoSanguineo = "AB-";
        paciente.codigo = 3;
        System.out.println(" ");
        System.out.println("Codigo: "+paciente.codigo);
        System.out.println("Nome: "+ paciente.nome);
        System.out.println("Data de Nascimento: "+ paciente.dataNascimento);
        System.out.println("Sexo: "+ paciente.sexo);
        System.out.println("Plano de saude: "+ paciente.planoSaude);
        System.out.println("Alergia: "+ paciente.alergia);
        System.out.println("Tipo Sanguíneo: "+ paciente.tipoSanguineo);

    }
}
