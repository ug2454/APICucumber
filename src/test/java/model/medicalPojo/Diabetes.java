package model.medicalPojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Diabetes
{
    private List<Labs> labs;
    private List<Medications> medications;

    @Override
    public String toString()
    {
        return "ClassPojo [labs = "+labs+", medications = "+medications+"]";
    }
}