public class Quest2_ClinicaMedico {

    public static void main(String[] args) {

        Quest2_endereco endereco = new Quest2_endereco("12", "123213123", "Bartolomeu", "Sem", "Centro", "Euclides da Cunha", "BA");
        Quest2_medico medico = new Quest2_medico(4, "Gustavo Teixeira", "Masculino", "Ginecologista", endereco);
        System.out.println(" ");
        System.out.println("Medico");
        System.out.println("Codigo: " + medico.codigo);
        System.out.println("Nome: " + medico.nome);
        System.out.println("Sexo: " + medico.sexo);
        System.out.println("Especialidade: " + medico.especialidade);
        System.out.println("Endereco");
        endereco.Endereco();

        endereco.numero = "213";
        endereco.cep = "1242423";
        endereco.rua = "Presidente Lula";
        endereco.complemento = "Sem";
        endereco.bairro = "Centro";
        endereco.cidade = "Rio de Janeiro";
        endereco.uf = "RJ";
        medico.codigo = 2123;
        medico.nome = "Larissa Lima";
        medico.sexo = "Feminino";
        medico.especialidade = "Geral";
        System.out.println(" ");
        System.out.println("Medico");
        System.out.println("Codigo: " + medico.codigo);
        System.out.println("Nome: " + medico.nome);
        System.out.println("Sexo: " + medico.sexo);
        System.out.println("Especialidade: " + medico.especialidade);
        System.out.println("Endereco");
        endereco.Endereco();
    }
}
