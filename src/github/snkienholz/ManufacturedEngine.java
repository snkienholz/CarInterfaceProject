package github.snkienholz;

import java.util.Date;

public class ManufacturedEngine implements Engine {

  // instance variables
  private String engineManufacturer;
  private Date engineManufacturedDate;
  private String engineMake;
  private String engineModel;
  private int engineCylinders;
  private String engineType;
  private String driveTrain;

  // CONSTRUCTORS
  public ManufacturedEngine() {

    this.engineManufacturer = "Generic";
    this.engineManufacturedDate = new Date();
    this.engineMake = "Generic";
    this.engineModel = "Generic";
    this.engineType = "85 AKI";
    this.engineCylinders = 0;
    this.driveTrain = "2WD: Two-Wheel Drives";
  }

  public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate,
      String engineMake, String engineModel, int engineCylinders, String engineType,
      String driveTrain) {

    this.engineManufacturer = engineManufacturer;
    this.engineManufacturedDate = engineManufacturedDate;
    this.engineMake = engineMake;
    this.engineModel = engineModel;
    this.engineCylinders = engineCylinders;
    this.engineType = engineType;
    this.driveTrain = driveTrain;
  }

  @Override
  public void setEngineCylinders(int engineCylinders) {
    this.engineCylinders = engineCylinders;
  }

  @Override
  public void setEngineManufacturedDate(Date date) {
    this.engineManufacturedDate = date;
  }

  @Override
  public void setEngineManufacturer(String manufacturer) {
    this.engineManufacturer = manufacturer;
  }

  @Override
  public void setEngineMake(String engineMake) {
    this.engineMake = engineMake;
  }

  @Override
  public void setEngineModel(String engineModel) {
    this.engineModel = engineModel;
  }

  @Override
  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;
  }

  @Override
  public void setEngineType(String fuel) {
    this.engineType = fuel;
  }

  public String toString() {
    return "Engine Manufacturer: " + engineManufacturer + "\n"
        + "Engine Manufactured: " + engineManufacturedDate + "\n"
        + "Engine Make: " + engineMake + "\n"
        + "Engine Model: " + engineModel + "\n"
        + "Engine Type: " + engineType + "\n"
        + "Engine Cylinders: " + engineCylinders + "\n"
        + "Drive Train: " + driveTrain;
  }

  public static void main(String[] args) {

    // Create new engines
    ManufacturedEngine defaultEngine = new ManufacturedEngine();
    ManufacturedEngine definedEngine = new ManufacturedEngine(
        "Honda",
        new Date(1328162144),
        "H-Series",
        "H23A1",
        4,
        "88 AKI",
        "2WD: Two-Wheel Drive"
    );

    // Display engines
    System.out.println(defaultEngine);
    System.out.println();
    System.out.println(definedEngine);
  }
}
