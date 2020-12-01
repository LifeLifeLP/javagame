import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

public class Display extends JFrame {
    private Canvas canvas;

    public Display(int width, int height){
        setTitle("Lifetimes V.0.1 running on: "+Launcher.printJV());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        canvas = new Canvas();
        canvas.setSize(new Dimension(width,height));
        canvas.setFocusable(false);
        add(canvas);
        pack();

        canvas.createBufferStrategy(2);



        setVisible(true);
        setLocationRelativeTo(null);
    }

    public void render(Game game){
        BufferStrategy bufferStrategy = canvas.getBufferStrategy();
        Graphics graphics = bufferStrategy.getDrawGraphics();

        graphics.setColor(Color.BLACK);
        graphics.fillRect(0,0,canvas.getWidth(),canvas.getHeight());

        Rectangle rectangle = game.getRectangle();
        graphics.setColor(Color.BLUE);
        graphics.fillRect(rectangle.x,rectangle.y,rectangle.width,rectangle.height);

        graphics.dispose();
        bufferStrategy.show();
    }
}
