package github.snkienholz;

public class VehicleFrame implements Chassis {

  String vehicleFrameType;

  public VehicleFrame() {
    vehicleFrameType = "Unibody";
  }

  public VehicleFrame(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  @Override
  public Chassis getChassisType() {
    return new VehicleFrame();
  }

  @Override
  public void setChassisType(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  public String toString() {
    return "Chassis : Chassis "
        + "\nVehicle Frame : " + vehicleFrameType;
  }

  public static void main(String[] args) {

    VehicleFrame frame1 = new VehicleFrame();
    VehicleFrame frame2 = new VehicleFrame("Ladder Frame");

    System.out.println(frame1);
    System.out.println();
    System.out.println(frame2);
  }
}
