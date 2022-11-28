# LiteApi.BookingManagementApi

All URIs are relative to _https://api.nlite.ml/v1_

| Method                                                                         | HTTP request                     | Description      |
| ------------------------------------------------------------------------------ | -------------------------------- | ---------------- |
| [**bookingsBookingIdDelete**](BookingManagementApi.md#bookingsBookingIdDelete) | **DELETE** /bookings/{bookingId} | Cancel booking   |
| [**bookingsBookingIdGet**](BookingManagementApi.md#bookingsBookingIdGet)       | **GET** /bookings/{bookingId}    | Retrieve booking |

## bookingsBookingIdDelete

> Object bookingsBookingIdDelete(bookingId)

Cancel booking

This endpoint allows you to cancel a booking based on a booking ID. The refund amount is based on the cancellation policies. &lt;!-- theme: danger --&gt;

### Example

```javascript
import LiteApi from "lite_api";
let defaultClient = LiteApi.ApiClient.instance;
// Configure API key authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications["ApiKeyAuth"];
ApiKeyAuth.apiKey = "YOUR API KEY";
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.apiKeyPrefix = 'Token';

let apiInstance = new LiteApi.BookingManagementApi();
let bookingId = SEMkJ9lNM; // String | (Required) The unique identifier of the booking you would like to update.
apiInstance.bookingsBookingIdDelete(bookingId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log("API called successfully. Returned data: " + data);
  }
});
```

### Parameters

| Name          | Type       | Description                                                               | Notes |
| ------------- | ---------- | ------------------------------------------------------------------------- | ----- |
| **bookingId** | **String** | (Required) The unique identifier of the booking you would like to update. |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

## bookingsBookingIdGet

> Object bookingsBookingIdGet(bookingId)

Retrieve booking

This endpoint allows you to retrieve all the information for specific booking ID.

### Example

```javascript
import LiteApi from "lite_api";
let defaultClient = LiteApi.ApiClient.instance;
// Configure API key authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications["ApiKeyAuth"];
ApiKeyAuth.apiKey = "YOUR API KEY";
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.apiKeyPrefix = 'Token';

let apiInstance = new LiteApi.BookingManagementApi();
let bookingId = SEMkJ9lNM; // String | (Required) The unique identifier of the booking you would like to update.
apiInstance.bookingsBookingIdGet(bookingId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log("API called successfully. Returned data: " + data);
  }
});
```

### Parameters

| Name          | Type       | Description                                                               | Notes |
| ------------- | ---------- | ------------------------------------------------------------------------- | ----- |
| **bookingId** | **String** | (Required) The unique identifier of the booking you would like to update. |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json
