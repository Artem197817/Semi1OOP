public class CreditCard extends Card{

    public CreditCard(String nameOwner, String number, double current) {
        super(nameOwner, number, current);
    }
    @Override
    public void take(){
        double amount = Dialog.checkID("Сумма снятия");
        if ((getCurrent() - amount) < 0) {
            Dialog.inputPane("Запрошенная сумма превышает баланс");
            return;
        }
        setCurrent(getCurrent() - ((double) Math.round((amount + (amount * 0.01)) * 100) /100));
    }

}

