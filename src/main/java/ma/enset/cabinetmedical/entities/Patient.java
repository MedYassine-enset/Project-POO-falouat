package ma.enset.cabinetmedical.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import net.bytebuddy.build.ToStringPlugin;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity @NoArgsConstructor @AllArgsConstructor @ToString @Data
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prenom;
    private String cin;
    private String tel;
    private String email;
    @DateTimeFormat(pattern = "YYYY-mm-dd")
    @Temporal(TemporalType.DATE)
    private Date dateNaissaince;
    @OneToMany(mappedBy = "patient")
    private Collection<Consultation> consultations;

}
