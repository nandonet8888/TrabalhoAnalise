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
public class CotacaoDolar {
        private List<VerificarCotacaoDola> ListaCotacao = new ArrayList<>();
        private Double dolaOntem;
        private Double dolaHoje;
        private static CotacaoDolar instanciaUnica;
  private CotacaoDolar(){
      System.out.println("Cotacao Dolar pode ser verificada somente uma vez");

}
  public synchronized  static CotacaoDolar acessoContacao(){
      if(instanciaUnica == null){
         instanciaUnica = new CotacaoDolar();
      }  else if(instanciaUnica != null){
            System.out.println("Essa Cotacao do Dolar ja foi instanciada");
        }
      return instanciaUnica;
                 
      
      
  
  }
        

    public Double getDolaOntem() {
        return dolaOntem;
    }
        
    public void setDolaOntem(Double dolaOntem){
        this.dolaOntem = dolaOntem;
    } 

    public Double getDolaHoje() {
        return dolaHoje;
    }
    
    public void setDolaHoje(Double dolaHoje){
       this.dolaOntem = this.dolaHoje;
        this.dolaHoje = dolaHoje;
    }
       
        
    public void adicionaCotacao(VerificarCotacaoDola cotacao){
        
        ListaCotacao.add(cotacao);
    }   
    
    
    public void historicoCotacao(){
            for(VerificarCotacaoDola historico:ListaCotacao){
                historico.NotificaalterarValor(this);
            }
    
    }
}
