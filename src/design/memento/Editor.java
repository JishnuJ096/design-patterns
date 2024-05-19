package design.memento;

public class Editor {
    private String content;

    public EditorState createEditorState(){
        return new EditorState(content);
    }

    public void restore(EditorState state){
        content = state.content();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
