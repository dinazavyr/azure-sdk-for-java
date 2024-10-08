// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.inference.usage;

import com.azure.ai.inference.EmbeddingsClient;
import com.azure.ai.inference.EmbeddingsClientBuilder;
import com.azure.ai.inference.models.EmbeddingsResult;
import com.azure.ai.inference.models.EmbeddingItem;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.util.Configuration;

import java.util.ArrayList;
import java.util.List;

public final class TextEmbeddingsSample {
     /**
     * @param args Unused. Arguments to the program.
     */
    public static void main(String[] args) {
        String key = Configuration.getGlobalConfiguration().get("AZURE_EMBEDDINGS_KEY");
        String endpoint = Configuration.getGlobalConfiguration().get("EMBEDDINGS_MODEL_ENDPOINT");
        EmbeddingsClient client = new EmbeddingsClientBuilder()
            .credential(new AzureKeyCredential(key))
            .endpoint(endpoint)
            .buildClient();

        List<String> promptList = new ArrayList<>();
        String prompt = "Tell me 3 jokes about trains";
        promptList.add(prompt);

        EmbeddingsResult embeddings = client.embed(promptList);

        for (EmbeddingItem item : embeddings.getData()) {
            System.out.printf("Index: %d.%n", item.getIndex());
            for (Float embedding : item.getEmbeddingList()) {
                System.out.printf("%f;", embedding);
            }
        }
    }
}
