package main;



import java.util.concurrent.ThreadLocalRandom;

public class Box {
    private Integer value;


    public Box() {
    }

    public Box(Integer value) {
        setValue(value);
    }

    public Box(boolean random) {
        int randomValue;
        if (random) setValue( randomValue = ThreadLocalRandom.current().nextInt(0, 100));
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}