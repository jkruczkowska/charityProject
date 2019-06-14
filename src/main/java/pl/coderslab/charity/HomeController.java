package pl.coderslab.charity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.model.Donation;
import pl.coderslab.charity.model.Institution;
import pl.coderslab.charity.repository.DonationRepository;
import pl.coderslab.charity.repository.InstitutionRepository;
import pl.coderslab.charity.service.InstitutionSrv;

import java.util.List;


@Controller
public class HomeController {

//    InstitutionRepository institutionRepository;
    DonationRepository donationRepository;
    InstitutionSrv institutionSrv;


    @RequestMapping("/")
    public String homeAction(Model model){
        List<Institution> institutions = institutionSrv.findAll();
        model.addAttribute("institutions", institutions);

        List<Donation> donations = donationRepository.findAll();
        model.addAttribute("donations", donations);

        int noBags = 0;
        for (Donation d : donations) {
            noBags += d.getQuantity();
        }

        model.addAttribute("noBags", noBags);
        return "index";
    }
}
