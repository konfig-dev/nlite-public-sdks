# BookingsApi

All URIs are relative to _https://api.nlite.ml/v1_

| Method                                        | HTTP request      | Description |
| --------------------------------------------- | ----------------- | ----------- |
| [**bookPost**](BookingsApi.md#bookPost)       | **POST** /book    | Book        |
| [**prebookPost**](BookingsApi.md#prebookPost) | **POST** /prebook | Prebook     |

<a name="bookPost"></a>

# **bookPost**

> Object bookPost(body)

Book

This endpoint allows you to send a specific prebook ID along with the email to confirm the booking for a specific room in a specific hotel.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BookingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.nlite.ml/v1");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    BookingsApi apiInstance = new BookingsApi(defaultClient);
    Object body = null; // Object |
    try {
      Object result = apiInstance.bookPost(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookingsApi#bookPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name     | Type       | Description | Notes      |
| -------- | ---------- | ----------- | ---------- |
| **body** | **Object** |             | [optional] |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
| ----------- | ----------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **200**     | OK          | _ Date - <br> _ Content-Type - <br> _ Content-Length - <br> _ Connection - <br> _ x-amzn-RequestId - <br> _ Access-Control-Allow-Origin - <br> _ Content-Encoding - <br> _ Access-Control-Allow-Headers - <br> _ x-amzn-Remapped-Content-Length - <br> _ x-amz-apigw-id - <br> _ Access-Control-Allow-Methods - <br> _ Access-Control-Expose-Headers - <br> _ x-amzn-Remapped-Date - <br> _ Access-Control-Max-Age - <br> \* Access-Control-Allow-Credentials - <br> |

<a name="prebookPost"></a>

# **prebookPost**

> Object prebookPost(body)

Prebook

This endpoint allows you to send a specific rate ID along with the session ID to confirm the room availability, rates and cancellation policies in the response. A prebook-id is also part of the response which can be used to book a specific room in a hotel.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BookingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.nlite.ml/v1");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    BookingsApi apiInstance = new BookingsApi(defaultClient);
    Object body = null; // Object |
    try {
      Object result = apiInstance.prebookPost(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookingsApi#prebookPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name     | Type       | Description | Notes      |
| -------- | ---------- | ----------- | ---------- |
| **body** | **Object** |             | [optional] |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers                                                                                                                                                                                                                                                                               |
| ----------- | ----------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **200**     | OK          | _ Access-Control-Allow-Credentials - <br> _ Access-Control-Allow-Headers - <br> _ Access-Control-Allow-Methods - <br> _ Access-Control-Allow-Origin - <br> _ Access-Control-Expose-Headers - <br> _ Access-Control-Max-Age - <br> _ Content-Type - <br> _ Date - <br> \* Content-Length - <br> |
