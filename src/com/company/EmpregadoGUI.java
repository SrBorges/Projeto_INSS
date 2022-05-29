package com.company;

import javax.swing.*;
import com.ggi.GerenciarEmpregadoGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.company.GerenciarEmpregados;

public class EmpregadoGUI extends JFrame{
    private JTextField tfCodEmp;
    private JTextField tfNomeEmpr;
    private JTextField tfSetor;
    private JTextField tfSalBruto;
    private JButton cadastrarButton;
    private JButton calcularRecolhimentoINSSButton;
    private JButton apresentarEmpregadosButton;
    private JPanel EmpPanel;


    public EmpregadoGUI(){

        setContentPane(EmpPanel);
        setTitle("INSS");
        setSize(400, 350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        initComponents();
        GerenciarEmpregados ge = new GerenciarEmpregados();


        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent l) {


                int codEmpregado = Integer.parseInt(tfCodEmp.getText());
                String nomeEmpregado = tfNomeEmpr.getText();
                String setor = tfSetor.getText();

                Empregado e = new Empregado(codEmpregado, nomeEmpregado, setor);



                cadastrarButton.setText("Reg:  " + e.getCodEmpregado() + " " +  e.getNomeEmpregado() + " " + e.getSetor());
                ge.adicionarEmpregado(e);
            }


        });
        calcularRecolhimentoINSSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent l) {

                double recInss = Double.parseDouble(tfSalBruto.getText());

                Empregado e = new Empregado(recInss, recInss);
                ParametroInss pir = new ParametroInss();

                calcularRecolhimentoINSSButton.setText("Valor líquido: " + pir.calcularInss(recInss));


            }
        });

        apresentarEmpregadosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                GerenciarEmpregadoGUI gem = new GerenciarEmpregadoGUI();

                apresentarEmpregadosButton.add(gem);

            }
        });
    }

    private void initComponents() {

    }

}
