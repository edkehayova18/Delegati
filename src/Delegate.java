public class Delegate {
    private String name;
    private String EGN;
    private String City;
    private double expences;

    public Delegate(){
        this.name = "Peter";
        this.EGN = "809555443";
        this.City = "Burgas";
        this.expences = 50.44;
    }

    public Delegate(String name, String EGN, String city, double expences) {
        this.name = name;
        this.EGN = EGN;
        City = city;
        this.expences = expences;
    }

    @Override
    public String toString() {
        return "Delegate{" +
                "name='" + name + '\'' +
                ", EGN='" + EGN + '\'' +
                ", City='" + City + '\'' +
                ", expences=" + expences +
                '}';
    }
}
