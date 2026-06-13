package com.example.coffeeorder;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service //logical layer (model->service->controller)
public class CoffeeService {
    int count=1;
    private List<MODELCLASS> orders=new ArrayList<>();//creating list
    //BUSINESS LOGIC:ADD A COFFEE ORDER
//    public String orderCoffee(String type){
//        orders.add(type); //adding orders and getting it from postmapping
//        //base requestmapping is coffee,from postmapping remaining cofee/capuchino{type},this we add
//        return "Order placed for: "+type;
//    }
    public MODELCLASS orderCoffee(String type, String name) {

        MODELCLASS coffee =
                new MODELCLASS(count, name, type); //cl to modelclass-see on modelclass

        orders.add(coffee);
        count++;

        return coffee;
    }
    //BUSINESS LOGIC:LIST ALL ORDERS
    public List<MODELCLASS> getOrders(){
        return orders; //to print order on browser
    }
}
