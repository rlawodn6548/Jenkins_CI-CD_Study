package com.test.cicd.service;

import com.test.cicd.dto.MenuDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuService {
    public List<MenuDTO> getMenu() {
        List<MenuDTO> menuList = new ArrayList<>();

        MenuDTO menu1 = new MenuDTO(1, "ice");
        menuList.add(menu1);

        MenuDTO menu2 = new MenuDTO(2, "cream");
        menuList.add(menu2);
        return menuList;
    }
}
