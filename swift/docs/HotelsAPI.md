# HotelsAPI

All URIs are relative to _https://api.nlite.ml/v1_

| Method                                                | HTTP request              | Description                                      |
| ----------------------------------------------------- | ------------------------- | ------------------------------------------------ |
| [**getData**](HotelsAPI.md#getdata)                   | **GET** /data             | Search by Destination/Hotel                      |
| [**hotelsHotelIdGet**](HotelsAPI.md#hotelshotelidget) | **GET** /hotels/{hotelId} | Get Room Availability &amp; Rates for a Hotel ID |
| [**hotelsPost**](HotelsAPI.md#hotelspost)             | **POST** /hotels          | Get Minimum Price for Available Hotels           |

# **getData**

```swift
    open class func getData(countryCode: String, hotelName: String? = nil, cityName: String? = nil, limit: Double? = nil, offset: Double? = nil, latitude: Double? = nil, longitude: Double? = nil, distance: Double? = nil, completion: @escaping (_ data: GetData200Response?, _ error: Error?) -> Void)
```

Search by Destination/Hotel

### Example

```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let countryCode = "countryCode_example" // String | country code Alpha-2 code (example US, RU, CN)
let hotelName = "hotelName_example" // String | hotel name (optional)
let cityName = "cityName_example" // String | city name (optional)
let limit = 987 // Double | limit results (max value 1000) (optional)
let offset = 987 // Double | results offset (optional)
let latitude = 987 // Double | latitude geo coordinates (optional)
let longitude = 987 // Double | longtude geo coordinates (optional)
let distance = 987 // Double | the distance starting from the selected geopgraphic point (optional)

// Search by Destination/Hotel
HotelsAPI.getData(countryCode: countryCode, hotelName: hotelName, cityName: cityName, limit: limit, offset: offset, latitude: latitude, longitude: longitude, distance: distance) { (response, error) in
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

| Name            | Type       | Description                                               | Notes      |
| --------------- | ---------- | --------------------------------------------------------- | ---------- |
| **countryCode** | **String** | country code Alpha-2 code (example US, RU, CN)            |
| **hotelName**   | **String** | hotel name                                                | [optional] |
| **cityName**    | **String** | city name                                                 | [optional] |
| **limit**       | **Double** | limit results (max value 1000)                            | [optional] |
| **offset**      | **Double** | results offset                                            | [optional] |
| **latitude**    | **Double** | latitude geo coordinates                                  | [optional] |
| **longitude**   | **Double** | longtude geo coordinates                                  | [optional] |
| **distance**    | **Double** | the distance starting from the selected geopgraphic point | [optional] |

### Return type

[**GetData200Response**](GetData200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **hotelsHotelIdGet**

```swift
    open class func hotelsHotelIdGet(hotelId: Int, rid: String? = nil, xid: String? = nil, checkin: String? = nil, checkout: String? = nil, adults: Int? = nil, guestNationality: String? = nil, currency: String? = nil, sessionId: String? = nil, completion: @escaping (_ data: AnyCodable?, _ error: Error?) -> Void)
```

Get Room Availability & Rates for a Hotel ID

This endpoint allows you to send a hotel ID with a specific date range and in response receive all the rooms, rates that are available along with the cancelllation policies.

### Example

```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let hotelId = 987 // Int |
let rid = "rid_example" // String |  (optional)
let xid = "xid_example" // String |  (optional)
let checkin = "checkin_example" // String |  (optional)
let checkout = "checkout_example" // String |  (optional)
let adults = 987 // Int |  (optional)
let guestNationality = "guestNationality_example" // String |  (optional)
let currency = "currency_example" // String |  (optional)
let sessionId = "sessionId_example" // String |  (optional)

// Get Room Availability & Rates for a Hotel ID
HotelsAPI.hotelsHotelIdGet(hotelId: hotelId, rid: rid, xid: xid, checkin: checkin, checkout: checkout, adults: adults, guestNationality: guestNationality, currency: currency, sessionId: sessionId) { (response, error) in
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

| Name                 | Type       | Description | Notes      |
| -------------------- | ---------- | ----------- | ---------- |
| **hotelId**          | **Int**    |             |
| **rid**              | **String** |             | [optional] |
| **xid**              | **String** |             | [optional] |
| **checkin**          | **String** |             | [optional] |
| **checkout**         | **String** |             | [optional] |
| **adults**           | **Int**    |             | [optional] |
| **guestNationality** | **String** |             | [optional] |
| **currency**         | **String** |             | [optional] |
| **sessionId**        | **String** |             | [optional] |

### Return type

[**AnyCodable**](AnyCodable.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **hotelsPost**

```swift
    open class func hotelsPost(rid: String? = nil, hotelsPostRequest: HotelsPostRequest? = nil, completion: @escaping (_ data: AnyCodable?, _ error: Error?) -> Void)
```

Get Minimum Price for Available Hotels

This endpoint allows you to send a list of hotel ID's for a specific date range and in response receive the best rate available for each of the hotel ID's. The limit is set to 200 hotels.

### Example

```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let rid = "rid_example" // String |  (optional)
let hotelsPostRequest = _hotels_post_request(checkin: "checkin_example", checkout: "checkout_example", latitude: 123, longitude: 123, country: "country_example", distance: 123, adults: 123, children: "children_example", currency: "currency_example", guestNationality: "guestNationality_example") // HotelsPostRequest |  (optional)

// Get Minimum Price for Available Hotels
HotelsAPI.hotelsPost(rid: rid, hotelsPostRequest: hotelsPostRequest) { (response, error) in
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

| Name                  | Type                                          | Description | Notes      |
| --------------------- | --------------------------------------------- | ----------- | ---------- |
| **rid**               | **String**                                    |             | [optional] |
| **hotelsPostRequest** | [**HotelsPostRequest**](HotelsPostRequest.md) |             | [optional] |

### Return type

[**AnyCodable**](AnyCodable.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
