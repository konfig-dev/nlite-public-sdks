# LiteApi.BookingsApi

All URIs are relative to _https://api.nlite.ml/v1_

| Method                                        | HTTP request      | Description |
| --------------------------------------------- | ----------------- | ----------- |
| [**bookPost**](BookingsApi.md#bookPost)       | **POST** /book    | Book        |
| [**prebookPost**](BookingsApi.md#prebookPost) | **POST** /prebook | Prebook     |

## bookPost

> Object bookPost(opts)

Book

This endpoint allows you to send a specific prebook ID along with the email to confirm the booking for a specific room in a specific hotel.

### Example

```javascript
import LiteApi from "lite_api";
let defaultClient = LiteApi.ApiClient.instance;
// Configure API key authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications["ApiKeyAuth"];
ApiKeyAuth.apiKey = "YOUR API KEY";
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.apiKeyPrefix = 'Token';

let apiInstance = new LiteApi.BookingsApi();
let opts = {
  body: { key: null }, // Object |
};
apiInstance.bookPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log("API called successfully. Returned data: " + data);
  }
});
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

> Object prebookPost(opts)

Prebook

This endpoint allows you to send a specific rate ID along with the session ID to confirm the room availability, rates and cancellation policies in the response. A prebook-id is also part of the response which can be used to book a specific room in a hotel.

### Example

```javascript
import LiteApi from "lite_api";
let defaultClient = LiteApi.ApiClient.instance;
// Configure API key authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications["ApiKeyAuth"];
ApiKeyAuth.apiKey = "YOUR API KEY";
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.apiKeyPrefix = 'Token';

let apiInstance = new LiteApi.BookingsApi();
let opts = {
  body: { key: null }, // Object |
};
apiInstance.prebookPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log("API called successfully. Returned data: " + data);
  }
});
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
