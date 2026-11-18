/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lavarapido.model;

/**
 *
 * @author lauanesouza
 */
public class Veiculo {
    
private int id;
private String placa;
private String marca;
private String modelo;
private String cor;

public Veiculo(int id, String placa, String marca, String modelo, String cor) {
    this.id = id;
    this.placa = placa;
    this.marca = marca;
    this.modelo = modelo;
    this.cor = cor;
       }

    public void setId(int id) {
        this.id = id;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getId() {
        return id;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

}

