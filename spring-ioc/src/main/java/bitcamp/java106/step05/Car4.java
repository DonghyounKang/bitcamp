package bitcamp.java106.step05;

import java.util.Properties;

public class Car4 {
    String model;
    String maker;
    int cc;
    Engine engine;
    Properties options;

    @Override
    public String toString() {
        return "Car4 [model=" + model + ", maker=" + maker + ", cc=" + cc + ", engine=" + engine + ", options="
                + options + "]";
    }

    public Properties getOptions() {
        return options;
    }

    public void setOptions(Properties options) {
        this.options = options;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }


}



