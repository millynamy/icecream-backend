package com.project.IceCream.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.HashMap;

@Entity
@Component
public class Pricing {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    HashMap<Topping, Double> toppingPricing;
    HashMap<Flavor, Double> flavorPricing;
    HashMap<Container, Double> containerPricing;
   double totalPrice;

    Pricing(){
       this.toppingPricing = new HashMap<>();
       this.flavorPricing = new HashMap<>();
       this.containerPricing = new HashMap<>();

       setToppingPricing();
       setFlavorPricing();
       setContainerPricing();
   }

   private void setToppingPricing(){
       toppingPricing.put(Topping.TWIX, 1.0);
       toppingPricing.put(Topping.CANDY, 1.2);
       toppingPricing.put(Topping.COOKIES, 0.8);
       toppingPricing.put(Topping.OREOS, 1.3);
       toppingPricing.put(Topping.SPRINKLES, 0.75);
   }

    public HashMap<Topping, Double> getToppingPricing(){
       return toppingPricing;
    }

    private void setFlavorPricing(){
       flavorPricing.put(Flavor.VANILLA,4.0);
       flavorPricing.put(Flavor.CARAMEL,4.5);
       flavorPricing.put(Flavor.MINT,4.0);
       flavorPricing.put(Flavor.CHOCOLATE,4.7);
       flavorPricing.put(Flavor.LEMON,4.0);
       flavorPricing.put(Flavor.COTTONCANDY,4.6);
       flavorPricing.put(Flavor.STRAWBERRY,4.5);

    }

    public HashMap<Flavor, Double> getFlavorPricing() {
        return flavorPricing;
    }

    public void setContainerPricing() {
        containerPricing.put(Container.BOWL,1.0);
        containerPricing.put(Container.PLATE,1.0);
        containerPricing.put(Container.FLATCONE,3.5);
        containerPricing.put(Container.SUGARCONE,3.0);
        containerPricing.put(Container.WAFFLECONE,4.0);
    }

    public HashMap<Container, Double> getContainerPricing() {
        return containerPricing;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
