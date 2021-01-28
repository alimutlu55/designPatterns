package mementoDesignPattern;

public class Editor {
    String content;

    public Editor() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public EditorState createState (){
        return new EditorState(this.content);
    }

    public void restoreEditor (EditorState editorState){
        this.content = editorState.content;
    }

}
