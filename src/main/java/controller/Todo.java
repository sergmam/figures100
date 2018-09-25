package controller;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

/**
 * Created by Юля on 25.09.2018.
 */
@Generated("org.jsonschema2pojo")
public class Todo {
        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("playerName")
        @Expose
        private String playerName;
        /**
         *
         * @return The id
         */
        public Integer getId() {
            return id;
        }
        /**
         *
         * @param id
         * The id
         */
        public void setId(Integer id) {
            this.id = id;
        }
        /**
         *
         * @return The playerName
         */
        public String getPlayerName() {
            return playerName;
        }
        /**
         *
         * @param playerName
         * The playerName
         */
        public void setPlayerName(String playerName) {
            this.playerName = playerName;
        }
}
