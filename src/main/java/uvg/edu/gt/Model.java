package uvg.edu.gt;

import javafx.scene.layout.Priority;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.PriorityQueue;
/**
 * Esta clase se encarga del funcionamiento interno del programa, lee el archivo y lo almacena dentro de un
 * VectorHeap
 * @author Jose Merida
 * @version 1.0
 * @since 09-04-2024
 */
public class Model {
    PriorityQueue<Patient> patientData;
    public Model(){
        patientData = new PriorityQueue<>();
    }
    /**
     * Metodo para leer los datos del archivo y almacenarlos dentro de un PriorityQueue
     */
    public void readFile(){
        ArrayList<String> tempList = new ArrayList<String>();
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader("pacientes.txt"))){
            while ((line = br.readLine()) != null){
                String[] separated = line.split(",");
                Patient tempPatient = new Patient(separated[0], separated[1], separated[2].replaceAll(" ", ""));
                patientData.add(tempPatient);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    /**
     * Getter para el PriorityQueue que contiene los datos de los pacientes
     * @return patientData
     */
    public PriorityQueue<Patient> getPatientData(){
        return patientData;
    }
}
