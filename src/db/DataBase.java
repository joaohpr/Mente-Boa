package db;

import java.util.ArrayList;
import model.Jogo;
import model.Ranque;
import model.Jogador;

public class DataBase {

    private static DataBase instance;

    private ArrayList<Jogador> jogadores = new ArrayList<>();

    private ArrayList<Jogo> jogos = new ArrayList<>();

    private ArrayList<Ranque> ranque = new ArrayList<>();


    private DataBase() {
    }


    public static DataBase getInstance() {
        if (instance == null) {
            instance = new DataBase();
        }
        return instance;
    }


    public ArrayList<Jogador> getJogadores() {
        return new ArrayList<>(jogadores);
    }

    public int getQtdJogadores() {
        return jogadores.size();
    }

    public void add(Jogador jogadorInput) {
        jogadores.add(jogadorInput);
    }

    public ArrayList<Jogo> getJogos() {
        return new ArrayList<>(jogos);
    }

    public int getQtdJogos() {
        return jogos.size();
    }

    public void add(Jogo jogoInput) {
        jogos.add(jogoInput);
    }

    public ArrayList<Ranque> getRanque() {
        return new ArrayList<>(ranque);
    }

    public int getQtdRanque() {
        return ranque.size();
    }

    public void add(Ranque ranqueInput) {
        ranque.add(ranqueInput);
    }
}
