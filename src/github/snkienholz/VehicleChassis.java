package github.snkienholz;

import java.time.temporal.ValueRange;

public class VehicleChassis implements Chassis {

  String chassisName;

  public VehicleChassis() {
    chassisName = CHASSIS;
  }

  public VehicleChassis(String chassisName) {
    this.chassisName = chassisName;
  }

  @Override
  public String getChassisType() {
    return CHASSIS;
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
