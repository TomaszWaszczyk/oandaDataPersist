package com.waszczyk.ceterisparibus.model.asiansession;

import javax.persistence.*;

/**
 * Created by Mr Phi on 2015-03-23.
 */
@Entity
@Table(name = "audusd_asian_levels")
public class AudUsdAssianSession extends AbstractAssianSession {

    @Id
    @SequenceGenerator(name = "AUDUSD_ASIAN_ID_GENERATOR", sequenceName = "AUDUSD_ASIAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AUDUSD_ASIAN_ID_GENERATOR")
    @Column(unique = true, nullable = false)
    private Long audusd_asian_id;

    public Long get_asian_id() {
        return audusd_asian_id;
    }

    public void set_asian_id(Long audusd_asian_id) {
        this.audusd_asian_id = audusd_asian_id;
    }
}
