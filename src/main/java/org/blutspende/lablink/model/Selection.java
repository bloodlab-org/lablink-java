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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.blutspende.lablink.model.SelectionType;

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
 * Selection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-12T06:34:53.661463+01:00[Europe/Berlin]")
public class Selection {
  public static final String SERIALIZED_NAME_IDS = "ids";
  @SerializedName(SERIALIZED_NAME_IDS)
  private List<UUID> ids = new ArrayList<>();

  public static final String SERIALIZED_NAME_LOCATION_ID = "locationId";
  @SerializedName(SERIALIZED_NAME_LOCATION_ID)
  private UUID locationId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private SelectionType type;

  public Selection() {
  }

  public Selection ids(List<UUID> ids) {
    
    this.ids = ids;
    return this;
  }

  public Selection addIdsItem(UUID idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * The IDs of the desired type
   * @return ids
  **/
  @javax.annotation.Nonnull
  public List<UUID> getIds() {
    return ids;
  }


  public void setIds(List<UUID> ids) {
    this.ids = ids;
  }


  public Selection locationId(UUID locationId) {
    
    this.locationId = locationId;
    return this;
  }

   /**
   * The LocationId to create the selection with
   * @return locationId
  **/
  @javax.annotation.Nonnull
  public UUID getLocationId() {
    return locationId;
  }


  public void setLocationId(UUID locationId) {
    this.locationId = locationId;
  }


  public Selection type(SelectionType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  public SelectionType getType() {
    return type;
  }


  public void setType(SelectionType type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Selection selection = (Selection) o;
    return Objects.equals(this.ids, selection.ids) &&
        Objects.equals(this.locationId, selection.locationId) &&
        Objects.equals(this.type, selection.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, locationId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Selection {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("ids");
    openapiFields.add("locationId");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ids");
    openapiRequiredFields.add("locationId");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Selection
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Selection.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Selection is not found in the empty JSON string", Selection.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Selection.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Selection` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Selection.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("ids") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ids` to be an array in the JSON string but got `%s`", jsonObj.get("ids").toString()));
      }
      if (!jsonObj.get("locationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationId").toString()));
      }
      // validate the required field `type`
      SelectionType.validateJsonElement(jsonObj.get("type"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Selection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Selection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Selection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Selection.class));

       return (TypeAdapter<T>) new TypeAdapter<Selection>() {
           @Override
           public void write(JsonWriter out, Selection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Selection read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Selection given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Selection
  * @throws IOException if the JSON string is invalid with respect to Selection
  */
  public static Selection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Selection.class);
  }

 /**
  * Convert an instance of Selection to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

