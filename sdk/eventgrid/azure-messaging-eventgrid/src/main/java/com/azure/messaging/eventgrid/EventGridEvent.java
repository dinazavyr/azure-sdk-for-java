// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.eventgrid;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.BinaryData;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.serializer.TypeReference;
import com.azure.json.JsonProviders;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Represents the EventGrid event conforming to the <a href="https://docs.microsoft.com/azure/event-grid/event-schema">
 *     EventGrid event schema</a>.
 *
 * <p>Depending on your scenario, you can either use the constructor
 * {@link #EventGridEvent(String, String, BinaryData, String)} to create an EventGridEvent,
 * or use the factory method {@link #fromString(String)} to deserialize EventGridEvent instances
 * from a Json String representation of EventGrid events.</p>
 *
 * <p>If you have the data payload of an EventGridEvent and want to send it out, use the constructor
 * {@link #EventGridEvent(String, String, BinaryData, String)} to create it. Then use
 * {@link EventGridPublisherAsyncClient} or {@link EventGridPublisherClient} to send it the EventGrid service.</p>
 *
 * <p><strong>Create EventGridEvent Samples</strong></p>
 * <!-- src_embed com.azure.messaging.eventgrid.EventGridEvent#constructor -->
 * <pre>
 * &#47;&#47; Use BinaryData.fromObject&#40;&#41; to create EventGridEvent data
 * &#47;&#47; From a model class
 * User user = new User&#40;&quot;Stephen&quot;, &quot;James&quot;&#41;;
 * EventGridEvent eventGridEventDataObject = new EventGridEvent&#40;&quot;&#47;EventGridEvents&#47;example&#47;source&quot;,
 *     &quot;Example.EventType&quot;, BinaryData.fromObject&#40;user&#41;, &quot;0.1&quot;&#41;;
 *
 * &#47;&#47; From a String
 * EventGridEvent eventGridEventDataStr = new EventGridEvent&#40;&quot;&#47;EventGridEvents&#47;example&#47;source&quot;,
 *     &quot;Example.EventType&quot;, BinaryData.fromObject&#40;&quot;Hello World&quot;&#41;, &quot;0.1&quot;&#41;;
 *
 * &#47;&#47; From an Integer
 * EventGridEvent eventGridEventDataInt = new EventGridEvent&#40;&quot;&#47;EventGridEvents&#47;example&#47;source&quot;,
 *     &quot;Example.EventType&quot;, BinaryData.fromObject&#40;1&#41;, &quot;0.1&quot;&#41;;
 *
 * &#47;&#47; From a Boolean
 * EventGridEvent eventGridEventDataBool = new EventGridEvent&#40;&quot;&#47;EventGridEvents&#47;example&#47;source&quot;,
 *     &quot;Example.EventType&quot;, BinaryData.fromObject&#40;true&#41;, &quot;0.1&quot;&#41;;
 *
 * &#47;&#47; From null
 * EventGridEvent eventGridEventDataNull = new EventGridEvent&#40;&quot;&#47;EventGridEvents&#47;example&#47;source&quot;,
 *     &quot;Example.EventType&quot;, BinaryData.fromObject&#40;null&#41;, &quot;0.1&quot;&#41;;
 *
 * &#47;&#47; Use BinaryData.fromString&#40;&#41; if you have a Json String for the EventGridEvent data.
 * String jsonStringForData = &quot;&#92;&quot;Hello World&#92;&quot;&quot;;  &#47;&#47; A json String.
 * EventGridEvent eventGridEventDataDataJsonStr = new EventGridEvent&#40;&quot;&#47;EventGridEvents&#47;example&#47;source&quot;,
 *     &quot;Example.EventType&quot;, BinaryData.fromString&#40;jsonStringForData&#41;, &quot;0.1&quot;&#41;;
 * </pre>
 * <!-- end com.azure.messaging.eventgrid.EventGridEvent#constructor -->
 *
 * <p>On the contrary, if you receive events from any event handlers and therefore have the Json string representation
 * of one or more of EventGridEvents, use {@link #fromString(String)} to deserialize them from the Json string.</p>
 *
 * <p><strong>Deserialize EventGridEvent Samples</strong></p>
 * <!-- src_embed com.azure.messaging.eventgrid.EventGridEvent.fromString -->
 * <pre>
 * List&lt;EventGridEvent&gt; eventGridEventList = EventGridEvent.fromString&#40;eventGridEventJsonString&#41;;
 * EventGridEvent eventGridEvent = eventGridEventList.get&#40;0&#41;;
 * BinaryData eventGridEventData = eventGridEvent.getData&#40;&#41;;
 *
 * User objectValue = eventGridEventData.toObject&#40;User.class&#41;;  &#47;&#47; If data payload is a User object.
 * int intValue = eventGridEventData.toObject&#40;Integer.class&#41;;  &#47;&#47; If data payload is an int.
 * boolean boolValue = eventGridEventData.toObject&#40;Boolean.class&#41;;  &#47;&#47; If data payload is boolean.
 * String stringValue = eventGridEventData.toObject&#40;String.class&#41;;  &#47;&#47; If data payload is String.
 * String jsonStringValue = eventGridEventData.toString&#40;&#41;;  &#47;&#47; The data payload represented in Json String.
 * </pre>
 * <!-- end com.azure.messaging.eventgrid.EventGridEvent.fromString -->
 *
 * @see EventGridPublisherAsyncClient to send EventGridEvents asynchronously.
 * @see EventGridPublisherClient to send EventGridEvents sychronously.
 **/
@Fluent
public final class EventGridEvent implements JsonSerializable<EventGridEvent> {

    private final com.azure.messaging.eventgrid.implementation.models.EventGridEvent event;

    private static final ClientLogger LOGGER = new ClientLogger(EventGridEvent.class);

    /*
     * Cache serialized data for getData()
     */
    private BinaryData binaryData;

    /**
     * Create a new instance of the EventGridEvent, with the given required fields.
     *
     * <p><strong>Create EventGridEvent Samples</strong></p>
     * <!-- src_embed com.azure.messaging.eventgrid.EventGridEvent#constructor -->
     * <pre>
     * &#47;&#47; Use BinaryData.fromObject&#40;&#41; to create EventGridEvent data
     * &#47;&#47; From a model class
     * User user = new User&#40;&quot;Stephen&quot;, &quot;James&quot;&#41;;
     * EventGridEvent eventGridEventDataObject = new EventGridEvent&#40;&quot;&#47;EventGridEvents&#47;example&#47;source&quot;,
     *     &quot;Example.EventType&quot;, BinaryData.fromObject&#40;user&#41;, &quot;0.1&quot;&#41;;
     *
     * &#47;&#47; From a String
     * EventGridEvent eventGridEventDataStr = new EventGridEvent&#40;&quot;&#47;EventGridEvents&#47;example&#47;source&quot;,
     *     &quot;Example.EventType&quot;, BinaryData.fromObject&#40;&quot;Hello World&quot;&#41;, &quot;0.1&quot;&#41;;
     *
     * &#47;&#47; From an Integer
     * EventGridEvent eventGridEventDataInt = new EventGridEvent&#40;&quot;&#47;EventGridEvents&#47;example&#47;source&quot;,
     *     &quot;Example.EventType&quot;, BinaryData.fromObject&#40;1&#41;, &quot;0.1&quot;&#41;;
     *
     * &#47;&#47; From a Boolean
     * EventGridEvent eventGridEventDataBool = new EventGridEvent&#40;&quot;&#47;EventGridEvents&#47;example&#47;source&quot;,
     *     &quot;Example.EventType&quot;, BinaryData.fromObject&#40;true&#41;, &quot;0.1&quot;&#41;;
     *
     * &#47;&#47; From null
     * EventGridEvent eventGridEventDataNull = new EventGridEvent&#40;&quot;&#47;EventGridEvents&#47;example&#47;source&quot;,
     *     &quot;Example.EventType&quot;, BinaryData.fromObject&#40;null&#41;, &quot;0.1&quot;&#41;;
     *
     * &#47;&#47; Use BinaryData.fromString&#40;&#41; if you have a Json String for the EventGridEvent data.
     * String jsonStringForData = &quot;&#92;&quot;Hello World&#92;&quot;&quot;;  &#47;&#47; A json String.
     * EventGridEvent eventGridEventDataDataJsonStr = new EventGridEvent&#40;&quot;&#47;EventGridEvents&#47;example&#47;source&quot;,
     *     &quot;Example.EventType&quot;, BinaryData.fromString&#40;jsonStringForData&#41;, &quot;0.1&quot;&#41;;
     * </pre>
     * <!-- end com.azure.messaging.eventgrid.EventGridEvent#constructor -->
     *
     * @param subject the subject of the event.
     * @param eventType the type of the event, e.g. "Contoso.Items.ItemReceived".
     * @param data the data associated with this event. The content of this {@link BinaryData} must be a Json value.
     * @param dataVersion the version of the data sent along with the event.
     *
     * @throws NullPointerException if subject, eventType, data, or dataVersion is {@code null}.
     * @throws IllegalArgumentException if the content of data isn't a Json value.
     */
    public EventGridEvent(String subject, String eventType, BinaryData data, String dataVersion) {
        Objects.requireNonNull(subject, "'subject' cannot be null.");
        Objects.requireNonNull(eventType, "'eventType' cannot be null.");
        Objects.requireNonNull(data, "'data' cannot be null");
        Objects.requireNonNull(dataVersion, "'dataVersion' cannot be null");

        this.event = new com.azure.messaging.eventgrid.implementation.models.EventGridEvent()
            .setEventTime(OffsetDateTime.now())
            .setId(CoreUtils.randomUuid().toString())
            .setSubject(subject)
            .setEventType(eventType)
            .setDataVersion(dataVersion);
        this.binaryData = data;
        this.event.setData(data.toObject(Object.class));
    }

    /**
     * Private constructor for serialization.
     */
    private EventGridEvent(com.azure.messaging.eventgrid.implementation.models.EventGridEvent event, BinaryData data) {
        this.event = event;
        this.binaryData = data;
    }

    /**
     * Deserialize {@link EventGridEvent} JSON string representation that has one EventGridEvent object or
     * an array of CloudEvent objects into a list of EventGridEvents.
     *
     * <p><strong>Deserialize EventGridEvent Samples</strong></p>
     * <!-- src_embed com.azure.messaging.eventgrid.EventGridEvent.fromString -->
     * <pre>
     * List&lt;EventGridEvent&gt; eventGridEventList = EventGridEvent.fromString&#40;eventGridEventJsonString&#41;;
     * EventGridEvent eventGridEvent = eventGridEventList.get&#40;0&#41;;
     * BinaryData eventGridEventData = eventGridEvent.getData&#40;&#41;;
     *
     * User objectValue = eventGridEventData.toObject&#40;User.class&#41;;  &#47;&#47; If data payload is a User object.
     * int intValue = eventGridEventData.toObject&#40;Integer.class&#41;;  &#47;&#47; If data payload is an int.
     * boolean boolValue = eventGridEventData.toObject&#40;Boolean.class&#41;;  &#47;&#47; If data payload is boolean.
     * String stringValue = eventGridEventData.toObject&#40;String.class&#41;;  &#47;&#47; If data payload is String.
     * String jsonStringValue = eventGridEventData.toString&#40;&#41;;  &#47;&#47; The data payload represented in Json String.
     * </pre>
     * <!-- end com.azure.messaging.eventgrid.EventGridEvent.fromString -->
     *
     * @param eventGridJsonString the JSON string containing one or more EventGridEvent objects.
     *
     * @return A list of {@link EventGridEvent EventGridEvents} deserialized from eventGridJsonString.
     * @throws IllegalArgumentException if eventGridJsonString isn't a JSON string for a eventgrid event
     * or an array of it.
     * @throws NullPointerException if eventGridJsonString is {@code null}.
     * @throws IllegalArgumentException if the eventGridJsonString isn't a Json string or can't be deserialized
     * into valid EventGridEvent instances.
     */
    public static List<EventGridEvent> fromString(String eventGridJsonString) {
        try (JsonReader jsonReader = JsonProviders.createReader(eventGridJsonString)) {
            List<com.azure.messaging.eventgrid.implementation.models.EventGridEvent> internalEvents;
            JsonToken token = jsonReader.nextToken();
            if (token == JsonToken.START_ARRAY) {
                internalEvents = jsonReader
                    .readArray(com.azure.messaging.eventgrid.implementation.models.EventGridEvent::fromJson);
            } else {
                internalEvents = Collections.singletonList(
                    com.azure.messaging.eventgrid.implementation.models.EventGridEvent.fromJson(jsonReader));
            }

            List<EventGridEvent> events = new ArrayList<>();
            for (int i = 0; i < internalEvents.size(); i++) {
                com.azure.messaging.eventgrid.implementation.models.EventGridEvent internalEvent
                    = internalEvents.get(i);
                if (internalEvent.getSubject() == null
                    || internalEvent.getEventType() == null
                    || internalEvent.getData() == null
                    || internalEvent.getDataVersion() == null) {
                    List<String> nullAttributes = new ArrayList<>();
                    if (internalEvent.getSubject() == null) {
                        nullAttributes.add("'subject'");
                    }
                    if (internalEvent.getEventType() == null) {
                        nullAttributes.add("'eventType'");
                    }
                    if (internalEvent.getData() == null) {
                        nullAttributes.add("'data'");
                    }
                    if (internalEvent.getDataVersion() == null) {
                        nullAttributes.add("'dataVersion'");
                    }
                    throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                        "'subject', 'eventType', 'data' and 'dataVersion' are mandatory attributes for an "
                            + "EventGridEvent. This Json string doesn't have "
                            + CoreUtils.stringJoin(",", nullAttributes) + " for the object at index " + i
                            + ". Please make sure the input Json string has the required attributes"));
                }
                events.add(new EventGridEvent(internalEvent));
            }
            return events;
        } catch (IOException ex) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("The input parameter isn't a JSON string.", ex.getCause()));
        }
    }

    /**
     * Get the unique id associated with this event.
     * @return the id.
     */
    public String getId() {
        return this.event.getId();
    }

    /**
     * Set the unique id of the event. Note that a random id has already been set by default.
     * @param id the unique id to set.
     *
     * @return the event itself.
     * @throws NullPointerException if id is null.
     * @throws IllegalArgumentException if id is an empty String.
     */
    public EventGridEvent setId(String id) {
        Objects.requireNonNull(id, "'id' cannot be null.");
        if (id.isEmpty()) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException("'id' cannot be empty."));
        }
        this.event.setId(id);
        return this;
    }

    /**
     * Get the topic associated with this event if it is associated with a domain.
     * @return the topic, or null if the topic is not set.
     */
    public String getTopic() {
        return this.event.getTopic();
    }

    /**
     * Set the topic associated with this event. Used to route events from domain endpoints.
     * @param topic the topic to set.
     *
     * @return the event itself.
     */
    public EventGridEvent setTopic(String topic) {
        this.event.setTopic(topic);
        return this;
    }

    /**
     * Get the subject associated with this event.
     * @return the subject.
     */
    public String getSubject() {
        return this.event.getSubject();
    }

    /**
     * Get the data associated with this event as a {@link BinaryData}, which has API to deserialize the data to
     * any objects by using {@link BinaryData#toObject(TypeReference)}.
     * @return A {@link BinaryData} that wraps this event's data payload.
     */
    public BinaryData getData() {
        if (this.binaryData == null) {
            Object data = this.event.getData();
            if (data != null) {
                this.binaryData = BinaryData.fromObject(data);
            }
        }
        return this.binaryData;
    }

    /**
     * Get the type of this event.
     * @return the event type.
     */
    public String getEventType() {
        return this.event.getEventType();
    }

    /**
     * Get the time associated with the occurrence of this event.
     * @return the event time.
     */
    public OffsetDateTime getEventTime() {
        return this.event.getEventTime();
    }

    /**
     * Set the time associated with the event. Note that a default time has already been set when the event was
     * constructed.
     * @param time the time to set.
     *
     * @return the event itself.
     */
    public EventGridEvent setEventTime(OffsetDateTime time) {
        this.event.setEventTime(time);
        return this;
    }

    /**
     * Get the version of the data in the event. This can be used to specify versioning of event data schemas over time.
     * @return the version of the event data.
     */
    public String getDataVersion() {
        return this.event.getDataVersion();
    }

    EventGridEvent(com.azure.messaging.eventgrid.implementation.models.EventGridEvent impl) {
        this.event = impl;
    }

    com.azure.messaging.eventgrid.implementation.models.EventGridEvent toImpl() {
        return this.event;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("event", this.event);
        jsonWriter.writeBinaryField("binaryData", this.binaryData.toBytes());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads a JSON stream into an {@link EventGridEvent}.
     *
     * @param jsonReader The {@link JsonReader} being read.
     * @return The {@link EventGridEvent} that the JSON stream represented, may return null.
     * @throws IOException If an {@link EventGridEvent} fails to be read from the {@code jsonReader}.
     */
    public static EventGridEvent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            com.azure.messaging.eventgrid.implementation.models.EventGridEvent internalEvent = null;
            BinaryData data = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("event".equals(fieldName)) {
                    internalEvent = com.azure.messaging.eventgrid.implementation.models.EventGridEvent.fromJson(reader);
                } else if ("binaryData".equals(fieldName)) {
                    data = BinaryData.fromBytes(reader.getBinary());
                } else {
                    reader.skipChildren();
                }
            }
            return new EventGridEvent(internalEvent, data);
        });
    }
}
