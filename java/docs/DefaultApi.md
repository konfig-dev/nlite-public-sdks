# DefaultApi

All URIs are relative to *https://api.nlite.ml/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**hotelsData**](DefaultApi.md#hotelsData) | **GET** /data | hotels data |


<a name="hotelsData"></a>
# **hotelsData**
> HotelsData200Response hotelsData(hotelName, cityName, countryCode, limit, offset, rid, xid)

hotels data

hotels data

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.nlite.ml/v1");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String hotelName = "ibis"; // String | 
    String cityName = "paris"; // String | 
    String countryCode = "FR"; // String | 
    String limit = "10"; // String | 
    String offset = "5"; // String | 
    String rid = "888-8888-8888-888"; // String | 
    String xid = ""; // String | 
    try {
      HotelsData200Response result = apiInstance.hotelsData(hotelName, cityName, countryCode, limit, offset, rid, xid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#hotelsData");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **hotelName** | **String**|  | [optional] |
| **cityName** | **String**|  | [optional] |
| **countryCode** | **String**|  | [optional] |
| **limit** | **String**|  | [optional] |
| **offset** | **String**|  | [optional] |
| **rid** | **String**|  | [optional] |
| **xid** | **String**|  | [optional] |

### Return type

[**HotelsData200Response**](HotelsData200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ibis hotels in Paris France |  * Access-Control-Allow-Credentials -  <br>  * Access-Control-Allow-Headers -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Expose-Headers -  <br>  * Access-Control-Max-Age -  <br>  * Connection -  <br>  * Content-Encoding -  <br>  * Content-Length -  <br>  * Date -  <br>  * x-amz-apigw-id -  <br>  * x-amzn-Remapped-Date -  <br>  * x-amzn-RequestId -  <br>  |
| **400** | Retrieve hotel no availability |  * Access-Control-Allow-Credentials -  <br>  * Access-Control-Allow-Headers -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Expose-Headers -  <br>  * Access-Control-Max-Age -  <br>  * Content-Length -  <br>  * Date -  <br>  |

