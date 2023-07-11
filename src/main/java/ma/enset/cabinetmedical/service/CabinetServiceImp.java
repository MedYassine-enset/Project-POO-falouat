package ma.enset.cabinetmedical.service;

import ma.enset.cabinetmedical.entities.Consultation;
import ma.enset.cabinetmedical.entities.Medicin;
import ma.enset.cabinetmedical.entities.Patient;
import ma.enset.cabinetmedical.repositories.ConsultationRepository;
import ma.enset.cabinetmedical.repositories.MedicienRepository;
import ma.enset.cabinetmedical.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service @Transactional
public class CabinetServiceImp implements ICabinetService{

    @Autowired
    MedicienRepository medicienRepository;
    @Autowired
    PatientRepository patientRepository;
    @Autowired
    ConsultationRepository consultationRepository;
    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public List<Patient> SearchPatientsByQuery(String query) {
        return patientRepository.findPatientsByNomContainsOrPrenomContains(query,query);
    }

    @Override
    public void addPatient(Patient patient) {
        patientRepository.save(patient);

    }

    @Override
    public void deletePatient(Long id) {
        patientRepository.deleteById(id);

    }

   /*@Override
    public List<Consultation> getConsultationsByPatient(Patient patient) {
        return consultationRepository.findConsultationByPatient(patient);
    }*/

    @Override
    public void addMedecin(Medicin medicin) {
        medicienRepository.save(medicin);

    }

    @Override
    public List<Medicin> getAllMedcins() {
        return medicienRepository.findAll();
    }

    @Override
    public void deleMedecinById(Long id) {
        medicienRepository.deleteById(id);

    }

    /*@Override
    public List<Consultation> getConsultationsByMedecin(Medicin medicin) {
        return consultationRepository.findConsultationByMedicin(medicin);
    }*/

    @Override
    public void addConsultations(Consultation consultation) {
        consultationRepository.save(consultation);

    }

    @Override
    public List<Consultation> getAllConsultations() {
        return consultationRepository.findAll();
    }

    @Override
    public void DeleteConsultation(Consultation consultation) {
        consultationRepository.delete(consultation);
    }
}
