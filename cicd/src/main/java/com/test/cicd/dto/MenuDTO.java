package com.test.cicd.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MenuDTO {
    private int menuId;
    private String menuName;
}
