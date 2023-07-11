package ma.enset.cabinetmedical.repositories;

import ma.enset.cabinetmedical.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    List<Patient> findPatientsByNomContainsOrPrenomContains(String mc1,String mc3);

}
