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
public class ProjetoLoja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           CotacaoDolar cotacao = CotacaoDolar.acessoContacao();
           
           cotacao.setDolaHoje(4.19);
            
           VerificarCotacaoDola verificar = new ValorDola();
           cotacao.adicionaCotacao(verificar);
           
  
           
          
         
      
        ProdutoUnico notebook = 
                new ProdutoUnico("Notebook Dell Processador: Core i7 ",950.65);
        
       
        ProdutoUnico monitor = 
                new ProdutoUnico("Monitor Da Dell 17 Polegadas"
                        ,700.99);
        
        
        Produto compras1 = new ProdutoMultiplos(notebook, monitor);
        System.out.println(compras1.getProduto() +  compras1.getPreco());
        NotaFiscal nota = new NotaFiscal();
        
        nota.addProdutoCarrinho(notebook);
        nota.addProdutoCarrinho(monitor);
        nota.imprimirNotaFiscal(cotacao.getDolaHoje());
        
         cotacao.setDolaHoje(5.19);
         
          ProdutoUnico Playstation3 = 
                new ProdutoUnico("Playstation 3 ",320.75);
        
       
        ProdutoUnico Playstation4 = 
                new ProdutoUnico("Playstation 4", 560.95
                        );
        
        
        Produto compras2 = new ProdutoMultiplos(Playstation3, Playstation4);
        System.out.println(compras2.getProduto() +  compras2.getPreco());
        NotaFiscal nota2 = new NotaFiscal();
        
        nota2.addProdutoCarrinho(Playstation3);
        nota2.addProdutoCarrinho(Playstation4);
        nota2.imprimirNotaFiscal(cotacao.getDolaHoje());
         
         
        
    }   
    
}
