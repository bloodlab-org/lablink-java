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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.blutspende.lablink.model.BloodDonor;
import org.blutspende.lablink.model.BoneMarrowDonor;
import org.blutspende.lablink.model.OrderExamination;
import org.blutspende.lablink.model.OrderStateType;
import org.blutspende.lablink.model.OrderType;
import org.blutspende.lablink.model.Patient;
import org.blutspende.lablink.model.Pseudonym;

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
 * Order
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-12T06:34:53.661463+01:00[Europe/Berlin]")
public class Order {
  public static final String SERIALIZED_NAME_BLOOD_DONOR = "bloodDonor";
  @SerializedName(SERIALIZED_NAME_BLOOD_DONOR)
  private BloodDonor bloodDonor;

  public static final String SERIALIZED_NAME_BONE_MARROW_DONOR = "boneMarrowDonor";
  @SerializedName(SERIALIZED_NAME_BONE_MARROW_DONOR)
  private BoneMarrowDonor boneMarrowDonor;

  public static final String SERIALIZED_NAME_EXAMINATIONS = "examinations";
  @SerializedName(SERIALIZED_NAME_EXAMINATIONS)
  private List<OrderExamination> examinations = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_LOCATION_ID = "locationId";
  @SerializedName(SERIALIZED_NAME_LOCATION_ID)
  private String locationId;

  public static final String SERIALIZED_NAME_ORDER_CREATION_DATE_TIME = "orderCreationDateTime";
  @SerializedName(SERIALIZED_NAME_ORDER_CREATION_DATE_TIME)
  private OffsetDateTime orderCreationDateTime;

  public static final String SERIALIZED_NAME_PATIENT = "patient";
  @SerializedName(SERIALIZED_NAME_PATIENT)
  private Patient patient;

  public static final String SERIALIZED_NAME_PSEUDONYM = "pseudonym";
  @SerializedName(SERIALIZED_NAME_PSEUDONYM)
  private Pseudonym pseudonym;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private OrderStateType state;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private OrderType type;

  public Order() {
  }

  public Order bloodDonor(BloodDonor bloodDonor) {
    
    this.bloodDonor = bloodDonor;
    return this;
  }

   /**
   * Get bloodDonor
   * @return bloodDonor
  **/
  @javax.annotation.Nullable
  public BloodDonor getBloodDonor() {
    return bloodDonor;
  }


  public void setBloodDonor(BloodDonor bloodDonor) {
    this.bloodDonor = bloodDonor;
  }


  public Order boneMarrowDonor(BoneMarrowDonor boneMarrowDonor) {
    
    this.boneMarrowDonor = boneMarrowDonor;
    return this;
  }

   /**
   * Get boneMarrowDonor
   * @return boneMarrowDonor
  **/
  @javax.annotation.Nullable
  public BoneMarrowDonor getBoneMarrowDonor() {
    return boneMarrowDonor;
  }


  public void setBoneMarrowDonor(BoneMarrowDonor boneMarrowDonor) {
    this.boneMarrowDonor = boneMarrowDonor;
  }


  public Order examinations(List<OrderExamination> examinations) {
    
    this.examinations = examinations;
    return this;
  }

  public Order addExaminationsItem(OrderExamination examinationsItem) {
    if (this.examinations == null) {
      this.examinations = new ArrayList<>();
    }
    this.examinations.add(examinationsItem);
    return this;
  }

   /**
   * The examinations belonging to the order
   * @return examinations
  **/
  @javax.annotation.Nonnull
  public List<OrderExamination> getExaminations() {
    return examinations;
  }


  public void setExaminations(List<OrderExamination> examinations) {
    this.examinations = examinations;
  }


  public Order id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the order
   * @return id
  **/
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public Order locationId(String locationId) {
    
    this.locationId = locationId;
    return this;
  }

