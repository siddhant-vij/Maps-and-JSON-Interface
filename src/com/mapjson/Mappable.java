package com.mapjson;

public interface Mappable {
  String JSON_PROPERTY = """
      "properties": {""";

  String getLabel();

  GeometryType getGeometryType();

  String getMarker();

  default String toJSON() {
    return """
        %s"type": "%s", "label": "%s", "marker": "%s"}""".formatted(JSON_PROPERTY, getGeometryType().toString(),
        getLabel(), getMarker());
  }
}
