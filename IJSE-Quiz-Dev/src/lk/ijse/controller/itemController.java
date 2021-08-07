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

public class itemController {
    @FXML
    private TextField itemid;

    @FXML
    private TextField itemName;

    @FXML
    private TextField itemQuantity;

    @FXML
    private TextField itemPrice;

    @FXML
    private Button itemSaveId;

    @FXML
    void itemSaveBtn(ActionEvent event) {
        String id = itemid.getText().toString();
        String name = itemName.getText().toString();
        String address = itemQuantity.getText().toString();
        int contact = Integer.parseInt(itemPrice.getText());


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
