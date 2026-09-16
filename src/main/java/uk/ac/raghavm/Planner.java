package uk.ac.raghavm;


import java.util.ArrayList;
import java.util.List;


//in-memory study planner
public class Planner {

    private ArrayList<Assignment> AssignmentsList = new ArrayList<Assignment>();


    public void addAssignment(Assignment assignment){
        AssignmentsList.add(assignment);
    }

    public ArrayList<Assignment> getAllAssignments(){
        return AssignmentsList;
    }

}
