import java.util.ArrayList;
import java.util.List;

public class Game {
    private Display display;
    private List<GameObject> gameObjects;

    public Game(int widh, int hight){
        display = new Display(widh,hight);
        gameObjects = new ArrayList<>();
        gameObjects.add(new Square());

    }

    public void update() {
        gameObjects.forEach(gameObject -> gameObject.update());
    }

    public void render() {
        display.render(this);

    }

    public List<GameObject> getGameObjects() {
        return gameObjects;
    }
}
