//TO CHECK:AFTER CODE,ADD In POSTMAN RUN localhost/coffee/lattee(post->send) will get [lattee] in postman as well as in browser
package com.example.coffeeorder;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController//to create rest api's
@RequestMapping("/coffee")//base url
public class CoffeeController {
    private final CoffeeService service;
    public CoffeeController(CoffeeService service){
        this.service=service; //used to identify current variable
    }
    @PostMapping("/{type}/{name}")
    // cofee/capucchino/americano(these are the types so we pass this to add to list)
    public MODELCLASS orderCoffee(@PathVariable String type,@PathVariable String name){
        //call to service layer see CoffeeService
        return service.orderCoffee(type,name); //calling function in coffeeservice to add to list
    }

    @GetMapping
    public List<MODELCLASS>getOrders(){
        return service.getOrders();
        //this func returns order
    }

    }


