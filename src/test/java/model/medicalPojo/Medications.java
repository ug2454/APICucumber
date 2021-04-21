package model.medicalPojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Medications
{
    private List<MedicationsClasses> medicationsClasses;


    @Override
    public String toString()
    {
        return "ClassPojo [medicationsClasses = "+medicationsClasses+"]";
    }
}
