package model;

public class Ranque {

    private Jogador jogador = new Jogador();
    private int qtd;
    private float mediaRanque;
    private int points;


    public Ranque() {

    }

    public Ranque(Jogador jogadorInput,int qtdInput,float mediaRanque,int pointsInput) {
        this.jogador = jogador;
        this.qtd = qtdInput;
        this.mediaRanque = mediaRanque;
        this.points = pointsInput;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }


    public int getQtd() {
        return this.qtd;
    }

    public void setQtd(int qtdInput) {
        this.qtd = qtdInput;
    }


    public float getMediaRanque() {
        return this.mediaRanque;
    }

    public void setMediaRanque(float mediaRanqueInput) {
        this.mediaRanque = mediaRanqueInput;
    }


    public int getPoints() {
        return this.points;
    }

    public void setPoints(int pointsInput) {
        this.points = pointsInput;
    }

    @Override
    public String toString() {
        return "Ranque{" +
                "jogador=" + jogador.getName() +
                ", qtd=" + qtd +
                ", mediaRanque=" + mediaRanque +
                ", points=" + points +
                '}';
    }
}
