# NliteApi.DefaultApi

All URIs are relative to *https://api.nlite.ml/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**hotelsData**](DefaultApi.md#hotelsData) | **GET** /data | hotels data



## hotelsData

> HotelsData200Response hotelsData(opts)

hotels data

hotels data

### Example

```javascript
import NliteApi from 'nlite_api';

let apiInstance = new NliteApi.DefaultApi();
let opts = {
  'hotelName': ibis, // String | 
  'cityName': paris, // String | 
  'countryCode': FR, // String | 
  'limit': 10, // String | 
  'offset': 5, // String | 
  'rid': 888-8888-8888-888, // String | 
  'xid':  // String | 
};
apiInstance.hotelsData(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hotelName** | **String**|  | [optional] 
 **cityName** | **String**|  | [optional] 
 **countryCode** | **String**|  | [optional] 
 **limit** | **String**|  | [optional] 
 **offset** | **String**|  | [optional] 
 **rid** | **String**|  | [optional] 
 **xid** | **String**|  | [optional] 

### Return type

[**HotelsData200Response**](HotelsData200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

