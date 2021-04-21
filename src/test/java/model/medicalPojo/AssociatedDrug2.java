package model.medicalPojo;


public class AssociatedDrug2 {
    private String dose;

    private String strength;

    private String name;

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ClassPojo [dose = " + dose + ", strength = " + strength + ", name = " + name + "]";
    }
}