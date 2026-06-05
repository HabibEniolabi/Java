// Assignment on Encapsulation

public class Phone {
  private String brand;
  private String model;
  private int batteryPercentage;

  public Phone(String phoneBrand, String phoneModel, int battery) {
    brand = phoneBrand;
    model = phoneModel;
    batteryPercentage = battery;
  }

  public void chargeBattery(int chargeAmount) {
    if(chargeAmount > 0) {
      batteryPercentage += chargeAmount;
      if(batteryPercentage > 100) {
        batteryPercentage = 100;
      }
    } else {
      System.out.println("Please charge battery low.");
    }
   }

   public void useBattery(int usageAmount) {
    if(usageAmount > 0) {
      batteryPercentage -= usageAmount;
      if(batteryPercentage < 0) {
        batteryPercentage = 0;
      }
    } else {
      System.out.println("Please use battery low.");
    }
   }

   public void setBrand(String phoneBrand) {
    brand = phoneBrand;
   }

   public String getBrand() {
    return brand;
   }

   public void setModel(String phoneModel) {
    model = phoneModel;
   }

   public String getModel() {
    return model;
   }

   public void setBatteryPercentage(int battery) {
    batteryPercentage = battery;
   }

   public int getBatteryPercentage() {
    return batteryPercentage;
   }
}
