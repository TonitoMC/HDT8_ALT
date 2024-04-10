package uvg.edu.gt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Model {
    VectorHeap<Patient> patientData;
    public Model(){
        patientData = new VectorHeap<>();
    }
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
    public VectorHeap<Patient> getPatientData(){
        return patientData;
    }
}
