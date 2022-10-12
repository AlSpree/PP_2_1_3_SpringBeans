package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal{

    public Dog() {
        System.out.println("Dog -> bean is created");
    }

    @Override
    public String toString() {
        return "Im a Dog";
    }
}
