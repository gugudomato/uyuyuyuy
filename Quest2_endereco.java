public class Quest2_endereco {

    String rua, complemento, bairro, cidade, uf, numero, cep;
    public Quest2_endereco(String numero, String cep, String rua, String complemento, String bairro, String cidade, String uf){

        this.numero = numero;
        this.cep = cep;
        this.rua = rua;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;

    }
    public void Endereco(){

        System.out.println("CEP: "+this.cep);
        System.out.println("UF: "+this.uf);
        System.out.println("Numero: "+this.numero);
        System.out.println("Complemento: "+this.complemento);
        System.out.println("Bairro: "+this.bairro);
        System.out.println("Cidade: "+this.cidade);
        System.out.println("Rua: "+this.rua);

    }
}
