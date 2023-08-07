package HW_Exceptions.HW_3.Task_2.Ui.Commands;

import HW_Exceptions.HW_3.Task_2.Ui.View;

public class PrintFile implements Commands {
    private View view;

    public PrintFile(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.printFile();
    }

    @Override
    public String description() {
        return "Показать содержимое файла";
    }
}
