package com.ggi;
import javax.swing.*;
import java.awt.*;
import com.company.Empregado;
import com.company.GerenciarEmpregados;

public class GerenciarEmpregadoGUI extends JFrame {
    private JPanel TablePane;
    private JTable table;
    private JScrollPane SCpane;
    Empregado e = new Empregado();
    GerenciarEmpregados ge = new GerenciarEmpregados();


    public GerenciarEmpregadoGUI(){

        setLayout(new FlowLayout());

        String[] columnNames = {"Código", "Nome", "Setor", "Salário", "Recolhimento"};

        Object[][] data = {

                {"Código", "Nome", "Setor", "Salário", "Recolhimento"},
                {"271", "Adriano", "TI", "2700", "324"},
                {"330", "Lucas", "TI", "1550", "89,50"},
                {"654", "Robert", "Cozinha", "1200", "108"}



        };

        table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(500, 50));
        table.setFillsViewportHeight(true);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);

        setContentPane(table);
        setTitle("Gerenciar Empregados");
        setSize(500, 480);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    };



}
