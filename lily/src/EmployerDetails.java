/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lailyyana
 */
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EmployerDetails implements ActionListener {

    JLabel lblFName, lblLName, lblAddress, lblSalary,
            lblFName_, lblLName_, lblAddress_, lblSalary_,
            lblFN_, lblLN_, lblADD_, lblSAL_;

    JTextField txtFName, txtLName, txtAddress, txtSalary; //textbox for user

    JButton btnInsert, btnUpdate, btnDelete, btnClear, //control button

            btnPrevious, btnNext;// navigation button

    ResultSet rs;

    public static void main(String[] args) {

        EmployerDetails obj = new EmployerDetails();

        obj.EmployerDetails();

    }

    private void EmployerDetails() {

        JFrame frame = new JFrame("JDBC All in One");

        //PANEL INPUT
        JPanel panelInput = new JPanel(new GridLayout(4, 2));

        lblFName = new JLabel("First Name : ");
        txtFName = new JTextField(15);
        lblLName = new JLabel("Last Name : ");
        txtLName = new JTextField();
        lblAddress = new JLabel("Address : ");
        txtAddress = new JTextField();
        lblSalary = new JLabel("Salary : ");
        txtSalary = new JTextField();

        //add label and textbox
        panelInput.add(lblFName);
        panelInput.add(txtFName);
        panelInput.add(lblLName);
        panelInput.add(txtLName);
        panelInput.add(lblAddress);
        panelInput.add(txtAddress);
        panelInput.add(lblSalary);
        panelInput.add(txtSalary);

        //PANEL BUTTON
        JPanel panelButton = new JPanel(new GridLayout(1, 4));

        btnInsert = new JButton("Insert");
        btnInsert.addActionListener(this);
        btnUpdate = new JButton("Update");
        btnUpdate.addActionListener(this);
        btnDelete = new JButton("Delete");
        btnDelete.addActionListener(this);
        btnClear = new JButton("Clear");
        btnClear.addActionListener(this);

        //add label and textbox to panel
        panelButton.add(btnInsert);
        panelButton.add(btnUpdate);
        panelButton.add(btnDelete);
        panelButton.add(btnClear);

        //PANEL OUTPUT
        JPanel panelOutput = new JPanel(new GridLayout(4, 2));

        lblFName_ = new JLabel("First Name : ");
        lblFN_ = new JLabel();
        lblLName_ = new JLabel("Last Name : ");
        lblLN_ = new JLabel();
        lblAddress_ = new JLabel("Address : ");
        lblADD_ = new JLabel();
        lblSalary_ = new JLabel("Salary : ");
        lblSAL_ = new JLabel();

        //add label to panel
        panelOutput.add(lblFName_);
        panelOutput.add(lblFN_);
        panelOutput.add(lblLName_);
        panelOutput.add(lblLN_);
        panelOutput.add(lblAddress_);
        panelOutput.add(lblADD_);
        panelOutput.add(lblSalary_);
        panelOutput.add(lblSAL_);

        //PANEL NAVIGATION
        JPanel panelNavigation = new JPanel(new GridLayout(1, 2));
        btnPrevious = new JButton(" << ");
        btnPrevious.setActionCommand("Previous");
        btnPrevious.addActionListener(this);
        btnNext = new JButton(" >> ");
        btnNext.setActionCommand("Next");
        btnNext.addActionListener(this);

        //add button to panel
        panelNavigation.add(btnPrevious);
        panelNavigation.add(btnNext);

        Container cont = frame.getContentPane();

        cont.setLayout(new BoxLayout(cont, BoxLayout.Y_AXIS));

        frame.add(panelInput);
        frame.add(panelButton);
        frame.add(panelOutput);
        frame.add(panelNavigation);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    @Override

    public void actionPerformed(ActionEvent evt) {

        String action = evt.getActionCommand();

        if (action.equals("Insert")) {

            InsertOperation();

        } else if (action.equals("Update")) {

            updateOperation();

        } else if (action.equals("Delete")) {

            deleteOperation();

        } else if (action.equals("Clear")) {

            ClearOperation();

        } else if (action.equals("Previous")) {

            preNavigation();

        } else if (action.equals("Next")) {

            nextNavigation();

        }

    }

    private void InsertOperation() {

        try {

            //Load Jdbc Odbc Driver
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

            String sql = "INSERT INTO employerinfo (FirstName,LastName,Address,Salary) "
                    + "Values ('" + txtFName.getText() + "',"
                    + "'" + txtLName.getText() + "',"
                    + "'" + txtAddress.getText() + "',"
                    + "'" + txtSalary.getText() + "')";

            Statement st = con.createStatement();

            st.execute(sql);

            JOptionPane.showMessageDialog(null, "Record Insert Succesfully.", "Record Insert",
                    JOptionPane.INFORMATION_MESSAGE);

            clearControls();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateOperation() {

        try {

            //Load Jdbc Odbc Driver
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

            String sql = "Update employerinfo "
                    + "SET LastName = '" + txtLName.getText() + "',"
                    + "Address = '" + txtAddress.getText() + "',"
                    + "Salary = '" + txtSalary.getText() + "'"
                    + "Where FirstName = '" + txtFName.getText() + "'";

            JOptionPane.showMessageDialog(null, sql, "Record Updated",
                    JOptionPane.INFORMATION_MESSAGE);

            Statement st = con.createStatement();
            st.execute(sql);

            JOptionPane.showMessageDialog(null, "Record Update Succesfully.",
                    "Record Updated", JOptionPane.INFORMATION_MESSAGE);

            clearControls();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);

        }

    }

    private void deleteOperation() {

        int ans = JOptionPane.showConfirmDialog(null,
                "Delete permenantly?", "Record deleted",
                JOptionPane.YES_NO_OPTION);

        if (ans == JOptionPane.YES_OPTION) {

            try {

                //Load Jdbc Odbc Driver
                Class.forName("com.mysql.jdbc.Driver");

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

                String sql = "Delete FROM employerinfo where FirstName = '" + txtFName.getText() + "'";

                Statement st = con.createStatement();

                st.execute(sql);

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, e.getMessage(), "Error",
                        JOptionPane.ERROR_MESSAGE);

            }

            JOptionPane.showMessageDialog(null, "Record Deleted", "Successul",
                    JOptionPane.INFORMATION_MESSAGE);

        } else {

            JOptionPane.showMessageDialog(null, "Operation Canceled", "Cancel",
                    JOptionPane.INFORMATION_MESSAGE);

        }

    }

    private void ClearOperation() {
        
        txtFName.setText("");
        txtLName.setText("");
        txtAddress.setText("");
        txtSalary.setText("");
        lblFN_.setText("");
        lblLN_.setText("");
        lblADD_.setText("");
        lblSAL_.setText("");

    }

    private void preNavigation() {

        try {

            if (rs == null) {

                //Load Jdbc Odbc Driver
                Class.forName("com.mysql.jdbc.Driver");

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

                String sql = "SELECT * FROM employerinfo";

                Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                        ResultSet.CONCUR_UPDATABLE);

                rs = st.executeQuery(sql);

            }

            if (rs.previous()) {

                populateValue();

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);

        }

    }

    private void nextNavigation() {

        try {

            if (rs == null) {

                //Load Jdbc Odbc Driver
                Class.forName("com.mysql.jdbc.Driver");

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

                String sql = "SELECT * FROM employerinfo";

                Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                        ResultSet.CONCUR_UPDATABLE);

                rs = st.executeQuery(sql);

            }

            if (rs.next()) {

                populateValue();

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);

        }

    }

    private void populateValue() throws Exception {

        String fName = rs.getString("FirstName");
        String lName = rs.getString("LastName");
        String add = rs.getString("Address");
        String sal = rs.getString("Salary");

        lblFN_.setText(fName);
        lblLN_.setText(lName);
        lblADD_.setText(add);
        lblSAL_.setText(sal);
        txtFName.setText(fName);
        txtLName.setText(lName);
        txtAddress.setText(add);
        txtSalary.setText(sal);
    }

    private void clearControls() {
        txtFName.setText(" ");
        txtLName.setText(" ");
        txtAddress.setText(" ");
        txtSalary.setText(" ");
    }

    private void dataComboBox() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "root", "");
            Statement stat = con.createStatement();
            String sql = "SELECT * FROM employerinfo";
            ResultSet res = stat.executeQuery(sql);
            while (res.next()) {
                Object[] ob = new Object[3];
                ob[0] = res.getString(1);
                //jComboBox5.addItem(ob[0]);                                     
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void showCBdata() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "root", "");
            Statement stat = con.createStatement();
            String sql = "SELECT * FROM employerinfo";
            ResultSet res = stat.executeQuery(sql);

            while (res.next()) {
                Object[] ob = new Object[3];
                ob[0] = res.getString(1);
                //txtFName.setText((String) ob[0]);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
