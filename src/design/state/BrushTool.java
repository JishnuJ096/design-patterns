package design.state;

public class BrushTool implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("Draw what it draws");
    }

    @Override
    public void mouseDown() {
        System.out.println("Stop drawing");
    }
}
