package com.qa.persistence.domain;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Transaction {

    @Id
    @GeneratedValue
    private Long id;

}
