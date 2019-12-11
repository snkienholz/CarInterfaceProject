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

    VehicleChassis vehicle1 = new VehicleChassis();
    VehicleChassis vehicle2 = new VehicleChassis("Something");
  }
}
