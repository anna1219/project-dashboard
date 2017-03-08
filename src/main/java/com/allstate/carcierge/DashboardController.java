package com.allstate.carcierge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private EmailHistoryRepository emailHistoryRepository;

    @RequestMapping("/dashboard")
    public String displayDashboard(Model model) {
        int numOfUser = userRepository.findAll().size();
        model.addAttribute("number_of_users", numOfUser);
        int numOfVehicle = vehicleRepository.findAll().size();
        model.addAttribute("number_of_vehicles", numOfVehicle);
        int numOfEmail = emailHistoryRepository.findAll().size();
        model.addAttribute("number_of_emails", numOfEmail);
        return "dashboard_view";
    }
}
