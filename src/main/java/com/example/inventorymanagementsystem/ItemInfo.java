package com.example.inventorymanagementsystem;



import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class ItemInfo extends javax.swing.JFrame {

    DefaultTableModel dtm;
    int[] n;


    public ItemInfo() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(166, 74, 227));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24));
        jLabel1.setText("Item Info");

        jButton1.setFont(new java.awt.Font("Arial", 1, 12));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(183, 130, 231));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jButton2.setText("Sort by Price");
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

        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextField1MouseReleased(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Item ID", "Item Name", "Item Price", "Item Category", "Price Range", "Item Quantity"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(jLabel1)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jButton1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(12, Short.MAX_VALUE)
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3)
                                        .addComponent(jButton2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
        com.example.inventorymanagementsystem.Admin ad = new com.example.inventorymanagementsystem.Admin();
        ad.setVisible(true);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        selectionSort(2);

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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        String iid = jTextField1.getText();

        selectionSort(0);

        try {
            if (iid.isBlank() == false) {
                dtm.setRowCount(0);
                int id = Integer.parseInt(jTextField1.getText().toString());
                int li = 0;
                int hi = n.length - 1;
                int mi = (li + hi) / 2;
                while (li <= hi) {
                    if (n[mi] == id) {
                        for (ItemRecord i : com.example.inventorymanagementsystem.AddItem.item) {
                            if (id == i.getItemId()) {
                                Object[] o = {i.getItemId(), i.getItemName(), i.getItemPrice(), i.getItemCategory(), i.getPriceRange(), i.getItemQuantity()};
                                dtm.addRow(o);
                                System.out.println(n[mi]);
                            }
                        }
                        //                    System.out.println(empName);
                        break;
                    } else if (n[mi] < id) {
                        li = mi + 1;
                    } else {
                        hi = mi - 1;
                    }

                    mi = (li + hi) / 2;
                }

                if (li > hi) {
                    JOptionPane.showMessageDialog(rootPane, "No such item found!");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Enter price please", "Error", JOptionPane.ERROR_MESSAGE);
                table(iid);
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(rootPane, "Enter an integer value please", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {
        addTable();
    }

    public void addTable() {

        dtm = (DefaultTableModel) jTable1.getModel();

        for (ItemRecord itm2 : com.example.inventorymanagementsystem.AddItem.item) {
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
    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {

        String iName = jTextField1.getText().toLowerCase();
        if (iName.isBlank() == true) {
            dtm.setRowCount(0);
            addTable();
//            table(iName);
        }


    }

    private void jTextField1MouseReleased(java.awt.event.MouseEvent evt) {
        dtm.setRowCount(0);
        addTable();
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
                for (ItemRecord it : com.example.inventorymanagementsystem.AddItem.item) {
                    int priceItem = it.getItemPrice();
                    if (priceItem == n[z]) {
                        Object[] o = {it.getItemId(), it.getItemName(), it.getItemPrice(), it.getItemCategory(), it.getPriceRange(), it.getItemQuantity()};
                        dtm.addRow(o);
                    }
                }

            }

        }
    }

    private void table(String search) {
        //System.out.println(search);
        dtm = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));

    }


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new ItemInfo().setVisible(true);

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
