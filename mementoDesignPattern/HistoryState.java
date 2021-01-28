package mementoDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class HistoryState {
    List<EditorState> editorStateList = new ArrayList<>();

    public void push(EditorState editorState){
        editorStateList.add(editorState);
    }

    public EditorState pop(){
        int lastIndex = editorStateList.size()-1;
        EditorState lastState = editorStateList.get(lastIndex);
        editorStateList.remove(lastState);
        return  lastState;
    }
}
