package model;

public class Jogador {

    private String name;
    private String nickName;
    private String cpf;


    public Jogador(){}


    public Jogador(String name,String nickName,String cpf) {
        this.name = name;
        this.nickName = nickName;
        this.cpf = cpf;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String nameInput) {
        this.name = nameInput;
    }


    public String getNickName() {
        return this.nickName;
    }

    public void setNickName(String nickNameInput) {
        this.nickName = nickNameInput;
    }


    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpfInput) {
        this.cpf = cpfInput;
    }

    @Override
    public String toString() {
        return "Jogador{\n" +
                "Name : "+this.name+
                "\nNickName : "+this.nickName+
                "\nCpf : "+this.cpf+"}";

    }

}
