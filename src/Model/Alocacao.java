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
public abstract class Alocacao
{
 private int codigo;
 private int codigoQuarto;
 private double PrecoQuarto;
 private int codigoFuncionario;
 private String dataEntrada;
 private String dataSaida;
 private String Servicos;
 private double precoServico;
 private String Anexo;
 private double precoAnexo;
 

    public Alocacao() 
    {
    
    }

    public Alocacao(int codigo, int codigoQuarto, double PrecoQuarto, int codigoFuncionario, String dataEntrada, String dataSaida, String Servicos, double precoServico, String Anexo, double precoAnexo) {
        this.codigo = codigo;
        this.codigoQuarto = codigoQuarto;
        this.PrecoQuarto = PrecoQuarto;
        this.codigoFuncionario = codigoFuncionario;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.Servicos = Servicos;
        this.precoServico = precoServico;
        this.Anexo = Anexo;
        this.precoAnexo = precoAnexo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoQuarto() {
        return codigoQuarto;
    }

    public void setCodigoQuarto(int codigoQuarto) {
        this.codigoQuarto = codigoQuarto;
    }

    public double getPrecoQuarto() {
        return PrecoQuarto;
    }

    public void setPrecoQuarto(double PrecoQuarto) {
        this.PrecoQuarto = PrecoQuarto;
    }

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getServicos() {
        return Servicos;
    }

    public void setServicos(String Servicos) {
        this.Servicos = Servicos;
    }

    public double getPrecoServico() {
        return precoServico;
    }

    public void setPrecoServico(double precoServico) {
        this.precoServico = precoServico;
    }

    public String getAnexo() {
        return Anexo;
    }

    public void setAnexo(String Anexo) {
        this.Anexo = Anexo;
    }

    public double getPrecoAnexo() {
        return precoAnexo;
    }

    public void setPrecoAnexo(double precoAnexo) {
        this.precoAnexo = precoAnexo;
    }

    @Override
    public String toString() {
        return "Alocacao{" + "codigo=" + codigo + ", codigoQuarto=" + codigoQuarto + ", PrecoQuarto=" + PrecoQuarto + ", codigoFuncionario=" + codigoFuncionario + ", dataEntrada=" + dataEntrada + ", dataSaida=" + dataSaida + ", Servicos=" + Servicos + ", precoServico=" + precoServico + ", Anexo=" + Anexo + ", precoAnexo=" + precoAnexo + '}';
    }


 
}
