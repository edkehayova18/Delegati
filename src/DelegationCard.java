public class DelegationCard {


    private int delegateNumber;
    private String dateOfArrival;
    private String dateOfLeaving;

    public DelegationCard(){
        this.delegateNumber = 2344;
        this.dateOfArrival = "10.03.23";
        this.dateOfLeaving = "16.03.23";
    }

    public DelegationCard(int delegateNumber, String dateOfArrival, String dateOfLeaving) {
        this.delegateNumber = delegateNumber;
        this.dateOfArrival = dateOfArrival;
        this.dateOfLeaving = dateOfLeaving;
    }

    public int getDelegateNumber() {
        return delegateNumber;
    }

    public void setDelegateNumber(int delegateNumber) {
        this.delegateNumber = delegateNumber;
    }

    public String getDateOfArrival() {
        return dateOfArrival;
    }

    public void setDateOfArrival(String dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    public String getDateOfLeaving() {
        return dateOfLeaving;
    }

    public void setDateOfLeaving(String dateOfLeaving) {
        this.dateOfLeaving = dateOfLeaving;
    }

    @Override
    public String toString() {
        return "DelegationCard{" +
                "delegateNumber=" + delegateNumber +
                ", dateOfArrival='" + dateOfArrival + '\'' +
                ", dateOfLeaving='" + dateOfLeaving + '\'' +
                '}';
    }
}
