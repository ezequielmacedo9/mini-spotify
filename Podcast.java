import model.Audio;

public class Podcast extends Audio {
    private int numeroEpisodio;
    private String apresentador;
    private String descricao;

    public int getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public void setNumeroEpisodio(int numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void exibirInfo() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Duração: " + getDuracao());
        System.out.println("Apresentador: " + getApresentador());
        System.out.println("Episósio: " + getNumeroEpisodio());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Curtidas: " + getCurtidas());
        System.out.println("Classificação: " + getClassificacao());



    }
}
