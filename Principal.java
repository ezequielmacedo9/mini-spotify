public class Principal {
    public static void main(String[] args) {

        Musica musica = new Musica();
        musica.setTitulo("Best Part");
        musica.setDuracao(3.30);
        musica.setArtista("Daniel Caesar");
        musica.setAlbum("Freudian");
        musica.setGenero("R&B / Soul");

        // Simulando Ações
        musica.reproduzir();
        musica.reproduzir();
        musica.reproduzir();
        musica.curtir();
        musica.curtir();
        musica.curtir();
        musica.calcularClassificacao();

        // Exibindo Tudo
        musica.exibirInfo();

        Podcast podcast = new Podcast();
        System.out.println(); // apenas pra pular a linha entre um e outro
        podcast.setTitulo("Inteligência Ltda");
        podcast.setDuracao(180);
        podcast.setApresentador("Rogério Vilela");
        podcast.setNumeroEpisodio(1900);
        podcast.setDescricao("Um podcast de entrevistas diferenciadas");

        podcast.reproduzir();
        podcast.reproduzir();
        podcast.reproduzir();
        podcast.curtir();
        podcast.curtir();
        podcast.curtir();
        podcast.calcularClassificacao();

        podcast.exibirInfo();

        ControladorAudio controle = new ControladorAudio();
        System.out.println("------------------");
        controle.adicionar(musica);
        controle.adicionar(podcast);
        controle.listarTudo();

    }
}
