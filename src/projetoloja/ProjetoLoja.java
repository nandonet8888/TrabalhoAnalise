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
        
        //=========================================
            CotacaoDolar cotacao = CotacaoDolar.acessoContacao();
            cotacao.setDolaHoje(4.15);
            cotacao.setDolaHoje(4.17);
            cotacao.setDolaHoje(4.19);
       
           VerificarCotacaoDola verificar = new ValorDola();
           cotacao.adicionaCotacao(verificar);
           
           cotacao.historicoCotacao();
                   
        //==========================================
        
        
        
     
    }
    
}
