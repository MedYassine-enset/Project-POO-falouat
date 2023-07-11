package ma.enset.cabinetmedical;

import ma.enset.cabinetmedical.entities.Medicin;
import ma.enset.cabinetmedical.entities.Patient;
import ma.enset.cabinetmedical.repositories.MedicienRepository;
import ma.enset.cabinetmedical.repositories.PatientRepository;
import ma.enset.cabinetmedical.service.ICabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class CabinetMedicalApplication implements CommandLineRunner{
    @Autowired
    private ICabinetService cabinetService;
    public static void main(String[] args) {
        SpringApplication.run(CabinetMedicalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*Medicin M=new Medicin(null,"yassinei","yassine","test@test.com","09999999",null);
        cabinetService.addMedecin(M);*/
    }

    }


