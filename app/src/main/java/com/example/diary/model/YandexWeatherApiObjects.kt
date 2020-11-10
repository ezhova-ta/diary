package com.example.diary.model

enum class Lang(val value: String) {
    RU("ru_RU"),
    EN("en_US")
}

enum class Condition(val enValue: String, val ruValue: String) {
    CLEAR("clear ", "ясно"),
    PARTLY_CLOUDY("partly-cloudy", "малооблачно"),
    CLOUDY("cloudy ", "облачно с прояснениями"),
    OVERCAST("overcast", "пасмурно"),
    DRIZZLE("drizzle", "морось"),
    LIGHT_RAIN("light-rain", "небольшой дождь"),
    RAIN("rain ", "дождь"),
    MODERATE_RAIN("moderate-rain", "умеренно сильный дождь"),
    HEAVY_RAIN("heavy-rain", "сильный дождь"),
    CONTINUOUS_HEAVY_RAIN("continuous-heavy-rain", "длительный сильный дождь"),
    SHOWERS("showers", "ливень"),
    WET_SNOW("wet-snow", "дождь со снегом"),
    LIGHT_SNOW("light-snow", "небольшой снег"),
    SNOW("snow", "снег"),
    SNOW_SHOWERS("snow-showers", "снегопад"),
    HAIL("hail", "град"),
    THUNDERSTORM("thunderstorm", "гроза"),
    THUNDERSTORM_WITH_RAIN("thunderstorm-with-rain", "дождь с грозой"),
    THUNDERSTORM_WITH_HAIL("thunderstorm-with-hail", "дождь с грозой")
}

enum class WindDir(val enValue:String, val ruValue: String) {
    NW("nw", "северо-западное"),
    N("n", "северное"),
    NE("ne", "северо-восточное"),
    E("e", "восточное"),
    SE("se", "юго-восточное"),
    S("s", "южное"),
    SW("sw", "юго-западное"),
    W("w", "западное"),
    C("c", "штиль")
}

enum class DayTime(val enValue:String, val ruValue: String) {
    D("d", "светлое время суток"),
    N("n", "темное время суток")
}

enum class Season(val enValue:String, val ruValue: String) {
    SUMMER("summer", "лето"),
    AUTUMN("autumn", "осень"),
    WINTER("winter", "зима"),
    SPRING("spring", "весна")
}
