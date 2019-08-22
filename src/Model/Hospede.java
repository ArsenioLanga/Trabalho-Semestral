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
public class Hospede extends Pessoa
{
private String nacionalidade;
private String naturalidade;
private String tipoHospedagem;
private int codigoFuncionario;

    public Hospede() 
    {
    
    }



    public Hospede(String nacionalidade, String naturalidade, String tipoHospedagem, int codigoFuncionario) 
    {
        this.nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
        this.tipoHospedagem = tipoHospedagem;
        this.codigoFuncionario = codigoFuncionario;
    }

    public Hospede(String nacionalidade, String naturalidade, String tipoHospedagem, int codigoFuncionario, String nome, int codigo, String sexo, int telefone, String email, String morada, String documento_Identificacao, String numero_Documento) 
    {
        super(nome, codigo, sexo, telefone, email, morada, documento_Identificacao, numero_Documento);
        this.nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
        this.tipoHospedagem = tipoHospedagem;
        this.codigoFuncionario = codigoFuncionario;
    }





    public String getNacionalidade() 
    {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) 
    {
        this.nacionalidade = nacionalidade;
    }

    public String getNaturalidade() 
    {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) 
    {
        this.naturalidade = naturalidade;
    }

    public String getTipoHospedagem() 
    {
        return tipoHospedagem;
    }

    public void setTipoHospedagem(String tipoHospedagem) 
    {
        this.tipoHospedagem = tipoHospedagem;
    }

    public int getCodigoFuncionario() 
    {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) 
    {
        this.codigoFuncionario = codigoFuncionario;
    }

    @Override
    public String toString() 
    {
        return "Hospede{" + "nacionalidade=" + nacionalidade + ", naturalidade=" + naturalidade + ", tipoHospedagem=" + tipoHospedagem + ", codigoFuncionario=" + codigoFuncionario + '}';
    }

void reservar()
{
 boolean reservar=true;
 
 if (reservar==true)
 {
     JOptionPane.showMessageDialog(null, "Hospede: "+getNome()+"ja Fez a Reserva");
             
 }
   
   
}
void cancelarReserva()
{
    boolean reservar=false;
    
    if (reservar==false)
    {
         JOptionPane.showMessageDialog(null, "Hospede: "+getNome()+"Cancelou a Reserva");
    }
}
        
void ocupar()
{
    boolean ocupar=true;
    if (ocupar==true)
    {
       JOptionPane.showMessageDialog(null, "Hospede: "+getNome()+"Ocupou um Quarto");  
    }
}
void cancelarOcupacao()
{
    boolean ocupar=false;
    
    if (ocupar==false)
    {
         JOptionPane.showMessageDialog(null, "Hospede: "+getNome()+"Cancelou a Ocupacao");
    }
}
void mudarQuarto()
{
  boolean mudarQuarto=true;
if(mudarQuarto==true)
{
     JOptionPane.showMessageDialog(null, "Hospede: "+getNome()+"mudou de Quarto");
}
}

}
