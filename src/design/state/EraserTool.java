package design.state;

public class EraserTool implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("Erase the field");
    }

    @Override
    public void mouseDown() {
        System.out.println("Stop erasing");
    }
}
