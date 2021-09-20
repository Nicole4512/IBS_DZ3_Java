package IBS_DZ3;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.processing.Generated;
import java.util.*;

@JsonPropertyOrder({
        "name",
        "currency",
        "code",
        "date"
})
@Generated("jsonschema2pojo")
public class Securities {
    @JsonIgnore
    private Map<String, Object> additionalPropertiesMap = new HashMap<String, Object>();
    @JsonProperty("name")
    String name;
    @JsonProperty("code")
    String code;
    @JsonProperty("date")
    @JsonFormat(pattern = "dd.MM.yyyy")
    Date date;
    @JsonProperty("currency")
    private List<String> currency;

    @JsonAnyGetter
    public Map<String, Object> getAdditionalPropertiesMap() {
        return this.additionalPropertiesMap;
    }

    @JsonAnySetter
    public void setAdditionalPropertiesMap(String name, Object value) {
        this.additionalPropertiesMap.put(name, value);
    }
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("currency")
    public List<String> getCurrencyList() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrencyList(List<String> currencyList) {
        this.currency = currencyList;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("date")
    public Date getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(Date date) {
        this.date = date;
    }
}
