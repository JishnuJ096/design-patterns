package design.state;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setToolType(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
