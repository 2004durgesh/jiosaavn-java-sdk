package com.jiosaavn.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonUtils {
  private static final ObjectMapper mapper =
      new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

  public static String toJson(Object data) {
    try {
      return mapper.writeValueAsString(data);
    } catch (Exception e) {
      return "{\"error\": \"Failed to serialize to JSON\"}";
    }
  }

  public static <T> T parse(String json, TypeReference<T> typeReference) {
    try {
      return mapper.readValue(json, typeReference);
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }
}
