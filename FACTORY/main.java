class Main{
    public static void main(String[] args) {
      System.out.println(CarFactory.buildCar(CarType.SEDAN));
      System.out.println(CarFactory.buildCar(CarType.LUXURY));
    }
  }