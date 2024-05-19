package design.state;

public class Canvas {
    private Tool toolType;

    public Tool getToolType() {
        return toolType;
    }

    public void setToolType(Tool toolType) {
        this.toolType = toolType;
    }

    public void mouseUp(){
        toolType.mouseUp();
    }

    public void mouseDown(){
        toolType.mouseDown();
    }

    /* public ToolType getToolType() {
        return toolType;
    }

    public void setToolType(ToolType toolType) {
        this.toolType = toolType;
    }*/
}
