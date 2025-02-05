package GUI_agora;

import static GUI_agora.Agora.um;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * GUI_CreateAccount creates a new user that would be either vendor or customer
 *
 * @author Maciej Medyk and Caio Farias
 */
public class GUI_CreateAccount extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUI_Login
     */
    public GUI_CreateAccount() {
        initComponents();
        mMessage.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        mEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mDate = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        mPassword = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        mChoice = new javax.swing.JComboBox();
        mMessage = new javax.swing.JLabel();

        setToolTipText("");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Account");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Username");

        jLabel3.setText("Full Name");

        jLabel4.setText("Email");

        jLabel5.setText("Date Of Birth");

        jLabel6.setText("Password");

        jButton2.setText("Create Account");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Account Type");

        mChoice.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Customer", "Vendor" }));

        mMessage.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        mMessage.setForeground(new java.awt.Color(255, 102, 102));
        mMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mMessage.setText("Account Created");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(mMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(mChoice, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(mEmail)
                                        .addComponent(mUsername)
                                        .addComponent(mPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(mDate, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                                        .addComponent(mName)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel7))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addGap(11, 11, 11)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addComponent(mMessage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2))
                                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(354, 354, 354)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(354, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    /**
     * Cancels action and returns back to login
     *
     * @param evt
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.setVisible(false);
        GUI_Login login = new GUI_Login("");
        Agora.desktop.add(login);
        login.setVisible(true);
    }

    /**
     * Creates new user
     * @param evt
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (mChoice.getSelectedItem().toString().equals("Vendor"))
        {
            Agora.um.addVendor(mName.getText(), mEmail.getText(), mUsername.getText(), mPassword.getText(), mDate.getText());
            this.setVisible(false);
            GUI_Login login = new GUI_Login("");
            Agora.desktop.add(login);
            login.setVisible(true);
            GUI_Note n = new GUI_Note("New Account Created");
            n.setLocation((Agora.desktop.getWidth() - n.getWidth())/2,(Agora.desktop.getHeight() - n.getHeight())/2);
            Agora.desktop.add(n, new Integer(10));
            n.setVisible(true);
        }
        if (mChoice.getSelectedItem().toString().equals("Customer"))
        {
            Agora.um.addCustomer(mName.getText(), mEmail.getText(), mUsername.getText(), mPassword.getText(), mDate.getText());
            this.setVisible(false);
            GUI_Login login = new GUI_Login("");
            Agora.desktop.add(login);
            login.setVisible(true);
            GUI_Note n = new GUI_Note("New Account Created");
            n.setLocation((Agora.desktop.getWidth() - n.getWidth())/2,(Agora.desktop.getHeight() - n.getHeight())/2);
            Agora.desktop.add(n, new Integer(10));
            n.setVisible(true);
        }
        try
        {
            this.serialization();
        }
        catch (Exception e)
        {

        }
    }

    /**
     * Saves the status of the program
     *
     * @throws IOException
     * @throws ClassNotFoundException
     */
    private void serialization() throws IOException, ClassNotFoundException
    {
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("agora.dat"));
        output.writeObject(Agora.um);
        output.close();
    }


    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox mChoice;
    private javax.swing.JFormattedTextField mDate;
    private javax.swing.JTextField mEmail;
    private javax.swing.JLabel mMessage;
    private javax.swing.JTextField mName;
    private javax.swing.JPasswordField mPassword;
    private javax.swing.JTextField mUsername;
    // End of variables declaration                   
}
