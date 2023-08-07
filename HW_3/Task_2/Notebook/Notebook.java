package HW_Exceptions.HW_3.Task_2.Notebook;

import HW_Exceptions.HW_3.Task_2.Note.Note;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Notebook implements Serializable {

    private List<Note> noteList;

    public Notebook(List<Note> noteList) {
        this.noteList = noteList;
    }

    public Notebook() {
        noteList = new ArrayList<>();
    }

    public void addNode(Note note) {
        noteList.add(note);
    }

    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < noteList.size(); i++) {
            stringBuilder.append(noteList.get(i));
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

}
