package model.medicalPojo;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Labs {
    private String missing_field;


    @Override
    public String toString() {
        return "ClassPojo [missing_field = " + missing_field + "]";
    }
}