/*
 * �Y~� Cheshire-Cat API
 * Production ready AI assistant framework
 *
 * The version of the OpenAPI document: 1.5.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package it.baccan.cheshirecat.service;

import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.model.HTTPValidationError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StatusApi
 */
@Disabled
public class StatusApiTest {

    private final StatusApi api = new StatusApi();

    /**
     * Home
     *
     * Server status
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void homeTest() throws ApiException {
        Object response = api.home();
        // TODO: test validations
    }

    /**
     * Message With Cat
     *
     * Get a response from the Cat
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void messageWithCatTest() throws ApiException {
        Object body = null;
        Object response = api.messageWithCat(body);
        // TODO: test validations
    }

}
