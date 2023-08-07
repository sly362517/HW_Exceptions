package HW_Exceptions.HW_3.Task_1;

public class PasswordCheck {
    
    private String password;

    public  PasswordCheck(){

    }

    public void passWordVerifier(String password) throws PasswordLengthException, PasswordNotContainNumber, PasswordNotContainCapitalLetter {
        if (password.length() < 8) {
            throw new PasswordLengthException("Пароль должен быть не менее 8 символов");
        }

        if (!checkNumber(password)) {
            throw new PasswordNotContainNumber("Пароль должен содержать хотя бы одну цифру");
        }

        if (!checkCapital(password)) {
            throw new PasswordNotContainCapitalLetter("Пароль должен содержать хотя бы одну заглавную букву");
        }

        System.out.println("Проверка пройдена успешно");
    }

    public boolean checkNumber(String password) {
        for (int i = 0; i <= 9; i++) {


            String str = Integer.toString(i);

            if (password.contains(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkCapital(String password) {
        for (int i = 65; i <= 90; i++) {

            // type casting
            char c = (char) i;

            String str1 = Character.toString(c);
            if (password.contains(str1)) {
                return true;
            }

        }
        return false;
    }
}
