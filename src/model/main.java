
import model.Items;
import model.Orders;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        //listing out the items avialabel
        Items item1=new Items("I1","1001","b9",1200);
        Items item2=new Items("I2","1002","b8",1300);
        Items item3=new Items("I3","1003","b9",1500);
        Items item4=new Items("I4","1004","b8",1400);
        Items item5=new Items("I5","1005","b9",1500);

      
        ArrayList<Items> its_ur1=new ArrayList<>();

        items_ur1.add(i1);
        items_ur1.add(i2);

      

        ArrayList<Items> its_ur2=new ArrayList<>();
        its_ur2.add(i3);
        its_ur2.add(i4);

        ArrayList<Orders> orders_ur1=new ArrayList<>();
        Orders usr1_o1=new Orders("u1",items_u1);
        Orders usr1_o2=new Orders("u1",items_u1);

        orders_u1.add(usr1_o1);
        orders_u1.add(usr1_o2);

        
        ArrayList<Orders> orders_ur2=new ArrayList<>();
        Orders usr2_o1=new Orders("u2",items_u2);
        Orders usr2_o2=new Orders("u2",items_u2);

        orders_usr1.add(u2_o1);
        orders_usr1.add(u2_o2);

        i1.display();

    }
}
