package com.stq.temperaturecollectionsystem.controller;


import com.stq.temperaturecollectionsystem.mapper.TempMapper;
import com.stq.temperaturecollectionsystem.pojo.Temp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TempController {

    @Autowired
    private TempMapper tempMapper;

    @RequestMapping("/temp")
    public String queryTempList(Model model) {
        List<Temp> temps = tempMapper.queryTempList();
        model.addAttribute("templist", temps);
        return "temp";
    }

    @PostMapping("/addTemp")
    public String addCogo(Temp temp) {
        tempMapper.addTemp(temp);
        return "redirect:/temp";
    }

    @GetMapping("/deleteTemp/{tid}")
    public String deleteTemp(@PathVariable("tid") int tid) {
        tempMapper.deleteTemp(tid);
        return "redirect:/temp";
    }


}
