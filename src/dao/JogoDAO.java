package dao;

import db.DataBase;
import model.Jogador;
import model.Jogo;

import java.util.ArrayList;

public class JogoDAO {
    DataBase dataBase = DataBase.getInstance();

    public boolean inserirJogo(Jogo jogo) {
       if(jogo == null) return false;

        dataBase.add(jogo);
        return true;
    }

    public void limpaDados(Jogo jogo) {
        jogo.setScore(0);
        Jogador jogador = new Jogador();
        jogo.setJogador(jogador);
        jogo.setCodeId(0);
    }

    public Jogo getJogo(int codeIdInput) {
        ArrayList<Jogo> jogos = dataBase.getJogos();
        for(int i = 0;i < jogos.size();i++) {
            Jogo jogo = jogos.get(i);
            if(jogo.getCodeId() == codeIdInput) {
                 return jogo;
            }
        }
        return null;
    }

    public boolean deleteJogo(int codeIdInput) {
        ArrayList<Jogo> jogos = dataBase.getJogos();

        for (int i = 0; i < jogos.size(); i++) {
            Jogo jogo = jogos.get(i);

            if (jogo.getCodeId() == codeIdInput) {
                jogos.remove(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Jogo> getAll() {
        return new ArrayList<>(dataBase.getJogos());
    }

}
