package github.snkienholz;

public class ExteriorFeature implements Feature {

  // instance variable
  private String exteriorFeature;

  /*** CONSTRUCTORS ***/
  public ExteriorFeature() {
    this.exteriorFeature = "Generic";
  }

  public ExteriorFeature(String exteriorFeature) {
    this.exteriorFeature = exteriorFeature;
  }

  @Override
  public String getFeature() {
    return this.exteriorFeature;
  }

  @Override
  public void setFeature(String feature) {
    this.exteriorFeature = feature;
  }

  public String toString() {
    return "Exterior [" + this.exteriorFeature + "]";
  }

  public static void main(String[] args) {

    // Create new exterior features
    ExteriorFeature defaultFeature = new ExteriorFeature();
    ExteriorFeature definedFeature = new ExteriorFeature("Fog Lamps");

    // Display the features
    System.out.println(defaultFeature);
    System.out.println();
    System.out.println(definedFeature);
  }
}
