package uvg.edu.gt;

/**
 * La clase paciente se utiliza para almacenar datos de los pacientes, implementa Comparable para poder determinar
 * si un paciente tiene prioridad sobre otro
 * @author Jose Merida
 * @version 1.0
 * @since 09-04-2024
 */
public class Patient implements Comparable<Patient> {
    private String name;
    private String condition;
    private Character priority;
    /**
     * Crea un  nuevo paciente
     * @param name el nombre del paciente
     * @param condition la condicion de la que padece el paciente
     * @param priority la prioridad definida por un caracter
     */
    public Patient(String name, String condition, String priority){
        this.name = name;
        this.condition = condition;
        this.priority = priority.charAt(0);
    }
    /**
     * Compara un paciente a otro
     * @param toCompare el paciente con el que se desea comparar
     * @return 1 si es mayor, 0 si sin iguales, menor a 0 si es menor
     */
    public int compareTo(Patient toCompare) {
        return priority.compareTo(toCompare.getPriority());
    }
    /**
     * Retorna la prioridad de un paciente
     * @return priority
     */
    public Character getPriority(){
        return priority;
    }
    /**
     * Retorna los datos del paciente separados por coma
     * @return un string concatenado con los datos del paciente
     */
    public String getData(){
        return name + "," + condition + "," + priority;
    }
}