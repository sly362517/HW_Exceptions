package HW_Exceptions.HW_3.Task_2.Ui;

import HW_Exceptions.HW_3.Task_2.Presenter.Presenter;


import java.util.Scanner;

public class Console implements View {

    private Presenter presenter;
    private Scanner scanner;
    private boolean work = true;
    private Menu menu;

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    public Console() {
        scanner = new Scanner(System.in);
        menu = new Menu(this);
    }

    @Override
    public void start() {
        boolean work1 = true;
        while (work1) {
            try {
                while (work) {
                    System.out.println(menu.printMenu());
                    System.out.println();
                    System.out.println("Введите цифру ");
                    int number = Integer.parseInt(scanner.nextLine());
                    menu.execute(number);
                }
            } catch (NumberFormatException e) {
                System.out.println("'Нужно вводить цифру от 1 до 6'");
            } catch (IndexOutOfBoundsException exception) {
                System.out.println("'Нужно вводить цифру от 1 до 6'");
            }
        }
    }


    @Override
    public void addRecords() {
        System.out.println("Введите запись");
        String note = scanner.nextLine();
        presenter.addNode(note);
    }

    @Override
    public void save() {
        presenter.saveFile();

    }

    @Override
    public void read() {
        presenter.readFile();

    }

    @Override
    public void copy() {
        presenter.copy();

    }

    @Override
    public void exit() {
        System.out.println("Работа завершена");
        scanner.close();
        work = false;

    }

    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }


    @Override
    public void printFile() {
        presenter.getRecords();
    }
}
