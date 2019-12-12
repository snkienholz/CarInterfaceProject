package github.snkienholz;

import java.util.Date;

/**
 * Car Interface Project
 *
 * @author Sabrina Summary - Displays information about cars. Makes use of inheritance concepts and
 * interfaces.
 */
public class Car extends Vehicle {

  // instance variables
  private Feature[] feature = new Feature[10];
  private int carAxle;

  // CONSTRUCTORS
  public Car() {
    super();
  }

  public Car(String vehicleManufacturer, Date vehicleManufacturedDate, String vehicleMake,
      String vehicleModel, String vehicleType, String driveTrain, Chassis vehicleFrame,
      Engine vehicleEngine, Feature[] feature, int carAxle) {

    // Calling the Vehicle constructor through a super() call
    super(vehicleManufacturer, vehicleManufacturedDate, vehicleMake, vehicleModel, vehicleType,
        driveTrain, vehicleFrame, vehicleEngine);

    this.feature = feature;
    this.carAxle = carAxle;
  }

  public String getExteriorFeatures() {

    // Creating an output StringBuilder to list exterior features
    StringBuilder outputString = new StringBuilder("Exterior Features : ");

    // Checking if a feature is an exterior feature and appending it to the String list
    for (Feature f : feature) {
      if (f instanceof ExteriorFeature) {

        outputString.append(f).append("\n");
      }
    }

    // Returning a String listing all exterior features
    return outputString.toString();
  }

  public String getInteriorFeatures() {

    // Creating an output StringBuilder to list interior features
    StringBuilder outputString = new StringBuilder("Interior Features : ");

    // Checking if a feature is an exterior feature and appending it to the String list
    for (Feature f : feature) {
      if (f instanceof InteriorFeature) {
        outputString.append(f).append("\n");
      }
    }

    // Returning a String listing all interior features
    return outputString.toString();
  }

  public String toString() {

    // Creating an output StringBuilder for the list of features
    StringBuilder featureList = new StringBuilder("");

    // Going through the Feature array to append all available features to the output String
    for (Feature f : feature) {
      if (f != null) {
        featureList.append(f).append("\n");
      }
    }

    // Returning a String with all car details(super call), including all features and car axle
    return super.toString() + "\n"
        + "Features: " + featureList + "\n"
        + "Car Axle: " + this.carAxle;

  }

  public static void main(String[] args) {

    // Creating some exterior and interior features
    Feature[] features = new Feature[]{
        new ExteriorFeature("Wood Panels"),
        new ExteriorFeature("Moonroof"),
        new InteriorFeature("AM/FM Radio"),
        new InteriorFeature("Air Conditioning")
    };

    // Creating new cars
    Car defaultCar = new Car();
    Car definedCar = new Car(
        "Honda",
        new Date(),
        "Honda",
        "Prelude",
        "The Ultimate Null Car",
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
        ),
        features,
        2
    );

    // Displaying car details
    System.out.println(defaultCar);
    System.out.println();
    System.out.println(definedCar);

    // Displaying features
    System.out.println(definedCar.getExteriorFeatures());
    System.out.println();
    System.out.println(definedCar.getInteriorFeatures());
  }
}
