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
public class ValorDola implements VerificarCotacaoDola{

    @Override
    public void NotificaalterarValor(CotacaoDolar cotacao) {
        
        if( cotacao.getDolaHoje() != cotacao.getDolaOntem()){
            System.out.println("Dolar  Alterada: "+ cotacao.getDolaHoje());
        
        }else{
           System.out.println("Dolar Igual" + cotacao.getDolaHoje());
        }


    }
    
}
