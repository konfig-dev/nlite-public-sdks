# HotelsApi

All URIs are relative to _https://api.nlite.ml/v1_

| Method                                                | HTTP request              | Description                                      |
| ----------------------------------------------------- | ------------------------- | ------------------------------------------------ |
| [**getData**](HotelsApi.md#getData)                   | **GET** /data             | Search by Destination/Hotel                      |
| [**hotelsHotelIdGet**](HotelsApi.md#hotelsHotelIdGet) | **GET** /hotels/{hotelId} | Get Room Availability &amp; Rates for a Hotel ID |
| [**hotelsPost**](HotelsApi.md#hotelsPost)             | **POST** /hotels          | Get Minimum Price for Available Hotels           |

## getData

> GetData200Response getData(countryCode, hotelName, cityName, limit, offset, latitude, longitude, distance)

Search by Destination/Hotel

### Example

```java
// Import classes:
//import org.openapitools.client.api.HotelsApi;

HotelsApi apiInstance = new HotelsApi();
String countryCode = null; // String | country code Alpha-2 code (example US, RU, CN)
String hotelName = null; // String | hotel name
String cityName = null; // String | city name
BigDecimal limit = null; // BigDecimal | limit results (max value 1000)
BigDecimal offset = null; // BigDecimal | results offset
BigDecimal latitude = null; // BigDecimal | latitude geo coordinates
BigDecimal longitude = null; // BigDecimal | longtude geo coordinates
BigDecimal distance = null; // BigDecimal | the distance starting from the selected geopgraphic point
try {
    GetData200Response result = apiInstance.getData(countryCode, hotelName, cityName, limit, offset, latitude, longitude, distance);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HotelsApi#getData");
    e.printStackTrace();
}
```

### Parameters

| Name            | Type           | Description                                               | Notes                        |
| --------------- | -------------- | --------------------------------------------------------- | ---------------------------- |
| **countryCode** | **String**     | country code Alpha-2 code (example US, RU, CN)            | [default to null]            |
| **hotelName**   | **String**     | hotel name                                                | [optional] [default to null] |
| **cityName**    | **String**     | city name                                                 | [optional] [default to null] |
| **limit**       | **BigDecimal** | limit results (max value 1000)                            | [optional] [default to null] |
| **offset**      | **BigDecimal** | results offset                                            | [optional] [default to null] |
| **latitude**    | **BigDecimal** | latitude geo coordinates                                  | [optional] [default to null] |
| **longitude**   | **BigDecimal** | longtude geo coordinates                                  | [optional] [default to null] |
| **distance**    | **BigDecimal** | the distance starting from the selected geopgraphic point | [optional] [default to null] |

### Return type

[**GetData200Response**](GetData200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

## hotelsHotelIdGet

> Object hotelsHotelIdGet(hotelId, rid, xid, checkin, checkout, adults, guestNationality, currency, sessionId)

Get Room Availability &amp; Rates for a Hotel ID

This endpoint allows you to send a hotel ID with a specific date range and in response receive all the rooms, rates that are available along with the cancelllation policies.

### Example

```java
// Import classes:
//import org.openapitools.client.api.HotelsApi;

HotelsApi apiInstance = new HotelsApi();
Integer hotelId = 436827; // Integer |
String rid = 888-8888-8888-888; // String |
String xid = null; // String |
String checkin = 2023-01-15; // String |
String checkout = 2023-01-16; // String |
Integer adults = 1; // Integer |
String guestNationality = MA; // String |
String currency = USD; // String |
String sessionId = GIYDEMZNGAYS2MJVPQZDAMRTFUYDCLJRGZ6DC7D4JVAXY7DZM5MDMQKKJJAXKZY; // String |
try {
    Object result = apiInstance.hotelsHotelIdGet(hotelId, rid, xid, checkin, checkout, adults, guestNationality, currency, sessionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HotelsApi#hotelsHotelIdGet");
    e.printStackTrace();
}
```

### Parameters

| Name                 | Type        | Description | Notes                        |
| -------------------- | ----------- | ----------- | ---------------------------- |
| **hotelId**          | **Integer** |             | [default to null]            |
| **rid**              | **String**  |             | [optional] [default to null] |
| **xid**              | **String**  |             | [optional] [default to null] |
| **checkin**          | **String**  |             | [optional] [default to null] |
| **checkout**         | **String**  |             | [optional] [default to null] |
| **adults**           | **Integer** |             | [optional] [default to null] |
| **guestNationality** | **String**  |             | [optional] [default to null] |
| **currency**         | **String**  |             | [optional] [default to null] |
| **sessionId**        | **String**  |             | [optional] [default to null] |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

## hotelsPost

> Object hotelsPost(rid, hotelsPostRequest)

Get Minimum Price for Available Hotels

This endpoint allows you to send a list of hotel ID&#39;s for a specific date range and in response receive the best rate available for each of the hotel ID&#39;s. The limit is set to 200 hotels.

### Example

```java
// Import classes:
//import org.openapitools.client.api.HotelsApi;

HotelsApi apiInstance = new HotelsApi();
String rid = 888-8888-8888-888; // String |
HotelsPostRequest hotelsPostRequest = {"checkin":"2023-03-15","checkout":"2023-03-16","latitude":41.009336416923006,"longitude":28.96179423827173,"country":"TR","distance":500,"adults":1,"children":"12,9","currency":"EUR","guestNationality":"MA"}; // HotelsPostRequest |
try {
    Object result = apiInstance.hotelsPost(rid, hotelsPostRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HotelsApi#hotelsPost");
    e.printStackTrace();
}
```

### Parameters

| Name                  | Type                                          | Description | Notes                        |
| --------------------- | --------------------------------------------- | ----------- | ---------------------------- |
| **rid**               | **String**                                    |             | [optional] [default to null] |
| **hotelsPostRequest** | [**HotelsPostRequest**](HotelsPostRequest.md) |             | [optional]                   |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json
