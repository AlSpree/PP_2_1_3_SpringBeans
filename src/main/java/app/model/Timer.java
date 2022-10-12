package app.model;

import org.springframework.stereotype.Component;

@Component
public class Timer {

    private Long nanoTime = System.nanoTime();

    public Timer() {
        System.out.println("Timer -> bean is created");
    }

    public Long getTime() {
        return nanoTime;
    }
}
