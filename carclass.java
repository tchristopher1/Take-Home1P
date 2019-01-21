class Car {
  
  int speed = 0;
  int gear = 0; //0 stands for in park
  int gas_mileage = 60; //60 mpg
  
  void changeGear(int newValue) {
        gear  = newValue;
        }
        
  void changeGasMileage(int newValue) {
        gas_mileage = newValue;
        }
        
  void accelerate(int increment) {
        speed = speed + increment;
        }
        
  void decelerate(int decrement){
         speed = speed - decrement;
         }
         
  void printStates() {
          System.out.println("Mileage:" + gas_mileage + "Gear:" + gear + "Speed:" +speed);
          }
}
