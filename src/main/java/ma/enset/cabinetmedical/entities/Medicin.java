package ma.enset.cabinetmedical.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity @NoArgsConstructor @AllArgsConstructor @ToString @Data
public class Medicin {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String tel;
    @OneToMany(mappedBy = "medicin")
    private List<Consultation> consultations;
}
