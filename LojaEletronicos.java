package com.mycompany.estudofinalpoo;

import java.util.*;

/* *Loja(estoque(lista de produtos), categorias(conjunto de marcas), mapa de produtos)
-Adicionar um produto.
-Busca de produto por id
-Exibir produtos por categoria
-Listar categorias */

public class LojaEletronicos {
    HashSet<String> Estoque;
    HashSet<String> Categorias;
    HashMap<Produto, String> MapaProdutos;
       
    public LojaEletronicos(){
        this.Estoque = new HashSet<>();
        this.Categorias = new HashSet<>();
        this.MapaProdutos = new HashMap<>();
    }
    
    public void addProduto(Produto p){
        this.Estoque.add(p.getNome());
        this.Categorias.add(p.getMarca());
        this.MapaProdutos.put(p, p.getNome());
        }
    
    public void contagemProdutos(){
        System.out.println("O TAMANHO DO ESTOQUE É DE " + this.Estoque.size());
    }  
    
    public void mostrarCategoria(Produto p){
        System.out.println("A MARCA DO PRODUTO É " + p.getMarca());
    }
    
    public void listarCategorias(){
        System.out.println("Listando produtos:");
        for(Produto p: MapaProdutos.keySet()){
            System.out.println(p);
        }
    }
    
}
