/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIs;

import Clases.Empresa;
import Filereading.ExcelManager;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

/**
 *
 * @author Sofia
 */
/*

0 = duracion de dias
1 = deadline 
Empresa A 
2 = ensambladores 
3 =placa base
4 =  cpu 
5 = ram 
6 = fuente 
7 = tarjetas 
Empresa B 
8 = ensambladores 
9 =placa base
10 =  cpu 
11 = ram 
12 = fuente 
13 = tarjetas 




*/


/*
0 - ensamblador
1- placa base
2 - memoria ram 
3- tarjetas graficas
4- fuentes de alimentacion 
5- cpu 


*/


public class BothGUI extends javax.swing.JFrame {
    
    /**
     * Creates new form BothGUI
     */
    public BothGUI() {
        initComponents();
    }
    
    
    private void start() {
       
        /*
        while (true) {
                applebusinness.work_business();
                dellbusinness.work_business();
                //Cantidades
                mbapple.setText(String.valueOf(applebusinness.getStorage().getPlaca_base()));
                ramapple.setText(String.valueOf(applebusinness.getStorage().getMemoria_ram()));
                powerapple.setText(String.valueOf(applebusinness.getStorage().getFuente_alimentacion()));
                cpuapple.setText(String.valueOf(applebusinness.getStorage().getCpus()));
                graphicapple.setText(String.valueOf(applebusinness.getStorage().getTarjetas_graficas()));
                
                //Trabajadores 
                workmbapple.setText(String.valueOf(applebusinness.getCantidadTrabajadores()[1]));
                workramapple.setText(String.valueOf(applebusinness.getCantidadTrabajadores()[2]));
                workpowerapple.setText(String.valueOf(applebusinness.getCantidadTrabajadores()[4]));
                workcpuapple.setText(String.valueOf(applebusinness.getCantidadTrabajadores()[5]));
                workgraphicapple.setText(String.valueOf(applebusinness.getCantidadTrabajadores()[3]));
                workassemapple.setText(String.valueOf(applebusinness.getCantidadTrabajadores()[0]));
                
                //Computadoras
                standardpcapple.setText(String.valueOf(applebusinness.getStorage().getCompuStandard()));
                graphicpcapple.setText(String.valueOf(applebusinness.getStorage().getCompuTarjeta()));
                
                //Project Manager
                boolean stateapplepm = applebusinness.getPm().isState(); 
                if (stateapplepm) {
                    pmstateapple.setText("Work");
                } else {
                     pmstateapple.setText("Anime");
                }
                foulsapple.setText(String.valueOf(applebusinness.getPm().getFaults()));
                discountedapple.setText(String.valueOf(applebusinness.getPm().getSalary_discounted()));
                
                boolean stateappledir = applebusinness.getPm().isState(); 
                if (stateappledir) {
                    directorapple.setText("Administrative");
                } else {
                     directorapple.setText("Accountability");
                }
                
                
                 //Valores de dell  --------------------------------------
                
                //Cantidades
                mbdell.setText(String.valueOf(dellbusinness.getStorage().getPlaca_base()));
                ramdell.setText(String.valueOf(dellbusinness.getStorage().getMemoria_ram()));
                powerdell.setText(String.valueOf(dellbusinness.getStorage().getFuente_alimentacion()));
                cpudell.setText(String.valueOf(dellbusinness.getStorage().getCpus()));
                graphicdell.setText(String.valueOf(dellbusinness.getStorage().getTarjetas_graficas()));
                
                //Trabajadores 
                workmbdell.setText(String.valueOf(dellbusinness.getCantidadTrabajadores()[1]));
                workramdell.setText(String.valueOf(dellbusinness.getCantidadTrabajadores()[2]));
                workpowerdell.setText(String.valueOf(dellbusinness.getCantidadTrabajadores()[4]));
                workcpudell.setText(String.valueOf(dellbusinness.getCantidadTrabajadores()[5]));
                workgraphicdell.setText(String.valueOf(dellbusinness.getCantidadTrabajadores()[3]));
                workassemdell.setText(String.valueOf(dellbusinness.getCantidadTrabajadores()[0]));
                
                //Computadoras
                standardpcdell.setText(String.valueOf(dellbusinness.getStorage().getCompuStandard()));
                graphicpcdell.setText(String.valueOf(dellbusinness.getStorage().getCompuTarjeta()));
                
                //Project Manager
                boolean statedellpm = dellbusinness.getPm().isState(); 
                if (stateapplepm) {
                    pmstatedell.setText("Work");
                } else {
                     pmstatedell.setText("Anime");
                }
                foulsdell.setText(String.valueOf(dellbusinness.getPm().getFaults()));
                discounteddell.setText(String.valueOf(dellbusinness.getPm().getSalary_discounted()));
                
                boolean statedelldir = dellbusinness.getPm().isState(); 
                if (stateappledir) {
                    directorapple.setText("Administrative");
                } else {
                     directorapple.setText("Accountability");
                }
               
        }
        */

       
        
    }
    /**
      
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        downmbapple = new javax.swing.JButton();
        upmbapple = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        workramapple = new javax.swing.JTextField();
        downramapple = new javax.swing.JButton();
        upramapple = new javax.swing.JButton();
        workpowerapple = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        uppowerapple = new javax.swing.JButton();
        downpowerapple = new javax.swing.JButton();
        upcpuapple = new javax.swing.JButton();
        downcpuapple = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        workcpuapple = new javax.swing.JTextField();
        workgraphicapple = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        upgraphicapple = new javax.swing.JButton();
        downgraphicapple = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Bar_graphic_apple = new javax.swing.JProgressBar();
        Bar_mother_apple = new javax.swing.JProgressBar();
        Bar_ram_apple = new javax.swing.JProgressBar();
        Bar_power_apple = new javax.swing.JProgressBar();
        Bar_cpus_apple = new javax.swing.JProgressBar();
        jLabel10 = new javax.swing.JLabel();
        upassemapple = new javax.swing.JButton();
        downassemapple = new javax.swing.JButton();
        workmbapple = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        powerapple = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        cpuapple = new javax.swing.JTextField();
        mbapple = new javax.swing.JTextField();
        ramapple = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        graphicapple = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        standardpcapple = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        graphicpcapple = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        workassemapple = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        pmstateapple = new javax.swing.JTextField();
        foulsapple = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        costtapple = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        directorapple = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        discountedapple1 = new javax.swing.JTextField();
        costbapple = new javax.swing.JTextField();
        costoapple = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        downmbdell = new javax.swing.JButton();
        upmbdell = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        workramdell = new javax.swing.JTextField();
        downramdell = new javax.swing.JButton();
        upramdell = new javax.swing.JButton();
        workpowerdell = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        uppowerdell = new javax.swing.JButton();
        downpowerdell = new javax.swing.JButton();
        upcpudell = new javax.swing.JButton();
        downcpudell = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        workcpudell = new javax.swing.JTextField();
        workgraphicdell = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        upgraphicdell = new javax.swing.JButton();
        downgraphicdell = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        Bar_graphic_dell = new javax.swing.JProgressBar();
        Bar_mother_dell = new javax.swing.JProgressBar();
        Bar_ram_dell = new javax.swing.JProgressBar();
        Bar_power_dell = new javax.swing.JProgressBar();
        Bar_cpus_dell = new javax.swing.JProgressBar();
        workassemdell = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        upassemdell = new javax.swing.JButton();
        downassemadell = new javax.swing.JButton();
        workmbdell = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        powerdell = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        cpudell = new javax.swing.JTextField();
        mbdell = new javax.swing.JTextField();
        ramdell = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        graphicdell = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        standardpcdell = new javax.swing.JTextField();
        Graphic = new javax.swing.JLabel();
        graphicpcdell = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        exitbutton = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        pmstatedell = new javax.swing.JTextField();
        foulsdell = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        discounteddell = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        directordell = new javax.swing.JTextField();
        costbdell = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        costtdell = new javax.swing.JTextField();
        costodell = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        countdown = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(239, 239, 239));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ready 💻");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(51, 51, 51));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("55");
        jTextField2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jTextField2.setFocusable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 95, 30, 30));

        downmbapple.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        downmbapple.setText("▼");
        downmbapple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downmbappleActionPerformed(evt);
            }
        });
        jPanel5.add(downmbapple, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 70, 20));

        upmbapple.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        upmbapple.setText("▲");
        upmbapple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upmbappleActionPerformed(evt);
            }
        });
        jPanel5.add(upmbapple, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 70, 20));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("RAM Memory");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 100, 40));

        workramapple.setEditable(false);
        workramapple.setBackground(new java.awt.Color(255, 255, 255));
        workramapple.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        workramapple.setForeground(new java.awt.Color(51, 51, 51));
        workramapple.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        workramapple.setText("0");
        workramapple.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        workramapple.setFocusable(false);
        workramapple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workramappleActionPerformed(evt);
            }
        });
        jPanel5.add(workramapple, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 95, 30, 30));

        downramapple.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        downramapple.setText("▼");
        downramapple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downramappleActionPerformed(evt);
            }
        });
        jPanel5.add(downramapple, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 70, 20));

        upramapple.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        upramapple.setText("▲");
        upramapple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upramappleActionPerformed(evt);
            }
        });
        jPanel5.add(upramapple, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 70, 20));

        workpowerapple.setEditable(false);
        workpowerapple.setBackground(new java.awt.Color(255, 255, 255));
        workpowerapple.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        workpowerapple.setForeground(new java.awt.Color(51, 51, 51));
        workpowerapple.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        workpowerapple.setText("0");
        workpowerapple.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        workpowerapple.setFocusable(false);
        workpowerapple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workpowerappleActionPerformed(evt);
            }
        });
        jPanel5.add(workpowerapple, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 145, 30, 30));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Power suply");
        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 100, 40));

        uppowerapple.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        uppowerapple.setText("▲");
        uppowerapple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uppowerappleActionPerformed(evt);
            }
        });
        jPanel5.add(uppowerapple, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 70, 20));

        downpowerapple.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        downpowerapple.setText("▼");
        downpowerapple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downpowerappleActionPerformed(evt);
            }
        });
        jPanel5.add(downpowerapple, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 70, 20));

        upcpuapple.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        upcpuapple.setText("▲");
        jPanel5.add(upcpuapple, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 70, 20));

        downcpuapple.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        downcpuapple.setText("▼");
        jPanel5.add(downcpuapple, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 70, 20));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("CPUs");
        jLabel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, 40));

        workcpuapple.setEditable(false);
        workcpuapple.setBackground(new java.awt.Color(255, 255, 255));
        workcpuapple.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        workcpuapple.setForeground(new java.awt.Color(51, 51, 51));
        workcpuapple.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        workcpuapple.setText("0");
        workcpuapple.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        workcpuapple.setFocusable(false);
        jPanel5.add(workcpuapple, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 195, 30, 30));

        workgraphicapple.setEditable(false);
        workgraphicapple.setBackground(new java.awt.Color(255, 255, 255));
        workgraphicapple.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        workgraphicapple.setForeground(new java.awt.Color(51, 51, 51));
        workgraphicapple.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        workgraphicapple.setText("0");
        workgraphicapple.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        workgraphicapple.setFocusable(false);
        jPanel5.add(workgraphicapple, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 245, 30, 30));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Graphic Card");
        jLabel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 100, 40));

        upgraphicapple.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        upgraphicapple.setText("▲");
        jPanel5.add(upgraphicapple, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 70, 20));

        downgraphicapple.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        downgraphicapple.setText("▼");
        jPanel5.add(downgraphicapple, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 70, 20));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Type of Worker");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        jPanel5.add(Bar_graphic_apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 100, 20));
        jPanel5.add(Bar_mother_apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 100, 20));
        jPanel5.add(Bar_ram_apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 100, 20));
        jPanel5.add(Bar_power_apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 100, 20));
        jPanel5.add(Bar_cpus_apple, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 100, 20));

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Assemblers");
        jLabel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 100, 40));

        upassemapple.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        upassemapple.setText("▲");
        jPanel5.add(upassemapple, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 70, 20));

        downassemapple.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        downassemapple.setText("▼");
        jPanel5.add(downassemapple, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 70, 20));

        workmbapple.setEditable(false);
        workmbapple.setBackground(new java.awt.Color(255, 255, 255));
        workmbapple.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        workmbapple.setForeground(new java.awt.Color(51, 51, 51));
        workmbapple.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        workmbapple.setText("0");
        workmbapple.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        workmbapple.setFocusable(false);
        workmbapple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workmbappleActionPerformed(evt);
            }
        });
        jPanel5.add(workmbapple, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 45, 30, 30));

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(255, 255, 255));
        jTextField10.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(51, 51, 51));
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("25");
        jTextField10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jTextField10.setFocusable(false);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 45, 30, 30));

        powerapple.setEditable(false);
        powerapple.setBackground(new java.awt.Color(255, 255, 255));
        powerapple.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        powerapple.setForeground(new java.awt.Color(51, 51, 51));
        powerapple.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        powerapple.setText("0");
        powerapple.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        powerapple.setFocusable(false);
        powerapple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerappleActionPerformed(evt);
            }
        });
        jPanel5.add(powerapple, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 145, 30, 30));

        jTextField13.setEditable(false);
        jTextField13.setBackground(new java.awt.Color(255, 255, 255));
        jTextField13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(51, 51, 51));
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setText("10");
        jTextField13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jTextField13.setFocusable(false);
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 245, 30, 30));

        jTextField14.setEditable(false);
        jTextField14.setBackground(new java.awt.Color(255, 255, 255));
        jTextField14.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(51, 51, 51));
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setText("20");
        jTextField14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jTextField14.setFocusable(false);
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 195, 30, 30));

        cpuapple.setEditable(false);
        cpuapple.setBackground(new java.awt.Color(255, 255, 255));
        cpuapple.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        cpuapple.setForeground(new java.awt.Color(51, 51, 51));
        cpuapple.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cpuapple.setText("0");
        cpuapple.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        cpuapple.setFocusable(false);
        cpuapple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpuappleActionPerformed(evt);
            }
        });
        jPanel5.add(cpuapple, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 195, 30, 30));

        mbapple.setEditable(false);
        mbapple.setBackground(new java.awt.Color(255, 255, 255));
        mbapple.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        mbapple.setForeground(new java.awt.Color(51, 51, 51));
        mbapple.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mbapple.setText("0");
        mbapple.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        mbapple.setFocusable(false);
        mbapple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbappleActionPerformed(evt);
            }
        });
        jPanel5.add(mbapple, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 45, 30, 30));

        ramapple.setEditable(false);
        ramapple.setBackground(new java.awt.Color(255, 255, 255));
        ramapple.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        ramapple.setForeground(new java.awt.Color(51, 51, 51));
        ramapple.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ramapple.setText("0");
        ramapple.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        ramapple.setFocusable(false);
        ramapple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ramappleActionPerformed(evt);
            }
        });
        jPanel5.add(ramapple, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 95, 30, 30));

        jTextField20.setEditable(false);
        jTextField20.setBackground(new java.awt.Color(255, 255, 255));
        jTextField20.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jTextField20.setForeground(new java.awt.Color(51, 51, 51));
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.setText("35");
        jTextField20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jTextField20.setFocusable(false);
        jTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 145, 30, 30));

        jTextField21.setEditable(false);
        jTextField21.setBackground(new java.awt.Color(255, 255, 255));
        jTextField21.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jTextField21.setForeground(new java.awt.Color(51, 51, 51));
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.setText("0");
        jTextField21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jTextField21.setFocusable(false);
        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 195, 30, 30));

        graphicapple.setEditable(false);
        graphicapple.setBackground(new java.awt.Color(255, 255, 255));
        graphicapple.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        graphicapple.setForeground(new java.awt.Color(51, 51, 51));
        graphicapple.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        graphicapple.setText("0");
        graphicapple.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        graphicapple.setFocusable(false);
        graphicapple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphicappleActionPerformed(evt);
            }
        });
        jPanel5.add(graphicapple, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 245, 30, 30));

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Max");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 10, -1, -1));

        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Standard");
        jLabel14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 80, 40));

        standardpcapple.setEditable(false);
        standardpcapple.setBackground(new java.awt.Color(0, 0, 0));
        standardpcapple.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        standardpcapple.setForeground(new java.awt.Color(255, 255, 255));
        standardpcapple.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        standardpcapple.setText("0");
        standardpcapple.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        standardpcapple.setFocusable(false);
        standardpcapple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standardpcappleActionPerformed(evt);
            }
        });
        jPanel5.add(standardpcapple, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 80, 30));

        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Graphic");
        jLabel15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 80, 40));

        graphicpcapple.setEditable(false);
        graphicpcapple.setBackground(new java.awt.Color(0, 0, 0));
        graphicpcapple.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        graphicpcapple.setForeground(new java.awt.Color(255, 255, 255));
        graphicpcapple.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        graphicpcapple.setText("0");
        graphicpcapple.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        graphicpcapple.setFocusable(false);
        graphicpcapple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphicpcappleActionPerformed(evt);
            }
        });
        jPanel5.add(graphicpcapple, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 80, 30));

        jLabel16.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Type of Worker");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel17.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Motherboard");
        jLabel17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, 40));

        jLabel19.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Warehouse");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        workassemapple.setEditable(false);
        workassemapple.setBackground(new java.awt.Color(255, 255, 255));
        workassemapple.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        workassemapple.setForeground(new java.awt.Color(51, 51, 51));
        workassemapple.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        workassemapple.setText("0");
        workassemapple.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        workassemapple.setFocusable(false);
        jPanel5.add(workassemapple, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 295, 30, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 580, 340));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Costos(b,o,t)");
        jLabel13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 150, 40));

        pmstateapple.setEditable(false);
        pmstateapple.setBackground(new java.awt.Color(255, 255, 255));
        pmstateapple.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        pmstateapple.setForeground(new java.awt.Color(51, 51, 51));
        pmstateapple.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pmstateapple.setText("anime");
        pmstateapple.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        pmstateapple.setFocusable(false);
        pmstateapple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pmstateappleActionPerformed(evt);
            }
        });
        jPanel6.add(pmstateapple, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 150, 40));

        foulsapple.setEditable(false);
        foulsapple.setBackground(new java.awt.Color(255, 255, 255));
        foulsapple.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        foulsapple.setForeground(new java.awt.Color(51, 51, 51));
        foulsapple.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        foulsapple.setText("0");
        foulsapple.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        foulsapple.setFocusable(false);
        foulsapple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foulsappleActionPerformed(evt);
            }
        });
        jPanel6.add(foulsapple, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 70, 40));

        jLabel18.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Fouls");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 70, 40));

        costtapple.setEditable(false);
        costtapple.setBackground(new java.awt.Color(255, 255, 255));
        costtapple.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        costtapple.setForeground(new java.awt.Color(51, 51, 51));
        costtapple.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        costtapple.setText("0");
        costtapple.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        costtapple.setFocusable(false);
        costtapple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costtappleActionPerformed(evt);
            }
        });
        jPanel6.add(costtapple, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 90, 40));

        jLabel20.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Discounted");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 120, 40));

        jLabel21.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Director");
        jLabel21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 150, 40));

        directorapple.setEditable(false);
        directorapple.setBackground(new java.awt.Color(255, 255, 255));
        directorapple.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        directorapple.setForeground(new java.awt.Color(51, 51, 51));
        directorapple.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        directorapple.setText("account");
        directorapple.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        directorapple.setFocusable(false);
        directorapple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directorappleActionPerformed(evt);
            }
        });
        jPanel6.add(directorapple, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 150, 40));

        jLabel29.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Project Manager");
        jLabel29.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 150, 40));

        discountedapple1.setEditable(false);
        discountedapple1.setBackground(new java.awt.Color(255, 255, 255));
        discountedapple1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        discountedapple1.setForeground(new java.awt.Color(51, 51, 51));
        discountedapple1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        discountedapple1.setText("0");
        discountedapple1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        discountedapple1.setFocusable(false);
        discountedapple1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountedapple1ActionPerformed(evt);
            }
        });
        jPanel6.add(discountedapple1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 120, 40));

        costbapple.setEditable(false);
        costbapple.setBackground(new java.awt.Color(255, 255, 255));
        costbapple.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        costbapple.setForeground(new java.awt.Color(51, 51, 51));
        costbapple.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        costbapple.setText("0");
        costbapple.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        costbapple.setFocusable(false);
        costbapple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costbappleActionPerformed(evt);
            }
        });
        jPanel6.add(costbapple, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 90, 40));

        costoapple.setEditable(false);
        costoapple.setBackground(new java.awt.Color(255, 255, 255));
        costoapple.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        costoapple.setForeground(new java.awt.Color(51, 51, 51));
        costoapple.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        costoapple.setText("0");
        costoapple.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        costoapple.setFocusable(false);
        costoapple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoappleActionPerformed(evt);
            }
        });
        jPanel6.add(costoapple, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 90, 40));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 580, 160));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 70, 640, 580));

        jPanel3.setBackground(new java.awt.Color(157, 200, 222));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Ready 💻");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        jTextField28.setEditable(false);
        jTextField28.setBackground(new java.awt.Color(255, 255, 255));
        jTextField28.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jTextField28.setForeground(new java.awt.Color(51, 51, 51));
        jTextField28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField28.setText("55");
        jTextField28.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jTextField28.setFocusable(false);
        jTextField28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField28ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 95, 30, 30));

        downmbdell.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        downmbdell.setText("▼");
        downmbdell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downmbdellActionPerformed(evt);
            }
        });
        jPanel7.add(downmbdell, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 70, 20));

        upmbdell.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        upmbdell.setText("▲");
        upmbdell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upmbdellActionPerformed(evt);
            }
        });
        jPanel7.add(upmbdell, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 70, 20));

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("RAM Memory");
        jLabel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 100, 40));

        workramdell.setEditable(false);
        workramdell.setBackground(new java.awt.Color(255, 255, 255));
        workramdell.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        workramdell.setForeground(new java.awt.Color(51, 51, 51));
        workramdell.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        workramdell.setText("0");
        workramdell.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        workramdell.setFocusable(false);
        workramdell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workramdellActionPerformed(evt);
            }
        });
        jPanel7.add(workramdell, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 95, 30, 30));

        downramdell.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        downramdell.setText("▼");
        downramdell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downramdellActionPerformed(evt);
            }
        });
        jPanel7.add(downramdell, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 70, 20));

        upramdell.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        upramdell.setText("▲");
        upramdell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upramdellActionPerformed(evt);
            }
        });
        jPanel7.add(upramdell, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 70, 20));

        workpowerdell.setEditable(false);
        workpowerdell.setBackground(new java.awt.Color(255, 255, 255));
        workpowerdell.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        workpowerdell.setForeground(new java.awt.Color(51, 51, 51));
        workpowerdell.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        workpowerdell.setText("0");
        workpowerdell.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        workpowerdell.setFocusable(false);
        workpowerdell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workpowerdellActionPerformed(evt);
            }
        });
        jPanel7.add(workpowerdell, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 145, 30, 30));

        jLabel22.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Power suply");
        jLabel22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 100, 40));

        uppowerdell.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        uppowerdell.setText("▲");
        uppowerdell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uppowerdellActionPerformed(evt);
            }
        });
        jPanel7.add(uppowerdell, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 70, 20));

        downpowerdell.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        downpowerdell.setText("▼");
        downpowerdell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downpowerdellActionPerformed(evt);
            }
        });
        jPanel7.add(downpowerdell, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 70, 20));

        upcpudell.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        upcpudell.setText("▲");
        jPanel7.add(upcpudell, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 70, 20));

        downcpudell.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        downcpudell.setText("▼");
        jPanel7.add(downcpudell, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 70, 20));

        jLabel23.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("CPUs");
        jLabel23.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, 40));

        workcpudell.setEditable(false);
        workcpudell.setBackground(new java.awt.Color(255, 255, 255));
        workcpudell.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        workcpudell.setForeground(new java.awt.Color(51, 51, 51));
        workcpudell.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        workcpudell.setText("0");
        workcpudell.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        workcpudell.setFocusable(false);
        jPanel7.add(workcpudell, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 195, 30, 30));

        workgraphicdell.setEditable(false);
        workgraphicdell.setBackground(new java.awt.Color(255, 255, 255));
        workgraphicdell.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        workgraphicdell.setForeground(new java.awt.Color(51, 51, 51));
        workgraphicdell.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        workgraphicdell.setText("0");
        workgraphicdell.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        workgraphicdell.setFocusable(false);
        jPanel7.add(workgraphicdell, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 245, 30, 30));

        jLabel24.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Graphic Card");
        jLabel24.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 100, 40));

        upgraphicdell.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        upgraphicdell.setText("▲");
        jPanel7.add(upgraphicdell, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 70, 20));

        downgraphicdell.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        downgraphicdell.setText("▼");
        jPanel7.add(downgraphicdell, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 70, 20));

        jLabel25.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Type of Worker");
        jPanel7.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        jPanel7.add(Bar_graphic_dell, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 100, 20));
        jPanel7.add(Bar_mother_dell, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 100, 20));
        jPanel7.add(Bar_ram_dell, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 100, 20));
        jPanel7.add(Bar_power_dell, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 100, 20));
        jPanel7.add(Bar_cpus_dell, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 100, 20));

        workassemdell.setEditable(false);
        workassemdell.setBackground(new java.awt.Color(255, 255, 255));
        workassemdell.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        workassemdell.setForeground(new java.awt.Color(51, 51, 51));
        workassemdell.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        workassemdell.setText("0");
        workassemdell.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        workassemdell.setFocusable(false);
        jPanel7.add(workassemdell, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 295, 30, 30));

        jLabel26.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Assemblers");
        jLabel26.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 100, 40));

        upassemdell.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        upassemdell.setText("▲");
        jPanel7.add(upassemdell, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 70, 20));

        downassemadell.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        downassemadell.setText("▼");
        jPanel7.add(downassemadell, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 70, 20));

        workmbdell.setEditable(false);
        workmbdell.setBackground(new java.awt.Color(255, 255, 255));
        workmbdell.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        workmbdell.setForeground(new java.awt.Color(51, 51, 51));
        workmbdell.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        workmbdell.setText("0");
        workmbdell.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        workmbdell.setFocusable(false);
        workmbdell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workmbdellActionPerformed(evt);
            }
        });
        jPanel7.add(workmbdell, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 45, 30, 30));

        jTextField35.setEditable(false);
        jTextField35.setBackground(new java.awt.Color(255, 255, 255));
        jTextField35.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jTextField35.setForeground(new java.awt.Color(51, 51, 51));
        jTextField35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField35.setText("25");
        jTextField35.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jTextField35.setFocusable(false);
        jTextField35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField35ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField35, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 45, 30, 30));

        powerdell.setEditable(false);
        powerdell.setBackground(new java.awt.Color(255, 255, 255));
        powerdell.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        powerdell.setForeground(new java.awt.Color(51, 51, 51));
        powerdell.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        powerdell.setText("0");
        powerdell.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        powerdell.setFocusable(false);
        powerdell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerdellActionPerformed(evt);
            }
        });
        jPanel7.add(powerdell, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 145, 30, 30));

        jTextField37.setEditable(false);
        jTextField37.setBackground(new java.awt.Color(255, 255, 255));
        jTextField37.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jTextField37.setForeground(new java.awt.Color(51, 51, 51));
        jTextField37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField37.setText("10");
        jTextField37.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jTextField37.setFocusable(false);
        jTextField37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField37ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField37, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 245, 30, 30));

        jTextField38.setEditable(false);
        jTextField38.setBackground(new java.awt.Color(255, 255, 255));
        jTextField38.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jTextField38.setForeground(new java.awt.Color(51, 51, 51));
        jTextField38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField38.setText("20");
        jTextField38.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jTextField38.setFocusable(false);
        jTextField38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField38ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField38, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 195, 30, 30));

        cpudell.setEditable(false);
        cpudell.setBackground(new java.awt.Color(255, 255, 255));
        cpudell.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        cpudell.setForeground(new java.awt.Color(51, 51, 51));
        cpudell.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cpudell.setText("0");
        cpudell.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        cpudell.setFocusable(false);
        cpudell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpudellActionPerformed(evt);
            }
        });
        jPanel7.add(cpudell, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 195, 30, 30));

        mbdell.setEditable(false);
        mbdell.setBackground(new java.awt.Color(255, 255, 255));
        mbdell.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        mbdell.setForeground(new java.awt.Color(51, 51, 51));
        mbdell.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mbdell.setText("0");
        mbdell.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        mbdell.setFocusable(false);
        mbdell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbdellActionPerformed(evt);
            }
        });
        jPanel7.add(mbdell, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 45, 30, 30));

        ramdell.setEditable(false);
        ramdell.setBackground(new java.awt.Color(255, 255, 255));
        ramdell.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        ramdell.setForeground(new java.awt.Color(51, 51, 51));
        ramdell.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ramdell.setText("0");
        ramdell.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        ramdell.setFocusable(false);
        ramdell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ramdellActionPerformed(evt);
            }
        });
        jPanel7.add(ramdell, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 95, 30, 30));

        jTextField42.setEditable(false);
        jTextField42.setBackground(new java.awt.Color(255, 255, 255));
        jTextField42.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jTextField42.setForeground(new java.awt.Color(51, 51, 51));
        jTextField42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField42.setText("35");
        jTextField42.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jTextField42.setFocusable(false);
        jTextField42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField42ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField42, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 145, 30, 30));

        jTextField43.setEditable(false);
        jTextField43.setBackground(new java.awt.Color(255, 255, 255));
        jTextField43.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jTextField43.setForeground(new java.awt.Color(51, 51, 51));
        jTextField43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField43.setText("0");
        jTextField43.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        jTextField43.setFocusable(false);
        jTextField43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField43ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField43, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 195, 30, 30));

        graphicdell.setEditable(false);
        graphicdell.setBackground(new java.awt.Color(255, 255, 255));
        graphicdell.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        graphicdell.setForeground(new java.awt.Color(51, 51, 51));
        graphicdell.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        graphicdell.setText("0");
        graphicdell.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        graphicdell.setFocusable(false);
        graphicdell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphicdellActionPerformed(evt);
            }
        });
        jPanel7.add(graphicdell, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 245, 30, 30));

        jLabel27.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Max");
        jPanel7.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 10, -1, -1));

        jLabel28.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Standard");
        jLabel28.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 80, 40));

        standardpcdell.setEditable(false);
        standardpcdell.setBackground(new java.awt.Color(0, 0, 0));
        standardpcdell.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        standardpcdell.setForeground(new java.awt.Color(255, 255, 255));
        standardpcdell.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        standardpcdell.setText("0");
        standardpcdell.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        standardpcdell.setFocusable(false);
        standardpcdell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standardpcdellActionPerformed(evt);
            }
        });
        jPanel7.add(standardpcdell, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 80, 30));

        Graphic.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Graphic.setForeground(new java.awt.Color(0, 0, 0));
        Graphic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Graphic.setText("Graphic");
        Graphic.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.add(Graphic, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 80, 40));

        graphicpcdell.setEditable(false);
        graphicpcdell.setBackground(new java.awt.Color(0, 0, 0));
        graphicpcdell.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        graphicpcdell.setForeground(new java.awt.Color(255, 255, 255));
        graphicpcdell.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        graphicpcdell.setText("0");
        graphicpcdell.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        graphicpcdell.setFocusable(false);
        graphicpcdell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphicpcdellActionPerformed(evt);
            }
        });
        jPanel7.add(graphicpcdell, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 80, 30));

        jLabel30.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Type of Worker");
        jPanel7.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel31.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Motherboard");
        jLabel31.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, 40));

        jLabel32.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Warehouse");
        jPanel7.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        exitbutton.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        exitbutton.setText("EXIT");
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
            }
        });
        jPanel7.add(exitbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 100, 30));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 10, 570, 340));

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Project Manager");
        jLabel33.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 40));

        pmstatedell.setEditable(false);
        pmstatedell.setBackground(new java.awt.Color(255, 255, 255));
        pmstatedell.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        pmstatedell.setForeground(new java.awt.Color(51, 51, 51));
        pmstatedell.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pmstatedell.setText("anime");
        pmstatedell.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        pmstatedell.setFocusable(false);
        pmstatedell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pmstatedellActionPerformed(evt);
            }
        });
        jPanel8.add(pmstatedell, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 150, 40));

        foulsdell.setEditable(false);
        foulsdell.setBackground(new java.awt.Color(255, 255, 255));
        foulsdell.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        foulsdell.setForeground(new java.awt.Color(51, 51, 51));
        foulsdell.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        foulsdell.setText("0");
        foulsdell.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        foulsdell.setFocusable(false);
        foulsdell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foulsdellActionPerformed(evt);
            }
        });
        jPanel8.add(foulsdell, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 70, 40));

        jLabel34.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Fouls");
        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel8.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 70, 40));

        discounteddell.setEditable(false);
        discounteddell.setBackground(new java.awt.Color(255, 255, 255));
        discounteddell.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        discounteddell.setForeground(new java.awt.Color(51, 51, 51));
        discounteddell.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        discounteddell.setText("0");
        discounteddell.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        discounteddell.setFocusable(false);
        discounteddell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discounteddellActionPerformed(evt);
            }
        });
        jPanel8.add(discounteddell, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 120, 40));

        jLabel35.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Discounted");
        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel8.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 120, 40));

        jLabel36.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Director");
        jLabel36.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 150, 40));

        directordell.setEditable(false);
        directordell.setBackground(new java.awt.Color(255, 255, 255));
        directordell.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        directordell.setForeground(new java.awt.Color(51, 51, 51));
        directordell.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        directordell.setText("account");
        directordell.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        directordell.setFocusable(false);
        directordell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directordellActionPerformed(evt);
            }
        });
        jPanel8.add(directordell, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 150, 40));

        costbdell.setEditable(false);
        costbdell.setBackground(new java.awt.Color(255, 255, 255));
        costbdell.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        costbdell.setForeground(new java.awt.Color(51, 51, 51));
        costbdell.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        costbdell.setText("0");
        costbdell.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        costbdell.setFocusable(false);
        costbdell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costbdellActionPerformed(evt);
            }
        });
        jPanel8.add(costbdell, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 90, 40));

        jLabel37.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Costos(b,o,t)");
        jLabel37.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 150, 40));

        costtdell.setEditable(false);
        costtdell.setBackground(new java.awt.Color(255, 255, 255));
        costtdell.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        costtdell.setForeground(new java.awt.Color(51, 51, 51));
        costtdell.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        costtdell.setText("0");
        costtdell.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        costtdell.setFocusable(false);
        costtdell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costtdellActionPerformed(evt);
            }
        });
        jPanel8.add(costtdell, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 90, 40));

        costodell.setEditable(false);
        costodell.setBackground(new java.awt.Color(255, 255, 255));
        costodell.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        costodell.setForeground(new java.awt.Color(51, 51, 51));
        costodell.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        costodell.setText("0");
        costodell.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        costodell.setFocusable(false);
        costodell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costodellActionPerformed(evt);
            }
        });
        jPanel8.add(costodell, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 90, 40));

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 360, 570, 160));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 780, 590));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setToolTipText("");
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Apple Computers 💻");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 420, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("DELL Computers 💻");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 420, -1));

        countdown.setEditable(false);
        countdown.setBackground(new java.awt.Color(0, 0, 0));
        countdown.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        countdown.setForeground(new java.awt.Color(255, 255, 255));
        countdown.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        countdown.setText("0");
        countdown.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        countdown.setFocusable(false);
        countdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countdownActionPerformed(evt);
            }
        });
        jPanel2.add(countdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 150, 30));

        jTextField24.setEditable(false);
        jTextField24.setBackground(new java.awt.Color(255, 255, 255));
        jTextField24.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jTextField24.setForeground(new java.awt.Color(51, 51, 51));
        jTextField24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField24.setText("COUNTDOWN: ");
        jTextField24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jTextField24.setFocusable(false);
        jTextField24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField24ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 20, 150, 30));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 70));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        public int getBarcpusapple() {
            return Bar_cpus_apple.getValue();
            }

        public int getBarcpusdell() {
            return Bar_cpus_dell.getValue();
        }

        public int getBargraphicapple() {
            return Bar_graphic_apple.getValue();
        }

        public int getBargraphicdell() {
            return Bar_graphic_dell.getValue();
        }

        public int getBarmotherapple() {
            return Bar_mother_apple.getValue();
        }

        public int getBarmotherdell() {
            return Bar_mother_dell.getValue();
        }

        public int getBarpowerapple() {
            return Bar_power_apple.getValue();
        }

        public int getBarpowerdell() {
            return Bar_power_dell.getValue();
        }

        public int getBarramapple() {
            return Bar_ram_apple.getValue();
        }

        public int getBarramdell() {
            return Bar_ram_dell.getValue();
        }

        public void setBarcpusapple(int value) {
            Bar_cpus_apple.setValue(value);
        }

        public void setBarcpusdell(int value) {
            Bar_cpus_dell.setValue(value);
        }

        public void setBargraphicapple(int value) {
            Bar_graphic_apple.setValue(value);
        }

        public void setBargraphicdell(int value) {
            Bar_graphic_dell.setValue(value);
        }

        public void setBarmotherapple(int value) {
            Bar_mother_apple.setValue(value);
        }

        public void setBarmotherdell(int value) {
            Bar_mother_dell.setValue(value);
        }

        public void setBarpowerapple(int value) {
            Bar_power_apple.setValue(value);
        }

        public void setBarpowerdell(int value) {
            Bar_power_dell.setValue(value);
        }

        public void setBarramapple(int value) {
            Bar_ram_apple.setValue(value);
        }

        public void setBarramdell(int value) {
            Bar_ram_dell.setValue(value);
        }
    
    public void setcoundown(int value) {
        countdown.setText(String.valueOf(value));
    }
    
    public int getcoundown() {
        return Integer.parseInt(countdown.getText()); 
    }
    
    
    public void setmbdell(String a) {
        mbdell.setText(a);
    }
    
    public void setramdell(String a) {
        ramdell.setText(a);
    }
    
    public void setpowerdell(String a) {
        powerdell.setText(a);
    }
    
    public void setcpudell(String a) {
        cpudell.setText(a);
    }
    
    public void setgraphicdell(String a) {
        graphicdell.setText(a);
    }
    public void setworkmbdell(String a) {
        workmbdell.setText(a);
    }
    
    public void setworkpowerdell(String a) {
        workpowerdell.setText(a);
    }
    
    public void setworkcpudell(String a) {
        workcpudell.setText(a);
    }
    
    public void setworkramdell(String a) {
        workramdell.setText(a);
    }
    
    public void setworkgraphicdell(String a) {
        workgraphicdell.setText(a);
    }
    
    public void setworkassemdell(String a) {
        workassemdell.setText(a);
    }
    
    public void setstandardpcdell(String a) {
        standardpcdell.setText(a);
    }
    
    public void setpmstatedell(String a) {
        pmstatedell.setText(a);
    }
     
    public void setgraphicpcdell(String a) {
        graphicpcdell.setText(a);
    }
     
    public void setfoulsdell(String a) {
        foulsdell.setText(a);
    }
    
    public void setdiscounteddell(String a) {
        discounteddell.setText(a);
    }
     
    public void setdirectordell(String a) {
        directordell.setText(a);
    }
    
    public void setmbapple(String a) {
        mbapple.setText(a);
    }
    
    public void setramapple(String a) {
        ramapple.setText(a);
    }
    
    public void setpowerapple(String a) {
        powerapple.setText(a);
    }
    
    public void setcpuapple(String a) {
        cpuapple.setText(a);
    }
    
    public void setgraphicapple(String a) {
        graphicapple.setText(a);
    }
    public void setworkmbapple(String a) {
        workmbapple.setText(a);
    }
    
    public void setworkpowerapple(String a) {
        workpowerapple.setText(a);
    }
    
    public void setworkcpuapple(String a) {
        workcpuapple.setText(a);
    }
    
    public void setworkramapple(String a) {
        workramapple.setText(a);
    }
    
    public void setworkgraphicapple(String a) {
        workgraphicapple.setText(a);
    }
    
    public void setworkassemapple(String a) {
        workassemapple.setText(a);
    }
    
    public void setstandardpcapple(String a) {
        standardpcapple.setText(a);
    }
    
    public void setpmstateapple(String a) {
        pmstateapple.setText(a);
    }
     
    public void setgraphicpcapple(String a) {
        graphicpcapple.setText(a);
    }
     
    public void setfoulsapple(String a) {
        foulsapple.setText(a);
    }
    
    public void setdiscountedapple(String a) {
        costtapple.setText(a);
    }
     
    public void setdirectorapple(String a) {
        directorapple.setText(a);
    }

    public int getCpuapple() {
        return Integer.parseInt(cpuapple.getText());
    }

    public int getCpudell() {
       return Integer.parseInt(cpudell.getText());
    }

    public String getDirectorapple() {
        return directorapple.getText();
    }

    public String getDirectordell() {
        return directordell.getText();
    }

    public int getDiscountedapple() {
        return Integer.parseInt(costtapple.getText());
    }

    public int getDiscounteddell() {
         return Integer.parseInt(discounteddell.getText());
    }



    public int getFoulsapple() {
        return Integer.parseInt(foulsapple.getText());
    }

    public int getFoulsdell() {
        return Integer.parseInt(foulsdell.getText());
    }

    public int getGraphicapple() {
        return Integer.parseInt(graphicapple.getText());
    }

    public int getGraphicdell() {
        return Integer.parseInt(graphicdell.getText());
    }

    public int getGraphicpcapple() {
        return Integer.parseInt(graphicpcapple.getText());
    }

    public int getGraphicpcdell() {
        return Integer.parseInt(graphicpcdell.getText());
    }

    public int getMbapple() {
        return Integer.parseInt(mbapple.getText());
    }

    public int getMbdell() {
        return Integer.parseInt(mbdell.getText());
    }

    public String getPmstateapple() {
        return pmstateapple.getText();   
    }

    public String getPmstatedell() {
        return pmstatedell.getText();   
    }

    public int getPowerapple() {
        return Integer.parseInt(powerapple.getText());
    }

    public int getPowerdell() {
        return Integer.parseInt(powerdell.getText());
    }

    public int getRamapple() {
        return Integer.parseInt(ramapple.getText());
    }

    public int getRamdell() {
        return Integer.parseInt(ramdell.getText());
    }

    public int getStandardpcapple() {
        return Integer.parseInt(standardpcapple.getText());
    }

    public int getStandardpcdell() {
        return Integer.parseInt(standardpcdell.getText());
    }


    public int getWorkassemapple() {
        return Integer.parseInt(workassemapple.getText());
    }

    public int getWorkassemdell() {
         return Integer.parseInt(workassemdell.getText());
    }

    public int getWorkcpuapple() {
         return Integer.parseInt(workcpuapple.getText());
    }

    public int getWorkcpudell() {
         return Integer.parseInt(workcpudell.getText());
    }

    public int getWorkgraphicapple() {
         return Integer.parseInt(workgraphicapple.getText());
    }

    public int getWorkgraphicdell() {
         return Integer.parseInt(workgraphicdell.getText());
    }

    public int getWorkmbapple() {
         return Integer.parseInt(workmbapple.getText());

    }

    public int getWorkmbdell() {
         return Integer.parseInt(workmbdell.getText());
    }

    public int getWorkpowerapple() {
         return Integer.parseInt(workpowerapple.getText());
    }

    public int getWorkpowerdell() {
         return Integer.parseInt(workpowerdell.getText());
    }

    public int getWorkramapple() {
         return Integer.parseInt(workramapple.getText());
    }

    public int getWorkramdell() {
         return Integer.parseInt(workramdell.getText());
    }

    public int getCostbapple() {
        return Integer.parseInt(costbapple.getText());
    }

    public void setCostbapple(int i) {
        costbapple.setText(String.valueOf(i)); 
    }

    public int getCostbdell() {
         return Integer.parseInt(costbdell.getText());
    }

    public void setCostbdell(int i) {
        costbdell.setText(String.valueOf(i)); 
    }

    public int getCostoapple() {
        return Integer.parseInt(costoapple.getText());
    }

    public void setCostoapple(int i) {
        costoapple.setText(String.valueOf(i)); 
    }

    public int getCostodell() {
       return Integer.parseInt(costodell.getText());
    }

    public void setCostodell(int i) {
        costodell.setText(String.valueOf(i)); 
    }

    public int getCosttapple() {
        return Integer.parseInt(costtapple.getText());
    }

    public void setCosttapple(int i) {
        costtapple.setText(String.valueOf(i)); 
    }

    public int getCosttdell() {
        return Integer.parseInt(costtdell.getText());
    }

    public void setCosttdell(int i) {
       costtdell.setText(String.valueOf(i)); 
    }
    
    
    
    
    
    private void standardpcappleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standardpcappleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_standardpcappleActionPerformed

    private void pmstateappleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pmstateappleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pmstateappleActionPerformed

    private void downmbappleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downmbappleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_downmbappleActionPerformed

    private void upmbappleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upmbappleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upmbappleActionPerformed

    private void workramappleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workramappleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_workramappleActionPerformed

    private void downramappleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downramappleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_downramappleActionPerformed

    private void upramappleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upramappleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upramappleActionPerformed

    private void workpowerappleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workpowerappleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_workpowerappleActionPerformed

    private void uppowerappleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uppowerappleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uppowerappleActionPerformed

    private void downpowerappleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downpowerappleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_downpowerappleActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void workmbappleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workmbappleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_workmbappleActionPerformed

    private void foulsappleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foulsappleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foulsappleActionPerformed

    private void powerappleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerappleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_powerappleActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void cpuappleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpuappleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpuappleActionPerformed

    private void mbappleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbappleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mbappleActionPerformed

    private void ramappleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ramappleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ramappleActionPerformed

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20ActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void graphicappleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphicappleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_graphicappleActionPerformed

    private void countdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countdownActionPerformed

    private void graphicpcappleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphicpcappleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_graphicpcappleActionPerformed

    private void jTextField24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField24ActionPerformed

    private void costtappleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costtappleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costtappleActionPerformed

    private void directorappleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directorappleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_directorappleActionPerformed

    private void jTextField28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField28ActionPerformed

    private void downmbdellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downmbdellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_downmbdellActionPerformed

    private void upmbdellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upmbdellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upmbdellActionPerformed

    private void workramdellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workramdellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_workramdellActionPerformed

    private void downramdellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downramdellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_downramdellActionPerformed

    private void upramdellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upramdellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upramdellActionPerformed

    private void workpowerdellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workpowerdellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_workpowerdellActionPerformed

    private void uppowerdellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uppowerdellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uppowerdellActionPerformed

    private void downpowerdellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downpowerdellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_downpowerdellActionPerformed

    private void workmbdellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workmbdellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_workmbdellActionPerformed

    private void jTextField35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField35ActionPerformed

    private void powerdellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerdellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_powerdellActionPerformed

    private void jTextField37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField37ActionPerformed

    private void jTextField38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField38ActionPerformed

    private void cpudellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpudellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpudellActionPerformed

    private void mbdellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbdellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mbdellActionPerformed

    private void ramdellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ramdellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ramdellActionPerformed

    private void jTextField42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField42ActionPerformed

    private void jTextField43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField43ActionPerformed

    private void graphicdellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphicdellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_graphicdellActionPerformed

    private void standardpcdellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standardpcdellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_standardpcdellActionPerformed

    private void graphicpcdellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphicpcdellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_graphicpcdellActionPerformed

    private void pmstatedellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pmstatedellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pmstatedellActionPerformed

    private void foulsdellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foulsdellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foulsdellActionPerformed

    private void discounteddellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discounteddellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discounteddellActionPerformed

    private void directordellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directordellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_directordellActionPerformed

    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
        int[] array = new int[12]; 
        array[0] = Integer.parseInt(workassemapple.getText());
        array[1] = Integer.parseInt(workmbapple.getText());
        array[2] = Integer.parseInt(workcpuapple.getText());
        array[3] = Integer.parseInt(workramapple.getText());
        array[4] = Integer.parseInt(workpowerapple.getText());
        array[5] = Integer.parseInt(workgraphicapple.getText());
        array[6] = Integer.parseInt(workassemdell.getText());
        array[7] = Integer.parseInt(workmbdell.getText());
        array[8] = Integer.parseInt(workcpudell.getText());
        array[9] = Integer.parseInt(workramdell.getText());
        array[10] = Integer.parseInt(workpowerdell.getText());
        array[11] = Integer.parseInt(workgraphicdell.getText());
        GUIfunctions.closeSim(array);
    }//GEN-LAST:event_exitbuttonActionPerformed

    private void discountedapple1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountedapple1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discountedapple1ActionPerformed

    private void costbappleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costbappleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costbappleActionPerformed

    private void costoappleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costoappleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costoappleActionPerformed

    private void costtdellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costtdellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costtdellActionPerformed

    private void costbdellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costbdellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costbdellActionPerformed

    private void costodellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costodellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costodellActionPerformed

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
            java.util.logging.Logger.getLogger(BothGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BothGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BothGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BothGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                /*
                new BothGUI().setVisible(true);
*/
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Bar_cpus_apple;
    private javax.swing.JProgressBar Bar_cpus_dell;
    private javax.swing.JProgressBar Bar_graphic_apple;
    private javax.swing.JProgressBar Bar_graphic_dell;
    private javax.swing.JProgressBar Bar_mother_apple;
    private javax.swing.JProgressBar Bar_mother_dell;
    private javax.swing.JProgressBar Bar_power_apple;
    private javax.swing.JProgressBar Bar_power_dell;
    private javax.swing.JProgressBar Bar_ram_apple;
    private javax.swing.JProgressBar Bar_ram_dell;
    private javax.swing.JLabel Graphic;
    private javax.swing.JTextField costbapple;
    private javax.swing.JTextField costbdell;
    private javax.swing.JTextField costoapple;
    private javax.swing.JTextField costodell;
    private javax.swing.JTextField costtapple;
    private javax.swing.JTextField costtdell;
    private javax.swing.JTextField countdown;
    private javax.swing.JTextField cpuapple;
    private javax.swing.JTextField cpudell;
    private javax.swing.JTextField directorapple;
    private javax.swing.JTextField directordell;
    private javax.swing.JTextField discountedapple1;
    private javax.swing.JTextField discounteddell;
    private javax.swing.JButton downassemadell;
    private javax.swing.JButton downassemapple;
    private javax.swing.JButton downcpuapple;
    private javax.swing.JButton downcpudell;
    private javax.swing.JButton downgraphicapple;
    private javax.swing.JButton downgraphicdell;
    private javax.swing.JButton downmbapple;
    private javax.swing.JButton downmbdell;
    private javax.swing.JButton downpowerapple;
    private javax.swing.JButton downpowerdell;
    private javax.swing.JButton downramapple;
    private javax.swing.JButton downramdell;
    private javax.swing.JButton exitbutton;
    private javax.swing.JTextField foulsapple;
    private javax.swing.JTextField foulsdell;
    private javax.swing.JTextField graphicapple;
    private javax.swing.JTextField graphicdell;
    private javax.swing.JTextField graphicpcapple;
    private javax.swing.JTextField graphicpcdell;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField mbapple;
    private javax.swing.JTextField mbdell;
    private javax.swing.JTextField pmstateapple;
    private javax.swing.JTextField pmstatedell;
    private javax.swing.JTextField powerapple;
    private javax.swing.JTextField powerdell;
    private javax.swing.JTextField ramapple;
    private javax.swing.JTextField ramdell;
    private javax.swing.JTextField standardpcapple;
    private javax.swing.JTextField standardpcdell;
    private javax.swing.JButton upassemapple;
    private javax.swing.JButton upassemdell;
    private javax.swing.JButton upcpuapple;
    private javax.swing.JButton upcpudell;
    private javax.swing.JButton upgraphicapple;
    private javax.swing.JButton upgraphicdell;
    private javax.swing.JButton upmbapple;
    private javax.swing.JButton upmbdell;
    private javax.swing.JButton uppowerapple;
    private javax.swing.JButton uppowerdell;
    private javax.swing.JButton upramapple;
    private javax.swing.JButton upramdell;
    private javax.swing.JTextField workassemapple;
    private javax.swing.JTextField workassemdell;
    private javax.swing.JTextField workcpuapple;
    private javax.swing.JTextField workcpudell;
    private javax.swing.JTextField workgraphicapple;
    private javax.swing.JTextField workgraphicdell;
    private javax.swing.JTextField workmbapple;
    private javax.swing.JTextField workmbdell;
    private javax.swing.JTextField workpowerapple;
    private javax.swing.JTextField workpowerdell;
    private javax.swing.JTextField workramapple;
    private javax.swing.JTextField workramdell;
    // End of variables declaration//GEN-END:variables
}
