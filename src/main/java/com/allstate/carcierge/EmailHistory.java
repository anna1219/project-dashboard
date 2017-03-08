package com.allstate.carcierge;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMAIL_HISTORY")
public class EmailHistory {

    @Id
//    @SequenceGenerator(name = "EmailHistorySequence", sequenceName = "EMAIL_HISTORY_SEQ")
//    @GeneratedValue(generator = "EmailHistorySequence", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private long id;

}
