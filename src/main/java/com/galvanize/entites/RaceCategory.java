package com.galvanize.entites;

public enum RaceCategory {

    STOCK_CAR("stock car"), OPEN_WHEEL("open wheel"), TOUR("tour"), SPORT_CAR("sport car"),
    RALLY("rally"), TIME_ATTACK("time attack"), DRAG("drag"), OFF_ROAD("off-road");

    private String displayName;

    RaceCategory(String s) {
        this.displayName = s;
    }
}
