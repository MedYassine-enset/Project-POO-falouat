package ma.enset.cabinetmedical.web;

import ma.enset.cabinetmedical.entities.Patient;
import ma.enset.cabinetmedical.service.ICabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CabinetController {
    @Autowired
    ICabinetService cabinetService;
    @GetMapping("/")
    public String home(){
        return "index";
    }
    @GetMapping("/patients")
    public String patients(Model model,@RequestParam(name = "mc",defaultValue = "") String mc){
        List<Patient> patients=cabinetService.SearchPatientsByQuery(mc);
        model.addAttribute("patients",patients);
        return "patients_list";
    }
    @GetMapping("/deletPatient")
    public String deletPatient(@RequestParam(name = "id",defaultValue = "0") Long id){
            cabinetService.deletePatient(id);
            return "redirect:/patients";
    }
    @GetMapping("/addPatient")
    public String patientForm(Model model){
        Patient p=new Patient();
        model.addAttribute("patient",p);
        return "patient_new";
    }
    @PostMapping("/savePatient")
    public String savePatient(@ModelAttribute Patient patient){
        cabinetService.addPatient(patient);
        return "redirect:/patients";
    }
}
