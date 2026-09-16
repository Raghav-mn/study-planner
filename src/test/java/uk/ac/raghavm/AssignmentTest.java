package uk.ac.raghavm;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;


//general rule to keep classes and methods are few characters as possible
class AssignmentTest {


    //Tests for blank names and modules names
    @Test 
    void throwsForBlankName(){
        assertThrows(IllegalArgumentException.class, () -> new Assignment(
            "", 
            "TestModule1", 
            LocalDate.now().plusWeeks(1), 
            Priority.LOW)
        );
    }

    @Test 
    void throwsForNullName(){
        assertThrows(IllegalArgumentException.class, () -> new Assignment(
            null, 
            "TestModule1", 
            LocalDate.now().plusWeeks(1), 
            Priority.LOW
        )
        );
    }

    @Test 
    void throwsForBlankModuleName(){
        assertThrows(IllegalArgumentException.class, () -> new Assignment(
            "Test2", 
            "", 
            LocalDate.now().plusWeeks(1), 
            Priority.LOW)
        );
    }

    @Test 
    void throwsForNullModuleName(){
        assertThrows(IllegalArgumentException.class, () -> new Assignment(
            "Test2", 
            null, 
            LocalDate.now().plusWeeks(1), 
            Priority.LOW
        )
    );
    }

    //dont see myself needing to test for a null due date or priority like this
    //need to test that the user gets the error when inputting
    /*@Test 
    void throwsForNullDueDate(){
        assertThrows(NullPointerException.class, () -> new Assignment(
            "Test3", 
            "ModuleTest3", 
            null, 
            Priority.LOW
        )
        );
    }
        */


}


