/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lavarapido.model;

/**
 *
 * @author lauanesouza
 */
public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String placaVeiculo;
    
    private java.util.List<Veiculo> veiculos = new java.util.ArrayList<>();

public Cliente(int id, String nome, String cpf,
        String telefone, String email) {

    this.id = id;
    this.nome = nome;
    this.cpf = cpf;
    this.telefone = telefone;
    this.email = email;
}

 public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }
    
public void adicionarVeiculo(Veiculo veiculo) {
    if (veiculo != null) {
        veiculos.add(veiculo);
    }
}

public java.util.List<Veiculo> getVeiculos() {
    return java.util.Collections.unmodifiableList(veiculos);
}


public String getPlacaDoVeiculo() {
    if (veiculos.isEmpty()) {
        return "";
    }

    return veiculos.get(0).getPlaca();
}
}

    
    




    

