
package resms.auth;

import resms.auth.login_page;
import javax.swing.JOptionPane;
import java.sql.*;
import resms.mysqlcon;

/**
 *
 * @author b54u
 */
public class register_page extends javax.swing.JFrame {

    mysqlcon conn=new mysqlcon();
    public register_page() {
        initComponents();
        setLocationRelativeTo(null);
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
        register_label = new javax.swing.JLabel();
        last_name_label = new javax.swing.JLabel();
        first_name_label = new javax.swing.JLabel();
        location_label = new javax.swing.JLabel();
        pass_label = new javax.swing.JLabel();
        user_label = new javax.swing.JLabel();
        first_name_field = new javax.swing.JTextField();
        last_name_field = new javax.swing.JTextField();
        user_name_field = new javax.swing.JTextField();
        pass_field = new javax.swing.JTextField();
        location_field = new javax.swing.JTextField();
        register_button = new javax.swing.JButton();
        back_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        register_label.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        register_label.setForeground(new java.awt.Color(0, 0, 0));
        register_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        register_label.setText("Register");

        last_name_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        last_name_label.setForeground(new java.awt.Color(0, 0, 0));
        last_name_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        last_name_label.setText("Last Name");

        first_name_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        first_name_label.setForeground(new java.awt.Color(0, 0, 0));
        first_name_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        first_name_label.setText("First Name");

        location_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        location_label.setForeground(new java.awt.Color(0, 0, 0));
        location_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        location_label.setText("Location");

        pass_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pass_label.setForeground(new java.awt.Color(0, 0, 0));
        pass_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pass_label.setText("Password");

        user_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        user_label.setForeground(new java.awt.Color(0, 0, 0));
        user_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_label.setText("User Name");

        first_name_field.setBackground(new java.awt.Color(255, 255, 255));

        last_name_field.setBackground(new java.awt.Color(255, 255, 255));

        user_name_field.setBackground(new java.awt.Color(255, 255, 255));

        pass_field.setBackground(new java.awt.Color(255, 255, 255));

        location_field.setBackground(new java.awt.Color(255, 255, 255));

        register_button.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        register_button.setText("Register");
        register_button.setMaximumSize(new java.awt.Dimension(82, 27));
        register_button.setMinimumSize(new java.awt.Dimension(82, 27));
        register_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                register_buttonMouseClicked(evt);
            }
        });

        back_button.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        back_button.setText("Go back");
        back_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_buttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(register_label, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(first_name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(last_name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(location_label, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user_label, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass_label, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(register_button, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pass_field, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(last_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(first_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(location_field, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(register_label, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(first_name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(first_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(last_name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(last_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(location_field, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(location_label, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_label, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass_field, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass_label, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(register_button, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void register_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_buttonMouseClicked
        
        try{
            String p=pass_field.getText();
            String u=user_name_field.getText();
            String f=first_name_field.getText();
            String l=last_name_field.getText();
            String lc=location_field.getText();
            if(u.isEmpty()){
                info_message("Provide username please!","Alert!",2);
                return;
            }
            if(p.isEmpty()){
                info_message("Provide password please!","Alert!",2);
                return;
            }
            if(f.isEmpty()){
                info_message("Provide first name please!","Alert!",2);
                return;
            }
            if(l.isEmpty()){
                info_message("Provide last name please!","Alert!",2);
                return;
            }
            if(lc.isEmpty()){
                info_message("Provide location please!","Alert!",2);
                return;
            }
            PreparedStatement in=conn.c.prepareStatement("insert into agent values(?,?,?,?)");
            in.setString(1, u);
            in.setString(2, f);
            in.setString(3, l);
            in.setString(4, lc);
            in.execute();
            info_message("inserted in agent table","Alert!",1);
            PreparedStatement in2=conn.c.prepareStatement("insert into login_data values(?,?)");
            in2.setString(1, u);
            in2.setString(2, p);
            in2.execute();
            info_message("inserted in login_data table","Alert!",1);
            info_message("Registered Successfully","Success",1);
            setVisible(false);
            new login_page().setVisible(true);
        }
        catch(SQLException ex){
             System.out.println(ex);
        }
        
        
    }//GEN-LAST:event_register_buttonMouseClicked

    private void back_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_buttonMouseClicked
        setVisible(false);
        new login_page().setVisible(true);
    }//GEN-LAST:event_back_buttonMouseClicked
    public void info_message(String message, String title,int c){
        if(c==1)
            JOptionPane.showMessageDialog(null,message,title,JOptionPane.INFORMATION_MESSAGE);
        else if(c==2)
            JOptionPane.showMessageDialog(null,message,title,JOptionPane.WARNING_MESSAGE);

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
                new register_page().setVisible(true);
            }
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JTextField first_name_field;
    private javax.swing.JLabel first_name_label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField last_name_field;
    private javax.swing.JLabel last_name_label;
    private javax.swing.JTextField location_field;
    private javax.swing.JLabel location_label;
    private javax.swing.JTextField pass_field;
    private javax.swing.JLabel pass_label;
    private javax.swing.JButton register_button;
    private javax.swing.JLabel register_label;
    private javax.swing.JLabel user_label;
    private javax.swing.JTextField user_name_field;
    // End of variables declaration//GEN-END:variables
}
