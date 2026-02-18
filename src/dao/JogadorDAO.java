package dao;

import db.DataBase;
import model.Jogador;

public class JogadorDAO {

    private static final DataBase dataBase = DataBase.getInstance();

    public void criarJogador(Jogador jogador) {
        dataBase.add(jogador);
    }

    public void mudarNome(Jogador jogador, String novoNome) {
        jogador.setName(novoNome);
    }

    public void mudarNickName(Jogador jogador, String novoNickName) {
        jogador.setNickName(novoNickName);
    }

    public void mudarCpf(Jogador jogador, String novoCpf) {
        jogador.setCpf(novoCpf);
    }
}
