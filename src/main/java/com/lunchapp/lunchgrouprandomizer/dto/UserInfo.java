package com.lunchapp.lunchgrouprandomizer.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserInfo {

    private String firstName;

    private String lastName;

    private String email;

    private Boolean isInOffice;

    private List<String> themes;
}
