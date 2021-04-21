package model.medicalPojo;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedicationsClasses
{
    private List<ClassName2> className2;

    private List<ClassName> className;



    @Override
    public String toString()
    {
        return "ClassPojo [className2 = "+className2+", className = "+className+"]";
    }
}