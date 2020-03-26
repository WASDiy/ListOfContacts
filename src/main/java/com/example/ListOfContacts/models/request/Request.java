package com.example.ListOfContacts.models.request;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "command",
        "nlu",
        "original_utterance",
        "type",
        "markup"
})
public class Request {

    @JsonProperty("command")
    private String command;
    @JsonProperty("nlu")
    private Nlu nlu;
    @JsonProperty("original_utterance")
    private String originalUtterance;
    @JsonProperty("type")
    private String type;
    @JsonProperty("markup")
    private Markup markup;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("command")
    public String getCommand() {
        return command;
    }

    @JsonProperty("command")
    public void setCommand(String command) {
        this.command = command;
    }

    @JsonProperty("nlu")
    public Nlu getNlu() {
        return nlu;
    }

    @JsonProperty("nlu")
    public void setNlu(Nlu nlu) {
        this.nlu = nlu;
    }

    @JsonProperty("original_utterance")
    public String getOriginalUtterance() {
        return originalUtterance;
    }

    @JsonProperty("original_utterance")
    public void setOriginalUtterance(String originalUtterance) {
        this.originalUtterance = originalUtterance;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("markup")
    public Markup getMarkup() {
        return markup;
    }

    @JsonProperty("markup")
    public void setMarkup(Markup markup) {
        this.markup = markup;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
