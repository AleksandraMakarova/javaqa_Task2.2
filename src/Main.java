public class Main {

    public static void main(String[] args) {

        int account = 100;
        int recharge = 1100;

        int bonus;
        if (recharge < 1000) {
            bonus = 0;
        } else {
            bonus = recharge / 100;
        }

        int totalAccount = account + recharge + bonus;

        System.out.println(totalAccount);

    }
}
