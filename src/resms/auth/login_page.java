package resms.auth;
import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import resms.Main_page;
import resms.mysqlcon;

public class login_page extends javax.swing.JFrame {

  
    
    public login_page() {
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

        jPanel4 = new javax.swing.JPanel();
        id_label = new javax.swing.JLabel();
        pass_label = new javax.swing.JLabel();
        login_button = new javax.swing.JButton();
        pass_field = new javax.swing.JTextField();
        id_field = new javax.swing.JTextField();
        register_button = new javax.swing.JButton();
        title_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(0, 153, 204));

        id_label.setBackground(new java.awt.Color(0, 0, 0));
        id_label.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        id_label.setForeground(new java.awt.Color(0, 0, 0));
        id_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id_label.setText("Agent ID");

        pass_label.setBackground(new java.awt.Color(0, 0, 0));
        pass_label.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pass_label.setForeground(new java.awt.Color(0, 0, 0));
        pass_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pass_label.setText("Password");

        login_button.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        login_button.setForeground(new java.awt.Color(0, 0, 0));
        login_button.setText("Login");
        login_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_buttonMouseClicked(evt);
            }
        });

        pass_field.setBackground(new java.awt.Color(255, 255, 255));

        id_field.setBackground(new java.awt.Color(255, 255, 255));
        id_field.setName(""); // NOI18N

        register_button.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        register_button.setForeground(new java.awt.Color(0, 0, 0));
        register_button.setText("Register");
        register_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                register_buttonMouseClicked(evt);
            }
        });

        title_label.setBackground(new java.awt.Color(0, 0, 0));
        title_label.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        title_label.setForeground(new java.awt.Color(0, 0, 0));
        title_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title_label.setText("WELCOME TO MAGIC PROPERTY");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 162, Short.MAX_VALUE)
                .addComponent(title_label)
                .addGap(155, 155, 155))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pass_label, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_label, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(id_field)
                            .addComponent(pass_field, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(register_button, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(title_label)
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(id_field, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(id_label, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass_label, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass_field, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(register_button, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    mysqlcon conn= new mysqlcon();
    private void login_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_buttonMouseClicked
        try{

            String check_st="select * from login_data where user_name=? and password=? ";
            String u=id_field.getText();
            if(u.isEmpty()){
                info_message("Provide username please!","Alert!",2);
                return;
            }
            
            String p=pass_field.getText();
            if(p.isEmpty()){
                info_message("Provide password please!","Alert!",2);
                return;
            }
            PreparedStatement check=conn.c.prepareStatement(check_st);//using connection variable from conn object
            check.setString(1,u);
            check.setString(2,p);
            ResultSet rs= check.executeQuery();
            if(!rs.next()){
                info_message("user not found!","Alert!",2);
            }
            else{
                info_message("logged in!","Alert!",1);
                new Main_page().setVisible(true);
                setVisible(false);
            }

        }
        catch(SQLException ex){
            System.out.println(ex);
        }

        
    }//GEN-LAST:event_login_buttonMouseClicked

    private void register_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_buttonMouseClicked
        // TODO add your handling code here:
        new register_page().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_register_buttonMouseClicked

    public static void main(String args[]) {
        
        new login_page().setVisible(true);
            
    }
   public void info_message(String message, String title,int c){
        if(c==1)
            JOptionPane.showMessageDialog(null,message,title,JOptionPane.INFORMATION_MESSAGE);
        else if(c==2)
            JOptionPane.showMessageDialog(null,message,title,JOptionPane.WARNING_MESSAGE);

    }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id_field;
    private javax.swing.JLabel id_label;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton login_button;
    private javax.swing.JTextField pass_field;
    private javax.swing.JLabel pass_label;
    private javax.swing.JButton register_button;
    private javax.swing.JLabel title_label;
    // End of variables declaration//GEN-END:variables
}
