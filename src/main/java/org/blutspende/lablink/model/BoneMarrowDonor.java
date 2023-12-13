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


package org.blutspende.lablink.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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

import org.blutspende.lablink.JSON;

/**
 * BoneMarrowDonor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-12T06:34:53.661463+01:00[Europe/Berlin]")
public class BoneMarrowDonor {
  public static final String SERIALIZED_NAME_DONOR_CODE = "donorCode";
  @SerializedName(SERIALIZED_NAME_DONOR_CODE)
  private String donorCode;

  public BoneMarrowDonor() {
  }

  public BoneMarrowDonor donorCode(String donorCode) {
    
    this.donorCode = donorCode;
    return this;
  }

   /**
   * The donor code
   * @return donorCode
  **/
  @javax.annotation.Nullable
  public String getDonorCode() {
    return donorCode;
  }


  public void setDonorCode(String donorCode) {
    this.donorCode = donorCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoneMarrowDonor boneMarrowDonor = (BoneMarrowDonor) o;
    return Objects.equals(this.donorCode, boneMarrowDonor.donorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(donorCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoneMarrowDonor {\n");
    sb.append("    donorCode: ").append(toIndentedString(donorCode)).append("\n");
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
    openapiFields.add("donorCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BoneMarrowDonor
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BoneMarrowDonor.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BoneMarrowDonor is not found in the empty JSON string", BoneMarrowDonor.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BoneMarrowDonor.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BoneMarrowDonor` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("donorCode") != null && !jsonObj.get("donorCode").isJsonNull()) && !jsonObj.get("donorCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `donorCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("donorCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BoneMarrowDonor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BoneMarrowDonor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BoneMarrowDonor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BoneMarrowDonor.class));

       return (TypeAdapter<T>) new TypeAdapter<BoneMarrowDonor>() {
           @Override
           public void write(JsonWriter out, BoneMarrowDonor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BoneMarrowDonor read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BoneMarrowDonor given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BoneMarrowDonor
  * @throws IOException if the JSON string is invalid with respect to BoneMarrowDonor
  */
  public static BoneMarrowDonor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BoneMarrowDonor.class);
  }

 /**
  * Convert an instance of BoneMarrowDonor to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
