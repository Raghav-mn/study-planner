package uk.ac.raghavm;

//java standard library imports (in JDK already)
import java.util.Objects;
import java.time.LocalDate;

public class Assignment {
    private final String name;
    private final String moduleName;
    private final LocalDate dueDate;
    private final Priority priority;
    private boolean isCompleted;

    public Assignment(
        String name, 
        String moduleName, 
        LocalDate dueDate, 
        Priority priority
    ){


        if(name == null || name.isBlank() ){
            throw new IllegalArgumentException("Error: Please enter Assignment Name before continuing.");
        }

        if( moduleName == null || moduleName.isBlank()){
            throw new IllegalArgumentException("Error: Please enter Module Name before continuing.");
        }

        /*if(dueDate == null){
            throw new IllegalArgumentException("Error: Please enter Due Date before continuing.");
        }*/

        this.name = name;
        this.moduleName = moduleName;
        this.dueDate =  Objects.requireNonNull(dueDate);
        this.priority = Objects.requireNonNull(priority);
        isCompleted = false;
    }

    //Getter methods
    public String getName(){
        return name;
    }

    public String getModuleName(){
        return moduleName;
    }

    public LocalDate getDueDate(){
        return dueDate;
    }

    public Priority getPriority(){
        return priority;
    }

    public Boolean getIsCompleted(){
        return isCompleted;
    } 

    //Setter methods
    public void setIsCompleted(){
        isCompleted = true;
    }

    //Misc. methods

    //overdue method needed

    


}
