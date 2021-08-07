/**
 * @author Lakal Ranuja <wadduwage.lakal@gmail.com>
 * @since 8/7/21
 */

package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import lk.ijse.dbConnection.dbConnection;
import lk.ijse.model.customer;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class customerController {
    @FXML
    private TextField cusId;

    @FXML
    private TextField cusName;

    @FXML
    private TextField cusAddress;

    @FXML
    private TextField cusTel;

    @FXML
    private Button cusBtn;

    @FXML
    void saveCus(ActionEvent event) {
        String id = cusId.getText().toString();
        String name = cusName.getText().toString();
        String address = cusAddress.getText().toString();
        int contact = Integer.parseInt(cusTel.getText());


        boolean b = addCustomer(new customer(id, name, address, contact));
        if (b) {
            JOptionPane.showMessageDialog(null, "Customer Added ");
        } else {
            JOptionPane.showMessageDialog(null, "Customer Added fail Now");
        }

    }


    private boolean addCustomer(customer customer) {
        boolean isCustomerAdded = false;
        try {
            Connection connection = dbConnection.getInstance().getConnection();
            String sql = "INSERT INTO customer VALUES(?,?,?,?)";

            PreparedStatement pstm = connection.prepareStatement(sql);
            pstm.setString(1, customer.getCusID());
            pstm.setString(2, customer.getCusName());
            pstm.setString(3, customer.getCusAddress());
            pstm.setInt(4, customer.getCusContact());

            isCustomerAdded = pstm.executeUpdate() > 0;
        } catch (SQLException ex) {

        }
        return isCustomerAdded;
    }
}
