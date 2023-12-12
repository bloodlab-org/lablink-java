/*
 * Lablink
 * Lablink Swagger documentation
 *
 * The version of the OpenAPI document: 3.0
 * Contact: laborit@blutspende.de
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.OrderResultStatus;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * OrderResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-12T04:43:46.153841900+01:00[Europe/Berlin]")
public class OrderResult {
  public static final String SERIALIZED_NAME_ANALYTE = "analyte";
  @SerializedName(SERIALIZED_NAME_ANALYTE)
  private String analyte;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private String result;

  public static final String SERIALIZED_NAME_RESULT_TYPE = "resultType";
  @SerializedName(SERIALIZED_NAME_RESULT_TYPE)
  private String resultType;

  public static final String SERIALIZED_NAME_RESULT_YIELD_DATE_TIME = "resultYieldDateTime";
  @SerializedName(SERIALIZED_NAME_RESULT_YIELD_DATE_TIME)
  private OffsetDateTime resultYieldDateTime;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private OrderResultStatus status;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;

  public OrderResult() {
  }

  public OrderResult analyte(String analyte) {
    
    this.analyte = analyte;
    return this;
  }

   /**
   * The analyte name
   * @return analyte
  **/
  @javax.annotation.Nullable
  public String getAnalyte() {
    return analyte;
  }


  public void setAnalyte(String analyte) {
    this.analyte = analyte;
  }


  public OrderResult result(String result) {
    
    this.result = result;
    return this;
  }

   /**
   * The result
   * @return result
  **/
  @javax.annotation.Nullable
  public String getResult() {
    return result;
  }


  public void setResult(String result) {
    this.result = result;
  }


  public OrderResult resultType(String resultType) {
    
    this.resultType = resultType;
    return this;
  }

   /**
   * The result type
   * @return resultType
  **/
  @javax.annotation.Nullable
  public String getResultType() {
    return resultType;
  }


  public void setResultType(String resultType) {
    this.resultType = resultType;
  }


  public OrderResult resultYieldDateTime(OffsetDateTime resultYieldDateTime) {
    
    this.resultYieldDateTime = resultYieldDateTime;
    return this;
  }

   /**
   * The result yield date-time
   * @return resultYieldDateTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getResultYieldDateTime() {
    return resultYieldDateTime;
  }


  public void setResultYieldDateTime(OffsetDateTime resultYieldDateTime) {
    this.resultYieldDateTime = resultYieldDateTime;
  }


  public OrderResult status(OrderResultStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public OrderResultStatus getStatus() {
    return status;
  }


  public void setStatus(OrderResultStatus status) {
    this.status = status;
  }


  public OrderResult unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * The unit
   * @return unit
  **/
  @javax.annotation.Nullable
  public String getUnit() {
    return unit;
  }


  public void setUnit(String unit) {
    this.unit = unit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderResult orderResult = (OrderResult) o;
    return Objects.equals(this.analyte, orderResult.analyte) &&
        Objects.equals(this.result, orderResult.result) &&
        Objects.equals(this.resultType, orderResult.resultType) &&
        Objects.equals(this.resultYieldDateTime, orderResult.resultYieldDateTime) &&
        Objects.equals(this.status, orderResult.status) &&
        Objects.equals(this.unit, orderResult.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analyte, result, resultType, resultYieldDateTime, status, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderResult {\n");
    sb.append("    analyte: ").append(toIndentedString(analyte)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    resultType: ").append(toIndentedString(resultType)).append("\n");
    sb.append("    resultYieldDateTime: ").append(toIndentedString(resultYieldDateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("analyte");
    openapiFields.add("result");
    openapiFields.add("resultType");
    openapiFields.add("resultYieldDateTime");
    openapiFields.add("status");
    openapiFields.add("unit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderResult is not found in the empty JSON string", OrderResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("analyte") != null && !jsonObj.get("analyte").isJsonNull()) && !jsonObj.get("analyte").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `analyte` to be a primitive type in the JSON string but got `%s`", jsonObj.get("analyte").toString()));
      }
      if ((jsonObj.get("result") != null && !jsonObj.get("result").isJsonNull()) && !jsonObj.get("result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("result").toString()));
      }
      if ((jsonObj.get("resultType") != null && !jsonObj.get("resultType").isJsonNull()) && !jsonObj.get("resultType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resultType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resultType").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        OrderResultStatus.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("unit") != null && !jsonObj.get("unit").isJsonNull()) && !jsonObj.get("unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unit").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderResult.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderResult>() {
           @Override
           public void write(JsonWriter out, OrderResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderResult
  * @throws IOException if the JSON string is invalid with respect to OrderResult
  */
  public static OrderResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderResult.class);
  }

 /**
  * Convert an instance of OrderResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

