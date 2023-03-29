package ma.enset.cabinetmedical;

import ma.enset.cabinetmedical.entities.Patient;
import ma.enset.cabinetmedical.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class CabinetMedicalApplication implements CommandLineRunner{
    @Autowired
    private PatientRepository patientRepository;
    public static void main(String[] args) {
        SpringApplication.run(CabinetMedicalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //Patient p1=new Patient(null,"ahmadi","yasssine","AD012356","0257415236","yassine@test.com",new Date(),null);
        //patientRepository.save(p1);
        List<Patient> patients = patientRepository.findAll();
        for (Patient p:patients) {
            System.out.println(p.getNom() + " " + p.getEmail());
        }
        //Patient p=patientRepository.findById(1L).get();
       // p.setPrenom("fati");
       // patientRepository.save(p);

        }

    }


