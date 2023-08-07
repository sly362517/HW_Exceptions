package HW_Exceptions.HW_3.Task_1;

public class PasswordLengthException extends Exception{
    public PasswordLengthException(String message) {
        super(message);
    }
}
