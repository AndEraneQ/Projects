package com.troja.GradeBook.dto.requests;

import com.troja.GradeBook.dto.ResidenceDto;
import com.troja.GradeBook.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegisterUserRequest {
    private UserDto user;
    private ResidenceDto residence;
}