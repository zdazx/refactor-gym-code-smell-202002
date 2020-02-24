package cc.xpbootcamp.code_smell_recognise.$04;

public class Transfer {
    public void transfer(Account from, Account to, float amount) {
        from.debit(amount);
        to.credit(amount);
        if (amount > 300) {
            sendTotification(from, to);
        }
    }

    private void sendTotification(Account from, Account to) {
        MsgSender msgSender = new MsgSender();
        msgSender.sendChangeNotification(from);
        msgSender.sendChangeNotification(to);
    }
}
