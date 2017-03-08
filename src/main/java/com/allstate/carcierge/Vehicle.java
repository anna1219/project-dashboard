package com.allstate.carcierge;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VEHICLE")
public class Vehicle {

    @Id
//    @SequenceGenerator(name = "VehicleSequence", sequenceName = "VEHICLE_SEQ")
//    @GeneratedValue(generator = "VehicleSequence", strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private long id;

}