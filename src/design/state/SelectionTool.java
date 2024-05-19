package design.state;

public class SelectionTool implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("Draw Rectangle");
    }

    @Override
    public void mouseDown() {
        System.out.println("Remove rectangle");
    }
}
