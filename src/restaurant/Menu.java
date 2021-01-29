package restaurant;

import java.lang.reflect.Array;
import java.util.Date;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;
    private HashMap<String, ArrayList<MenuItem>> categoryToItemsMap = new HashMap<>();

    public Menu(ArrayList<MenuItem> items){
        setItems(items);
    }

    public Menu(Date d, ArrayList<MenuItem> items) {
        setItems(items);
        this.lastUpdated = d;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
        this.lastUpdated = new Date();
    }

    public Date getLastUpdated() {
        return this.lastUpdated;
    }

    public String getMenuString() {
        String str = "";
        for(MenuItem item : this.items){
            str += item.getCategory() + " (" + item.getPrice() + ")" + "-" + item.getDescription();
        }
        return str;
    }

    public String printMenu() {
        String str = "APPETIZERS: ";
        for(MenuItem item : this.items){
            if(item.getCategory() = "Appetizer"){
                str += item.getCategory() + " (" + item.getPrice() + ")" + "-" + item.getDescription();
            }
        }
        return str;
    }
}

