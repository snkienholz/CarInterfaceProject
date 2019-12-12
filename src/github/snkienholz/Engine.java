package github.snkienholz;

import java.util.Date;

public interface Engine {

  void setEngineCylinders(int engineCylinders);

  void setEngineManufacturedDate(Date date);

  void setEngineManufacturer(String manufacturer);

  void setEngineMake(String engineMake);

  void setEngineModel(String engineModel);

  void setDriveTrain(String driveTrain);

  void setEngineType(String fuel);
}
