package com.github.poletto.bootcamp.weather;

import java.io.IOException;

/**
 * This interface represents a service that enables you to get weather forecasts for a specific
 * location.
 */
public interface WeatherService {

    /**
     * Get the weather forecast at a given location.
     *
     * @param location the location for which you want to get the forecast
     * @return the weather forecast for the given location
     * @throws IOException if there is a network error of any kind
     */
    WeatherForecast getForecast(Location location) throws IOException;

}

