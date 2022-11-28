# BookingManagementApi

All URIs are relative to _https://api.nlite.ml/v1_

| Method                                                                         | HTTP request                     | Description      |
| ------------------------------------------------------------------------------ | -------------------------------- | ---------------- |
| [**bookingsBookingIdDelete**](BookingManagementApi.md#bookingsBookingIdDelete) | **DELETE** /bookings/{bookingId} | Cancel booking   |
| [**bookingsBookingIdGet**](BookingManagementApi.md#bookingsBookingIdGet)       | **GET** /bookings/{bookingId}    | Retrieve booking |

<a name="bookingsBookingIdDelete"></a>

# **bookingsBookingIdDelete**

> Object bookingsBookingIdDelete(bookingId)

Cancel booking

This endpoint allows you to cancel a booking based on a booking ID. The refund amount is based on the cancellation policies. &lt;!-- theme: danger --&gt;

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BookingManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.nlite.ml/v1");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    BookingManagementApi apiInstance = new BookingManagementApi(defaultClient);
    String bookingId = "SEMkJ9lNM"; // String | (Required) The unique identifier of the booking you would like to update.
    try {
      Object result = apiInstance.bookingsBookingIdDelete(bookingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookingManagementApi#bookingsBookingIdDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name          | Type       | Description                                                               | Notes |
| ------------- | ---------- | ------------------------------------------------------------------------- | ----- |
| **bookingId** | **String** | (Required) The unique identifier of the booking you would like to update. |       |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description       | Response headers                                                                                                                                                                                                                                                                               |
| ----------- | ----------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **200**     | successful cancel | -                                                                                                                                                                                                                                                                                              |
| **400**     | Bad Request       | _ Access-Control-Allow-Credentials - <br> _ Access-Control-Allow-Headers - <br> _ Access-Control-Allow-Methods - <br> _ Access-Control-Allow-Origin - <br> _ Access-Control-Expose-Headers - <br> _ Access-Control-Max-Age - <br> _ Content-Type - <br> _ Date - <br> \* Content-Length - <br> |

<a name="bookingsBookingIdGet"></a>

# **bookingsBookingIdGet**

> Object bookingsBookingIdGet(bookingId)

Retrieve booking

This endpoint allows you to retrieve all the information for specific booking ID.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BookingManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.nlite.ml/v1");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    BookingManagementApi apiInstance = new BookingManagementApi(defaultClient);
    String bookingId = "SEMkJ9lNM"; // String | (Required) The unique identifier of the booking you would like to update.
    try {
      Object result = apiInstance.bookingsBookingIdGet(bookingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookingManagementApi#bookingsBookingIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name          | Type       | Description                                                               | Notes |
| ------------- | ---------- | ------------------------------------------------------------------------- | ----- |
| **bookingId** | **String** | (Required) The unique identifier of the booking you would like to update. |       |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers                                                                                                                                                                                                                                                                               |
| ----------- | ----------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **200**     | OK          | _ Access-Control-Allow-Credentials - <br> _ Access-Control-Allow-Headers - <br> _ Access-Control-Allow-Methods - <br> _ Access-Control-Allow-Origin - <br> _ Access-Control-Expose-Headers - <br> _ Access-Control-Max-Age - <br> _ Content-Type - <br> _ Date - <br> \* Content-Length - <br> |
| **400**     | Bad Request | _ Access-Control-Allow-Credentials - <br> _ Access-Control-Allow-Headers - <br> _ Access-Control-Allow-Methods - <br> _ Access-Control-Allow-Origin - <br> _ Access-Control-Expose-Headers - <br> _ Access-Control-Max-Age - <br> _ Content-Type - <br> _ Date - <br> \* Content-Length - <br> |
