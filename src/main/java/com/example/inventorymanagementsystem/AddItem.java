package com.example.inventorymanagementsystem;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AddItem extends javax.swing.JFrame {

    public static ArrayList<ItemRecord> item = new ArrayList<>();
    public static Stack<ItemRecord> stackItem = new Stack<>();

    DefaultTableModel dtm;
    String[] iCat;
    int[] n;
    Connection con;
    PreparedStatement pst;


    public AddItem() {
        initComponents();
        addTable();
    }





    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        jLabel12.setBackground(new java.awt.Color(255, 51, 0));
        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));

        jMenu1.setText("jMenu1");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(166, 74, 227));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Item ID");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Item Name");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Item Price");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Item Category");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Item Quantity");

        jComboBox1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT CATEGORY", "Fruits", "Chocolates", "Dry Fruit", "Vegetable", "Dairy Products" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(183, 130, 231));
        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Add Item");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 204, 102));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ADD ITEM");

        jLabel6.setBackground(new java.awt.Color(255, 51, 0));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));

        jLabel8.setBackground(new java.awt.Color(255, 51, 0));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));

        jLabel9.setBackground(new java.awt.Color(255, 51, 0));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));

        jLabel10.setBackground(new java.awt.Color(255, 51, 0));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));

        jLabel13.setBackground(new java.awt.Color(255, 51, 0));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 51));

        jLabel14.setBackground(new java.awt.Color(0, 0, 204));
        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 153));

        jButton3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Item Info");

        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextField5MouseReleased(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Arial", 1, 12));
        jButton5.setText("Search by Price");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Arial", 1, 12));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT CATEGORY", "Frozen Products", "Beverages", "Bread/Bakery", "Farm Produce", "Dairy Products","Canned/Jarred Goods", "Dry/Baking Goods","Home Cleaners","Home Care" }));

        jButton6.setFont(new java.awt.Font("Arial", 1, 12));
        jButton6.setText("Search by Category");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Item ID", "Item Name", "Price", "Category", "Price Range", "Quantity"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel15.setText("Price Range");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Low");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Medium");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("High");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5)
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(117, 117, 117)
                                                .addComponent(jLabel1)
                                                .addGap(29, 29, 29))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel15)
                                                        .addComponent(jLabel3))
                                                .addGap(18, 18, 18)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jRadioButton1)
                                                .addGap(18, 18, 18)
                                                .addComponent(jRadioButton2)
                                                .addGap(21, 21, 21)
                                                .addComponent(jRadioButton3)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(107, 107, 107)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel5)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addGap(37, 37, 37)
                                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 166, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(345, 345, 345)
                                .addComponent(jButton3)
                                .addGap(17, 17, 17))
                        .addComponent(jScrollPane1)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jButton2)
                                                .addGap(325, 325, 325)
                                                .addComponent(jLabel7))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(66, 66, 66)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(400, 400, 400)
                                                .addComponent(jLabel11)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel2)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(35, 35, 35)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel15)
                                                                        .addComponent(jRadioButton1)
                                                                        .addComponent(jRadioButton2)
                                                                        .addComponent(jRadioButton3)))
                                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(51, 51, 51)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, Short.MAX_VALUE)
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(30, 30, 30)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton5)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(207, 207, 207)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(444, 444, 444))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        jButton4.setBackground(new java.awt.Color(183, 130, 231));
        jButton4.setFont(new java.awt.Font("Arial", 1, 12));
        jButton4.setText("Sort By Price");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(183, 130, 231));
        jButton7.setFont(new java.awt.Font("Arial", 1, 12));
        jButton7.setText("Delete");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jMenu2.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Open");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem4.setText("User Guide");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7)
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }

    static boolean isNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)) == false) {
                return false;
            }
        }

        return true;
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {


        String itemName = jTextField2.getText().toLowerCase().trim();

        String itemCategory = (String) jComboBox1.getSelectedItem();

        String priceRange = "";
        if (jRadioButton1.isSelected()) {
            priceRange = priceRange + jRadioButton1.getText().trim();
        }
        if (jRadioButton2.isSelected()) {
            priceRange = priceRange + jRadioButton2.getText().trim();
        }
        if (jRadioButton3.isSelected()) {
            priceRange = priceRange + jRadioButton3.getText().trim();
        }



        //ID Validation
        if (isNumber(jTextField1.getText().trim()) == false) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter Integer Value in ID", "Error", JOptionPane.WARNING_MESSAGE);
        } else if (jTextField1.getText().toLowerCase().trim().isEmpty() == true) {
            JOptionPane.showMessageDialog(rootPane, "Can't Leave ID Empty ", "Error",  JOptionPane.WARNING_MESSAGE);
        } //Item Name Validation
        else if (itemName.isEmpty() == true) {
            JOptionPane.showMessageDialog(rootPane, "Can't Leave Name Empty ", "Error", JOptionPane.WARNING_MESSAGE);
        } else if (itemName.matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(rootPane, "Only Text Value can be entered in item Name", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (isNumber(jTextField3.getText().trim()) == false) {
            JOptionPane.showMessageDialog(rootPane,  "Please Enter Integer Value in Price", "Error",JOptionPane.WARNING_MESSAGE);
        } else if (jTextField3.getText().toLowerCase().trim().isEmpty() == true) {
            JOptionPane.showMessageDialog(rootPane, "Can't Leave Price Empty ","Error",  JOptionPane.WARNING_MESSAGE);
        } else if (itemCategory == "SELECT CATEGORY") {
            JOptionPane.showMessageDialog(rootPane,"Can't Leave Item Category Empty ",  "Error", JOptionPane.WARNING_MESSAGE);
        } else if (isNumber(jTextField4.getText().trim()) == false) {
            JOptionPane.showMessageDialog(rootPane,  "Please Enter Integer Value in Quantity","Error", JOptionPane.WARNING_MESSAGE);
        } else if (jTextField4.getText().toLowerCase().trim().isEmpty() == true) {
            JOptionPane.showMessageDialog(rootPane,  "Can't Leave Item Quantity Empty","Error", JOptionPane.WARNING_MESSAGE);
        } else if (priceRange == "") {
            JOptionPane.showMessageDialog(rootPane, "Can't Leave Price Range Empty ", "Error", JOptionPane.WARNING_MESSAGE);
        } else {

            int iId = Integer.parseInt(jTextField1.getText().trim());
            int iPrice = Integer.parseInt(jTextField3.getText().trim());
            int iQuantity = Integer.parseInt(jTextField4.getText().trim());

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/item_data?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "Kuagbenu12345");
                pst = con.prepareStatement("insert into item_details(ID, Item, Qty, Category, PriceRange, Price)values(?,?,?,?,?,?)");
                pst.setInt(1, iId);
                pst.setString(2, itemName);
                pst.setInt(3, iQuantity);
                pst.setString(4, itemCategory);
                pst.setString(5, priceRange);
                pst.setInt(6, iPrice);

                pst.executeUpdate();

                JOptionPane.showMessageDialog(this,"Record Successfully Added to database");

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddItem.class.getName()).log(Level.SEVERE, null, ex);

            }catch (SQLException ex){
                Logger.getLogger(AddItem.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, ex);
            }

            for (ItemRecord ir : item) {
                System.out.println(ir.getItemId());
            }
            int exit = 1;

            for (ItemRecord ir : item) {

                if (iId == ir.getItemId()) {
                    exit = 2;
                    break;

                } else if (ir.getItemName().toLowerCase().compareTo(itemName) == 0) {
                    exit = 3;
                    break;
                }

            }

            if (exit == 2) {
                JOptionPane.showMessageDialog(rootPane, "Item ID already added", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (exit == 3) {
                JOptionPane.showMessageDialog(rootPane,  "Item Name already exit","Error", JOptionPane.ERROR_MESSAGE);
            } else if (exit == 1) {
                ItemRecord itm = new ItemRecord(iId, itemName, iPrice, itemCategory, priceRange, iQuantity);
                item.add(itm);

                addTable();


                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jComboBox1.setSelectedIndex(0);
                jTextField4.setText("");
                buttonGroup1.clearSelection();
            }

        }

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
        com.example.inventorymanagementsystem.Admin ad = new com.example.inventorymanagementsystem.Admin();
        ad.setVisible(true);
    }


    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        selectionSort(2);
        JOptionPane.showMessageDialog(rootPane, "Successfully sorted", "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    private void addTable() {

        dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);

        for (ItemRecord itm2 : item) {
            int itID = itm2.getItemId();
            String itemName = itm2.getItemName();
            int price = itm2.getItemPrice();
            String category = itm2.getItemCategory();
            String priceRange = itm2.getPriceRange();
            int quantity = itm2.getItemQuantity();
            Object[] o = {itID, itemName, price, category, priceRange, quantity};
            dtm.addRow(o);
        }
    }

    private void readDatabaseContents(){
        int c;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/item_data?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "Kuagbenu12345");
            pst = con.prepareStatement("select * from item_details");
            ResultSet st = pst.executeQuery();
            ResultSetMetaData mt = st.getMetaData();
            c = mt.getColumnCount();



            while(st.next()){
                int itemID = st.getInt("ID");
                String itemName = st.getString("Item");
                int itemQty = st.getInt("Qty");
                String itemCat = st.getString("Category");
                String itemPriceRange = st.getString("PriceRange");
                int itemPrice = st.getInt("Price");

                ItemRecord itm = new ItemRecord(itemID, itemName, itemQty, itemCat, itemPriceRange, itemPrice);
                item.add(itm);
                addTable();
            }

        } catch (ClassNotFoundException ex){
            Logger.getLogger(AddItem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex){
            Logger.getLogger(AddItem.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        }
    }

    private boolean openCurrentFile(String filePath) {

        boolean isImported = false;
        BufferedReader ab = null;
        String lineReader = "";

        try {
            ab = new BufferedReader(new FileReader(filePath));

            while ((lineReader = ab.readLine()) != null) {

                String[] line = lineReader.split(",");
                int iid = Integer.parseInt(line[0]);
                String name = line[1];
                int price = Integer.parseInt(line[2]);
                String category = line[3];
                String priceRange = line[4];
                int iqty = Integer.parseInt(line[5]);

//                ItemRecord itm = new ItemRecord(iid, name, price, category, priceRange, iqty);
//                item.add(itm);
//                addTable();
            }

            isImported = true;
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Error Please refer to the help section", "Warning", JOptionPane.ERROR_MESSAGE);
//            isImported = false;
        } finally {
            if (ab != null) {
                try {
                    ab.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return isImported;
        }
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {

        if (com.example.inventorymanagementsystem.Admin.count == 1) {
            com.example.inventorymanagementsystem.Admin.count++;
//            String filePath = "item_data.csv";
//           if (openCurrentFile(filePath) {
//                JOptionPane.showMessageDialog(null, " Data is Imported");
//            } else {
//                JOptionPane.showMessageDialog(null, "Data could not be imported");
//            }
//        } else {
            readDatabaseContents();
            if (item.size() != 0) {
                addTable();
            }
        }

    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        String iPrice = jTextField5.getText();
        selectionSort(2);
        try {
            if (iPrice.isBlank() == false) {
                dtm.setRowCount(0);
                //item price
                int ip = Integer.parseInt(jTextField5.getText().toString());
                int li = 0;
                int hi = n.length - 1;
                int mi = (li + hi) / 2;
                while (li <= hi) {
                    if (n[mi] == ip) {
                        for (ItemRecord i : AddItem.item) {
                            if (ip == i.getItemPrice()) {
                                Object[] o = {i.getItemId(), i.getItemName(), i.getItemPrice(), i.getItemCategory(), i.getPriceRange(), i.getItemQuantity()};
                                dtm.addRow(o);
                                System.out.println(n[mi]);
                                JOptionPane.showMessageDialog(rootPane, "Item-ID :  "+i.getItemId() + "\r\n" + "Item-Name :  " + i.getItemName() + "\r\n" + "Item-Price :  " +i.getItemPrice() + "\r\n" + "Item-Category :  " +i.getItemCategory() + "\r\n" + "Price-Range  :  " + i.getPriceRange() + "\r\n" + "Item-Quantity :  " + i.getItemQuantity());
                                break;
                            }

                        }
                        break;
                    } else if (n[mi] < ip) {
                        li = mi + 1;
                    } else {
                        hi = mi - 1;
                    }

                    mi = (li + hi) / 2;
                }

                if (li > hi) {
                    JOptionPane.showMessageDialog(rootPane, "No such item found, enter another price");

                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Enter price please", "Error", JOptionPane.ERROR_MESSAGE);
                table(iPrice);
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(rootPane, "Enter an integer value please", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {
        String iPrice = jTextField5.getText();
        if (iPrice.isBlank() == true) {
            dtm.setRowCount(0);
            addTable();

        }

    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        int rowCount = jTable1.getRowCount();
        int a = 0;
        String name = "";
        //Binary Search
        String iCategory = (String) jComboBox2.getSelectedItem();
        for (int i = 0; i < rowCount; i++) {
            String jCategory = jTable1.getValueAt(i, 3).toString();
            String iName = jTable1.getValueAt(i, 1).toString();
            if (iCategory.equals(jCategory)) {
                name += iName + ", ";
                a++;

            }

        }
        JOptionPane.showMessageDialog(rootPane, "There are " + a + " items " + "in " + iCategory + " Category: " + name);

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {

        if (com.example.inventorymanagementsystem.Admin.count == 2) {
            com.example.inventorymanagementsystem.Admin.count++;
            String filePath = "item_data.csv";
            if (openCurrentFile(filePath)) {
                JOptionPane.showMessageDialog(null, " Data is Imported");
            } else {
                JOptionPane.showMessageDialog(null, "Data could not be imported");
            }
        } else {
            JOptionPane.showMessageDialog(null, " Data has already been Imported, please delete all the data from the table and then open file again to import");
        }


    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jComboBox1.setSelectedIndex(0);
        jTextField4.setText("");
        buttonGroup1.clearSelection();
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        int a = JOptionPane.showConfirmDialog(rootPane, "Are you sure?");
        if (a == JOptionPane.OK_OPTION) {
            int row = jTable1.getSelectedRow();
            int iId = Integer.parseInt(jTable1.getValueAt(row, 0).toString());

            dtm.removeRow(row);

            for (ItemRecord ir : item) {
                if (ir.getItemId() == iId) {
                    item.remove(ir);
                    break;
                }
            }
        }
        if (jTable1.getRowCount() == 0) {
            com.example.inventorymanagementsystem.Admin.count = 1;
        }
    }

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {

        File file = new File("helpmenu.pdf");
        try {
            Desktop.getDesktop().open(file);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "File not found");
        }
    }

    private void jTextField5MouseReleased(java.awt.event.MouseEvent evt) {
        dtm.setRowCount(0);
        addTable();

    }

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void table(String search) {
        dtm = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));

    }

    public static int removeDuplicateElements(int arr[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];
        // Changing original array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }

    private void selectionSort(int col) {
        int rowCount = jTable1.getRowCount();
        n = new int[rowCount];

        if (rowCount != 0) {
            for (int i = 0; i < rowCount; i++) {
                int num = Integer.parseInt(jTable1.getValueAt(i, col).toString());
                n[i] = num;
            }

        }
        int length = removeDuplicateElements(n, rowCount);
        if (length != 0) {
            // Selection Sort
            int min;
            int tempPrice;

            for (int i = 0; i < length; i++) {
                dtm.setRowCount(0);
                min = i;
                for (int j = i + 1; j < length; j++) {

                    if (n[j] < n[min]) {
                        min = j;

                    }
                }

                tempPrice = n[i];
                n[i] = n[min];
                n[min] = tempPrice;

            }
            for (int z = 0; z < length; z++) {
                for (ItemRecord it : AddItem.item) {
                    int priceItem = it.getItemPrice();
                    if (priceItem == n[z]) {
                        Object[] o = {it.getItemId(), it.getItemName(), it.getItemPrice(), it.getItemCategory(), it.getPriceRange(), it.getItemQuantity()};
                        dtm.addRow(o);
                    }
                }

            }

        }
    }

    //Connection con;
    //PreparedStatement pst;



    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddItem().setVisible(true);

                com.example.inventorymanagementsystem.Login ln = new com.example.inventorymanagementsystem.Login();
                ln.setVisible(true);
            }
        });


    }

    // Variables declaration
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;

}
