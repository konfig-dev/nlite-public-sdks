# DefaultAPI

All URIs are relative to *https://api.nlite.ml/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**hotelsData**](DefaultAPI.md#hotelsdata) | **GET** /data | hotels data


# **hotelsData**
```swift
    open class func hotelsData(hotelName: String? = nil, cityName: String? = nil, countryCode: String? = nil, limit: String? = nil, offset: String? = nil, rid: String? = nil, xid: String? = nil, completion: @escaping (_ data: HotelsData200Response?, _ error: Error?) -> Void)
```

hotels data

hotels data

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let hotelName = "hotelName_example" // String |  (optional)
let cityName = "cityName_example" // String |  (optional)
let countryCode = "countryCode_example" // String |  (optional)
let limit = "limit_example" // String |  (optional)
let offset = "offset_example" // String |  (optional)
let rid = "rid_example" // String |  (optional)
let xid = "" // String |  (optional)

// hotels data
DefaultAPI.hotelsData(hotelName: hotelName, cityName: cityName, countryCode: countryCode, limit: limit, offset: offset, rid: rid, xid: xid) { (response, error) in
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hotelName** | **String** |  | [optional] 
 **cityName** | **String** |  | [optional] 
 **countryCode** | **String** |  | [optional] 
 **limit** | **String** |  | [optional] 
 **offset** | **String** |  | [optional] 
 **rid** | **String** |  | [optional] 
 **xid** | **String** |  | [optional] 

### Return type

[**HotelsData200Response**](HotelsData200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

