package com.aca.exam.exam3.service.core;

import com.aca.exam.exam3.entity.Plate;

public interface PlateService {

    Plate create(CreatePlateParams params);

    Plate getById(Long id);

}
