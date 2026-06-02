interface Playable {

    // Abstract method
    void play();
}

class Guitar implements Playable {

    @Override
    public void play() {
        System.out.println("Playing the Guitar");
    }
}

class Piano implements Playable {

    @Override
    public void play() {
        System.out.println("Playing the Piano");
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {

        // Create objects
        Guitar guitar = new Guitar();
        Piano piano = new Piano();

        // Call play() methods
        guitar.play();
        piano.play();
    }
}
