package model.medicalPojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Problems
{
    private List<Diabetes> Diabetes;


    @Override
    public String toString()
    {
        return "ClassPojo [Diabetes = "+Diabetes+"]";
    }
}
