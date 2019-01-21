public calss SportsCar extends Car {
      private String suspension;
      
      public SportsCar(
                   int startMileage,
                   int startGear,
                   int startSpeed,
                   String engineType){
             super(startMileage,
                   startGear,
                   startSpeed);
             this.setEngine(engineType);
          }
          
          public String getEngine(){
            return this.engine
          }
          
          public void setEngine(String engineType) {
              public.engine = engineType;
          }
          
          public void printDescription() {
              super.printDescription();
              System.out.println("The " + "SportsCar has a" getEngine() + " engine.");
              }
 }
