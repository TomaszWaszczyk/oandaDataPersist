package com.waszczyk.ceterisparibus.model.asiansession;

import javax.persistence.*;

/**
 * Created by Mr Phi on 2015-03-23.
 */
@Entity
@Table(name = "usdchf_asian_levels")
public class UsdChfAssianSession extends AbstractAssianSession {

    @Id
    @SequenceGenerator(name = "USDCHF_ASIAN_ID_GENERATOR", sequenceName = "USDCHF_ASIAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USDCHF_ASIAN_ID_GENERATOR")
    @Column(unique = true, nullable = false)
    private Long usdchf_asian_id;

    public Long getUsdchf_asian_id() {
        return usdchf_asian_id;
    }

    public void setUsdchf_asian_id(Long usdchf_asian_id) {
        this.usdchf_asian_id = usdchf_asian_id;
    }
}
