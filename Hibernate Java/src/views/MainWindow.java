package views;

import controller.Actions;
import controller.Controller;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.Program;
import model.Schedule;
import model.Student;

public class MainWindow extends javax.swing.JFrame {

    public MainWindow(Controller controller) {
        initComponents();
        initActions(controller);
        this.setBackground(Color.WHITE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbCurrent = new javax.swing.JLabel();
        jbAdd = new javax.swing.JButton();
        tfSearch = new javax.swing.JTextField();
        jbDelete = new javax.swing.JButton();
        jbEdit = new javax.swing.JButton();
        jbSearch = new javax.swing.JButton();
        jpTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        model = new DefaultTableModel();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lbPickOne = new javax.swing.JLabel();
        jbStudents = new javax.swing.JButton();
        jbProgram = new javax.swing.JButton();
        jbSchedule = new javax.swing.JButton();
        jbCities = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hibernate CRUD");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbCurrent.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbCurrent.setText("Current");

        jbAdd.setBackground(new java.awt.Color(51, 51, 255));
        jbAdd.setForeground(new java.awt.Color(255, 255, 255));
        jbAdd.setText("Add");
        jbAdd.setBorderPainted(false);

        tfSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tfSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSearchActionPerformed(evt);
            }
        });

        jbDelete.setBackground(new java.awt.Color(255, 51, 51));
        jbDelete.setForeground(new java.awt.Color(255, 255, 255));
        jbDelete.setText("Del");
        jbDelete.setBorderPainted(false);

        jbEdit.setBackground(new java.awt.Color(51, 255, 51));
        jbEdit.setForeground(new java.awt.Color(255, 255, 255));
        jbEdit.setText("Edit");
        jbEdit.setBorderPainted(false);

        jbSearch.setBackground(new java.awt.Color(255, 51, 51));
        jbSearch.setForeground(new java.awt.Color(255, 255, 255));
        jbSearch.setText("Search");
        jbSearch.setBorderPainted(false);

        jpTable.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(model);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jpTableLayout = new javax.swing.GroupLayout(jpTable);
        jpTable.setLayout(jpTableLayout);
        jpTableLayout.setHorizontalGroup(
            jpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpTableLayout.setVerticalGroup(
            jpTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTableLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSearch))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbDelete)
                    .addComponent(jbEdit)
                    .addComponent(tfSearch)
                    .addComponent(jbSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lbPickOne.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbPickOne.setText("Pick one:");

        jbStudents.setBackground(new java.awt.Color(255, 51, 51));
        jbStudents.setForeground(new java.awt.Color(255, 255, 255));
        jbStudents.setText("Students");
        jbStudents.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbStudents.setBorderPainted(false);

        jbProgram.setBackground(new java.awt.Color(255, 51, 51));
        jbProgram.setForeground(new java.awt.Color(255, 255, 255));
        jbProgram.setText("Programs");
        jbProgram.setBorderPainted(false);

        jbSchedule.setBackground(new java.awt.Color(255, 51, 51));
        jbSchedule.setForeground(new java.awt.Color(255, 255, 255));
        jbSchedule.setText("Schedule");
        jbSchedule.setBorderPainted(false);

        jbCities.setBackground(new java.awt.Color(255, 51, 51));
        jbCities.setForeground(new java.awt.Color(255, 255, 255));
        jbCities.setText("Cities");
        jbCities.setBorderPainted(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbCities, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbProgram, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lbPickOne, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 35, Short.MAX_VALUE))
                    .addComponent(jbStudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbPickOne, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCities, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator1.setBackground(new java.awt.Color(255, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSearchActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbAdd;
    private javax.swing.JButton jbCities;
    private javax.swing.JButton jbDelete;
    private javax.swing.JButton jbEdit;
    private javax.swing.JButton jbProgram;
    private javax.swing.JButton jbSchedule;
    private javax.swing.JButton jbSearch;
    private javax.swing.JButton jbStudents;
    private javax.swing.JPanel jpTable;
    private javax.swing.JLabel lbCurrent;
    private javax.swing.JLabel lbPickOne;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables

    private DefaultTableModel model;

    private void initActions(Controller controller) {

        jbAdd.setActionCommand(Actions.ADD.toString());
        jbAdd.addActionListener(controller);

        jbCities.setActionCommand(Actions.SHOW_CITIES.toString());
        jbCities.addActionListener(controller);

        jbDelete.setActionCommand(Actions.DELETE.toString());
        jbDelete.addActionListener(controller);

        jbEdit.setActionCommand(Actions.EDIT.toString());
        jbEdit.addActionListener(controller);

        jbProgram.setActionCommand(Actions.SHOW_PROGRAMS.toString());
        jbProgram.addActionListener(controller);

        jbSchedule.setActionCommand(Actions.SHOW_SCHEDULE.toString());
        jbSchedule.addActionListener(controller);

        jbSearch.setActionCommand(Actions.SEARCH.toString());
        jbSearch.addActionListener(controller);

        jbStudents.setActionCommand(Actions.SHOW_STUDENTS.toString());
        jbStudents.addActionListener(controller);
    }

    public String getSearchValue() {
        String aux = tfSearch.getText();
        tfSearch.setText("");
        return aux;
    }

    /**
     * Remueve todos los datos de la tabla actual, cambia el modelo, lo asigna
     * de nuevo a la misma tabla y luego muestra los datos correspondientes
     *
     * @param headerColumns
     * @param resultList
     */
    public void refreshTable(Object[] headerColumns, List<?> resultList) {
        model.getDataVector().removeAllElements();
        model.setColumnIdentifiers(headerColumns);
        for (Object object : resultList) {
            if (object instanceof Student) {
                model.addRow(((Student) object).getValuesForTable());
            } else if (object instanceof Program) {
                model.addRow(((Program) object).getValuesForTable());
            } else if (object instanceof Schedule) {
                model.addRow(((Schedule) object).getValuesForTable());
            } else if (object instanceof City) {
                model.addRow(((City) object).getValuesForTable());
            }
        }
    }

    /**
     * Actualiza la tabla con la Query
     *
     * @param resultList
     */
    public void refreshTable(List<?> resultList) {
        model.getDataVector().removeAllElements();
        for (Object object : resultList) {
            if (object instanceof Student) {
                model.addRow(((Student) object).getValuesForTable());
            } else if (object instanceof Program) {
                model.addRow(((Program) object).getValuesForTable());
            } else if (object instanceof Schedule) {
                model.addRow(((Schedule) object).getValuesForTable());
            } else if (object instanceof City) {
                model.addRow(((City) object).getValuesForTable());
            }
        }
    }

    public void setLabelCurrent(String content) {
        lbCurrent.setText(content);
    }

    //dialogs Utiles para creaciones o modificaciones____________________________
    public String createNewProgram() {
        return JOptionPane.showInputDialog(this, "Please type the name of the new program", "Create new Program", JOptionPane.QUESTION_MESSAGE);
    }

    public String[] createNewSchedule() {
        return JOptionPane.showInputDialog(this, "Please type day of the week, the hour of start, and the hour of end, separated by 'comas'", "Create new Program", JOptionPane.QUESTION_MESSAGE).split(",");
    }

    public Program getSelectedProgram(List<Program> items) {
        return (Program) (JOptionPane.showInputDialog(this, "Please select the program", "Select Program", JOptionPane.QUESTION_MESSAGE, null, items.toArray(), items.get(0)));
    }

    public String createNewCity() {
        return JOptionPane.showInputDialog(this, "Please type the name of the new city", "Create new city", JOptionPane.QUESTION_MESSAGE);
    }
    
    public void showErrorMessage(String errorMessage) {
         JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void setModel(DefaultTableModel model) {
        this.model = model;
    }

    public long getIdOfSelectedItem() {
        return (long) jTable1.getValueAt(jTable1.getSelectedRow(),0 );
    }
}