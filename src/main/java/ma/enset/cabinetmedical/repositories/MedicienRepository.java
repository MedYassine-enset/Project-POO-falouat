package ma.enset.cabinetmedical.repositories;

import ma.enset.cabinetmedical.entities.Medicin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicienRepository extends JpaRepository<Medicin,Long> {
}
