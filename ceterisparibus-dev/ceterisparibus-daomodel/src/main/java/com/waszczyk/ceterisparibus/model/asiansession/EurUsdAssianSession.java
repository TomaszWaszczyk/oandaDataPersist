package com.waszczyk.ceterisparibus.model.asiansession;

import javax.persistence.*;

/**
 * Created by Mr Phi on 2015-03-23.
 */
@Entity
@Table(name = "eurusd_asian_levels")
public class EurUsdAssianSession extends AbstractAssianSession {

    @Id
    @SequenceGenerator(name = "EURUSD_ASIAN_ID_GENERATOR", sequenceName = "EURUSD_ASIAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EURUSD_ASIAN_ID_GENERATOR")
    @Column(unique = true, nullable = false)
    private Long eurusd_asian_id;

    public Long getEurusd_asian_id() {
        return eurusd_asian_id;
    }

    public void setEurusd_asian_id(Long eurusd_asian_id) {
        this.eurusd_asian_id = eurusd_asian_id;
    }
}
