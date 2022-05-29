package com.ggi;
import com.company.LoginLog;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Thread;
public class TesteRecInss {

    public static void main(String[] args){

        int op, retorno;

        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        System.out.println("1 - Adicionar Empregado. ");
        System.out.println("2 - Remover Empregado. ");
        System.out.println("3 - Listar Empregados. ");
        System.out.println("9 - Sair");

        do {
            System.out.println("Informe a opção: ");
            op = sc.nextInt();

            try{
                System.out.println("Aguarde... ");
                Thread.sleep(1000);
            }catch (Exception erro){

            }

            switch (op) {

                case 1:
                    list.add(111);
                    list.add(462);
                    list.add(788);
                    System.out.println("Funcionário adicionado. ");
                    break;
                case 2:
                    list.remove(0);
                    System.out.println("Funcionário excluído");
                    break;
                case 3:
                    for (Integer lis : list) {
                        System.out.println("Crachá: " + lis);

                    }
                    break;


            }

            System.out.println("Desejar  encerrar ?  -> 0 <-");
            retorno = sc.nextInt();

        }while(retorno != 0);



        sc.close();


    }



}
