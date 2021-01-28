package mementoDesignPattern;

public class EditorState {
    final String content;

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
