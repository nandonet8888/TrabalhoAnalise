/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoloja;

/**
 *
 * @author Fernando
 */
public class ProdutoUnico implements Produto{
    private String Produto;

    private Double preco;
    
    public ProdutoUnico(String produto,Double preco){
        this.Produto = produto;
        
        this.preco = preco;
    }
    
    
    
    
    
    @Override
    public String getProduto() {
        return Produto;

    }

  

    @Override
    public Double getPreco() {
        return this.preco;
    }
    
}
