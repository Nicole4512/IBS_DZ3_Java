package IBS_DZ3;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.processing.Generated;
import java.util.*;


@JsonPropertyOrder({
        "id",
        "name",
        "address",
        "phoneNumber",
        "inn",
        "founded",
        "securities"
})
@Generated("jsonschema2pojo")
public class Company {
    @JsonIgnore
    private Map<String, Object> additionalPropertiesMap = new HashMap<String, Object>();
    @JsonProperty("companies")
    List <Company> companies = new ArrayList<>();

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("address")
    private String address;

    @JsonProperty("phoneNumber")
    private String phoneNumber;

    @JsonProperty("inn")
    private String inn;

    @JsonProperty("founded")
    @JsonFormat(pattern = "dd.mm.yyyy")
    private Date founded;

    @JsonProperty("securities")
    private List<Securities> securities;

    @Override
    public String toString() {
        return "id: " + id + " Имя: " + name + " Адрес:  " + address + " Номер телефона: " + phoneNumber + " ОГРН: " + founded +
                " ИНН: " + inn;
    }
    @JsonAnyGetter
    public Map<String, Object> getAdditionalPropertiesMap() {
        return this.additionalPropertiesMap;
    }

    @JsonAnySetter
    public void setAdditionalPropertiesMap(String name, Object value) {
        this.additionalPropertiesMap.put(name, value);
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phNumber) {
        this.phoneNumber = phNumber;
    }

    public void setInn(String INN) {
        this.inn = INN;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFounded(Date OGRN) {
        this.founded = OGRN;
    }

    public void setSecurities(List<Securities> securities) {
        this.securities = securities;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getInn() {
        return inn;
    }

    public int getId() {
        return id;
    }

    public Date getFounded() {
        return founded;
    }

    public List<Securities> getSecurities() {
        return securities;
    }




}

