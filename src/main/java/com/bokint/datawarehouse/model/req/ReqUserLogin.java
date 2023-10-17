package com.bokint.datawarehouse.model.req;

import lombok.Data;

@Data
public class ReqUserLogin {

    private String username;
    private String password;
}
