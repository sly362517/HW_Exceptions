package HW_Exceptions.HW_3.Task_2.Ui.Commands;

import HW_Exceptions.HW_3.Task_2.Ui.View;

public class AddRecords implements Commands {

    private View view;

    public AddRecords(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.addRecords();
    }

    @Override
    public String description() {
        return "Добавить новую запись";
    }
}
