package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "USER_INFO")
public class UserInfo extends BaseModel {

    @Column(name = "content")
    private String content;
}
