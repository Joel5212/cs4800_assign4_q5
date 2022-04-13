public class IndividualHolder extends AccountHolder implements Util {
    private String name;
    private String SSN;

    IndividualHolder(int ID, String address, String name, String SSN) {
        super(ID, address);
        this.name = name;
        this.SSN = SSN;

    }

    public String getName() {
        return name;
    }

    public String getSSN() {
        return SSN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    @Override
    public String convertNameUpperCase(String name) {
        // TODO Auto-generated method stub
        return name.toUpperCase();
    }

}