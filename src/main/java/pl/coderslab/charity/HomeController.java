package pl.coderslab.charity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.model.Donation;
import pl.coderslab.charity.model.Institution;
import pl.coderslab.charity.repository.DonationRepository;
import pl.coderslab.charity.service.DonationSrv;
import pl.coderslab.charity.service.InstitutionSrv;

import java.util.List;


@Controller
public class HomeController {

//    InstitutionRepository institutionRepository;
    @Autowired
    DonationSrv donationSrv;
    InstitutionSrv institutionSrv;

    public HomeController(InstitutionSrv institutionSrv, DonationSrv donationSrv) {
        this.institutionSrv = institutionSrv;
        this.donationSrv = donationSrv;
    }


    @RequestMapping("/")
    public String homeAction(Model model){
        List<Institution> institutions = institutionSrv.findAllInstitution();
        model.addAttribute("institutions", institutions);

        List<Donation> donations = donationSrv.findAllDonations();
        model.addAttribute("donations", donations);

        int noBags = 0;
        for (Donation d : donations) {
            noBags += d.getQuantity();
        }

        model.addAttribute("noBags", noBags);
        return "index";
    }
}
