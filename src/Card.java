public class Card {
    private final String nameOwner;
    private final String number;
    private double current;

    public String getNameOwner() {
        return nameOwner;
    }

    public String getNumber() {
        return number;
    }

    public double getCurrent() {
        return current;
    }

    public void setCurrent(double current) {
        this.current = current;
    }

    public Card(String nameOwner, String number, double current) {
        this.nameOwner = nameOwner;
        this.number = number;
        if (current >= 0)
          this.current = current;
        else {
            Dialog.inputPane("Нулевой баланс");
            this.current = 0;
        }
    }
    public void put (){
       double amount = Dialog.checkID("Сумма пополнения");
       setCurrent(getCurrent() + amount);
    }
    public void take(){
        double amount = Dialog.checkID("Сумма снятия");
        if ((getCurrent() - amount) < 0) {
            Dialog.messagePane ("Запрошенная сумма превышает баланс");
            return;
        }
        System.out.println(getCurrent()-amount + " " + amount);
        setCurrent(getCurrent() - amount);
    }

}
