import java.awt.*;

public class Game {
    private Display display;
    private Rectangle rectangle;

    public Game(int widh, int hight){
        display = new Display(widh,hight);
        rectangle = new Rectangle(0,0,50,50);

    }

    public void update() {
        rectangle.setLocation(rectangle.x + 1,rectangle.y + 1);

    }

    public void render() {
        display.render(this);

    }

    public Rectangle getRectangle() {
        return rectangle;
    }
}
