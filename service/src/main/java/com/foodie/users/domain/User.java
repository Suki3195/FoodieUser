package com.foodie.users.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
class User {

    private String userName;
    private String cuisine ;
    private String description;
    private String dish ;

}
