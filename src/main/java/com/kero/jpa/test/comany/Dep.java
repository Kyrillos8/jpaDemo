package com.kero.jpa.test.comany;

import javax.persistence.*;

@Entity
@Table(name = "Department")
public class Dep {

    @Id
    @Column(name = "depId")
    private int depId;

    @Column(name = "depName")
    private int depName;
}
