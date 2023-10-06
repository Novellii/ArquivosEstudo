package com.mycompany.mavenproject1;

public class CHIP {
    private String id;
    private String operadora;
    
    public CHIP(String operadora, String id){
       this.operadora = operadora;
       this.id = id;
    }
    
    public String getID(){
        return this.id;
    }
    
    public void setID(String id){
        this.id = id;
    }
    
    public void setOperadora(String operadora){
        this.operadora = operadora;
    }
    
    public String getOperadora(){
        return this.operadora;
    }
}
