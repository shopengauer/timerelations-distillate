package com.distillate.timerelations;

import org.joda.time.LocalDate;

public interface ITimePeriod {

    boolean hasStart();

    LocalDate start();

    boolean hasEnd();

    LocalDate end();

    boolean isMoment();

    void setup(LocalDate newStart, LocalDate newEnd);

    boolean isSamePeriod(ITimePeriod timePeriod);

    boolean hasInside(LocalDate localDate);

    boolean hasInside(ITimePeriod timePeriod);



}
