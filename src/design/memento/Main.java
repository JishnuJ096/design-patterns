package design.memento;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Editor editor= new Editor();
        History history= new History();

        editor.setContent("A");
        history.push(editor.createEditorState());

        editor.setContent("B");
        history.push(editor.createEditorState());

        editor.setContent("C");
        editor.restore(history.pop());
        editor.restore(history.pop());
        System.out.println(editor.getContent());
    }
}