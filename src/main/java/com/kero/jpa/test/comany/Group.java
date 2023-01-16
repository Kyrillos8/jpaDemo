package com.kero.jpa.test.comany;

import javax.persistence.*;

@Entity
@Table(name = "Group")
public class Group {

    @Id
    @Column(name = "groupId")
    private int GroupId;

    @Column(name = "groupName")
    private int GroupName;
}
