package com.waszczyk.ceterisparibus.model.alarms;

import javax.persistence.*;

/**
 * Created by Mr Phi on 2015-03-29.
 */
@Entity
@Table(name="alarms")
public class AlarmEntity extends AbstractAlarm {

    @Id
    @SequenceGenerator(name = "ALARM_ID_GENERATOR", sequenceName = "ALARM_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ALARM_ID_GENERATOR")
    @Column(unique = true, nullable = false)
    private Long alarm_id;

    public AlarmEntity(String date, String instrument, String message) {
        this.date = date;
        this.instrument = instrument;
        this.message = message;
    }

    public AlarmEntity() {
    }

    public Long getAlarm_id() {
        return alarm_id;
    }

    public void setAlarm_id(Long alarm_id) {
        this.alarm_id = alarm_id;
    }
}
