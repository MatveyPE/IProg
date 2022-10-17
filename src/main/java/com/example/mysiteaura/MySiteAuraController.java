package com.example.mysiteaura;

import com.example.mysiteaura.model.ResultForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySiteAuraController {

    @RequestMapping("/NumberOfRooms.html")
    public String FormController(Model model) {
        model.addAttribute("contacts", new ResultForm());
        return "NumberOfRooms.html";
    }

    @PostMapping("/result")
    public String sendEmail(@ModelAttribute ResultForm contacts, Model model) {
        if (ResultForm.contacts.isEmpty()) {
            model.addAttribute("error", "Поля не должны быть пустыми");
            return "NumberOfRooms.html";
        }
        return "result.html";
    }
}
