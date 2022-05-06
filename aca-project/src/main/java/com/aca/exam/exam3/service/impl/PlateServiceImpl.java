package com.aca.exam.exam3.service.impl;

import com.aca.exam.exam3.entity.Plate;
import com.aca.exam.exam3.repository.PlateRepository;
import com.aca.exam.exam3.service.core.CreatePlateParams;
import com.aca.exam.exam3.service.core.PlateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import java.util.Optional;

public class PlateServiceImpl implements PlateService {

    private static Logger LOGGER = LoggerFactory.getLogger(PlateServiceImpl.class);

    private PlateRepository plateRepository;

    public PlateServiceImpl(PlateRepository plateRepository) {
        this.plateRepository = plateRepository;
    }

    @Override
    public Plate create(CreatePlateParams params) {
        Assert.notNull(params, "The create plate params should not be null");
        LOGGER.info("Creating a plate for the provided params - {}", params);

        Plate plate = new Plate(params.getNumbers(), params.getNumberStatus());
        Plate savedPlate = plateRepository.save(plate);

        LOGGER.info("Successfully created a plate for the provided params - {}, plate - {}", params, plate);
        return savedPlate;
    }

    @Override
    public Plate getById(Long id) {
        Assert.notNull(id, "The id should not be null");
        LOGGER.info("Call plate for id provided - {}", id);

        final Optional<Plate> optionalPlate = plateRepository.findById(id);

        if (optionalPlate.isEmpty()) {
            throw new IllegalArgumentException();
        }

        Plate plate = optionalPlate.get();
        LOGGER.info("Successfully retrieved the plate for the provided id - {}, result - {}", id, plate);
        return plate;
    }
}
