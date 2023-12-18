package Exeptions;

public class OutOfMinSummOfMoneyBoxExeption  extends RuntimeException{
    @Override
    public String getMessage() {
        return "Недостаточно денег";
    }
}