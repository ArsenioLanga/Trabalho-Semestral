/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.JOptionPane;

/**
 *
 * @author FMatusse
 */
public class Ocupacao extends Alocacao
{
private double precoTotal;
    public Ocupacao() 
    {
    
    }
    public Ocupacao(double precoTotal) 
    {
        this.precoTotal = precoTotal;
    }

    public Ocupacao(double precoTotal, int codigo, int codigoQuarto, double PrecoQuarto, int codigoFuncionario, String dataEntrada, String dataSaida, String Servicos, double precoServico, String Anexo, double precoAnexo) {
        super(codigo, codigoQuarto, PrecoQuarto, codigoFuncionario, dataEntrada, dataSaida, Servicos, precoServico, Anexo, precoAnexo);
        this.precoTotal = precoTotal;
    }

   

    @Override
    public String toString() {
        return "Ocupacao{" + "precoTotal=" + precoTotal + '}';
    }

    
   void desocupar()
   {
   boolean desocupar=true;
   if(desocupar==true)
        JOptionPane.showMessageDialog(null, "Hospede: "+getCodigoQuarto()+"Cancelou a Reserva");
       
   }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }
    
   public  double precoTotal()
    {
      return (double) getPrecoAnexo()+getPrecoServico()+getPrecoQuarto();
    }
}
