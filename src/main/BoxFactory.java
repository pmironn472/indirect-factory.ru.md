package main;

import java.lang.reflect.Constructor;

public class BoxFactory {
    public Object getBox(String className,Class argumentType,Object value) {
        Class classRef;
        try {
            classRef = Class.forName(className);
            Constructor constructor = classRef.getConstructor(argumentType);
            return constructor.newInstance(value);
        } catch (Exception ignored) {

        }
        return null;
    }
}