# openapi-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.openapitools</groupId>
    <artifactId>openapi-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

- target/openapi-android-client-1.0.0.jar
- target/lib/\*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.client.api.BookingManagementApi;

public class BookingManagementApiExample {

    public static void main(String[] args) {
        BookingManagementApi apiInstance = new BookingManagementApi();
        String bookingId = SEMkJ9lNM; // String | (Required) The unique identifier of the booking you would like to update.
        try {
            Object result = apiInstance.bookingsBookingIdDelete(bookingId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BookingManagementApi#bookingsBookingIdDelete");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to _https://api.nlite.ml/v1_

| Class                  | Method                                                                              | HTTP request                     | Description                                      |
| ---------------------- | ----------------------------------------------------------------------------------- | -------------------------------- | ------------------------------------------------ |
| _BookingManagementApi_ | [**bookingsBookingIdDelete**](docs/BookingManagementApi.md#bookingsBookingIdDelete) | **DELETE** /bookings/{bookingId} | Cancel booking                                   |
| _BookingManagementApi_ | [**bookingsBookingIdGet**](docs/BookingManagementApi.md#bookingsBookingIdGet)       | **GET** /bookings/{bookingId}    | Retrieve booking                                 |
| _BookingsApi_          | [**bookPost**](docs/BookingsApi.md#bookPost)                                        | **POST** /book                   | Book                                             |
| _BookingsApi_          | [**prebookPost**](docs/BookingsApi.md#prebookPost)                                  | **POST** /prebook                | Prebook                                          |
| _HotelsApi_            | [**getData**](docs/HotelsApi.md#getData)                                            | **GET** /data                    | Search by Destination/Hotel                      |
| _HotelsApi_            | [**hotelsHotelIdGet**](docs/HotelsApi.md#hotelsHotelIdGet)                          | **GET** /hotels/{hotelId}        | Get Room Availability &amp; Rates for a Hotel ID |
| _HotelsApi_            | [**hotelsPost**](docs/HotelsApi.md#hotelsPost)                                      | **POST** /hotels                 | Get Minimum Price for Available Hotels           |

## Documentation for Models

- [GetData200Response](docs/GetData200Response.md)
- [GetData200ResponseDataInner](docs/GetData200ResponseDataInner.md)
- [GetData200ResponseDataInnerLocation](docs/GetData200ResponseDataInnerLocation.md)
- [HotelsPostRequest](docs/HotelsPostRequest.md)

## Documentation for Authorization

Authentication schemes defined for the API:

### ApiKeyAuth

- **Type**: API key

- **API key parameter name**: X-API-KEY
- **Location**: HTTP header

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author
