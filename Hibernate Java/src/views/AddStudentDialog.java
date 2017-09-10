package views;

import controller.Actions;
import controller.Controller;
import java.util.List;
import model.City;
import model.Student;

public class AddStudentDialog extends javax.swing.JDialog {

    public AddStudentDialog(Controller controller) {
        initComponents();
        initActions(controller);
        this.setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbHeader = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lbName = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        lbMail = new javax.swing.JLabel();
        tfMail = new javax.swing.JTextField();
        lbId1 = new javax.swing.JLabel();
        tfPassword = new javax.swing.JTextField();
        lbName1 = new javax.swing.JLabel();
        cbCity = new javax.swing.JComboBox<>();
        jbAddStudent = new javax.swing.JButton();
        jbCancelAddStudent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbHeader.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbHeader.setText("Add Student");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lbName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbName.setText("Name:");

        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });

        lbMail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbMail.setText("Mail");

        tfMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMailActionPerformed(evt);
            }
        });

        lbId1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbId1.setText("Password");

        lbName1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbName1.setText("Ciudad");

        jbAddStudent.setBackground(new java.awt.Color(51, 255, 51));
        jbAddStudent.setForeground(new java.awt.Color(255, 255, 255));
        jbAddStudent.setText("Add");
        jbAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddStudentActionPerformed(evt);
            }
        });

        jbCancelAddStudent.setBackground(new java.awt.Color(255, 51, 51));
        jbCancelAddStudent.setForeground(new java.awt.Color(255, 255, 255));
        jbCancelAddStudent.setText("Cancel");
        jbCancelAddStudent.setBorderPainted(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfMail, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbName, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                    .addComponent(lbId1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfPassword))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbName1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbCity, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbAddStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbCancelAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbMail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfMail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbId1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbName1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCity, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbCancelAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAddStudentActionPerformed

    private void tfMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMailActionPerformed

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<City> cbCity;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbAddStudent;
    private javax.swing.JButton jbCancelAddStudent;
    private javax.swing.JLabel lbHeader;
    private javax.swing.JLabel lbId1;
    private javax.swing.JLabel lbMail;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbName1;
    private javax.swing.JTextField tfMail;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPassword;
    // End of variables declaration//GEN-END:variables

    public void addCities(List<?> items) {
        cbCity.removeAllItems();
        for (Object item : items) {
            cbCity.addItem((City) item);
        }
    }

    private void initActions(Controller controller) {
        jbAddStudent.setActionCommand(Actions.ADD_STUDENT.toString());
        jbAddStudent.addActionListener(controller);

        jbCancelAddStudent.setActionCommand(Actions.CANCEL_ADD_STUDENT.toString());
        jbCancelAddStudent.addActionListener(controller);
    }

    public void cancelAddStudent() {
        tfMail.setText("");
        tfName.setText("");
        tfPassword.setText("");
        this.setVisible(false);
    }

    public Student getNewStudent() {
        return new Student(tfName.getText(), tfMail.getText(), tfPassword.getText(), (City) (cbCity.getSelectedItem()));
    }

    public void setToEditeMode(Student st, List<?> items) {
        tfMail.setText(st.getMail());
        tfName.setText(st.getName());
        tfPassword.setText(st.getPassword());
        lbHeader.setText("Edit Student");
        jbAddStudent.setText("Edit");
        addCities(items);
        jbAddStudent.setActionCommand(Actions.EDIT_STUDENT.toString());
        this.setVisible(true);
    }

    public void setToAddMode() {
        jbAddStudent.setActionCommand(Actions.ADD_STUDENT.toString());
        lbHeader.setText("Add Student");
//        cancelAddStudent();
        jbAddStudent.setText("Add");

    }
}