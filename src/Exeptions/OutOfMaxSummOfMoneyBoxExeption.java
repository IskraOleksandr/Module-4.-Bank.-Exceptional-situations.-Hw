package Exeptions;

public class OutOfMaxSummOfMoneyBoxExeption extends RuntimeException{
    @Override
    public String getMessage() {
        return "Превышена сумма максимальной вместимости";
    }

}
