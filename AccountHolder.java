import java.util.Random;

public abstract class AccountHolder {
    protected int ID;
    protected String address;
    Random random = new Random();

    public AccountHolder(int ID, String address) {
        this.ID = ID;
        this.address = address;
    }

    public int getNextID() {
        return random.nextInt(1000001);

    }

}