public class Wallet {
    float money;

    Wallet(){
        this.money = 300;
    }

    Wallet(float amount) {
        this.money = amount;
    }

    void addMoney(float amount) {
        this.money += amount;
    }

    void removeMoney(float amount) {
        this.money -=amount;
    }

    void printAmount() {
        System.out.println("Wartosc portfela:" + this.money);
    }
}
