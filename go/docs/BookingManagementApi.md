# \BookingManagementApi

All URIs are relative to _https://api.nlite.ml/v1_

| Method                                                                         | HTTP request                     | Description      |
| ------------------------------------------------------------------------------ | -------------------------------- | ---------------- |
| [**BookingsBookingIdDelete**](BookingManagementApi.md#BookingsBookingIdDelete) | **Delete** /bookings/{bookingId} | Cancel booking   |
| [**BookingsBookingIdGet**](BookingManagementApi.md#BookingsBookingIdGet)       | **Get** /bookings/{bookingId}    | Retrieve booking |

## BookingsBookingIdDelete

> map[string]any BookingsBookingIdDelete(ctx, bookingId).Execute()

Cancel booking

### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    bookingId := "SEMkJ9lNM" // string | (Required) The unique identifier of the booking you would like to update.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.BookingManagementApi.BookingsBookingIdDelete(context.Background(), bookingId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `BookingManagementApi.BookingsBookingIdDelete``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `BookingsBookingIdDelete`: map[string]any
    fmt.Fprintf(os.Stdout, "Response from `BookingManagementApi.BookingsBookingIdDelete`: %v\n", resp)
}
```

### Path Parameters

| Name          | Type                | Description                                                                 | Notes |
| ------------- | ------------------- | --------------------------------------------------------------------------- | ----- |
| **ctx**       | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc. |
| **bookingId** | **string**          | (Required) The unique identifier of the booking you would like to update.   |

### Other Parameters

Other parameters are passed through a pointer to a apiBookingsBookingIdDeleteRequest struct via the builder pattern

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |

### Return type

**map[string]any**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

## BookingsBookingIdGet

> map[string]any BookingsBookingIdGet(ctx, bookingId).Execute()

Retrieve booking

### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    bookingId := "SEMkJ9lNM" // string | (Required) The unique identifier of the booking you would like to update.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.BookingManagementApi.BookingsBookingIdGet(context.Background(), bookingId).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `BookingManagementApi.BookingsBookingIdGet``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `BookingsBookingIdGet`: map[string]any
    fmt.Fprintf(os.Stdout, "Response from `BookingManagementApi.BookingsBookingIdGet`: %v\n", resp)
}
```

### Path Parameters

| Name          | Type                | Description                                                                 | Notes |
| ------------- | ------------------- | --------------------------------------------------------------------------- | ----- |
| **ctx**       | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc. |
| **bookingId** | **string**          | (Required) The unique identifier of the booking you would like to update.   |

### Other Parameters

Other parameters are passed through a pointer to a apiBookingsBookingIdGetRequest struct via the builder pattern

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |

### Return type

**map[string]any**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)
