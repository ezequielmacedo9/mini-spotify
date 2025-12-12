import model.Audio;

public class Musica extends Audio {
    private String artista;
    private String album;
    private String genero;

    public String getArtista() {
        return artista;
    }

    public String getAlbum() {
        return album;
    }

    public String getGenero() {
        return genero;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void exibirInfo(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Duração: " + getDuracao());
        System.out.println("Curtidas: " + getCurtidas());
        System.out.println("Classificação: " + getClassificacao());
        System.out.println("Artista: " + getArtista());
        System.out.println("Álbum: " + getAlbum());
        System.out.println("Gênero: " + getGenero());
    }
}
