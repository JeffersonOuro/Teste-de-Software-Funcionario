/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade.pkg9;

/**
 *
 * @author Jefferson
 */
public class Funcionario {

    private String Nome;
    private String Setor;
    private double SalarioBruto;
    private String DataAdmissao;
    private String DataDemissao;

    public Funcionario() {
    }

    public String getSituacao(String DataAdmissao, String DataDemissao) {
        String situacao = null;
        if (DataDemissao == "0") {
            situacao = "Demitido";
        } else {
            situacao = "Ativa";
        }
        return situacao;
    }

    public static double calcularSalarioLiquido(double salario) {
        double SalarioLiquido;
        double imposto;

        if (salario < 1900) {
            SalarioLiquido = salario;
        } else if (salario >= 1900 && salario < 2800) {
            imposto = salario * 0.075;
                SalarioLiquido = salario - imposto;
        } else if (salario >= 2800 && salario < 3750) {
            imposto = salario * 0.15;
                SalarioLiquido = salario - imposto;
        } else if (salario >= 3750 && salario <= 4660) {
            imposto = salario * 0.225;
                SalarioLiquido = salario - imposto;
        } else {
            imposto = salario * 0.274;
                SalarioLiquido = salario - imposto;
        }

        return SalarioLiquido;
    }

    public Funcionario(String Nome, String Setor, double SalarioBruto, String DataAdmissao, String DataDemissao) {
        this.Nome = Nome;
        this.Setor = Setor;
        this.SalarioBruto = SalarioBruto;
        this.DataAdmissao = DataAdmissao;
        this.DataDemissao = DataDemissao;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSetor() {
        return Setor;
    }

    public void setSetor(String Setor) {
        this.Setor = Setor;
    }

    public double getSalarioBruto() {
        return SalarioBruto;
    }

    public void setSalarioBruto(double SalarioBruto) {
        this.SalarioBruto = SalarioBruto;
    }

    public String getDataAdmissao() {
        return DataAdmissao;
    }

    public void setDataAdmissao(String DataAdmissao) {
        this.DataAdmissao = DataAdmissao;
    }

    public String getDataDemissao() {
        return DataDemissao;
    }

    public void setDataDemissao(String DataDemissao) {
        this.DataDemissao = DataDemissao;
    }

}
