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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.OrderState;

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
 * GetOrderStatesV3200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-12T04:43:46.153841900+01:00[Europe/Berlin]")
public class GetOrderStatesV3200Response {
  public static final String SERIALIZED_NAME_CURRENT_PAGE = "currentPage";
  @SerializedName(SERIALIZED_NAME_CURRENT_PAGE)
  private Integer currentPage;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<OrderState> items;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "totalCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public static final String SERIALIZED_NAME_TOTAL_PAGES = "totalPages";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGES)
  private Integer totalPages;

  public GetOrderStatesV3200Response() {
  }

  public GetOrderStatesV3200Response currentPage(Integer currentPage) {
    
    this.currentPage = currentPage;
    return this;
  }

   /**
   * The actual page number
   * @return currentPage
  **/
  @javax.annotation.Nullable
  public Integer getCurrentPage() {
    return currentPage;
  }


  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }


  public GetOrderStatesV3200Response items(List<OrderState> items) {
    
    this.items = items;
    return this;
  }

  public GetOrderStatesV3200Response addItemsItem(OrderState itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  public List<OrderState> getItems() {
    return items;
  }


  public void setItems(List<OrderState> items) {
    this.items = items;
  }


  public GetOrderStatesV3200Response pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * The number of items per page
   * @return pageSize
  **/
  @javax.annotation.Nullable
  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public GetOrderStatesV3200Response totalCount(Integer totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * The total count of items
   * @return totalCount
  **/
  @javax.annotation.Nullable
  public Integer getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  public GetOrderStatesV3200Response totalPages(Integer totalPages) {
    
    this.totalPages = totalPages;
    return this;
  }

   /**
   * The total pages
   * @return totalPages
  **/
  @javax.annotation.Nullable
  public Integer getTotalPages() {
    return totalPages;
  }


  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOrderStatesV3200Response getOrderStatesV3200Response = (GetOrderStatesV3200Response) o;
    return Objects.equals(this.currentPage, getOrderStatesV3200Response.currentPage) &&
        Objects.equals(this.items, getOrderStatesV3200Response.items) &&
        Objects.equals(this.pageSize, getOrderStatesV3200Response.pageSize) &&
        Objects.equals(this.totalCount, getOrderStatesV3200Response.totalCount) &&
        Objects.equals(this.totalPages, getOrderStatesV3200Response.totalPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPage, items, pageSize, totalCount, totalPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOrderStatesV3200Response {\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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
    openapiFields.add("currentPage");
    openapiFields.add("items");
    openapiFields.add("pageSize");
    openapiFields.add("totalCount");
    openapiFields.add("totalPages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetOrderStatesV3200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetOrderStatesV3200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetOrderStatesV3200Response is not found in the empty JSON string", GetOrderStatesV3200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetOrderStatesV3200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetOrderStatesV3200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull()) {
        JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
        if (jsonArrayitems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
          }

          // validate the optional field `items` (array)
          for (int i = 0; i < jsonArrayitems.size(); i++) {
            OrderState.validateJsonElement(jsonArrayitems.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetOrderStatesV3200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetOrderStatesV3200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetOrderStatesV3200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetOrderStatesV3200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetOrderStatesV3200Response>() {
           @Override
           public void write(JsonWriter out, GetOrderStatesV3200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetOrderStatesV3200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetOrderStatesV3200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetOrderStatesV3200Response
  * @throws IOException if the JSON string is invalid with respect to GetOrderStatesV3200Response
  */
  public static GetOrderStatesV3200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetOrderStatesV3200Response.class);
  }

 /**
  * Convert an instance of GetOrderStatesV3200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

