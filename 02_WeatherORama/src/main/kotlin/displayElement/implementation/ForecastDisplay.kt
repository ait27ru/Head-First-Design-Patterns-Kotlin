package displayElement.implementation

import Observer
import Subject
import displayElement.*

class ForecastDisplay(weatherData: Subject): Observer, DisplayElement {
    private var pressure = 0f
    private var avgPressure = 0f
    private var numberOfMeasurements = 0

    init{
        weatherData.registerObserver(this)
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        numberOfMeasurements++
        this.pressure = pressure
        this.avgPressure = (this.avgPressure * (numberOfMeasurements - 1) + pressure) / numberOfMeasurements

        display()
    }

    override fun display() {
        println("Forecast: ${formatForecast()}")
    }

    private fun formatForecast(): String {
        return when {
            (numberOfMeasurements == 0) -> "N/A"
            (pressure == avgPressure) -> "More of the same"
            (pressure > avgPressure) -> "Improving weather on the way!"
            else -> "Watch out for cooler, rainy weather"
        }
    }
}