package jp.te4a.spring.mybootapp5;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value="/post", method=RequestMethod.POST)
public ModelAndView postForm(@RequestParam("text1") String text1) {
    ModelAndView mv = new ModelAndView("index");
    mv.addObject("msg","you write'" + text1 + "'!!!");
    return mv;
}

/*3
@RequestMapping(value="/post", method=RequestMethod.POST)
public ModelAndView postForm(@RequestParam("text1") String text1) {
    ModelAndView mv = new ModelAndView("index");
    mv.addObject("msg", "you write '" + text1 + "'!!!");
    return mv;
}
*/

/*2
@RequestMapping("/")
public String index(Model model) {
    model.addAttribute("msg", "this is  a setting message");
    return "index";
}
 */

/*1
@Controller
public class HelloController {
    @RequestMapping("/")
    public String index() {
    	//return "this is Spring Boot sample.";
        return "index";
    }
}
*/