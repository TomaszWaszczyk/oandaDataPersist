package com.waszczyk.ceterisparibus.model.asiansession;

import javax.persistence.*;

/**
 * Created by Mr Phi on 2015-03-23.
 */
@Entity
@Table(name = "usdjpy_asian_levels")
public class UsdJpyAssianSession extends AbstractAssianSession {

    @Id
    @SequenceGenerator(name = "USDJPY_ASIAN_ID_GENERATOR", sequenceName = "USDJPY_ASIAN_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USDJPY_ASIAN_ID_GENERATOR")
    @Column(unique = true, nullable = false)
    private Long usdjpy_asian_id;

    public Long getUsdjpy_asian_id() {
        return usdjpy_asian_id;
    }

    public void setUsdjpy_asian_id(Long usdjpy_asian_id) {
        this.usdjpy_asian_id = usdjpy_asian_id;
    }
}
