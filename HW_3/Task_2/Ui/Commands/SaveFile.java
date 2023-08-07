package HW_Exceptions.HW_3.Task_2.Ui.Commands;

import HW_Exceptions.HW_3.Task_2.Ui.View;

public class SaveFile implements Commands {

    private View view;

    public SaveFile(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.save();
    }

    @Override
    public String description() {

        return "Сохранить файл";
    }
}
