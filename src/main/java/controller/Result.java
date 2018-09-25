package controller;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Юля on 25.09.2018.
 */
@Generated("org.jsonschema2pojo")
public class Result {
    @SerializedName("names")
    @Expose
    private List<Todo> names = new ArrayList<Todo>();
    /**
     *
     * @return The todos
     */
    public List<Todo> getNames() {
        return names;
    }
    /**
     *
     * @param todos
     * The todos
     */
    public void setTodos(List<Todo> names) {
        this.names = names;
    }
}
