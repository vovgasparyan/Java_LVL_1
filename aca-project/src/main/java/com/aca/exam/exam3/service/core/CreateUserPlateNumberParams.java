package com.aca.exam.exam3.service.core;

public class CreateUserPlateNumberParams {

    private Long userId;
    private Long plateId;

    public CreateUserPlateNumberParams(Long userId, Long plateId) {
        this.userId = userId;
        this.plateId = plateId;
    }
    public Long getUserId() {
        return userId;
    }

    public Long getPlateId() {
        return plateId;
    }
}
