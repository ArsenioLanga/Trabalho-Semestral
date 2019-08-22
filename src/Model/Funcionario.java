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
public class Funcionario extends Pessoa
{

 private String senha;
 private String cargo;
 private double salario;
 private double AjustoSalarial;

    public Funcionario() 
    {
    }

    public Funcionario(String senha, String cargo, double salario, double AjustoSalarial) 
    {
        this.senha = senha;
        this.cargo = cargo;
        this.salario = salario;
        this.AjustoSalarial = AjustoSalarial;
    }

    public Funcionario(String senha, String cargo, double salario, double AjustoSalarial, String nome, int codigo, String sexo, int telefone, String email, String morada, String documento_Identificacao, String numero_Documento) 
    {
        super(nome, codigo, sexo, telefone, email, morada, documento_Identificacao, numero_Documento);
        this.senha = senha;
        this.cargo = cargo;
        this.salario = salario;
        this.AjustoSalarial = AjustoSalarial;
    }
 
    
    

    public String getSenha() 
    {
        return senha;
    }

    public void setSenha(String senha) 
    {
        this.senha = senha;
    }

    public String getCargo() 
    {
        return cargo;
    }

    public void setCargo(String cargo) 
    {
        this.cargo = cargo;
    }

    public double getSalario() 
    {
        return salario;
    }

    public void setSalario(double salario) 
    {
        this.salario = salario;
    }

    public double getAjustoSalarial() 
    {
        return AjustoSalarial;
    }

    public void setAumentoSalario(double AjustoSalarial) 
    {
        this.AjustoSalarial = AjustoSalarial;
    }

    @Override
    public String toString() 
    {
        return "Funcionario{" + "senha=" + senha + ", cargo=" + cargo + ", salario=" + salario + ", AjustoSalarial=" + AjustoSalarial + '}';
    }
 
 
 
    /*
    Metodos Referentes a Classe Funcionario
    */
 
    /*
    Aumento do Salario
    */
 
    double aumentarSalario()
    {
    return(double) getSalario()+getAjustoSalarial();
    }
    
    /*
    Diminuir o Salario
    */
    double diminuirSalario()
    {
      return (double)getSalario()-getAjustoSalarial();
    }
    
    void demitir()
    {
        boolean demitir=true;
        if(demitir==true)
        {
            JOptionPane.showMessageDialog(null, "O Funcionario Esta Demitido");
        }
        else
            JOptionPane.showMessageDialog(null, "O Funcionario esta Activo");
    }
}
