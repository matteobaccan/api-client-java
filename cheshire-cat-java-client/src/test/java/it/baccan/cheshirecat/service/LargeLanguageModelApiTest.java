/*
 * �Y~� Cheshire-Cat API
 * Production ready AI assistant framework
 *
 * The version of the OpenAPI document: 1.5.1
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
 * API tests for LargeLanguageModelApi
 */
@Disabled
public class LargeLanguageModelApiTest {

    private final LargeLanguageModelApi api = new LargeLanguageModelApi();

    /**
     * Get Llm Settings
     *
     * Get settings and schema of the specified Large Language Model
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLlmSettingsTest() throws ApiException {
        String languageModelName = null;
        Object response = api.getLlmSettings(languageModelName);
        // TODO: test validations
    }

    /**
     * Get Llms Settings
     *
     * Get the list of the Large Language Models
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLlmsSettingsTest() throws ApiException {
        Object response = api.getLlmsSettings();
        // TODO: test validations
    }

    /**
     * Upsert Llm Setting
     *
     * Upsert the Large Language Model setting
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void upsertLlmSettingTest() throws ApiException {
        String languageModelName = null;
        Object body = null;
        Object response = api.upsertLlmSetting(languageModelName, body);
        // TODO: test validations
    }

}
