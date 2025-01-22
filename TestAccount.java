public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new Account(1122, 20000);

        System.out.println(acc1.toString());
        acc1.withdraws(2500);
        System.out.println(acc1.toString());
        acc1.deposit(3000);
        System.out.println(acc1.toString());

    }
}
