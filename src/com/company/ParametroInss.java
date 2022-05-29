package com.company;

public class ParametroInss {

    public static final double FAIXA1 = 7.5;
    public static final double LIMITEFAIXA1 = 1100.0;
    public static final double FAIXA2 = 9;
    public static final double LIMITEFAIXA2 = 2203.48;
    public static final double FAIXA3 = 12;
    public static final double LIMITEFAIXA3 = 3300.22;
    public static final double FAIXA4 = 14;
    public static final double LIMITEFAIXA4 = 6433.57;
    public double repique;


    public double calcularInss(double calc){

        if(calc <= LIMITEFAIXA1){
            System.out.println("Salário: " + calc);
            repique = calc * 7.5 / 100;
            return calc -= repique;


        }else if(calc > LIMITEFAIXA1 && calc <= LIMITEFAIXA2){
            System.out.println("Salário: " + calc);
            repique = calc * 9 / 100;
            return calc -= repique;

        }else if(calc > LIMITEFAIXA2 && calc <= LIMITEFAIXA3){
            System.out.println("Salário: " + calc);
            repique = calc * 12 / 100;
            return calc -= repique;
        }else if(calc > LIMITEFAIXA3 && calc <= LIMITEFAIXA4){
            System.out.println("Salário: " + calc);
            repique = calc * 14 / 100;
            return calc -= repique;
        }else if(calc > LIMITEFAIXA4){
            System.out.println("Salário: " + calc);
            repique = calc * 14 / 100;
            return calc -= repique;

        }


        return 0;
    }

}
