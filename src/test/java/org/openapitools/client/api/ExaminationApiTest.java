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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.ApiError;
import org.openapitools.client.model.GetExaminationsV3200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExaminationApi
 */
@Disabled
public class ExaminationApiTest {

    private final ExaminationApi api = new ExaminationApi();

    /**
     * Get examinations
     *
     * Gets all examination.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getExaminationsV3Test() throws ApiException {
        Integer page = null;
        Integer pageSize = null;
        String xApiVersion = null;
        List<String> sort = null;
        String code = null;
        String name = null;
        String unit = null;
        GetExaminationsV3200Response response = api.getExaminationsV3(page, pageSize, xApiVersion, sort, code, name, unit);
        // TODO: test validations
    }

}