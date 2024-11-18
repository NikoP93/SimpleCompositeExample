package eksempel2;

import java.util.ArrayList;
import java.util.List;

//Composite klasse, har børn i en liste
public class Box implements Order{

    private List<Order> itemlst = new ArrayList<Order>();

    public void addItem(Order item) {
        itemlst.add(item);
    }

    public void removeItem(Order item) {
        itemlst.remove(item);
    }

    @Override
    public double getPrice(){
        double totalPrice = 0;
        for (Order item : itemlst) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public String toString(){
        return "box containing: " + itemlst;
    }
}
