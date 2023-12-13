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
import java.time.LocalDate;
import java.util.Arrays;
import org.blutspende.lablink.model.Gender;

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
 * Patient
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-12T06:34:53.661463+01:00[Europe/Berlin]")
public class Patient {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "dateOfBirth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private LocalDate dateOfBirth;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private Gender gender;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_PHONE_NUMBER_PRIMARY = "phoneNumberPrimary";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER_PRIMARY)
  private String phoneNumberPrimary;

  public static final String SERIALIZED_NAME_PHONE_NUMBER_SECONDARY = "phoneNumberSecondary";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER_SECONDARY)
  private String phoneNumberSecondary;

  public static final String SERIALIZED_NAME_POST_CODE = "postCode";
  @SerializedName(SERIALIZED_NAME_POST_CODE)
  private String postCode;

  public Patient() {
  }

  public Patient address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * The address
   * @return address
  **/
  @javax.annotation.Nonnull
  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public Patient city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The city
   * @return city
  **/
  @javax.annotation.Nonnull
  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public Patient country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The country
   * @return country
  **/
  @javax.annotation.Nonnull
  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public Patient dateOfBirth(LocalDate dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * The date of birth (yyyy-MM-dd)
   * @return dateOfBirth
  **/
  @javax.annotation.Nonnull
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public Patient firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name
   * @return firstName
  **/
  @javax.annotation.Nonnull
  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public Patient gender(Gender gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nonnull
  public Gender getGender() {
    return gender;
  }


  public void setGender(Gender gender) {
    this.gender = gender;
  }


  public Patient lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The last name
   * @return lastName
  **/
  @javax.annotation.Nonnull
  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public Patient phoneNumberPrimary(String phoneNumberPrimary) {
    
    this.phoneNumberPrimary = phoneNumberPrimary;
    return this;
  }

   /**
   * The primary phone number
   * @return phoneNumberPrimary
  **/
  @javax.annotation.Nonnull
  public String getPhoneNumberPrimary() {
    return phoneNumberPrimary;
  }


  public void setPhoneNumberPrimary(String phoneNumberPrimary) {
    this.phoneNumberPrimary = phoneNumberPrimary;
  }


  public Patient phoneNumberSecondary(String phoneNumberSecondary) {
    
    this.phoneNumberSecondary = phoneNumberSecondary;
    return this;
  }

   /**
   * The secondary phone number
   * @return phoneNumberSecondary
  **/
  @javax.annotation.Nullable
  public String getPhoneNumberSecondary() {
    return phoneNumberSecondary;
  }


  public void setPhoneNumberSecondary(String phoneNumberSecondary) {
    this.phoneNumberSecondary = phoneNumberSecondary;
  }


  public Patient postCode(String postCode) {
    
    this.postCode = postCode;
    return this;
  }

   /**
   * The post
   * @return postCode
  **/
  @javax.annotation.Nonnull
  public String getPostCode() {
    return postCode;
  }


  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Patient patient = (Patient) o;
    return Objects.equals(this.address, patient.address) &&
        Objects.equals(this.city, patient.city) &&
        Objects.equals(this.country, patient.country) &&
        Objects.equals(this.dateOfBirth, patient.dateOfBirth) &&
        Objects.equals(this.firstName, patient.firstName) &&
        Objects.equals(this.gender, patient.gender) &&
        Objects.equals(this.lastName, patient.lastName) &&
        Objects.equals(this.phoneNumberPrimary, patient.phoneNumberPrimary) &&
        Objects.equals(this.phoneNumberSecondary, patient.phoneNumberSecondary) &&
        Objects.equals(this.postCode, patient.postCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, city, country, dateOfBirth, firstName, gender, lastName, phoneNumberPrimary, phoneNumberSecondary, postCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Patient {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phoneNumberPrimary: ").append(toIndentedString(phoneNumberPrimary)).append("\n");
    sb.append("    phoneNumberSecondary: ").append(toIndentedString(phoneNumberSecondary)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("city");
    openapiFields.add("country");
    openapiFields.add("dateOfBirth");
    openapiFields.add("firstName");
    openapiFields.add("gender");
    openapiFields.add("lastName");
    openapiFields.add("phoneNumberPrimary");
    openapiFields.add("phoneNumberSecondary");
    openapiFields.add("postCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("address");
    openapiRequiredFields.add("city");
    openapiRequiredFields.add("country");
    openapiRequiredFields.add("dateOfBirth");
    openapiRequiredFields.add("firstName");
    openapiRequiredFields.add("gender");
    openapiRequiredFields.add("lastName");
    openapiRequiredFields.add("phoneNumberPrimary");
    openapiRequiredFields.add("postCode");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Patient
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Patient.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Patient is not found in the empty JSON string", Patient.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Patient.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Patient` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Patient.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if (!jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if (!jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if (!jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      // validate the required field `gender`
      Gender.validateJsonElement(jsonObj.get("gender"));
      if (!jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if (!jsonObj.get("phoneNumberPrimary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumberPrimary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumberPrimary").toString()));
      }
      if ((jsonObj.get("phoneNumberSecondary") != null && !jsonObj.get("phoneNumberSecondary").isJsonNull()) && !jsonObj.get("phoneNumberSecondary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumberSecondary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumberSecondary").toString()));
      }
      if (!jsonObj.get("postCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Patient.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Patient' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Patient> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Patient.class));

       return (TypeAdapter<T>) new TypeAdapter<Patient>() {
           @Override
           public void write(JsonWriter out, Patient value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Patient read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Patient given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Patient
  * @throws IOException if the JSON string is invalid with respect to Patient
  */
  public static Patient fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Patient.class);
  }

 /**
  * Convert an instance of Patient to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
