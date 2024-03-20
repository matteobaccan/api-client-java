/*
 * 😸 Cheshire-Cat API
 * Customizable AI architecture
 *
 * The version of the OpenAPI document: 0.0.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package it.baccan.cheshirecat.model;

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

import it.baccan.cheshirecat.JSON;

/**
 * ResponseGetAllowedMimetypes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ResponseGetAllowedMimetypes {
  public static final String SERIALIZED_NAME_ALLOWED = "allowed";
  @SerializedName(SERIALIZED_NAME_ALLOWED)
  private List<String> allowed;

  public ResponseGetAllowedMimetypes() {
  }

  public ResponseGetAllowedMimetypes allowed(List<String> allowed) {
    this.allowed = allowed;
    return this;
  }

  public ResponseGetAllowedMimetypes addAllowedItem(String allowedItem) {
    if (this.allowed == null) {
      this.allowed = new ArrayList<>();
    }
    this.allowed.add(allowedItem);
    return this;
  }

   /**
   * Get allowed
   * @return allowed
  **/
  @javax.annotation.Nullable
  public List<String> getAllowed() {
    return allowed;
  }

  public void setAllowed(List<String> allowed) {
    this.allowed = allowed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseGetAllowedMimetypes responseGetAllowedMimetypes = (ResponseGetAllowedMimetypes) o;
    return Objects.equals(this.allowed, responseGetAllowedMimetypes.allowed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseGetAllowedMimetypes {\n");
    sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
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
    openapiFields.add("allowed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ResponseGetAllowedMimetypes
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ResponseGetAllowedMimetypes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResponseGetAllowedMimetypes is not found in the empty JSON string", ResponseGetAllowedMimetypes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ResponseGetAllowedMimetypes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResponseGetAllowedMimetypes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowed") != null && !jsonObj.get("allowed").isJsonNull() && !jsonObj.get("allowed").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowed` to be an array in the JSON string but got `%s`", jsonObj.get("allowed").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResponseGetAllowedMimetypes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResponseGetAllowedMimetypes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResponseGetAllowedMimetypes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResponseGetAllowedMimetypes.class));

       return (TypeAdapter<T>) new TypeAdapter<ResponseGetAllowedMimetypes>() {
           @Override
           public void write(JsonWriter out, ResponseGetAllowedMimetypes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResponseGetAllowedMimetypes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResponseGetAllowedMimetypes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResponseGetAllowedMimetypes
  * @throws IOException if the JSON string is invalid with respect to ResponseGetAllowedMimetypes
  */
  public static ResponseGetAllowedMimetypes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResponseGetAllowedMimetypes.class);
  }

 /**
  * Convert an instance of ResponseGetAllowedMimetypes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

