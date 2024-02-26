public class BonusService {
    public long calculate(long amount, boolean registered) {
        int percent = registered ? 3 : 1; // процент считается для зарегистрированного пользователя 3 процента, незарегистрированного 1 процент
        long bonus = amount * percent / 100;
        long limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
}