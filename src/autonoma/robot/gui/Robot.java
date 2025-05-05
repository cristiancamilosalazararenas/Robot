// Este es el paquete donde se ubica la clase Robot.
package autonoma.robot.gui;
// Importamos las clases necesarias para los gráficos
import java.awt.Color;
import java.awt.Graphics;
/**
 * Clase que representa una ventana con un robot dibujado.
 *
 * @author      Cristian Camilo Salazar Arenas
 * @version     1.0
 * @since       2025.05.04
 */
public class Robot extends javax.swing.JFrame {
    /**
     * Constructor que inicializa la ventana del robot.
     */
    public Robot() {
        initComponents();
        this.setSize(700, 700); // Configuramos el tamaño de la ventana (700x700 píxeles)
        this.setLocationRelativeTo(null); // Centramos la ventana en la pantalla
    }
    /**
     * Método que dibuja todas las partes del robot en la ventana.
     *
     * @param g El objeto Graphics para dibujar
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g); // Llamamos al método paint de la clase padre
        // Dibujamos la cara del robot
        g.setColor(Color.GRAY); // Establecemos color gris
        g.fillRect(300, 200, 100, 100); // Rectángulo para la cara
        // Dibujamos los ojos del robot
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(320, 220, 20, 20); // Ojo izquierdo
        g.fillOval(360, 220, 20, 20); // Ojo derecho
        // Dibujamos el cuerpo del robot
        g.setColor(Color.GRAY);
        g.fillRect(290, 310, 120, 150); // Rectángulo para el cuerpo
        // Dibujamos los brazos del robot
        g.drawLine(290, 330, 250, 350); // Brazo izquierdo (línea)
        g.drawLine(410, 330, 450, 350); // Brazo derecho (línea)
        // Dibujamos las piernas del robot
        g.fillRect(310, 460, 20, 50); // Pierna izquierda
        g.fillRect(370, 460, 20, 50); // Pierna derecha
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
    /**
     * Método principal que inicia la aplicación.
     *
     * @param args Argumentos de línea de comandos
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Robot().setVisible(true); // Creamos y mostramos la ventana
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
