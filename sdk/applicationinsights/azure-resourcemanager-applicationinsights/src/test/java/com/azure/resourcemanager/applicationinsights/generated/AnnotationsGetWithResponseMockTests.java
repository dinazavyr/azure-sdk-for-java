// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager;
import com.azure.resourcemanager.applicationinsights.models.Annotation;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class AnnotationsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "[{\"AnnotationName\":\"ujxukndxd\",\"Category\":\"rjguufzdmsyqtf\",\"EventTime\":\"2021-02-25T10:39:49Z\",\"Id\":\"botzingamvppho\",\"Properties\":\"qzudphq\",\"RelatedAnnotation\":\"vdkfwynwcvtbvk\"},{\"AnnotationName\":\"hmtnvy\",\"Category\":\"atkzwpcnpw\",\"EventTime\":\"2021-02-07T21:37:46Z\",\"Id\":\"esgvvsccyaj\",\"Properties\":\"qfhwyg\",\"RelatedAnnotation\":\"vdnkfxusem\"},{\"AnnotationName\":\"zrmuhapfcqdps\",\"Category\":\"qvpsvuoymg\",\"EventTime\":\"2021-10-29T23:35:36Z\",\"Id\":\"vezrypqlmfeo\",\"Properties\":\"rqwky\",\"RelatedAnnotation\":\"ob\"}]";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        ApplicationInsightsManager manager = ApplicationInsightsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        List<Annotation> response = manager.annotations()
            .getWithResponse("hahhxvrhmzkwpj", "wws", "ughftqsx", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("ujxukndxd", response.get(0).annotationName());
        Assertions.assertEquals("rjguufzdmsyqtf", response.get(0).category());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-25T10:39:49Z"), response.get(0).eventTime());
        Assertions.assertEquals("botzingamvppho", response.get(0).id());
        Assertions.assertEquals("qzudphq", response.get(0).properties());
        Assertions.assertEquals("vdkfwynwcvtbvk", response.get(0).relatedAnnotation());
    }
}
