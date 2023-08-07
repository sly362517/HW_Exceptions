package HW_Exceptions.HW_3.Task_2.Ui.Commands;

import HW_Exceptions.HW_3.Task_2.Ui.View;

public class Exit implements Commands {

    private View view;

    public Exit(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.exit();

    }

    @Override
    public String description() {
        return "Выход";
    }
}
