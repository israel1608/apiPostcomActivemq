package com.bridgingcode.springbootactivemqdemo.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author AJ Catambay of Bridging Code
 *
 */
public class SystemMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    //private String source;
    //private String message;
    private String nomeCliente;
    private String marcaModeloVeiculo;

    private int anoModelo;
    private double valorVenda;
    private Date cadastro;
    


	public String getnomeCliente() {
		return nomeCliente;
	}

	public void setnomeCliente(String nome) {
		this.nomeCliente = nome;
	}

	public String getmarcaModeloVeiculo() {
		return marcaModeloVeiculo;
	}

	public void setmarcaModeloVeiculo(String nome) {
		this.marcaModeloVeiculo = nome;
	}
        
        public int getanoModelo() {
		return anoModelo;
	}

	public void setanoModelo(int ano) {
		this.anoModelo = ano;
	}
        
        public double getvalorVenda() {
		return valorVenda;
	}

	public void setvalorVenda(double valor) {
		this.valorVenda = valor;
	}

	public Date getCadastro() {
		return cadastro;
	}

	public void setCadastro(Date cadastro) {
		this.cadastro = cadastro;
	}
/*
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    } 
       */ 
    @Override
    public String toString() {
       
          return "'{'nomeCliente':'" + nomeCliente +
                ", 'marcaModeloVeiculo':" + marcaModeloVeiculo+
                ", 'anoModelo':'" + anoModelo +
                ", 'valorVenda':" + valorVenda+
                ", 'cadastro':" + cadastro+"}";
    }
}

