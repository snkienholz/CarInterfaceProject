package github.snkienholz;

public class VehicleChassis implements Chassis {

  String chassisName;

  public VehicleChassis() {
    chassisName = CHASSIS;
  }

  public VehicleChassis(String chassisName) {
    this.chassisName = chassisName;
  }

  @Override
  public Chassis getChassisType() {
    return new VehicleChassis();
  }

  @Override
  public void setChassisType(String vehicleChassis) {
    this.chassisName = vehicleChassis;
  }

  public String toString() {
    return "Chassis Name: " + chassisName;
  }

  public static void main(String[] args) {

    // Create new chassis
    VehicleChassis defaultChassis = new VehicleChassis();
    VehicleChassis definedChassis = new VehicleChassis("Something");

    System.out.println(defaultChassis);
    System.out.println();
    System.out.println(definedChassis);
  }
}
