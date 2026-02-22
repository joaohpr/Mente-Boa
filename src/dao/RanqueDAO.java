package dao;

import db.DataBase;
import model.Ranque;

import java.util.ArrayList;

public class RanqueDAO {

    DataBase dataBase = DataBase.getInstance();

    public RanqueDAO () {}


    public ArrayList<Ranque> getAll() {
        ArrayList<Ranque> arrayReturn = dataBase.getRanque();
        return arrayReturn;
    }

    public void limpaDados() {
        ArrayList<Ranque> ranque = dataBase.getRanque();

        for(int i = 0;i < ranque.size();i++) {
           ranque.remove(i);
        }
    }

    public boolean inserirRanque(Ranque ranqueInput) {
        dataBase.add(ranqueInput);
        return true;
    }
}
