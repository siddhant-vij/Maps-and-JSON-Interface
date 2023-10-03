package com.mapjson;

public class Building implements Mappable {

  String name;
  UsageType usageType;
  Color color;
  PointMarker pointMarker;

  public Building(String name, UsageType usageType, Color color, PointMarker pointMarker) {
    this.name = name;
    this.usageType = usageType;
    this.color = color;
    this.pointMarker = pointMarker;
  }

  @Override
  public String getLabel() {
    return name + " (" + usageType + ")";
  }

  @Override
  public GeometryType getGeometryType() {
    return GeometryType.POINT;
  }

  @Override
  public String getMarker() {
    return this.color.toString() + " " + this.pointMarker.toString();
  }

  @Override
  public String toJSON() {
    return """
        %s"type": "%s", "label": "%s", "marker": "%s", "name": "%s", "usage": "%s"}""".formatted(JSON_PROPERTY,
        getGeometryType().toString(), getLabel(), getMarker(), name, usageType.toString());
  }

}
