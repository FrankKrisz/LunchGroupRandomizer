package com.lunchapp.lunchgrouprandomizer.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.List;

@Data
public class CreateUserCommand {

    @NotNull(message = "Cannot be null!")
    @NotEmpty(message = "Cannot be empty!")
    @NotBlank(message = "Cannot be blank!")
    @Length(min = 3)
    @Pattern(regexp = "^(?:(?![×Þß÷þø])[-'a-zA-ZÀ-ÿ])+$", message = "Invalid input: Name must contain only alphabet characters and cannot start with whitespace.")
    private String firstName;

    @NotNull(message = "Cannot be null!")
    @NotEmpty(message = "Cannot be empty!")
    @NotBlank(message = "Cannot be blank!")
    @Length(min = 3)
    @Pattern(regexp = "^(?:(?![×Þß÷þø])[-'a-zA-ZÀ-ÿ])+$", message = "Invalid input: Name must contain only alphabet characters and cannot start with whitespace.")
    private String lastName;

    @NotNull(message = "Cannot be null!")
    @NotEmpty(message = "Cannot be empty!")
    @NotBlank(message = "Cannot be blank!")
    @Length(min = 3)
    private String email;


    private List<String> themes;
}