   /**
   * Identifier of the location (client)
   * @return locationId
  **/
  @javax.annotation.Nonnull
  public String getLocationId() {
    return locationId;
  }


  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }


  public Order orderCreationDateTime(OffsetDateTime orderCreationDateTime) {
    
    this.orderCreationDateTime = orderCreationDateTime;
    return this;
  }

   /**
   * The order creation date-time (yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ)
   * @return orderCreationDateTime
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getOrderCreationDateTime() {
    return orderCreationDateTime;
  }


  public void setOrderCreationDateTime(OffsetDateTime orderCreationDateTime) {
    this.orderCreationDateTime = orderCreationDateTime;
  }


  public Order patient(Patient patient) {
    
    this.patient = patient;
    return this;
  }

   /**
   * Get patient
   * @return patient
  **/
  @javax.annotation.Nullable
  public Patient getPatient() {
    return patient;
  }


  public void setPatient(Patient patient) {
    this.patient = patient;
  }


  public Order pseudonym(Pseudonym pseudonym) {
    
    this.pseudonym = pseudonym;
    return this;
  }

   /**
   * Get pseudonym
   * @return pseudonym
  **/
  @javax.annotation.Nullable
  public Pseudonym getPseudonym() {
    return pseudonym;
  }


  public void setPseudonym(Pseudonym pseudonym) {
    this.pseudonym = pseudonym;
  }


  public Order reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * The external unique identifier of the order
   * @return reference
  **/
  @javax.annotation.Nullable
  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public Order state(OrderStateType state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  public OrderStateType getState() {
    return state;
  }


  public void setState(OrderStateType state) {
    this.state = state;
  }


  public Order type(OrderType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  public OrderType getType() {
    return type;
  }


  public void setType(OrderType type) {
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
    Order order = (Order) o;
    return Objects.equals(this.bloodDonor, order.bloodDonor) &&
        Objects.equals(this.boneMarrowDonor, order.boneMarrowDonor) &&
        Objects.equals(this.examinations, order.examinations) &&
        Objects.equals(this.id, order.id) &&
        Objects.equals(this.locationId, order.locationId) &&
        Objects.equals(this.orderCreationDateTime, order.orderCreationDateTime) &&
        Objects.equals(this.patient, order.patient) &&
        Objects.equals(this.pseudonym, order.pseudonym) &&
        Objects.equals(this.reference, order.reference) &&
        Objects.equals(this.state, order.state) &&
        Objects.equals(this.type, order.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bloodDonor, boneMarrowDonor, examinations, id, locationId, orderCreationDateTime, patient, pseudonym, reference, state, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    sb.append("    bloodDonor: ").append(toIndentedString(bloodDonor)).append("\n");
    sb.append("    boneMarrowDonor: ").append(toIndentedString(boneMarrowDonor)).append("\n");
    sb.append("    examinations: ").append(toIndentedString(examinations)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    orderCreationDateTime: ").append(toIndentedString(orderCreationDateTime)).append("\n");
    sb.append("    patient: ").append(toIndentedString(patient)).append("\n");
    sb.append("    pseudonym: ").append(toIndentedString(pseudonym)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
    openapiFields.add("bloodDonor");
    openapiFields.add("boneMarrowDonor");
    openapiFields.add("examinations");
    openapiFields.add("id");
    openapiFields.add("locationId");
    openapiFields.add("orderCreationDateTime");
    openapiFields.add("patient");
    openapiFields.add("pseudonym");
    openapiFields.add("reference");
    openapiFields.add("state");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("examinations");
    openapiRequiredFields.add("locationId");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Order
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Order.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Order is not found in the empty JSON string", Order.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Order.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Order` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Order.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `bloodDonor`
      if (jsonObj.get("bloodDonor") != null && !jsonObj.get("bloodDonor").isJsonNull()) {
        BloodDonor.validateJsonElement(jsonObj.get("bloodDonor"));
      }
      // validate the optional field `boneMarrowDonor`
      if (jsonObj.get("boneMarrowDonor") != null && !jsonObj.get("boneMarrowDonor").isJsonNull()) {
        BoneMarrowDonor.validateJsonElement(jsonObj.get("boneMarrowDonor"));
      }
      // ensure the json data is an array
      if (!jsonObj.get("examinations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `examinations` to be an array in the JSON string but got `%s`", jsonObj.get("examinations").toString()));
      }

      JsonArray jsonArrayexaminations = jsonObj.getAsJsonArray("examinations");
      // validate the required field `examinations` (array)
      for (int i = 0; i < jsonArrayexaminations.size(); i++) {
        OrderExamination.validateJsonElement(jsonArrayexaminations.get(i));
      };
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("locationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationId").toString()));
      }
      // validate the optional field `patient`
      if (jsonObj.get("patient") != null && !jsonObj.get("patient").isJsonNull()) {
        Patient.validateJsonElement(jsonObj.get("patient"));
      }
      // validate the optional field `pseudonym`
      if (jsonObj.get("pseudonym") != null && !jsonObj.get("pseudonym").isJsonNull()) {
        Pseudonym.validateJsonElement(jsonObj.get("pseudonym"));
      }
      if ((jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonNull()) && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        OrderStateType.validateJsonElement(jsonObj.get("state"));
      }
      // validate the required field `type`
      OrderType.validateJsonElement(jsonObj.get("type"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Order.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Order' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Order> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Order.class));

       return (TypeAdapter<T>) new TypeAdapter<Order>() {
           @Override
           public void write(JsonWriter out, Order value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Order read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Order given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Order
  * @throws IOException if the JSON string is invalid with respect to Order
  */
  public static Order fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Order.class);
  }

 /**
  * Convert an instance of Order to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

