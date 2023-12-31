/*
 * Lablink
 * Lablink Swagger documentation
 *
 * The version of the OpenAPI document: 3.0
 * Contact: laborit@blutspende.de
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.blutspende.lablink.api;

import org.blutspende.lablink.ApiException;
import org.blutspende.lablink.model.ApiError;
import org.blutspende.lablink.model.GetLocationsV3200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LocationApi
 */
@Disabled
public class LocationApiTest {

    private final LocationApi api = new LocationApi();

    /**
     * Get locations
     *
     * Gets all location.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLocationsV3Test() throws ApiException {
        Integer page = null;
        Integer pageSize = null;
        String xApiVersion = null;
        List<String> sort = null;
        String name = null;
        GetLocationsV3200Response response = api.getLocationsV3(page, pageSize, xApiVersion, sort, name);
        // TODO: test validations
    }

}
