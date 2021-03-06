    package br.com.crescer.social.web;

import br.com.crescer.social.entity.entities.Time;
import br.com.crescer.social.entity.entities.Usuario;
import br.com.crescer.social.service.Service.TimeService;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @author Carlos H. Nonnemacher
 */
@Controller
public class AcessController {
    
    @Autowired
    TimeService timeService;
    
    @RequestMapping("/login")
    String login(Model m) {
        return "login"; 
    } 
    
    @RequestMapping("/logout")
    String logout(HttpSession httpSession) {
        httpSession.invalidate();
        return "redirect:login";
    } 
    
    @RequestMapping(value="/add")
    String add(Model m) {
        return "home";
    }
    
}
