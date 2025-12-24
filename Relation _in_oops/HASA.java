public class HASA {
    public static void main(String[] args) {

        Engine engine = new Engine(1234.67, "Diesel");
        Chopper ch = new Chopper(3456.57, "military", engine);

        System.out.println(ch.getType()+ch.getWeight()+ch.getEngine());
    }
}

class Chopper {
    double weight;
    String type;

    Engine engine;

    public Chopper(double weight, String type, Engine engine) {
        this.weight = weight;
        this.type = type;
        this.engine = engine;
    }

    public double getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    public Engine getEngine() {
        return engine;
    }

    

}

class Engine {
    double engine_weight;
    String engine_type;

    public Engine(double engine_weight, String engine_type) {
        this.engine_weight = engine_weight;
        this.engine_type = engine_type;
    }

    public String toString() {
        return this.engine_type + " " + this.engine_weight;
    }
}
