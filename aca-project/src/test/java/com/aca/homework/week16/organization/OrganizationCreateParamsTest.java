package com.aca.homework.week16.organization;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class OrganizationCreateParamsTest {

    @Test
    public void testNullOrganizationName() {
        Assertions.assertThatThrownBy(() -> new OrganizationCreateParams(null, "Amiryan 12"));
    }

    @Test
    public void testNullFullAddress() {
        Assertions.assertThatThrownBy(() -> new OrganizationCreateParams("Aeroflot", null));
    }

}