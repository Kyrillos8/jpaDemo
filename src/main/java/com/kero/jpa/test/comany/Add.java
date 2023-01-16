package com.kero.jpa.test.comany;

import javax.persistence.*;

@Entity
@Table(name = "Address")
public class Add {
    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "AddressName")
    private int AddName;
}
