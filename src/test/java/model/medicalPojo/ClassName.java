package model.medicalPojo;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClassName
{
    private List<AssociatedDrug> associatedDrug;

    private List<AssociatedDrug2> associatedDrug2;



    @Override
    public String toString()
    {
        return "ClassPojo [associatedDrug = "+associatedDrug+", associatedDrug2 = "+associatedDrug2+"]";
    }
}
	