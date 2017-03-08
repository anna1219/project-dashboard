package com.allstate.carcierge;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MEMBER")
public class User {

    @Id
//    @SequenceGenerator(name = "MemberSequence", sequenceName = "MEMBER_SEQ")
//    @GeneratedValue(generator = "MemberSequence", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private long id;

}

