public class Quest4_Postagem_Facebook {

    public static void main(String[] args){

        Quest4_Postagem amazonia = new Quest4_Postagem("Está pegando fogo na amazonia hoje", "https://www.instagram.com");

        amazonia.Curtir();
        amazonia.Curtir();
        amazonia.Curtir();
        System.out.println("Quantidade de curtidas: "+amazonia.numeroCurtidas);

        amazonia.Compartilhar();
        amazonia.Compartilhar();
        System.out.println("Quantidade de compartilhamentos: "+amazonia.numeroCompartilhamento);
    }
}
