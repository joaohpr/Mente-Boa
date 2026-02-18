package dao;

import db.DataBase;
import model.Jogador;

import java.util.ArrayList;

public class JogadorDAO {

    private static final DataBase dataBase = DataBase.getInstance();

    public boolean inserirJogador(Jogador jogador) {
        dataBase.add(jogador);
        return true;
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

    public void limparDados(Jogador jogadorInput) {
        for (Jogador jogador : dataBase.getJogadores()) {
            if (jogador.equals(jogadorInput)) {
                jogador.setCpf(null);
                jogador.setNickName(null);
                jogador.setName(null);
                return;
            }
        }
    }

    public ArrayList<Jogador> getAll() {
       ArrayList<Jogador> jogadores = dataBase.getJogadores();
       return jogadores;
    }

    public Jogador getJogador(String cpfInput) {
        ArrayList<Jogador> jogadores = dataBase.getJogadores();
        for(int i = 0;i < jogadores.size();i++) {
            Jogador jogador = jogadores.get(i);

            if(jogador.getCpf().equalsIgnoreCase(cpfInput)) {
                 return jogador;
            }
        }
        return null;
    }

    public boolean deleteJogador(String cpfInput) {
        if (cpfInput == null) return false;

        ArrayList<Jogador> jogadores = dataBase.getJogadores();

        for (int i = 0; i < jogadores.size(); i++) {
            Jogador jogador = jogadores.get(i);

            if (jogador.getCpf() != null &&
                    jogador.getCpf().equalsIgnoreCase(cpfInput)) {

                jogadores.remove(i);
                return true;
            }
        }
        return false;
    }


}
