package raf.dom.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import raf.dom.demo.fruits.Fruit;

import java.util.ArrayList;
import java.util.List;


@Service
public class FruitServices {

    @Autowired
    private FruitRepository fruitRepository;


    // get all
    public List<Fruit> getFruits() {
        List<Fruit> fruit = new ArrayList<>();
        fruitRepository.findAll().forEach(fruit::add);
        return fruit;
    }

    // get single
    public Fruit getFruitByName(String name){
        return fruitRepository.findOne(name);
        
    }

    // save
    public void addFruit(Fruit fruit) {
        fruitRepository.save(fruit);
    }

    // update/save
    public void updateFruit(Fruit fruit, String name) {
        fruitRepository.save(fruit);
    }

    //delete
    public void deleteFruit(String name) {
        fruitRepository.delete(name);
    }
}
