package github.snkienholz;

public class VehicleFrame implements Chassis {

  // instance variables
  private String vehicleFrameType;

  // CONSTRUCTORS
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
    return "Chassis : Chassis " + "\n"
        + "Vehicle Frame : " + vehicleFrameType;
  }

  public static void main(String[] args) {

    // Create new frames
    VehicleFrame defaultFrame = new VehicleFrame();
    VehicleFrame definedFrame = new VehicleFrame("Ladder Frame");

    // Display frames
    System.out.println(defaultFrame);
    System.out.println();
    System.out.println(definedFrame);
  }
}
