/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIs;

import javax.swing.JOptionPane;

/**
 *
 * @author Katiuska Torres
 */
public class NewData extends javax.swing.JFrame {
    int values1 []; 
    int values2 [] = new int [14]; 
    /**
     * Creates new form NewData
     */
    public NewData() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Assembly_apple = new javax.swing.JTextField();
        Mother_apple = new javax.swing.JTextField();
        Cpus_apple = new javax.swing.JTextField();
        Power_apple = new javax.swing.JTextField();
        Ram_apple = new javax.swing.JTextField();
        Graphic_apple = new javax.swing.JTextField();
        Mother_dell = new javax.swing.JTextField();
        Cpus_dell = new javax.swing.JTextField();
        Power_dell = new javax.swing.JTextField();
        Ram_dell = new javax.swing.JTextField();
        Deadline = new javax.swing.JTextField();
        Assembly_dell = new javax.swing.JTextField();
        Graphic_dell = new javax.swing.JTextField();
        Time_day = new javax.swing.JTextField();
        Enter = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        jLabel1.setText("Valores Iniciales de la simulacion:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel1)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 60));

        jLabel2.setFont(new java.awt.Font("SansSerif", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Dell:");
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 10, 320));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 730, 10));

        jLabel4.setFont(new java.awt.Font("sansserif", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Apple:");
        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Deadline time:");
        jLabel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, -1, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Motherboard:");
        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("CPUs:");
        jLabel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Power Spupply:");
        jLabel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("RAM memory:");
        jLabel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Graphic Card:");
        jLabel10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Assembler:");
        jLabel17.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Time of day:");
        jLabel18.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, -1));

        Assembly_apple.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Assembly_apple.setText("0");
        jPanel1.add(Assembly_apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 40, -1));

        Mother_apple.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Mother_apple.setText("0");
        jPanel1.add(Mother_apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 40, -1));

        Cpus_apple.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Cpus_apple.setText("0");
        jPanel1.add(Cpus_apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 40, -1));

        Power_apple.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Power_apple.setText("0");
        jPanel1.add(Power_apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 40, -1));

        Ram_apple.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Ram_apple.setText("0");
        jPanel1.add(Ram_apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 40, -1));

        Graphic_apple.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Graphic_apple.setText("0");
        jPanel1.add(Graphic_apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 40, -1));

        Mother_dell.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Mother_dell.setText("0");
        jPanel1.add(Mother_dell, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 40, -1));

        Cpus_dell.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Cpus_dell.setText("0");
        jPanel1.add(Cpus_dell, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 40, -1));

        Power_dell.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Power_dell.setText("0");
        jPanel1.add(Power_dell, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 40, -1));

        Ram_dell.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Ram_dell.setText("0");
        jPanel1.add(Ram_dell, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 40, -1));

        Deadline.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Deadline.setText("0");
        jPanel1.add(Deadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 60, -1));

        Assembly_dell.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Assembly_dell.setText("0");
        jPanel1.add(Assembly_dell, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 40, -1));

        Graphic_dell.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Graphic_dell.setText("0");
        jPanel1.add(Graphic_dell, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 40, -1));

        Time_day.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Time_day.setText("0");
        jPanel1.add(Time_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 60, -1));

        Enter.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Enter.setText("Enter");
        Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });
        jPanel1.add(Enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 90, 50));

        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Motherboard:");
        jLabel19.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));

        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("CPUs:");
        jLabel20.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, -1));

        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Power Spupply:");
        jLabel21.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));

        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("RAM memory:");
        jLabel22.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, -1, -1));

        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Graphic Card:");
        jLabel23.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, -1, -1));

        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Assembler:");
        jLabel24.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed
        if (validateInput()){
            this.setVisible(false);
            values2[0] = values1[13]; 
            values2[1] = values1[12]; 
            values2[2] = values1[0];
            values2[2] = values1[0];
            values2[3] = values1[1];
            values2[4] = values1[2];
            values2[5] = values1[3];
            values2[6] = values1[4];
            values2[7] = values1[5];
            values2[8] = values1[6];
            values2[9] = values1[7];
            values2[10] = values1[8];
            values2[11] = values1[9];
            values2[12] = values1[10];
            values2[13] = values1[11];
            
            GUIfunctions.openSim(values2);}
        else{
            JOptionPane.showMessageDialog(null, "Se tienen que ingresar NUMEROS mayores a 0");
        }
    }//GEN-LAST:event_EnterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewData().setVisible(true);
            }
        });
    }
private boolean validateInput() {
    int[] values = new int[14];
    int cont1 = 0;
    int cont = 0;
    
    try {
        values[0] = Integer.parseInt(Assembly_apple.getText());
        values[1] = Integer.parseInt(Mother_apple.getText());
        values[2] = Integer.parseInt(Cpus_apple.getText());
        values[3] = Integer.parseInt(Ram_apple.getText());
        values[4] = Integer.parseInt(Power_apple.getText());
        values[5] = Integer.parseInt(Graphic_apple.getText()); 
        values[6] = Integer.parseInt(Assembly_dell.getText());
        values[7] = Integer.parseInt(Mother_dell.getText());
        values[8] = Integer.parseInt(Cpus_dell.getText());
        values[9] = Integer.parseInt(Ram_dell.getText());
        values[10] = Integer.parseInt(Power_dell.getText());
        values[11] = Integer.parseInt(Graphic_dell.getText());
        values[12] = Integer.parseInt(Deadline.getText());
        values[13] = Integer.parseInt(Time_day.getText());
    } catch (NumberFormatException e) {
        return false; 
    }

    for (int value : values) {
        if (value <= 0) {
            return false;
        }
    }
    for (int i = 0; i < 5; i++) {
        cont1 = cont1 + values[i];
    }
    for (int i = 6; i < 11; i++) {
        cont = cont + values[i];
    }
    if (cont1 > 18 || cont > 15) {
        
        return false;
    } else {
        values1 = values; 
        return true;
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Assembly_apple;
    private javax.swing.JTextField Assembly_dell;
    private javax.swing.JTextField Cpus_apple;
    private javax.swing.JTextField Cpus_dell;
    private javax.swing.JTextField Deadline;
    private javax.swing.JButton Enter;
    private javax.swing.JTextField Graphic_apple;
    private javax.swing.JTextField Graphic_dell;
    private javax.swing.JTextField Mother_apple;
    private javax.swing.JTextField Mother_dell;
    private javax.swing.JTextField Power_apple;
    private javax.swing.JTextField Power_dell;
    private javax.swing.JTextField Ram_apple;
    private javax.swing.JTextField Ram_dell;
    private javax.swing.JTextField Time_day;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
