package HW_Exceptions.HW_3.Task_2.Ui.Commands;

import HW_Exceptions.HW_3.Task_2.Ui.View;

public class Start implements Commands {

    private View view;

    public Start(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.start();
    }

    @Override
    public String description() {
        return "Старт";
    }
}
