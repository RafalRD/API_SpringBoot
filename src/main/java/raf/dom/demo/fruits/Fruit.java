package raf.dom.demo.fruits;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fruit {

    @Id
    private String name;
    private float price;



    public Fruit() {
    }

    public Fruit(String name, float price) {
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
