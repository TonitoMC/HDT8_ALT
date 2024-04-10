package uvg.edu.gt;

public class Patient implements Comparable<Patient> {
    private String name;
    private String condition;
    private Character priority;
    public Patient(String name, String condition, String priority){
        this.name = name;
        this.condition = condition;
        this.priority = priority.charAt(0);
    }
    public int compareTo(Patient toCompare) {
        return priority.compareTo(toCompare.getPriority());
    }
    public Character getPriority(){
        return priority;
    }
    public String getData(){
        return name + "," + condition + "," + priority;
    }
}