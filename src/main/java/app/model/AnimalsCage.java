package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dog")
    private Animal animal;

    @Autowired
    private Timer timerBean;

    public AnimalsCage() {
        System.out.println("AnimalsCage -> bean is created");
    }

    public Timer getTimer() {
        return timerBean;
    }

    public long getTime() {
        return getTimer().getTime();
    }


    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(getTime());
        System.out.println("________________________");
    }
}
