package Classes;

import Exeptions.NotCorrectNominalException;
import Exeptions.OutOfMaxSummOfMoneyBoxExeption;
import Exeptions.OutOfMinSummOfMoneyBoxExeption;

public class Moneybox {
    private final int nominal;
    private int count;
    private final int maxCount=1000 ;

    //При создании объекта: nominal-номинал купюр,
    // count- количество купюр,
    // maxCount- максимальное количество вместимости купюр
    public Moneybox(int nominal,int count){
        if(nominal ==1 ||nominal ==2 ||nominal ==5 ||nominal ==10 ||nominal ==20 ||
                nominal ==50 ||nominal ==100 ||nominal ==200 ||nominal ==500){
            this.nominal=nominal;
        }else{
            throw new NotCorrectNominalException();
        }
        if(count <0 || count > maxCount){
            throw new OutOfMaxSummOfMoneyBoxExeption();
        }else{
            this.count = count;
        }
    }

    public int getCount() {
        return count;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public int getNominal() {
        return nominal;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
