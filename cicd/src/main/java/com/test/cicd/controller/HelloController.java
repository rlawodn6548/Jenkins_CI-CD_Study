package com.test.cicd.controller;

import com.test.cicd.dto.MenuDTO;
import com.test.cicd.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class HelloController {
    @Autowired
    private MenuService menuService;

    @GetMapping("/")
    public String menu(Model model) {
        List<MenuDTO> menuList = menuService.getMenu();
        model.addAttribute("menuList", menuList);
        return "menu";
    }

    @GetMapping("/menus")
    public String menu2(Model model) {
        List<MenuDTO> menuList = menuService.getMenu();
        model.addAttribute("menuList", menuList);
        return "menu";
    }
}
