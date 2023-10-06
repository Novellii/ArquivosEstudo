package com.mycompany.estudofinalpoo;

public class EstudoFinalPOO {

    public static void main(String[] args) {
        
        LojaEletronicos MarioGames = new LojaEletronicos();
        Produto Teclado = new Produto(1323, "Teclado Gamer", "ASUS", 23.99);
        
        System.out.println(Teclado.getNome());
        MarioGames.addProduto(Teclado);
        MarioGames.mostrarCategoria(Teclado);
        MarioGames.contagemProdutos();  
        MarioGames.listarCategorias();
        
        System.out.println(MarioGames);
    }
}
