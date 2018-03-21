package raf.dom.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import raf.dom.demo.FruitServices;
import raf.dom.demo.fruits.Fruit;

import java.util.List;

@RestController
public class FruitController {

    @Autowired
    private FruitServices fruitServices;

    // get all
    @RequestMapping("/fruit")
    public List<Fruit> getAllFruits(){
        return fruitServices.getFruits();
    }
    // get single
    @RequestMapping("/fruit/{name}")
    public Fruit getSingleFruit(@PathVariable String name){

        return fruitServices.getFruitByName(name);
    }
    //post
    @RequestMapping(method = RequestMethod.POST, value = "/fruit")
    public void addFruit (@RequestBody Fruit fruit){
        fruitServices.addFruit(fruit);
    }

    //update
    @RequestMapping(method = RequestMethod.PUT, value = "/fruit/{name}")
    public void updateFruit (@RequestBody Fruit fruit,@PathVariable String name){
        fruitServices.updateFruit(fruit,name);
    }

    // delete
    @RequestMapping(method = RequestMethod.DELETE, value ="fruit/{name}")
    public void deleteFruit (@PathVariable String name){
        fruitServices.deleteFruit(name);
    }





}
