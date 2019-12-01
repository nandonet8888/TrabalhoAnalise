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
public class ProdutoMultiplos implements Produto{
    private Produto Produto1;
    private Produto Produto2;
   
    private Double precoProduto;
    
    public ProdutoMultiplos(Produto Produto1,Produto Produto2){
    this.Produto1 = Produto1;
    this.Produto2 = Produto2;
    
    
    
    
    }
    
    
    @Override
    public String getProduto() {
        return Produto1.getProduto() + "\nJunto\n" + Produto2.getProduto()+"\nU$$";
    }

  

    @Override
    public Double getPreco() {
       return Produto1.getPreco();
    }
    
}
