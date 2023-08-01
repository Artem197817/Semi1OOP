import java.time.LocalDateTime;

public class DepositCard extends Card{
    LocalDateTime lastDateTime = LocalDateTime.now();
    public DepositCard(String nameOwner, String number, double current) {
        super(nameOwner, number, current);
    }
    @Override
    public void take (){
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowMinusDay = now.minusDays(1);
        if (!nowMinusDay.isBefore(lastDateTime)) {
            super.take();
            lastDateTime = now;
            return;
       }
        Dialog.messagePane("Время прошедшее с последнего снятия менее 24 часов");

    }
}
