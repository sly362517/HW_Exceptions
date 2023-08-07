// Задача 2: Файловый менеджер (ООП, исключения)
// 
// Создайте класс FileManager. Этот класс должен иметь методы для выполнения основных операций с файлами: чтение, запись и копирование. 
// Каждый из этих методов должен выбрасывать соответствующее исключение, если в процессе выполнения операции произошла ошибка (например, FileNotFoundException, если файл не найден).

package HW_Exceptions.HW_3.Task_2;

import HW_Exceptions.HW_3.Task_2.FileHandler.FileHandler;
import HW_Exceptions.HW_3.Task_2.Notebook.Notebook;
import HW_Exceptions.HW_3.Task_2.Presenter.Presenter;
import HW_Exceptions.HW_3.Task_2.Service.Service;
import HW_Exceptions.HW_3.Task_2.Ui.Console;
import HW_Exceptions.HW_3.Task_2.Ui.View;

public class Program {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        View view = new Console();
        Service service = new Service(notebook, new FileHandler());
        Presenter presenter = new Presenter(view, service);
        view.start();
    }
}
