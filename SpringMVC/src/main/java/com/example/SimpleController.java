package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SimpleController {

    @RequestMapping("/quick") // URL pattern
    public String display()
    {
        return "quick"; // view JSP
    }

    @RequestMapping("/bye")
    public String goodBye()
    {
        return "bye";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginPost(HttpServletRequest req, Model m)
    {
        String u = req.getParameter("username");
        String p = req.getParameter("password");
        m.addAttribute("user",u);
        req.setAttribute("pass",p);
        if(u.equals("Tom") && p.equals("Cat"))
        return "welcome";
        else
         return "bye" ;
    }

    @RequestMapping("/calc")
    public String add(@RequestParam("no1") int no1,@RequestParam("no2") int no2, @RequestParam("math") String math,Model output)
    {
      int ans = 0;
      if(math.equals("add")) ans = no1+no2;
      else if(math.equals("sub")) ans= no1-no2;
      output.addAttribute("ans",ans);

        return "displayResult";

    }


}
