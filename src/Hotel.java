public class Hotel {

  private String hotelName;
  private int roomNumber;
  private double pricePerNight;


  public Hotel (){
    this.hotelName = "Himalaya";
    this.roomNumber = 204;
    this.pricePerNight = 50.0;
  }

  public Hotel(String hotelName, int roomNumber, double pricePerNight) {
    this.hotelName = hotelName;
    this.roomNumber = roomNumber;
    this.pricePerNight = pricePerNight;
  }

  public String getHotelName() {
    return hotelName;
  }

  public void setHotelName(String hotelName) {
    this.hotelName = hotelName;
  }

  public int getRoomNumber() {
    return roomNumber;
  }

  public void setRoomNumber(int roomNumber) {
    this.roomNumber = roomNumber;
  }

  public double getPricePerNight() {
    return pricePerNight;
  }

  public void setPricePerNight(double pricePerNight) {
    this.pricePerNight = pricePerNight;
  }


  @Override
  public String toString() {
    return "Hotel{" +
            "hotelName='" + hotelName + '\'' +
            ", roomNumber=" + roomNumber +
            ", pricePerNight=" + pricePerNight +
            '}';
  }
}
