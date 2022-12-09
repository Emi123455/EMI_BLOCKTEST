
import model.Items;
import model.Orders;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        //listing out the items avialabel
        Items i1=new Items("I1","1001","b9",1200);
        Items i2=new Items("I2","1002","b8",1300);
        Items i3=new Items("I3","1003","b9",1500);
        Items i4=new Items("I4","1004","b8",1400);
        Items i5=new Items("I5","1005","b9",1500);

        //creating an arraylist to store the items ordered by the user.
        ArrayList<Items> items_u1=new ArrayList<>();

        items_u1.add(i1);
        items_u1.add(i2);

        //creating an arraylist to store the items ordered by the second user.

        ArrayList<Items> items_u2=new ArrayList<>();
        items_u2.add(i3);
        items_u2.add(i4);

        //creating an arraylist to store the number of orders of an user.
        ArrayList<Orders> orders_u1=new ArrayList<>();
        Orders u1_o1=new Orders("u1",items_u1);
        Orders u1_o2=new Orders("u1",items_u1);

        orders_u1.add(u1_o1);
        orders_u1.add(u1_o2);

        //creating an arraylist to store the number of orders of second user.
        ArrayList<Orders> orders_u2=new ArrayList<>();
        Orders u2_o1=new Orders("u2",items_u2);
        Orders u2_o2=new Orders("u2",items_u2);

        orders_u1.add(u2_o1);
        orders_u1.add(u2_o2);

        i1.display();

    }
}