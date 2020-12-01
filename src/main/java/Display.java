import javax.swing.*;
import java.awt.*;

public class Display extends JFrame {
    private Canvas canvas;

    public Display(int width, int height){
        setTitle("Lifetimes V.0.1");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        canvas = new Canvas();
        canvas.setSize(new Dimension(width,height));
        canvas.setFocusable(false);


    }
}
