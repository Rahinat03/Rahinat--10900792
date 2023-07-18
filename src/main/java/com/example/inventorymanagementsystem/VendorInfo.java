package com.example.inventorymanagementsystem;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class VendorInfo extends javax.swing.JFrame {

    DefaultTableModel dtm;
    String[] eName;

    public VendorInfo() {
        initComponents();
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(166, 74, 227));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Employee Info");

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Name", "Password", "Email", "Phone Number", "Gender", "Country"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(183, 130, 231));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Sort by name");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton1)
                                                .addGap(90, 90, 90)
                                                .addComponent(jLabel1)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(48, 48, 48)
                                .addComponent(jButton2)
                                .addContainerGap())
                        .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton1)
                                                .addGap(33, 33, 33))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3)
                                        .addComponent(jButton2))
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
        com.example.inventorymanagementsystem.Admin ad = new com.example.inventorymanagementsystem.Admin();
        ad.setVisible(true);
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {
        addT();

    }

    public void addT(){
        dtm = (DefaultTableModel) jTable1.getModel();

        for (VendorRecord emm2 : RegisterVendor.vendor) {
            String name = emm2.getName();
            String email = emm2.getEmail();
            String password = emm2.getPassword();
            long number = emm2.getPhoneNumber();
            String gender = emm2.getGender();
            String country = emm2.getCountry();

            Object[] o = {name, password, email, number, gender, country};
            dtm.addRow(o);
        }
    }

    private void table(String search) {
        dtm = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));

    }


    private void columnArr(){
        int rowCount = jTable1.getRowCount();
        eName = new String[rowCount];

        if (rowCount != 0) {
            for (int i = 0; i < rowCount; i++) {
                String name = jTable1.getValueAt(i, 0).toString();
                eName[i] = name;
            }
        }
    }


    private void selectionSort(){
        // Selection Sort
        if (eName.length != 0) {
            int min;
            String temp = "";

            for (int i = 0; i < eName.length; i++) {
                dtm.setRowCount(0);
                min = i;
                for (int j = i + 1; j < eName.length; j++) {
                    if (eName[j].compareTo(eName[min]) < 0) {
                        min = j;
                    }
                }

                temp = eName[i];
                eName[i] = eName[min];
                eName[min] = temp;
            }

            for(int z=0;z<eName.length;z++){
                for(VendorRecord em : RegisterVendor.vendor){
                    String name = em.getName().toLowerCase();
                    if(name.equals(eName[z])){
                        Object[] o = {em.getName(),em.getPassword(),em.getEmail(),em.getPhoneNumber(),em.getGender(),em.getCountry()};
                        dtm.addRow(o);
                    }
                }
//                System.out.println(eName[z]);
            }
        }
    }


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        columnArr();

        selectionSort();

    }

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {

        // Binary Search
        String empName = jTextField1.getText().toLowerCase();
        System.out.println(empName.isBlank());
        if(empName.isBlank() == true){
            dtm.setRowCount(0);
            addT();
            table(empName);
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {

        columnArr();

        selectionSort();

        //Binary Search
        String empName = jTextField1.getText().toLowerCase();

        if(empName.isBlank() == false){
            int li = 0;
            int hi = eName.length - 1;
            int mi = (li + hi) / 2;
            while (li <= hi) {
                if (eName[mi].compareTo(empName) == 0) {
                    table(empName);
                    break;
                } else if (eName[mi].compareTo(empName) < 0) {
                    li = mi + 1;
                } else {
                    hi = mi - 1;
                }

                mi = (li + hi) / 2;
            }

            if (li > hi) {
                System.out.println("element not found");
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Enter name please", "Error", JOptionPane.ERROR_MESSAGE);
            table(empName);
        }

    }
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new VendorInfo().setVisible(true);
                Login ln = new Login();
                ln.setVisible(true);
            }
        });

    }

    // Variables declaration
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;

}

