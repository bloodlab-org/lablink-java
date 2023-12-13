# HealthApi

All URIs are relative to *https://blutspende.org/lablink*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getHealth**](HealthApi.md#getHealth) | **GET** /health | Service health check |


<a id="getHealth"></a>
# **getHealth**
> HealthCheck getHealth()

Service health check

Shows if the service is running or not.

### Example
```java
// Import classes:
import org.blutspende.lablink.ApiClient;
import org.blutspende.lablink.ApiException;
import org.blutspende.lablink.Configuration;
import org.blutspende.lablink.models.*;
import org.blutspende.lablink.api.HealthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://blutspende.org/lablink");

    HealthApi apiInstance = new HealthApi(defaultClient);
    try {
      HealthCheck result = apiInstance.getHealth();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HealthApi#getHealth");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**HealthCheck**](HealthCheck.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

