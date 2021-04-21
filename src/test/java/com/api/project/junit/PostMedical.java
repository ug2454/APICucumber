package com.api.project.junit;

import io.restassured.http.ContentType;
import model.medicalPojo.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class PostMedical {

    @Test
    public void postMedicalJSON() {
        AssociatedDrug asdrug1 = new AssociatedDrug();
        asdrug1.setDose("");
        asdrug1.setName("asprin");
        asdrug1.setStrength("500 mg");

        AssociatedDrug2 asdrug2 = new AssociatedDrug2();
        asdrug2.setDose("");
        asdrug2.setName("somethingElse");
        asdrug2.setStrength("500 mg");

        List<AssociatedDrug> associatedDrugs = new ArrayList<>();
        associatedDrugs.add(0, asdrug1);

        List<AssociatedDrug2> associatedDrug2s = new ArrayList<>();
        associatedDrug2s.add(0, asdrug2);

        ClassName className = new ClassName();
        className.setAssociatedDrug(associatedDrugs);
        className.setAssociatedDrug2(associatedDrug2s);

        ClassName2 className2 = new ClassName2();
        className2.setAssociatedDrug(associatedDrugs);
        className2.setAssociatedDrug2(associatedDrug2s);

        List<ClassName> classNames = new ArrayList<>();
        classNames.add(0, className);

        List<ClassName2> className2s = new ArrayList<>();
        className2s.add(0, className2);


        MedicationsClasses medicationsClasses = new MedicationsClasses();
        medicationsClasses.setClassName(classNames);
        medicationsClasses.setClassName2(className2s);

        List<MedicationsClasses> medicationsClasses1 = new ArrayList<>();
        medicationsClasses1.add(0, medicationsClasses);


        Medications medications = new Medications();
        medications.setMedicationsClasses(medicationsClasses1);

        List<Medications> medications1 = new ArrayList<>();
        medications1.add(0, medications);

        Diabetes diabetes = new Diabetes();
        diabetes.setMedications(medications1);

        Labs labs = new Labs();
        labs.setMissing_field("missing_value");

        List<Labs> labs1 = new ArrayList<>();
        labs1.add(0,labs);

        diabetes.setLabs(labs1);

        List<Diabetes> diabetes1 = new ArrayList<>();
        diabetes1.add(0,diabetes);

        Problems problems = new Problems();
        problems.setDiabetes(diabetes1);

        List<Problems> problems1 = new ArrayList<>();
        problems1.add(0,problems);

        MyPojo myPojo = new MyPojo();
        myPojo.setProblems(problems1);




        given()
                .contentType(ContentType.JSON)
                .when()
                .body(myPojo)
                .post("https://jsonplaceholder.typicode.com/users")
                .then()
                .statusCode(201)
                .log()
                .all();
    }
}
