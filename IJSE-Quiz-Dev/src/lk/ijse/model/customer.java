/**
 * @author Lakal Ranuja <wadduwage.lakal@gmail.com>
 * @since 8/7/21
 * @version v1.0.0
 */

package lk.ijse.model;

public class customer {
    private String CusID;
    private String CusName;
    private String CusAddress;
    private int CusContact;

    public customer() {
    }

    public customer(String cusID, String cusName, String cusAddress, int cusContact) {
        CusID = cusID;
        CusName = cusName;
        CusAddress = cusAddress;
        CusContact = cusContact;
    }

    public String getCusID() {
        return CusID;
    }

    public void setCusID(String cusID) {
        CusID = cusID;
    }

    public String getCusName() {
        return CusName;
    }

    public void setCusName(String cusName) {
        CusName = cusName;
    }

    public String getCusAddress() {
        return CusAddress;
    }

    public void setCusAddress(String cusAddress) {
        CusAddress = cusAddress;
    }

    public int getCusContact() {
        return CusContact;
    }

    public void setCusContact(int cusContact) {
        CusContact = cusContact;
    }

    @Override
    public String toString() {
        return "customer{" +
                "CusID='" + CusID + '\'' +
                ", CusName='" + CusName + '\'' +
                ", CusAddress='" + CusAddress + '\'' +
                ", CusContact=" + CusContact +
                '}';
    }
}
