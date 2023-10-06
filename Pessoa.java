package com.mycompany.mavenproject1;

public class Pessoa {
    private String Nome;
    private int RG;
    
    public Pessoa(String Nome, int RG){
        this.Nome = Nome;
        this.RG = RG;
    }
    
    public String getNome(){
        return this.Nome;
    }
    
    public void setNome(String Nome){
        this.Nome = Nome;
    }
    
    public int getRG(){
        return this.RG;
    }
    
    public void setRG(int RG){
        this.RG = RG;
    }
    
}
