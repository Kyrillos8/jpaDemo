package com.kero.jpa.test.comany;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@Access(AccessType.FIELD)
public class Emp {

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "Name")
    private int name;

    @Column(name = "Dep")
    private int Dep;

    @Column(name = "Add")
    private int Add;

    @Column(name = "Group")
    private int Group;

}
