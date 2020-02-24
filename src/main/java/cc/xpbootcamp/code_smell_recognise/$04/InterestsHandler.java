package cc.xpbootcamp.code_smell_recognise.$04;

public class InterestsHandler {
    public void calculateInterests(Account account) {
        double interests = account.getBalance() * 0.003;
        account.credit(interests);
        if (interests > 300) {
            new MsgSender().sendChangeNotification(account);
        }
    }
}
