public class Bird {
    public void sound() {
        System.out.println("birds sounds");
    }

    public static void main(String[] args) {
        Bird pigeon = new Pigeon();
        pigeon.sound();

        Bird sparrow = new Sparrow();
        sparrow.sound();
    }
}

class Pigeon extends Bird {
    @Override
    public void sound() {
        System.out.println("cooing");
    }
}

class Sparrow extends Bird {
    @Override
    public void sound() {
        System.out.println("chip");
    }
}
