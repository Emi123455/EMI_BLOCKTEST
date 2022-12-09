package model;
import java.util.ArrayList;

public class Users {
    String user_name;
    ArrayList <Orders> orders;

    public Users(String user_name, ArrayList<Orders> orders) {
        this.user_name = user_name;
        this.orders = orders;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public ArrayList<Orders> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Orders> orders) {
        this.orders = orders;
    }
}