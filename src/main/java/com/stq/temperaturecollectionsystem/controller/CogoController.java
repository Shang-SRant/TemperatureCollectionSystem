package com.stq.temperaturecollectionsystem.controller;

import com.stq.temperaturecollectionsystem.mapper.CogoMapper;
import com.stq.temperaturecollectionsystem.pojo.Cogo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CogoController {

    @Autowired
    private CogoMapper cogoMapper;

    @RequestMapping("/cogo")
    public String queryCogoList(Model model) {
        List<Cogo> cogos = cogoMapper.queryCogoList();
        model.addAttribute("cogolist", cogos);
        return "cogo";
    }

    @PostMapping("/addCogo")
    public String addCogo(Cogo cogo) {
        cogoMapper.addCogo(cogo);
        return "redirect:/cogo";
    }

    @GetMapping("/deleteCogo/{aid}")
    public String deleteCogo(@PathVariable("aid") int aid) {
        cogoMapper.deleteCogo(aid);
        return "redirect:/cogo";
    }
}
