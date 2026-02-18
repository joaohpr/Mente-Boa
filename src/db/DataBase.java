package db;

import java.util.ArrayList;
import model.Jogos;
import model.Ranque;
import model.Jogador;

public class DataBase {

    private static DataBase instance;

    private ArrayList<Jogador> jogadores = new ArrayList<>();
    private ArrayList<Jogos> jogos = new ArrayList<>();
    private ArrayList<Ranque> ranque = new ArrayList<>();

    private DataBase() {
    }

    public static DataBase getInstance() {
        if (instance == null) {
            instance = new DataBase();
        }
        return instance;
    }


    public ArrayList<Jogador> getJogadores(){
        return this.jogadores;
    }

    public int getQtdJogadores() {
        return jogadores.size();
    }


    public ArrayList<Jogos> getJogos() {
        return this.jogos;
    }

    public int getQtdJogos() {
        return jogos.size();
    }


    public ArrayList<Ranque> getRanque() {
        return this.ranque;
    }

    public int getQtdRanque() {
        return ranque.size();
    }
}
