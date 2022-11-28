# BookingManagementApi

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

```java
// Import classes:
//import org.openapitools.client.api.BookingManagementApi;

BookingManagementApi apiInstance = new BookingManagementApi();
String bookingId = SEMkJ9lNM; // String | (Required) The unique identifier of the booking you would like to update.
try {
    Object result = apiInstance.bookingsBookingIdDelete(bookingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingManagementApi#bookingsBookingIdDelete");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type       | Description                                                               | Notes             |
| ------------- | ---------- | ------------------------------------------------------------------------- | ----------------- |
| **bookingId** | **String** | (Required) The unique identifier of the booking you would like to update. | [default to null] |

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

```java
// Import classes:
//import org.openapitools.client.api.BookingManagementApi;

BookingManagementApi apiInstance = new BookingManagementApi();
String bookingId = SEMkJ9lNM; // String | (Required) The unique identifier of the booking you would like to update.
try {
    Object result = apiInstance.bookingsBookingIdGet(bookingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingManagementApi#bookingsBookingIdGet");
    e.printStackTrace();
}
```

### Parameters

| Name          | Type       | Description                                                               | Notes             |
| ------------- | ---------- | ------------------------------------------------------------------------- | ----------------- |
| **bookingId** | **String** | (Required) The unique identifier of the booking you would like to update. | [default to null] |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json
