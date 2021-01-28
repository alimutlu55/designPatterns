package mementoDesignPattern;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        HistoryState historyState = new HistoryState();

        editor.setContent("Selam Ali.");
        historyState.push(editor.createState());

        editor.setContent("Selam Ahmet.");
        historyState.push(editor.createState());

        editor.setContent("Selam Mehmet.");
        editor.restoreEditor(historyState.pop());
        editor.restoreEditor(historyState.pop());


        System.out.println(editor.getContent());
    }
}
