package com.waszczyk.ceterisparibus.model.asiansession;

import javax.persistence.*;

/**
 * Created by Mr Phi on 2015-03-23.
 */
@Entity
@Table(name = "eurjpy_asian_levels")
public class EurJpyAssianSession extends AbstractAssianSession {

    @Id
    @SequenceGenerator(name = "EURJPY_ASIAN_ID_GENERATOR", sequenceName = "EURJPY_ASIAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EURJPY_ASIAN_ID_GENERATOR")
    @Column(unique = true, nullable = false)
    private Long eurjpy_asian_id;

    public Long getEurjpy_asian_id() {
        return eurjpy_asian_id;
    }

    public void setEurjpy_asian_id(Long eurjpy_assian_id) {
        this.eurjpy_asian_id = eurjpy_assian_id;
    }
}
