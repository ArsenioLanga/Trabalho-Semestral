/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Objects;

/**
 *
 * @author FMatusse
 */
public abstract class Pessoa 
{
private String nome;
private int codigo;
private String sexo;
private int telefone;
private String email;
private String morada;
private String documento_Identificacao;
private String numero_Documento;

    public Pessoa()
    {
        
    }

    public Pessoa(String nome, int codigo, String sexo, int telefone, String email, String morada, String documento_Identificacao, String numero_Documento) 
    {
        this.nome = nome;
        this.codigo = codigo;
        this.sexo = sexo;
        this.telefone = telefone;
        this.email = email;
        this.morada = morada;
        this.documento_Identificacao = documento_Identificacao;
        this.numero_Documento = numero_Documento;
    }
    
    
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public int getCodigo() 
    {
        return codigo;
    }

    public void setCodigo(int codigo) 
    {
        this.codigo = codigo;
    }

    public String getSexo() 
    {
        return sexo;
    }

    public void setSexo(String sexo) 
    {
        this.sexo = sexo;
    }

    public int getTelefone() 
    {
        return telefone;
    }

    public void setTelefone(int telefone) 
    {
        this.telefone = telefone;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getMorada() 
    {
        return morada;
    }

    public void setMorada(String morada) 
    {
        this.morada = morada;
    }

    public String getDocumento_Identificacao() 
    {
        return documento_Identificacao;
    }

    public void setDocumento_Identificacao(String documento_Identificacao) 
    {
        this.documento_Identificacao = documento_Identificacao;
    }

    public String getNumero_Documento() 
    {
        return numero_Documento;
    }

    public void setNumero_Documento(String numero_Documento) 
    {
        this.numero_Documento = numero_Documento;
    }

    @Override
    public String toString() 
    {
        return "Pessoa{" + "nome=" + nome + ", codigo=" + codigo + ", sexo=" + sexo + ", telefone=" + telefone + ", email=" + email + ", morada=" + morada + ", documento_Identificacao=" + documento_Identificacao + ", numero_Documento=" + numero_Documento + '}';
    }


    

 

}
