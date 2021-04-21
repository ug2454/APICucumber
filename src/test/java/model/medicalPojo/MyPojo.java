package model.medicalPojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MyPojo {
    private List<Problems> problems;



    @Override
    public String toString() {
        return "ClassPojo [problems = " + problems + "]";
    }
}