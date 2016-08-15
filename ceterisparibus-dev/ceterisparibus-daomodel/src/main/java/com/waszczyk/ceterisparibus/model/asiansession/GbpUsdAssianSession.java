package com.waszczyk.ceterisparibus.model.asiansession;

import javax.persistence.*;

/**
 * Created by Mr Phi on 2015-03-23.
 */
@Entity
@Table(name = "gbpusd_asian_levels")
public class GbpUsdAssianSession extends AbstractAssianSession {

    @Id
    @SequenceGenerator(name = "GBPUSD_ASIAN_ID_GENERATOR", sequenceName = "GBPUSD_ASIAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GBPUSD_ASIAN_ID_GENERATOR")
    @Column(unique = true, nullable = false)
    private Long gbpusd_asian_id;

    public Long getGbpusd_asian_id() {
        return gbpusd_asian_id;
    }

    public void setGbpusd_asian_id(Long gbpusd_asian_id) {
        this.gbpusd_asian_id = gbpusd_asian_id;
    }
}
