# BookingManagementAPI

All URIs are relative to _https://api.nlite.ml/v1_

| Method                                                                         | HTTP request                     | Description      |
| ------------------------------------------------------------------------------ | -------------------------------- | ---------------- |
| [**bookingsBookingIdDelete**](BookingManagementAPI.md#bookingsbookingiddelete) | **DELETE** /bookings/{bookingId} | Cancel booking   |
| [**bookingsBookingIdGet**](BookingManagementAPI.md#bookingsbookingidget)       | **GET** /bookings/{bookingId}    | Retrieve booking |

# **bookingsBookingIdDelete**

```swift
    open class func bookingsBookingIdDelete(bookingId: String, completion: @escaping (_ data: AnyCodable?, _ error: Error?) -> Void)
```

Cancel booking

This endpoint allows you to cancel a booking based on a booking ID. The refund amount is based on the cancellation policies. <!-- theme: danger -->

### Example

```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let bookingId = "bookingId_example" // String | (Required) The unique identifier of the booking you would like to update.

// Cancel booking
BookingManagementAPI.bookingsBookingIdDelete(bookingId: bookingId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

| Name          | Type       | Description                                                               | Notes |
| ------------- | ---------- | ------------------------------------------------------------------------- | ----- |
| **bookingId** | **String** | (Required) The unique identifier of the booking you would like to update. |

### Return type

[**AnyCodable**](AnyCodable.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bookingsBookingIdGet**

```swift
    open class func bookingsBookingIdGet(bookingId: String, completion: @escaping (_ data: AnyCodable?, _ error: Error?) -> Void)
```

Retrieve booking

This endpoint allows you to retrieve all the information for specific booking ID.

### Example

```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let bookingId = "bookingId_example" // String | (Required) The unique identifier of the booking you would like to update.

// Retrieve booking
BookingManagementAPI.bookingsBookingIdGet(bookingId: bookingId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

| Name          | Type       | Description                                                               | Notes |
| ------------- | ---------- | ------------------------------------------------------------------------- | ----- |
| **bookingId** | **String** | (Required) The unique identifier of the booking you would like to update. |

### Return type

[**AnyCodable**](AnyCodable.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
