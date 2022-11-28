/*
 * nlite API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.RateBookRequestContact;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * RateBookRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-10T16:56:49.845+01:00[Africa/Casablanca]")
public class RateBookRequest {
  public static final String SERIALIZED_NAME_CONTACT = "contact";
  @SerializedName(SERIALIZED_NAME_CONTACT)
  private RateBookRequestContact contact;

  public static final String SERIALIZED_NAME_PREBOOK_ID = "prebookId";
  @SerializedName(SERIALIZED_NAME_PREBOOK_ID)
  private String prebookId;

  public static final String SERIALIZED_NAME_RATE_ID = "rateId";
  @SerializedName(SERIALIZED_NAME_RATE_ID)
  private String rateId;

  public static final String SERIALIZED_NAME_SESSION_ID = "sessionId";
  @SerializedName(SERIALIZED_NAME_SESSION_ID)
  private String sessionId;

  public RateBookRequest() {
  }

  public RateBookRequest contact(RateBookRequestContact contact) {
    
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RateBookRequestContact getContact() {
    return contact;
  }


  public void setContact(RateBookRequestContact contact) {
    this.contact = contact;
  }


  public RateBookRequest prebookId(String prebookId) {
    
    this.prebookId = prebookId;
    return this;
  }

   /**
   * Get prebookId
   * @return prebookId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "qLEMBTh6O", value = "")

  public String getPrebookId() {
    return prebookId;
  }


  public void setPrebookId(String prebookId) {
    this.prebookId = prebookId;
  }


  public RateBookRequest rateId(String rateId) {
    
    this.rateId = rateId;
    return this;
  }

   /**
   * Get rateId
   * @return rateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2_4634XHAH6YZIURQNGOIQYD5QKQAOTDAQ3BN2ZPPUQ7KNRJPO7LRKIGRTNSWPA22TWLTSGQNVWJIT6NMCC4GXGZZ6NWB7WWB7TLIGRQFPUYFOJI3ESXRVWQM5WVQ7UYSYSVZSSQ5J6LOZW3JNZ3GRGPSI6ANEH4VSKBKYW77T2LWFMHWTVIWC7F34NSXG7VS6JFZGD7I6VQ535D5T3JHHRLWIWQ6UB35HCDVC5S4Q67KYEDUEYMJHTE3PIQ5I6NZBOKSVQ7ITNY5IIIYJMCS64GLHONSKL4E3HNJPHU5ODQSOW6644UDZTRDDICOPWSQNEPW2YJJPX4GDFBLM3J2YNTGOQXUSIQFQYP5NL4Z3JE52NAL4TA6LZ7LVRZVAOCGNS4ZGGKTA3SQ7F5UJVMUM7YKY4J3QTK6JGKVHP7TCDDEL2VKSCWDJ2WJBVH265EQH3DBLJCAJT2ZJJPFX64EKCRH7JXFZP2DVUTHSLBOF3QFBM43SRZ5LBD66BTPQCG74YKFYPXFBZWZKL374NEKOACZRR4D2KMRXWZ3ZZBXDYP3OKLW2FRVA", value = "")

  public String getRateId() {
    return rateId;
  }


  public void setRateId(String rateId) {
    this.rateId = rateId;
  }


  public RateBookRequest sessionId(String sessionId) {
    
    this.sessionId = sessionId;
    return this;
  }

   /**
   * Get sessionId
   * @return sessionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GIYDEMZNGAYS2MJVPQZDAMRTFUYDCLJRGZ6DC7BRGIWDS7CNIF6HY4DPK4ZUQ2TGIRREI", value = "")

  public String getSessionId() {
    return sessionId;
  }


  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateBookRequest rateBookRequest = (RateBookRequest) o;
    return Objects.equals(this.contact, rateBookRequest.contact) &&
        Objects.equals(this.prebookId, rateBookRequest.prebookId) &&
        Objects.equals(this.rateId, rateBookRequest.rateId) &&
        Objects.equals(this.sessionId, rateBookRequest.sessionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contact, prebookId, rateId, sessionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateBookRequest {\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    prebookId: ").append(toIndentedString(prebookId)).append("\n");
    sb.append("    rateId: ").append(toIndentedString(rateId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
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
    openapiFields.add("contact");
    openapiFields.add("prebookId");
    openapiFields.add("rateId");
    openapiFields.add("sessionId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RateBookRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RateBookRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RateBookRequest is not found in the empty JSON string", RateBookRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RateBookRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RateBookRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `contact`
      if (jsonObj.get("contact") != null && !jsonObj.get("contact").isJsonNull()) {
        RateBookRequestContact.validateJsonObject(jsonObj.getAsJsonObject("contact"));
      }
      if ((jsonObj.get("prebookId") != null && !jsonObj.get("prebookId").isJsonNull()) && !jsonObj.get("prebookId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prebookId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prebookId").toString()));
      }
      if ((jsonObj.get("rateId") != null && !jsonObj.get("rateId").isJsonNull()) && !jsonObj.get("rateId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rateId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rateId").toString()));
      }
      if ((jsonObj.get("sessionId") != null && !jsonObj.get("sessionId").isJsonNull()) && !jsonObj.get("sessionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sessionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sessionId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RateBookRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RateBookRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RateBookRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RateBookRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<RateBookRequest>() {
           @Override
           public void write(JsonWriter out, RateBookRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RateBookRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RateBookRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RateBookRequest
  * @throws IOException if the JSON string is invalid with respect to RateBookRequest
  */
  public static RateBookRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RateBookRequest.class);
  }

 /**
  * Convert an instance of RateBookRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
