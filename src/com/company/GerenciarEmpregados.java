package com.company;
import java.util.List;
import java.util.ArrayList;

public class GerenciarEmpregados implements LoginLog {

    List<Empregado> list = new ArrayList<>();

    public void adicionarEmpregado(Empregado e){

        list.add(new Empregado(e.getCodEmpregado(), e.getNomeEmpregado(), e.getSetor()));

    }

    public void removerEmpregado(Empregado e){

        list.remove(e.getCodEmpregado());

    }

    public void listarEmpregado(Empregado e){

        for(Empregado show : list){
            System.out.println(show);
        }

    }


    @Override
    public boolean login() {
        return false;
    }

    @Override
    public void logof() {

    }
}
