package com.mapjson;

public class App {
  public static void main(String[] args) {
    Building building = new Building("City Town Hall", UsageType.MUNICIPAL, Color.RED, PointMarker.STAR);
    System.out.println(building.toJSON());

    UtilityLine utilityLine = new UtilityLine("College St", UtilityType.FIBER_OPTIC, Color.GREEN, LineMarker.DOTTED);
    System.out.println(utilityLine.toJSON());
  }
}
