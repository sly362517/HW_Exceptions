package HW_Exceptions.HW_3.Task_2.Note;

import java.io.Serializable;

public class Note implements Serializable {

    private String note;

    public Note(String note) {
        this.note = note;
    }

    public String getNote() {
        return note;
    }

    @Override
    public String toString() {
        return " " + note;
    }
}
