
package ru.qatools.json2pojo.beans;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Player {

    @Expose
    private Integer playerID;
    @Expose
    private String playerName;
    @Expose
    private Integer countPassedLevels;
    @Expose
    private List<Integer> passedLevels = new ArrayList<Integer>();

    public Integer getPlayerID() {
        return playerID;
    }

    public void setPlayerID(Integer playerID) {
        this.playerID = playerID;
    }

    public Player withPlayerID(Integer playerID) {
        this.playerID = playerID;
        return this;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Player withPlayerName(String playerName) {
        this.playerName = playerName;
        return this;
    }

    public Integer getCountPassedLevels() {
        return countPassedLevels;
    }

    public void setCountPassedLevels(Integer countPassedLevels) {
        this.countPassedLevels = countPassedLevels;
    }

    public Player withCountPassedLevels(Integer countPassedLevels) {
        this.countPassedLevels = countPassedLevels;
        return this;
    }

    public List<Integer> getPassedLevels() {
        return passedLevels;
    }

    public void setPassedLevels(List<Integer> passedLevels) {
        this.passedLevels = passedLevels;
    }

    public Player withPassedLevels(List<Integer> passedLevels) {
        this.passedLevels = passedLevels;
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
