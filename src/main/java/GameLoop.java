public class GameLoop implements Runnable {
    private boolean running;
    private final double updateRate = 1.0d/60.0d;
    private long nextStateTime;
    private int fps, ups;

    private Game game;

    public GameLoop(Game game){
        this.game = game;
    }


    @Override
    public void run() {
        running = true;
        double accumulator = 0;
        long currentTime, lastUpdate = System.currentTimeMillis();
        nextStateTime = System.currentTimeMillis() + 1000;

        while (running){
            currentTime = System.currentTimeMillis();
            double lastRenderTimeinSeconds=(currentTime-lastUpdate) / 1000d;
            accumulator +=lastRenderTimeinSeconds;
            lastUpdate = currentTime;

            if(accumulator >= updateRate){
                while (accumulator >= updateRate){
                    update();
                    accumulator -= updateRate;
                }
                render();
            }
            printStats();
        }
    }

    private void printStats() {
        if(System.currentTimeMillis() > nextStateTime){
            System.out.println(String.format("FPS: %d, UPS: %d", fps,ups));
            fps = 0;
            ups = 0;
            nextStateTime = System.currentTimeMillis() + 1000;
        }
    }

    private void update() {
        game.update();
        ups++;
    }

    private void render() {
        game.render();
        fps++;
    }
}
