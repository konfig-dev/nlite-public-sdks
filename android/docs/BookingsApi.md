# BookingsApi

All URIs are relative to _https://api.nlite.ml/v1_

| Method                                        | HTTP request      | Description |
| --------------------------------------------- | ----------------- | ----------- |
| [**bookPost**](BookingsApi.md#bookPost)       | **POST** /book    | Book        |
| [**prebookPost**](BookingsApi.md#prebookPost) | **POST** /prebook | Prebook     |

## bookPost

> Object bookPost(body)

Book

This endpoint allows you to send a specific prebook ID along with the email to confirm the booking for a specific room in a specific hotel.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BookingsApi;

BookingsApi apiInstance = new BookingsApi();
Object body = null; // Object |
try {
    Object result = apiInstance.bookPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingsApi#bookPost");
    e.printStackTrace();
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

## prebookPost

> Object prebookPost(body)

Prebook

This endpoint allows you to send a specific rate ID along with the session ID to confirm the room availability, rates and cancellation policies in the response. A prebook-id is also part of the response which can be used to book a specific room in a hotel.

### Example

```java
// Import classes:
//import org.openapitools.client.api.BookingsApi;

BookingsApi apiInstance = new BookingsApi();
Object body = null; // Object |
try {
    Object result = apiInstance.prebookPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingsApi#prebookPost");
    e.printStackTrace();
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
