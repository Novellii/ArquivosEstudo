package com.mycompany.mavenproject1;

public class Telefone {   
    private Pessoa telefonePessoa;
    private String Nome;
    private DDD telefoneDDD;
    private CHIP telefoneCHIP;
    
    public Telefone (String Nome){
        this.telefonePessoa = new Pessoa("String", 12);
        this.Nome = Nome;
    } 
       
    public void setDDDPessoa(DDD telefoneDDD){
        this.telefoneDDD = telefoneDDD;
    }
    
    public void pegarInformacoesPessoa(){
        System.out.println(telefonePessoa.getNome());
        System.out.println(telefonePessoa.getRG());
    }
    
    public DDD getDDDPessoa(){
        return this.telefoneDDD;
    }
    
    public void setCHIPPessoa(CHIP telefoneCHIP){
        this.telefoneCHIP = telefoneCHIP;
    }
    
    public CHIP getCHIPPessoa(){
        return telefoneCHIP;
    }
    
    public Pessoa getTelefonePessoa(){
        return this.telefonePessoa;
    }
    
    public void setTelefonePessoa(Pessoa telefonePessoa){
        this.telefonePessoa = telefonePessoa;
    }
    
    public String getNome(){
        return this.Nome;
    }
    
    public void setNome(String Nome){
        this.Nome = Nome;
    }
}
