package uvg.edu.gt;

import java.util.PriorityQueue;
/**
 * Este programa simula un sistema de atencion de pacientes que llegan a la seccion de emergencias de un hospital. Lee
 * un archivo de texto que incluye Nombre, Sintomes y Graveded. Lee los datos del archivo txt y los almacena dentro
 * de un PriorityQueue, luego se van tomando uno por uno e imprimiendo de regreso enla consola
 * @author Jose Merida - 201105
 * @version 1.0
 * @since 09-04-2024
 */
public class App 
{
    public static void main( String[] args )
    {
        Model model = new Model();
        model.readFile();
        PriorityQueue<Patient> patientList = model.getPatientData();
        while (!patientList.isEmpty()){
            System.out.println(patientList.remove().getData());
        }
    }
}
