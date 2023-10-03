package com.mapjson;

public class UtilityLine implements Mappable {

  String name;
  UtilityType utilityType;
  Color color;
  LineMarker lineMarker;

  public UtilityLine(String name, UtilityType utilityType, Color color, LineMarker lineMarker) {
    this.name = name;
    this.utilityType = utilityType;
    this.color = color;
    this.lineMarker = lineMarker;
  }

  @Override
  public String getLabel() {
    return name + " (" + utilityType + ")";
  }

  @Override
  public GeometryType getGeometryType() {
    return GeometryType.LINE;
  }

  @Override
  public String getMarker() {
    return this.color.toString() + " " + this.lineMarker.toString();
  }

  @Override
  public String toJSON() {
    return """
        %s"type": "%s", "label": "%s", "marker": "%s", "name": "%s", "utility": "%s"}""".formatted(JSON_PROPERTY,
        getGeometryType().toString(), getLabel(), getMarker(), name, utilityType.toString());
  }

}
