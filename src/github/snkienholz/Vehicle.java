package github.snkienholz;

import java.util.Date;

public class Vehicle implements Engine, Chassis {

  // instance variables
  private Date vehicleManufacturedDate;
  private String vehicleManufacturer;
  private String vehicleMake;
  private String vehicleModel;
  private Chassis vehicleFrame;
  private String vehicleType;
  private String driveTrain;
  private Engine vehicleEngine;

  /*** CONSTRUCTORS ***/
  public Vehicle() {
      this.vehicleManufacturedDate = new Date();
      this.vehicleManufacturer = "Generic";
      this.vehicleMake = "Generic";
      this.vehicleModel = "Generic";
      this.vehicleFrame = new VehicleFrame();
      this.vehicleType = "None";
      this.driveTrain = "2WD: Two-Wheel Drive";
      this.vehicleEngine = new ManufacturedEngine();
  }

  public Vehicle(String vehicleManufacturer, Date vehicleManufacturedDate, String vehicleMake,
      String vehicleModel, String vehicleType, String driveTrain, Chassis vehicleFrame,
      Engine vehicleEngine) {
    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.vehicleFrame = vehicleFrame;
    this.vehicleType = vehicleType;
    this.driveTrain = driveTrain;
    this.vehicleEngine = vehicleEngine;
  }

  @Override
  public Chassis getChassisType() {
    return this.vehicleFrame;
  }

  @Override
  public void setChassisType(String vehicleChassis) {
    this.vehicleFrame.setChassisType(vehicleChassis);
  }

  @Override
  public void setEngineCylinders(int engineCylinders) {
    this.vehicleEngine.setEngineCylinders(engineCylinders);
  }

  @Override
  public void setEngineManufacturedDate(Date date) {
    this.vehicleEngine.setEngineManufacturedDate(date);
  }

  @Override
  public void setEngineManufacturer(String manufacturer) {
    this.vehicleEngine.setEngineManufacturer(manufacturer);
  }

  @Override
  public void setEngineMake(String engineMake) {
    this.vehicleEngine.setEngineMake(engineMake);
  }

  @Override
  public void setEngineModel(String engineModel) {
    this.vehicleEngine.setEngineModel(engineModel);
  }

  @Override
  public void setDriveTrain(String driveTrain) {
    this.vehicleEngine.setDriveTrain(driveTrain);
  }

  @Override
  public void setEngineType(String fuel) {
    this.vehicleEngine.setEngineType(fuel);
  }

  public String toString() {
    return "Manufacturer Name: " + this.vehicleManufacturer + "\n"
        + "Manufactured Date: " + this.vehicleManufacturedDate + "\n"
        + "Vehicle Make: " + this.vehicleMake + "\n"
        + "Vehicle Model: " + this.vehicleModel + "\n"
        + "Vehicle Type: " + this.vehicleType + "\n"
        + this.vehicleEngine;
  }

  public static void main(String[] args) {

    // Create new vehicles
    Vehicle defaultVehicle = new Vehicle();
    Vehicle definedVehicle = new Vehicle(
        "Honda",
        new Date(),
        "Honda",
        "Prelude",
        "null",
        "2WD: Two-Wheel Drive",
        new VehicleFrame(),
        new ManufacturedEngine(
            "Honda",
            new Date(),
            "H-Series",
            "H23A1",
            4,
            "88 AKI",
            "2WD: Two-Wheel Drive"
        )
    );

    // Display vehicle details
    System.out.println(defaultVehicle);
    System.out.println();
    System.out.println(definedVehicle);
  }
}
