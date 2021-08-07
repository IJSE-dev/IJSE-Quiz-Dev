/**
 * @author Lakal Ranuja <wadduwage.lakal@gmail.com>
 * @since 8/7/21
 */

package lk.ijse.model;

public class item {
    private String itemID;
    private String itemName;
    private String itemQuantity;
    private int itemPrice;

    public item() {
    }

    public item(String itemID, String itemName, String itemQuantity, int itemPrice) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(String itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "item{" +
                "itemID='" + itemID + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemQuantity='" + itemQuantity + '\'' +
                ", itemPrice=" + itemPrice +
                '}';
    }
}
