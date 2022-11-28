# LiteApi.HotelsApi

All URIs are relative to _https://api.nlite.ml/v1_

| Method                                                | HTTP request              | Description                                      |
| ----------------------------------------------------- | ------------------------- | ------------------------------------------------ |
| [**getData**](HotelsApi.md#getData)                   | **GET** /data             | Search by Destination/Hotel                      |
| [**hotelsHotelIdGet**](HotelsApi.md#hotelsHotelIdGet) | **GET** /hotels/{hotelId} | Get Room Availability &amp; Rates for a Hotel ID |
| [**hotelsPost**](HotelsApi.md#hotelsPost)             | **POST** /hotels          | Get Minimum Price for Available Hotels           |

## getData

> GetData200Response getData(countryCode, opts)

Search by Destination/Hotel

### Example

```javascript
import LiteApi from "lite_api";
let defaultClient = LiteApi.ApiClient.instance;
// Configure API key authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications["ApiKeyAuth"];
ApiKeyAuth.apiKey = "YOUR API KEY";
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.apiKeyPrefix = 'Token';

let apiInstance = new LiteApi.HotelsApi();
let countryCode = "countryCode_example"; // String | country code Alpha-2 code (example US, RU, CN)
let opts = {
  hotelName: "hotelName_example", // String | hotel name
  cityName: "cityName_example", // String | city name
  limit: 3.4, // Number | limit results (max value 1000)
  offset: 3.4, // Number | results offset
  latitude: 3.4, // Number | latitude geo coordinates
  longitude: 3.4, // Number | longtude geo coordinates
  distance: 3.4, // Number | the distance starting from the selected geopgraphic point
};
apiInstance.getData(countryCode, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log("API called successfully. Returned data: " + data);
  }
});
```

### Parameters

| Name            | Type       | Description                                               | Notes      |
| --------------- | ---------- | --------------------------------------------------------- | ---------- |
| **countryCode** | **String** | country code Alpha-2 code (example US, RU, CN)            |
| **hotelName**   | **String** | hotel name                                                | [optional] |
| **cityName**    | **String** | city name                                                 | [optional] |
| **limit**       | **Number** | limit results (max value 1000)                            | [optional] |
| **offset**      | **Number** | results offset                                            | [optional] |
| **latitude**    | **Number** | latitude geo coordinates                                  | [optional] |
| **longitude**   | **Number** | longtude geo coordinates                                  | [optional] |
| **distance**    | **Number** | the distance starting from the selected geopgraphic point | [optional] |

### Return type

[**GetData200Response**](GetData200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

## hotelsHotelIdGet

> Object hotelsHotelIdGet(hotelId, opts)

Get Room Availability &amp; Rates for a Hotel ID

This endpoint allows you to send a hotel ID with a specific date range and in response receive all the rooms, rates that are available along with the cancelllation policies.

### Example

```javascript
import LiteApi from "lite_api";
let defaultClient = LiteApi.ApiClient.instance;
// Configure API key authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications["ApiKeyAuth"];
ApiKeyAuth.apiKey = "YOUR API KEY";
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.apiKeyPrefix = 'Token';

let apiInstance = new LiteApi.HotelsApi();
let hotelId = 436827; // Number |
let opts = {
  rid: 888 - 8888 - 8888 - 888, // String |
  xid: "xid_example", // String |
  checkin: 2023 - 01 - 15, // String |
  checkout: 2023 - 01 - 16, // String |
  adults: 1, // Number |
  guestNationality: MA, // String |
  currency: USD, // String |
  sessionId: GIYDEMZNGAYS2MJVPQZDAMRTFUYDCLJRGZ6DC7D4JVAXY7DZM5MDMQKKJJAXKZY, // String |
};
apiInstance.hotelsHotelIdGet(hotelId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log("API called successfully. Returned data: " + data);
  }
});
```

### Parameters

| Name                 | Type       | Description | Notes      |
| -------------------- | ---------- | ----------- | ---------- |
| **hotelId**          | **Number** |             |
| **rid**              | **String** |             | [optional] |
| **xid**              | **String** |             | [optional] |
| **checkin**          | **String** |             | [optional] |
| **checkout**         | **String** |             | [optional] |
| **adults**           | **Number** |             | [optional] |
| **guestNationality** | **String** |             | [optional] |
| **currency**         | **String** |             | [optional] |
| **sessionId**        | **String** |             | [optional] |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

## hotelsPost

> Object hotelsPost(opts)

Get Minimum Price for Available Hotels

This endpoint allows you to send a list of hotel ID&#39;s for a specific date range and in response receive the best rate available for each of the hotel ID&#39;s. The limit is set to 200 hotels.

### Example

```javascript
import LiteApi from "lite_api";
let defaultClient = LiteApi.ApiClient.instance;
// Configure API key authorization: ApiKeyAuth
let ApiKeyAuth = defaultClient.authentications["ApiKeyAuth"];
ApiKeyAuth.apiKey = "YOUR API KEY";
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.apiKeyPrefix = 'Token';

let apiInstance = new LiteApi.HotelsApi();
let opts = {
  rid: 888 - 8888 - 8888 - 888, // String |
  hotelsPostRequest: {
    checkin: "2023-03-15",
    checkout: "2023-03-16",
    latitude: 41.009336416923006,
    longitude: 28.96179423827173,
    country: "TR",
    distance: 500,
    adults: 1,
    children: "12,9",
    currency: "EUR",
    guestNationality: "MA",
  }, // HotelsPostRequest |
};
apiInstance.hotelsPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log("API called successfully. Returned data: " + data);
  }
});
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
