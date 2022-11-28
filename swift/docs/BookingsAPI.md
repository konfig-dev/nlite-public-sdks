# BookingsAPI

All URIs are relative to _https://api.nlite.ml/v1_

| Method                                        | HTTP request      | Description |
| --------------------------------------------- | ----------------- | ----------- |
| [**bookPost**](BookingsAPI.md#bookpost)       | **POST** /book    | Book        |
| [**prebookPost**](BookingsAPI.md#prebookpost) | **POST** /prebook | Prebook     |

# **bookPost**

```swift
    open class func bookPost(body: AnyCodable? = nil, completion: @escaping (_ data: AnyCodable?, _ error: Error?) -> Void)
```

Book

This endpoint allows you to send a specific prebook ID along with the email to confirm the booking for a specific room in a specific hotel.

### Example

```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let body = "TODO" // AnyCodable |  (optional)

// Book
BookingsAPI.bookPost(body: body) { (response, error) in
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

| Name     | Type           | Description | Notes      |
| -------- | -------------- | ----------- | ---------- |
| **body** | **AnyCodable** |             | [optional] |

### Return type

[**AnyCodable**](AnyCodable.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **prebookPost**

```swift
    open class func prebookPost(body: AnyCodable? = nil, completion: @escaping (_ data: AnyCodable?, _ error: Error?) -> Void)
```

Prebook

This endpoint allows you to send a specific rate ID along with the session ID to confirm the room availability, rates and cancellation policies in the response. A prebook-id is also part of the response which can be used to book a specific room in a hotel.

### Example

```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let body = "TODO" // AnyCodable |  (optional)

// Prebook
BookingsAPI.prebookPost(body: body) { (response, error) in
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

| Name     | Type           | Description | Notes      |
| -------- | -------------- | ----------- | ---------- |
| **body** | **AnyCodable** |             | [optional] |

### Return type

[**AnyCodable**](AnyCodable.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
