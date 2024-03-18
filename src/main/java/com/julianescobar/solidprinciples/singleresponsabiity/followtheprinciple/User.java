package com.julianescobar.solidprinciples.singleresponsabiity.followtheprinciple;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

    private int id;
    private String name;
    private String email;
    private String password;
}
