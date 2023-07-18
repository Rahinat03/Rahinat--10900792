package com.example.inventorymanagementsystem;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.*;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login extends JFrame {
    public static String query;
    DefaultTableModel model;
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JTextField jTextField1;
    private JTextField jTextField2;

    public Login() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jButton1 = new JButton();
        this.jTextField1 = new JTextField();
        this.jTextField2 = new JTextField();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
        this.setDefaultCloseOperation(3);
        this.addWindowListener(new WindowAdapter() {
            public void windowOpened(WindowEvent evt) {
                Login.this.formWindowOpened(evt);
            }
        });
        this.jPanel1.setBackground(new Color(166, 74, 227));
        this.jLabel1.setFont(new Font("Arial", 1, 14));
        this.jLabel1.setText("Username");
        this.jLabel2.setFont(new Font("Arial", 1, 14));
        this.jLabel2.setText("Password");
        this.jButton1.setBackground(new Color(183, 130, 231));
        this.jButton1.setFont(new Font("Arial", 1, 14));
        this.jButton1.setText("Login");
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Login.this.jButton1ActionPerformed(evt);
            }
        });
        this.jTextField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Login.this.jTextField1ActionPerformed(evt);
            }
        });
        this.jTextField1.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                Login.this.jTextField1KeyReleased(evt);
            }

            public void keyTyped(KeyEvent evt) {
                Login.this.jTextField1KeyTyped(evt);
            }
        });
        this.jTextField2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Login.this.jTextField2ActionPerformed(evt);
            }
        });
        this.jLabel3.setFont(new Font("Times New Roman", 1, 30));
        this.jLabel3.setForeground(new Color(255, 255, 255));
        this.jLabel3.setText("    INVENTORY MANAGEMENT ");
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap(-1, 32767).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(this.jLabel5).addGap(217, 217, 217)).addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(this.jButton1, -2, 85, -2).addGap(170, 170, 170)))).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(73, 73, 73).addComponent(this.jLabel2).addGap(18, 18, 18).addComponent(this.jTextField2, -2, 203, -2)).addGroup(jPanel1Layout.createSequentialGroup().addGap(71, 71, 71).addComponent(this.jLabel1).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jTextField1, -2, 203, -2).addComponent(this.jLabel4))).addComponent(this.jLabel3, -2, 421, -2)).addContainerGap(-1, 32767)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(15, 15, 15).addComponent(this.jLabel3).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jLabel4).addGap(18, 18, 18).addComponent(this.jLabel5).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jTextField1, -2, -1, -2).addComponent(this.jLabel1)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jTextField2, -2, -1, -2).addComponent(this.jLabel2)).addGap(31, 31, 31).addComponent(this.jButton1, -2, 31, -2).addContainerGap(45, 32767)));
        this.jTable1.setBackground(new Color(166, 74, 227));
        this.jTable1.setModel(new DefaultTableModel(new Object[][]{{"admin", "password", "administrator"}}, new String[]{"Username", "Password", "Type"}) {
            Class[] types = new Class[]{String.class, String.class, String.class};

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }
        });
        this.jTable1.getTableHeader().setReorderingAllowed(false);
        this.jScrollPane1.setViewportView(this.jTable1);
        if (this.jTable1.getColumnModel().getColumnCount() > 0) {
            this.jTable1.getColumnModel().getColumn(0).setResizable(false);
            this.jTable1.getColumnModel().getColumn(1).setResizable(false);
            this.jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767).addComponent(this.jScrollPane1));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -1, -1, 32767).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jScrollPane1, -2, 47, -2)));
        this.pack();
        this.setLocationRelativeTo((Component)null);
    }

    private void table(String search) {
        this.model = (DefaultTableModel)this.jTable1.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter(this.model);
        this.jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search, new int[0]));
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        String username = this.jTextField1.getText().toLowerCase().trim();
        String password = this.jTextField2.getText().toLowerCase().trim();
        int rowCount = this.jTable1.getRowCount();
        int colCount = this.jTable1.getColumnCount();
        if (username.isEmpty()) {
            JOptionPane.showMessageDialog(this.rootPane, "Please Enter Username", "Error", 2);
        } else if (password.isEmpty()) {
            JOptionPane.showMessageDialog(this.rootPane, "Please Enter Password", "Error", 2);
        } else if (username.equals("admin") && password.equals("password")) {
            com.example.inventorymanagementsystem.Admin log = new com.example.inventorymanagementsystem.Admin();
            log.setVisible(true);
            this.setVisible(false);
        } else if (!RegisterVendor.vendor.isEmpty()) {
            int temp = 0;
            Iterator var7 = RegisterVendor.vendor.iterator();

            while(var7.hasNext()) {
                VendorRecord em = (VendorRecord)var7.next();
                String user = em.getName().toLowerCase();
                String pass = em.getPassword().toLowerCase();
                if (user.equals(username) && pass.equals(password)) {
                    Vendor e = new Vendor();
                    e.setVisible(true);
                    this.setVisible(false);
                    ++temp;
                }
            }

            if (temp == 0) {
                JOptionPane.showMessageDialog(this.rootPane, "Vendor Username and Password do not match.", "Error", 2);
            }
        } else {
            JOptionPane.showMessageDialog(this.rootPane, "Admin UserName & Password don't match OR Vendor is not registered yet.", "Error", 2);
        }

    }

    private void jTextField1KeyTyped(KeyEvent evt) {
    }

    private void jTextField1KeyReleased(KeyEvent evt) {
        query = this.jTextField1.getText().toLowerCase();
        this.table(query);
    }

    private void formWindowOpened(WindowEvent evt) {
        if (RegisterVendor.vendor != null) {
            this.model = (DefaultTableModel)this.jTable1.getModel();
            Iterator var2 = RegisterVendor.vendor.iterator();

            while(var2.hasNext()) {
                VendorRecord emm2 = (VendorRecord)var2.next();
                String name = emm2.getName();
                String type = "vendor";
                String password = emm2.getPassword();
                Object[] o = new Object[]{name, password, type};
                this.model.addRow(o);
            }
        }

    }

    private void jTextField2ActionPerformed(ActionEvent evt) {
    }

    private void jTextField1ActionPerformed(ActionEvent evt) {
    }

    public static void main(String[] args) throws Exception {
        try {
            UIManager.LookAndFeelInfo[] var1 = UIManager.getInstalledLookAndFeels();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                UIManager.LookAndFeelInfo info = var1[var3];
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException var5) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new Login()).setVisible(true);
            }
        });
    }
}
