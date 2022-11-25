package edu.miu.waa.propertymanagementservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponse {

    private String accessToken;

    private String refreshToken;

    private String email;
}