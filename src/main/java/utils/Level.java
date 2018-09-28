
package utils;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Level {

    @Expose
    private Integer levelID;
    @Expose
    private List<Double> x = new ArrayList<Double>();
    @Expose
    private List<Double> y = new ArrayList<Double>();
    @Expose
    private Integer p;
    @Expose
    private Object backImage;
    @Expose
    private Boolean active;
    @Expose
    private Boolean passed;

    public Integer getLevelID() {
        return levelID;
    }

    public void setLevelID(Integer levelID) {
        this.levelID = levelID;
    }

    public Level withLevelID(Integer levelID) {
        this.levelID = levelID;
        return this;
    }

    public List<Double> getX() {
        return x;
    }

    public void setX(List<Double> x) {
        this.x = x;
    }

    public Level withX(List<Double> x) {
        this.x = x;
        return this;
    }

    public List<Double> getY() {
        return y;
    }

    public void setY(List<Double> y) {
        this.y = y;
    }

    public Level withY(List<Double> y) {
        this.y = y;
        return this;
    }

    public Integer getP() {
        return p;
    }

    public void setP(Integer p) {
        this.p = p;
    }

    public Level withP(Integer p) {
        this.p = p;
        return this;
    }

    public Object getBackImage() {
        return backImage;
    }

    public void setBackImage(Object backImage) {
        this.backImage = backImage;
    }

    public Level withBackImage(Object backImage) {
        this.backImage = backImage;
        return this;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Level withActive(Boolean active) {
        this.active = active;
        return this;
    }

    public Boolean getPassed() {
        return passed;
    }

    public void setPassed(Boolean passed) {
        this.passed = passed;
    }

    public Level withPassed(Boolean passed) {
        this.passed = passed;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

}
