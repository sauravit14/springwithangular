package com.saurav.rest.webservices.restfulwebservice.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {
  
  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;
    
//    {
//    	"token":"eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTYwMDMyMTI1MiwiaWF0IjoxNTk5NzE2NDUyfQ.e6NEeNTZxvk9aly7UGP4y3NFygA9CApN50AxEaDR_MEcI165WLCjBL4ZdtO91Zs597PA9_uKFGcl-YtuVNgCNQ"
//    }
    

    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

