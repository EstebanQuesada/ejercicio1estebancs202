package practica.java;

import javax.swing.JOptionPane;

public class ejercicio1 {
    public static void main(String[] args) {
        int empleados = Integer.parseInt(JOptionPane.showInputDialog("cuantos empleados hay"));
        double montoTotal = 0;

        for (int i = 1; i <= empleados; i++) {
            double salario = Double.parseDouble(JOptionPane.showInputDialog("cual es el salario? " + i + ":"));

            double montosem = salario * 0.0925;
            double montoivm = salario * 0.0508;
            double total = montosem + montoivm;

            montoTotal += total;
        }

        JOptionPane.showMessageDialog(null, "La empresa deberá abonar a la CCSS el monto de " + montoTotal + ".");
    }
}




















