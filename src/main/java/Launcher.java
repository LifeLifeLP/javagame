public class Launcher {
    public static void main(String[] args) {
        new Thread(new GameLoop(new Game(800,600))).start();

    }


    static String printJV() {
        System.out.println("Java " + System.getProperty("java.version") +" from " + System.getProperty("java.vendor"));
        return "Java " + System.getProperty("java.version") +" from " + System.getProperty("java.vendor");
    }

}
