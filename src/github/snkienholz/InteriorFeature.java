package github.snkienholz;

public class InteriorFeature implements Feature{

  //instance variables
  private String interiorFeature;

  /*** CONSTRUCTORS ***/
  public InteriorFeature() {
    interiorFeature = "Generic";
  }

  public InteriorFeature(String interiorFeature) {
    this.interiorFeature = interiorFeature;
  }

  @Override
  public String getFeature() {
    return this.interiorFeature;
  }

  @Override
  public void setFeature(String feature) {
    this.interiorFeature = feature;
  }

  public String toString() {
    return "Interior [" + this.interiorFeature + "]";
  }

  public static void main(String[] args) {

    // Create new interior features
    InteriorFeature defaultFeature = new InteriorFeature();
    InteriorFeature definedFeature = new InteriorFeature("Climate Control");

    // Display the features
    System.out.println(defaultFeature);
    System.out.println();
    System.out.println(definedFeature);
  }
}
