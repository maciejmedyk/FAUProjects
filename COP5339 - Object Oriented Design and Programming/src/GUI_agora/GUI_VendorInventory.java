package GUI_agora;

import FNC_agora.Product;
import FNC_agora.Vendor;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.HashSet;
import java.util.Set;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 * GUI_VendorInventory allows vendor to view all his inventory products
 *
 * @author Maciej Medyk and Caio Farias
 */
public class GUI_VendorInventory extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUI_VendorInventory
     */
    public GUI_VendorInventory() {
        initComponents();
        mWelcome.setText("Welcome: " + Agora.um.loggedName);
        Vendor v = Agora.um.vLoggedUser;
        mpanel = new JPanel();
        npanel = new JPanel();
        mpanel.setLayout(new BoxLayout(mpanel, BoxLayout.Y_AXIS));
        npanel.setLayout(new BorderLayout());
        mpanel.setAlignmentX(LEFT_ALIGNMENT);
        mpanel.setAlignmentY(TOP_ALIGNMENT);
        for(Product p : v.viewInventory())
        {
            item = new GUI_VendorLineItem(p, this);
            mpanel.add(item);
            mpanel.setAlignmentX(LEFT_ALIGNMENT);
            mpanel.setAlignmentY(TOP_ALIGNMENT);
        }
        npanel.add(mpanel, BorderLayout.NORTH);
        mainPanel.getViewport().add(npanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        mainPanel = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        mWelcome = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setTitle("Vendor Inventory");
        setToolTipText("");

        mainPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        mainPanel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        mainPanel.setAlignmentX(0.0F);
        mainPanel.setAlignmentY(0.0F);
        mainPanel.setOpaque(true);

        jButton1.setText("Logout");
        jButton1.setToolTipText("Logout Button");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        mWelcome.setText("Welcome: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mWelcome)
                                .addContainerGap(420, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(mWelcome))
                                .addContainerGap(8, Short.MAX_VALUE))
        );

        jButton2.setText("Add Product");
        jButton2.setToolTipText("Add Product To Inventory");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Account Summary");
        jButton4.setToolTipText("View Account Summary");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setText("Order History");
        jButton3.setToolTipText("View Order History");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        jLabel1.setText("Product Name                         Product Description                                                                                                                                                                        Price           Cost          Qty ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(63, 63, 63)
                                                                .addComponent(jButton4)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton3)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton2))
                                                        .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jSeparator1)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton2)
                                                        .addComponent(jButton3)
                                                        .addComponent(jButton4))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    /**
     * Logs vendor out to login screen
     *
     * @param evt
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.setVisible(false);
        Agora.desktop.removeAll();
        GUI_Login login = new GUI_Login("");
        Agora.desktop.add(login);
        login.setVisible(true);
    }

    /**
     * Opens AddProduct view to add new product
     *
     * @param evt
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        GUI_AddProduct ap = new GUI_AddProduct(this);
        ap.setLocation((Agora.desktop.getWidth() - ap.getWidth())/2,(Agora.desktop.getHeight() - ap.getHeight())/2);
        Agora.desktop.add(ap, new Integer(10));
        ap.setVisible(true);
    }


    /**
     * Opens OrderHistory view where all prior orders can be viewed
     *
     * @param evt
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        GUI_OrderHistory oh = new GUI_OrderHistory();
        oh.setLocation((Agora.desktop.getWidth() - oh.getWidth())/2,(Agora.desktop.getHeight() - oh.getHeight())/2);
        Agora.desktop.add(oh, new Integer(10));
        oh.setVisible(true);
    }

    /**
     * Opens AccountSummary view where vendor can see revenues, costs, and profits
     *
     * @param evt
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        GUI_AccountSummary as = new GUI_AccountSummary();
        as.setLocation((Agora.desktop.getWidth() - as.getWidth())/2,(Agora.desktop.getHeight() - as.getHeight())/2);
        Agora.desktop.add(as, new Integer(10));
        as.setVisible(true);
    }

    /**
     * Repaints the inventory panel
     */
    public void repaintMainPanel()
    {
        Vendor v = Agora.um.vLoggedUser;
        mpanel.removeAll();
        npanel.removeAll();
        for(Product p : v.viewInventory())
        {;
            item = new GUI_VendorLineItem(p, this);
            mpanel.add(item);
            mpanel.setAlignmentX(LEFT_ALIGNMENT);
            mpanel.setAlignmentY(TOP_ALIGNMENT);
        }
        npanel.add(mpanel, BorderLayout.NORTH);
        mainPanel.getViewport().add(npanel);
        mainPanel.getViewport().revalidate();
        mainPanel.getViewport().repaint();
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mWelcome;
    private javax.swing.JScrollPane mainPanel;
    // End of variables declaration                   
    private javax.swing.JPanel mpanel;
    private javax.swing.JPanel npanel;
    private GUI_VendorLineItem item;
}
