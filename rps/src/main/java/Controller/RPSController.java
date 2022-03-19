package Controller;

import Service.RPSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RPSController {

    @Autowired
    private RPSService service;

    @GetMapping("/")
    public ModelAndView game() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    @PostMapping("turn")
    public ModelAndView luck(@RequestParam("tryIndex") String chance){
        String result = service.play(chance);
        ModelAndView modelAndView = new ModelAndView("end");
        modelAndView.addObject("result", result);
        return modelAndView;
    }

}
