# HotelsApi

All URIs are relative to _https://api.nlite.ml/v1_

| Method                                                | HTTP request              | Description                                      |
| ----------------------------------------------------- | ------------------------- | ------------------------------------------------ |
| [**getData**](HotelsApi.md#getData)                   | **GET** /data             | Search by Destination/Hotel                      |
| [**hotelsHotelIdGet**](HotelsApi.md#hotelsHotelIdGet) | **GET** /hotels/{hotelId} | Get Room Availability &amp; Rates for a Hotel ID |
| [**hotelsPost**](HotelsApi.md#hotelsPost)             | **POST** /hotels          | Get Minimum Price for Available Hotels           |

<a name="getData"></a>

# **getData**

> GetData200Response getData(countryCode, hotelName, cityName, limit, offset, latitude, longitude, distance)

Search by Destination/Hotel

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.HotelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.nlite.ml/v1");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HotelsApi apiInstance = new HotelsApi(defaultClient);
    String countryCode = "countryCode_example"; // String | country code Alpha-2 code (example US, RU, CN)
    String hotelName = "hotelName_example"; // String | hotel name
    String cityName = "cityName_example"; // String | city name
    BigDecimal limit = new BigDecimal(78); // BigDecimal | limit results (max value 1000)
    BigDecimal offset = new BigDecimal(78); // BigDecimal | results offset
    BigDecimal latitude = new BigDecimal(78); // BigDecimal | latitude geo coordinates
    BigDecimal longitude = new BigDecimal(78); // BigDecimal | longtude geo coordinates
    BigDecimal distance = new BigDecimal(78); // BigDecimal | the distance starting from the selected geopgraphic point
    try {
      GetData200Response result = apiInstance.getData(countryCode, hotelName, cityName, limit, offset, latitude, longitude, distance);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HotelsApi#getData");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name            | Type           | Description                                               | Notes      |
| --------------- | -------------- | --------------------------------------------------------- | ---------- |
| **countryCode** | **String**     | country code Alpha-2 code (example US, RU, CN)            |            |
| **hotelName**   | **String**     | hotel name                                                | [optional] |
| **cityName**    | **String**     | city name                                                 | [optional] |
| **limit**       | **BigDecimal** | limit results (max value 1000)                            | [optional] |
| **offset**      | **BigDecimal** | results offset                                            | [optional] |
| **latitude**    | **BigDecimal** | latitude geo coordinates                                  | [optional] |
| **longitude**   | **BigDecimal** | longtude geo coordinates                                  | [optional] |
| **distance**    | **BigDecimal** | the distance starting from the selected geopgraphic point | [optional] |

### Return type

[**GetData200Response**](GetData200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
| ----------- | ----------- | ---------------- |
| **200**     | OK          | -                |

<a name="hotelsHotelIdGet"></a>

# **hotelsHotelIdGet**

> Object hotelsHotelIdGet(hotelId, rid, xid, checkin, checkout, adults, guestNationality, currency, sessionId)

Get Room Availability &amp; Rates for a Hotel ID

This endpoint allows you to send a hotel ID with a specific date range and in response receive all the rooms, rates that are available along with the cancelllation policies.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.HotelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.nlite.ml/v1");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HotelsApi apiInstance = new HotelsApi(defaultClient);
    Integer hotelId = 436827; // Integer |
    String rid = "888-8888-8888-888"; // String |
    String xid = "xid_example"; // String |
    String checkin = "2023-01-15"; // String |
    String checkout = "2023-01-16"; // String |
    Integer adults = 1; // Integer |
    String guestNationality = "MA"; // String |
    String currency = "USD"; // String |
    String sessionId = "GIYDEMZNGAYS2MJVPQZDAMRTFUYDCLJRGZ6DC7D4JVAXY7DZM5MDMQKKJJAXKZY"; // String |
    try {
      Object result = apiInstance.hotelsHotelIdGet(hotelId, rid, xid, checkin, checkout, adults, guestNationality, currency, sessionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HotelsApi#hotelsHotelIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name                 | Type        | Description | Notes      |
| -------------------- | ----------- | ----------- | ---------- |
| **hotelId**          | **Integer** |             |            |
| **rid**              | **String**  |             | [optional] |
| **xid**              | **String**  |             | [optional] |
| **checkin**          | **String**  |             | [optional] |
| **checkout**         | **String**  |             | [optional] |
| **adults**           | **Integer** |             | [optional] |
| **guestNationality** | **String**  |             | [optional] |
| **currency**         | **String**  |             | [optional] |
| **sessionId**        | **String**  |             | [optional] |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers                                                                                                                                                                                                                                                                                  |
| ----------- | ----------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **200**     | OK          | _ Access-Control-Allow-Credentials - <br> _ Access-Control-Allow-Headers - <br> _ Access-Control-Allow-Methods - <br> _ Access-Control-Allow-Origin - <br> _ Access-Control-Expose-Headers - <br> _ Access-Control-Max-Age - <br> _ Content-Type - <br> _ Date - <br> \* Transfer-Encoding - <br> |
| **400**     | Bad Request | _ Access-Control-Allow-Credentials - <br> _ Access-Control-Allow-Headers - <br> _ Access-Control-Allow-Methods - <br> _ Access-Control-Allow-Origin - <br> _ Access-Control-Expose-Headers - <br> _ Access-Control-Max-Age - <br> _ Content-Type - <br> _ Date - <br> \* Content-Length - <br>    |

<a name="hotelsPost"></a>

# **hotelsPost**

> Object hotelsPost(rid, hotelsPostRequest)

Get Minimum Price for Available Hotels

This endpoint allows you to send a list of hotel ID&#39;s for a specific date range and in response receive the best rate available for each of the hotel ID&#39;s. The limit is set to 200 hotels.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.HotelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.nlite.ml/v1");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    HotelsApi apiInstance = new HotelsApi(defaultClient);
    String rid = "888-8888-8888-888"; // String |
    HotelsPostRequest hotelsPostRequest = new HotelsPostRequest(); // HotelsPostRequest |
    try {
      Object result = apiInstance.hotelsPost(rid, hotelsPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HotelsApi#hotelsPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name                  | Type                                          | Description | Notes      |
| --------------------- | --------------------------------------------- | ----------- | ---------- |
| **rid**               | **String**                                    |             | [optional] |
| **hotelsPostRequest** | [**HotelsPostRequest**](HotelsPostRequest.md) |             | [optional] |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description  | Response headers                                                                                                                                                                                                                                                                               |
| ----------- | ------------ | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **200**     | OK           | _ Access-Control-Allow-Credentials - <br> _ Access-Control-Allow-Headers - <br> _ Access-Control-Allow-Methods - <br> _ Access-Control-Allow-Origin - <br> _ Access-Control-Expose-Headers - <br> _ Access-Control-Max-Age - <br> _ Content-Type - <br> _ Date - <br> \* Content-Length - <br> |
| **400**     | Bad Request  | _ Access-Control-Allow-Credentials - <br> _ Access-Control-Allow-Headers - <br> _ Access-Control-Allow-Methods - <br> _ Access-Control-Allow-Origin - <br> _ Access-Control-Expose-Headers - <br> _ Access-Control-Max-Age - <br> _ Content-Type - <br> _ Date - <br> \* Content-Length - <br> |
| **401**     | Unauthorized | _ Access-Control-Allow-Credentials - <br> _ Access-Control-Allow-Headers - <br> _ Access-Control-Allow-Methods - <br> _ Access-Control-Allow-Origin - <br> _ Access-Control-Expose-Headers - <br> _ Access-Control-Max-Age - <br> _ Content-Type - <br> _ Date - <br> \* Content-Length - <br> |
