package model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by Сергей on 14.09.2018.
 */
public class RawDataBody implements Serializable {

    @JsonProperty("rawDatas")
    @JsonDeserialize
    private ArrayList<RawData> rawDatas = new ArrayList<RawData>();

    public RawDataBody(){
    }

    public RawDataBody rawDatas(ArrayList<RawData> rawDatas) {
        this.rawDatas = rawDatas;
        return this;
    }

    @JsonProperty("rawDatas")
    public ArrayList<RawData> getRawDatas() {
        return rawDatas;
    }

    @JsonProperty("rawDatas")
    public void setRawDatas(ArrayList<RawData> rawDatas) {
        this.rawDatas = rawDatas;
    }


    public class RawData implements Serializable {

        private String tag = null;
        private Double value = null;
        private Integer quality = null;
        private Integer site = null;
        private Integer supplier = null;
        private Integer zone = null;
        private BigDecimal timestamp = null;


        @JsonProperty("tag")
        public String getTag() {
            return tag;
        }

        @JsonProperty("tag")
        public void setTag(String tag) {
            this.tag = tag;
        }

        @JsonProperty("value")
        public Double getValue() {
            return value;
        }

        @JsonProperty("value")
        public void setValue(Double value) {
            this.value = value;
        }


        @JsonProperty("quality")
        public Integer getQuality() {
            return quality;
        }

        @JsonProperty("quality")
        public void setQuality(Integer quality) {
            this.quality = quality;
        }


        @JsonProperty("site")
        public Integer getSite() {
            return site;
        }

        @JsonProperty("site")
        public void setSite(Integer site) {
            this.site = site;
        }


        @JsonProperty("supplier")
        public Integer getSupplier() {
            return supplier;
        }

        @JsonProperty("supplier")
        public void setSupplier(Integer supplier) {
            this.supplier = supplier;
        }


        @JsonProperty("zone")
        public Integer getZone() {
            return zone;
        }

        @JsonProperty("zone")
        public void setZone(Integer zone) {
            this.zone = zone;
        }

        @JsonProperty("timestamp")
        public BigDecimal getTimestamp() {
            return timestamp;
        }

        @JsonProperty("timestamp")
        public void setTimestamp(BigDecimal timestamp) {
            this.timestamp = timestamp;
        }
    }
}
