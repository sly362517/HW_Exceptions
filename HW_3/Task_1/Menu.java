//Задача 1: Проверка пароля (Основы языка Java, операторы, ветвления)

//     Создайте класс PasswordVerifier. Этот класс должен содержать метод, который принимает строку пароля и проверяет его на соответствие следующим правилам:

//      Пароль должен быть не менее 8 символов.
//      Пароль должен содержать хотя бы одну цифру.
//      Пароль должен содержать хотя бы одну заглавную букву.
//      Метод должен выбрасывать исключение, если пароль не соответствует какому-либо из этих правил.

package HW_Exceptions.HW_3.Task_1;

import HW_Exceptions.HW_2.Task3;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введитe пароль: ");
            String password = scanner.nextLine();
            PasswordCheck passwordCheck = new PasswordCheck();
            passwordCheck.passWordVerifier(password);
        }catch (PasswordLengthException lengthException){
            System.out.println(lengthException.getMessage());
        }catch (PasswordNotContainCapitalLetter containCapitalLetter){
            System.out.println(containCapitalLetter.getMessage());
        }catch (PasswordNotContainNumber passwordNotContainNumber){
            System.out.println(passwordNotContainNumber.getMessage());
        }
    }
}
