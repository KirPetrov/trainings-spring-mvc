package ru.petrov.trainings.files;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/references")
@Controller
public class DrillReferenseController {

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model uiModel) {
        //return null;
        return "contacts/references";
    }
}
