public class Main {
    public static void main(String[] args) {

        Wallet wallet = new Wallet();

        for (int i = 0; i < 6; i++) {
            System.out.println("Miesiac " + (i + 1));
            wallet.addMoney(5000);
            wallet.removeMoney(2000);
            wallet.removeMoney(1000);
        }

        wallet.printAmount();
    }
}
