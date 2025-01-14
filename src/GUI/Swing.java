
package GUI;

import javax.swing.*;
public class Swing extends javax.swing.JFrame {


    public Swing() {
        initComponents();
        initComponent();
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
    //Membuat Label 
   private void initComponent(){
       JLabel  label = new JLabel("Masukkan Nama:");
       label.setBounds(50,20,150,30);
       
       JTextField textField = new JTextField ();
       textField.setBounds(150,20,200,30);

       
       JButton button = new JButton("Klik Saya");
       button.setBounds(150,60,100,30);
       button.addActionListener(e -> {
           String name = textField.getText();
           JOptionPane.showMessageDialog(this, "Halo, " + name);
       });
       add(label);
       add(textField);
       add(button);
       setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    
       //set Layout
       setLayout(null);
       setSize(500,200);
       setTitle("Aplikasi Swing");
       
   }
    
   
   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Swing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
