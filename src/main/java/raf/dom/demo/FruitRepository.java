package raf.dom.demo;


import org.springframework.data.repository.CrudRepository;
import raf.dom.demo.fruits.Fruit;

public interface FruitRepository extends CrudRepository<Fruit,String>{
// we extend all methods to our interface ;)
}
