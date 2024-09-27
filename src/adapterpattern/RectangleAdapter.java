package adapterpattern;
// Adapter Class
public class RectangleAdapter implements Square {
    private Rectangle rectangle;

    public RectangleAdapter(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public void draw() {
        rectangle.drawRectangle();
    }
}