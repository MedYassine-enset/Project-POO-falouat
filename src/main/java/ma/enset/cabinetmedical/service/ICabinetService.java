package ma.enset.cabinetmedical.service;

import ma.enset.cabinetmedical.entities.Consultation;
import ma.enset.cabinetmedical.entities.Medicin;
import ma.enset.cabinetmedical.entities.Patient;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

public interface ICabinetService {
    List<Patient> getAllPatients();
    List<Patient> SearchPatientsByQuery(String query);
    void addPatient(Patient patient);
    void deletePatient(Long id);
    /*List<Consultation> getConsultationsByPatient(Patient patient);*/
    void addMedecin(Medicin medicin);
    List<Medicin> getAllMedcins();
    void deleMedecinById(Long id);
    /*List<Consultation> getConsultationsByMedecin(Medicin medicin);*/
    void addConsultations(Consultation consultation);
    List<Consultation> getAllConsultations();
    void DeleteConsultation(Consultation consultation);
}
