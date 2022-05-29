package com.company;

public class Empregado {

    private int codEmpregado;
    private String nomeEmpregado;
    private String setor;
    private double salarioBruto;
    private double recInss;


   public Empregado(){

    }


    public Empregado(int codEmpregado, String nomeEmpregado, String setor){

        this.codEmpregado = codEmpregado;
        this.nomeEmpregado = nomeEmpregado;
        this.setor = setor;

    }

    public Empregado(double salarioBruto, double recInss){

        this.salarioBruto = salarioBruto;
        this.recInss = recInss;

    }


    public int getCodEmpregado() {
        return codEmpregado;
    }

    public void setCodEmpregado(int codEmpregado) {
        this.codEmpregado = codEmpregado;
    }

    public String getNomeEmpregado() {
        return nomeEmpregado;
    }

    public void setNomeEmpregado(String nomeEmpregado) {
        this.nomeEmpregado = nomeEmpregado;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getRecInss() {
        return recInss;
    }

    public void setRecInss(double recInss) {
        this.recInss = recInss;
    }
}
