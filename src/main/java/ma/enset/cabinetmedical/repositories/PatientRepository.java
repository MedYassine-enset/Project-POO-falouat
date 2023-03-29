package ma.enset.cabinetmedical.repositories;

import ma.enset.cabinetmedical.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
