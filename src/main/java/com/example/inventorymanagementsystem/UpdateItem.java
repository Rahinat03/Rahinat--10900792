package com.example.inventorymanagementsystem;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class UpdateItem extends javax.swing.JFrame {

    int row;
    int itemPrice;
    DefaultTableModel dtm;
    public static int totalBill;


    public UpdateItem() {
        initComponents();

    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(166, 74, 227));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Item ID", "Item Name", "Item Price", "Item Category", "Item Quantity", "Total Price"
                }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(183, 130, 231));
        jButton3.setText("Confirm");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Total Bill:");

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Item Quantity:");

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Name");

        jLabel4.setText("Price");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton1)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addGap(12, 12, 12)
                                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(jLabel3))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jTextField2)
                                                                        .addComponent(jTextField4)
                                                                        .addComponent(jTextField3)))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jButton4)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton3)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton2)))))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jButton1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(76, 76, 76)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3))
                                                .addGap(28, 28, 28)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(25, 25, 25)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton3)
                                                        .addComponent(jButton4)
                                                        .addComponent(jButton2))
                                                .addGap(34, 34, 34)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addGap(4, 4, 4))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            JFrame f;
            f = new JFrame();
            int a = JOptionPane.showConfirmDialog(f, "Are you sure?");
            if (a == JOptionPane.OK_OPTION) {
                int updateQty = Integer.parseInt(jTextField4.getText());
                int totalPrice = updateQty * itemPrice;
                jTable1.setValueAt(updateQty, row, 4);
                jTable1.setValueAt(totalPrice, row, 5);
                totalBill();
                jTextField4.setText("");
            }
        }catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(rootPane, "Enter a integer value please", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        int rCount = jTable1.getRowCount();

        if (rCount != 0) {
            int itId;
            String itName;
            int itPrice;
            int itQty;
            int tPrice;
            int remQty;
            String itCategory;

            com.example.inventorymanagementsystem.BillItem.bRecord.clear();

            for (int i = 0; i < rCount; i++) {
                itId = Integer.parseInt(jTable1.getValueAt(i, 0).toString());
                itName = jTable1.getValueAt(i, 1).toString();
                itPrice = Integer.parseInt(jTable1.getValueAt(i, 2).toString());
                itCategory = jTable1.getValueAt(i, 3).toString();
                itQty = Integer.parseInt(jTable1.getValueAt(i, 4).toString());
                tPrice = Integer.parseInt(jTable1.getValueAt(i, 5).toString());

                BillingItemRecord bi = new BillingItemRecord(itId, itName, itPrice, itCategory, itQty, tPrice);
                com.example.inventorymanagementsystem.BillItem.bRecord.add(bi);

                for (ItemRecord it : com.example.inventorymanagementsystem.AddItem.item) {

                    int idItem = it.getItemId();

                    if (itId == idItem) {
                        remQty = it.getItemQuantity() - itQty;
                        it.setItemQuantity(remQty);
                        System.out.println(remQty);

                    }
                }

            }

        } else {
            com.example.inventorymanagementsystem.BillItem.bRecord.clear();
            totalBill = 0;
        }

        IssueBilling sb = new IssueBilling();
        sb.setVisible(true);
        setVisible(false);

    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {
        dtm = (DefaultTableModel) jTable1.getModel();

        for (BillingItemRecord bir : com.example.inventorymanagementsystem.BillItem.bRecord) {
            String name = bir.getItemName();
            int price = bir.getItemPrice();
            int itemID = bir.getItemID();
            String category = bir.getCategory();
            int quantity = bir.getItemQuantity();
            int totalPrice = bir.getTotalPrice();
            Object[] o = {itemID, name, price, category, quantity, totalPrice};
            dtm.addRow(o);
        }
        totalBill();

    }

    public void totalBill() {

        int rowCount = jTable1.getRowCount();
        if (rowCount != 0) {
            totalBill = 0;
            for (int i = 0; i < rowCount; i++) {
                int tPrice = Integer.parseInt(jTable1.getValueAt(i, 5).toString());
                totalBill += tPrice;
            }

            jTextField1.setText(Integer.toString(totalBill));
        } else {
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        com.example.inventorymanagementsystem.BillItem bi = new com.example.inventorymanagementsystem.BillItem();
        bi.setVisible(true);
        setVisible(false);
    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
        row = jTable1.getSelectedRow();
        int id = Integer.parseInt(jTable1.getValueAt(row, 0).toString());
        String itemName = jTable1.getValueAt(row, 1).toString();
        itemPrice = Integer.parseInt(jTable1.getValueAt(row, 2).toString());
        jTextField2.setText(itemName);
        jTextField3.setText(Integer.toString(itemPrice));


    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        JFrame R;
        R = new JFrame();

        int a = JOptionPane.showConfirmDialog(R, "Are you sure?");
        if (a == JOptionPane.OK_OPTION) {
            row = jTable1.getSelectedRow();
            int iId = Integer.parseInt(jTable1.getValueAt(row, 0).toString());

            dtm.removeRow(row);

            for (BillingItemRecord br : com.example.inventorymanagementsystem.BillItem.bRecord) {
                if (br.getItemID() == iId) {
                    com.example.inventorymanagementsystem.BillItem.bRecord.remove(br);
                    break;
                }
            }
            totalBill();
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
        }


    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
    }
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new UpdateItem().setVisible(true);
                Login ln = new Login();
                ln.setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
}

