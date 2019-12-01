/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoloja;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fernando
 */
public class NotaFiscal {
    List<Produto> listaProduto = new ArrayList<>();
    Double valorTotal = 0.00;
    Double ValorDolar = 0.00;
   
  
    
    
    
    
    
    public void addProdutoCarrinho(Produto carrinho){
        listaProduto.add(carrinho);
    }
    
    public void imprimirNotaFiscal(Double valorDolar){
        this.ValorDolar = valorDolar;
        Double valorTotalDolar;
        for(Produto listarvalorTotal:listaProduto){
         System.out.println("\nProduto: "+ listarvalorTotal.getProduto()
                +"\nValor em Dolar:U$$" + listarvalorTotal.getPreco());
          valorTotal +=  listarvalorTotal.getPreco();
        }
        System.out.println("\nValor Total Da Compra:U$$" + valorTotal);
       valorTotalDolar = valorTotal * valorDolar;
        System.out.println("Total em Reais: " + "R$"+valorTotalDolar);
    }
  
     
    
   
    
    
    
    
    
    
}
