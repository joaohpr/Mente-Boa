package model;

public class Jogos {

    private Jogador jogador = new Jogador();
    private int score;
    private int codeId;


    public Jogos() {}

    public Jogos(Jogador jogador, int score, int codeId) {
        this.jogador = jogador;
        this.score = score;
        this.codeId = codeId;
    }


    public Jogador getJogador() {
        return this.jogador;
    }

    public void setJogador(Jogador jogadorInput) {
        this.jogador = jogadorInput;
    }


    public int getScore() {
        return this.score;
    }

    public void setScore(int scoreInput) {
        this.score = scoreInput;
    }


    public int  getCodeId() {
        return this.codeId;
    }

    public void setCodeId(int codeIdInput) {
        this.codeId = codeIdInput;
    }
}
