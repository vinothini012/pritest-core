package no.citrus.restapi.model;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import no.citrus.restapi.model.Measure;

import org.junit.Test;


public class MeasureTest {

    @Test
    public void shouldSupportName() {
        Measure measure = new Measure("abc");
        assertThat(measure.getName(), equalTo("abc"));
    }
}