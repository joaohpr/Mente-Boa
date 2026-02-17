package model;

import model.Jogador;

public class Jogo {

    private Jogador jogador = new Jogador();
    private int score;
    private int codeId;


    public Jogo() {}

    public Jogo(Jogador jogador,int score,int codeId) {
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
