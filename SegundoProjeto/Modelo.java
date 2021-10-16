package SegundoProjeto;

public abstract class Modelo {
    private int id;
    private String nome;
    private String email;


    public Modelo(int id, String nome, String email){
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public Modelo(){}


    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }


}