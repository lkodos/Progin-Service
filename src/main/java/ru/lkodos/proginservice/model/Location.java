package ru.lkodos.proginservice.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Location {

    GAGARINA("Гагарина"),
    TRK("ТРК"),
    DUBRAVNAYA("Дубравная"),
    YASHLEK("Яшлек"),
    ONLINE("Онлайн");

    private final String displayName;
}
