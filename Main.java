public class Main {

    public static void main(String[] args) {

        // TODO : create and use a TransactionListener interface with onComplete method

        Bank account = new Bank(1000);
        int value = 100;

        Transactions.withdraw(account, value, new TransactionListener() {
            @Override
            public void onComplete(Bank account) {
                System.out.printf("Your balance is: %d%n", account.getTotal());
            }
        });

    }
}
