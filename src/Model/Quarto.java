/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author FMatusse
 */
public class Quarto 
{
private int codigo;
private String categoria;
private String descricao;
private double preco;

    public Quarto() 
    {
    }

    public Quarto(int codigo, String categoria, String descricao, double preco) 
    {
        this.codigo = codigo;
        this.categoria = categoria;
        this.descricao = descricao;
        this.preco = preco;
    }




    public int getCodigo() 
    {
        return codigo;
    }

    public void setCodigo(int codigo) 
    {
        this.codigo = codigo;
    }

    public String getCategoria() 
    {
        return categoria;
    }

    public void setCategoria(String categoria) 
    {
        this.categoria = categoria;
    }

    public String getDescricao() 
    {
        return descricao;
    }

    public void setDescricao(String descricao) 
    {
        this.descricao = descricao;
    }

    public double getPreco() 
    {
        return preco;
    }

    public void setPreco(double preco) 
    {
        this.preco = preco;
    }

    @Override
    public String toString() 
    {
        return "Quarto{" + "codigo=" + codigo + ", categoria=" + categoria + ", descricao=" + descricao + ", preco=" + preco + '}';
    }




}
