package autonoma.robot.gui;

import java.awt.Color;
import java.awt.Graphics;


public class Robot extends javax.swing.JFrame {

    public Robot() {
        initComponents();
        this.setSize(700, 700); //Configuramos el tamaño de la ventana
        this.setLocationRelativeTo(null); //Hacemos que la ventana se ejecute en el centro
    }
    
    //Este método nos permite crear las diferentes figuras
    @Override
    public void paint(Graphics g){
        //Creación del robot
        //Cara del robot
        g.setColor(Color.GRAY); //Cambiamos el color (de negro a gris)
        //          x    y  ancho largo
        g.fillRect(300, 200, 100, 100); //Creamos el rectángulo RELLENO
        //Ojos del robot
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(320, 220, 20, 20); //Ojo izquierdo
        g.fillOval(360, 220, 20, 20); //Ojo derecho
        //Cuerpo del robot
        g.setColor(Color.GRAY);
        g.fillRect(290, 310, 120, 150);
        //Brazos del robot
        g.drawLine(290, 330, 250, 350); //Brazo izquierdo
        g.drawLine(410, 330, 450, 350); //Brazo derecho
        //Piernas del robot
        g.fillRect(310, 460, 20, 50); //Pie izquierdo
        g.fillRect(370, 460, 20, 50); //Pie derecho
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Robot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
