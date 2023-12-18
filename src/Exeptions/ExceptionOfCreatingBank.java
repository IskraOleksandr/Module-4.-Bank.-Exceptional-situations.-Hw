package Exeptions;

import Classes.Bank;
public class ExceptionOfCreatingBank extends RuntimeException{
   private final Bank bank;
   public ExceptionOfCreatingBank(Bank bank){
       this.bank=bank;
   }
    @Override
    public String getMessage() {
        return "Банк не был создан \nколичество АТМ не вмещает заданную сумму денег" +
                "\nДобавьте больше банкоматов или уменьшите сумму";
    }

    public Bank getBank() {
        return bank;
    }
}
