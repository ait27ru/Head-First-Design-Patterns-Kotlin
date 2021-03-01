package displayElement.implementation

import Observer
import Subject
import displayElement.*

class StatisticsDisplay(weatherData: Subject): Observer, DisplayElement {
    private var temperature = 0f
    private var avgTemperature = 0f
    private var maxTemperature = Float.MIN_VALUE
    private var minTemperature = Float.MAX_VALUE
    private var numberOfMeasurements = 0

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        numberOfMeasurements++
        this.temperature = temperature
        this.avgTemperature = (this.avgTemperature * (numberOfMeasurements - 1) + temperature) / numberOfMeasurements
        if(temperature > maxTemperature) maxTemperature = temperature
        if(temperature < minTemperature) minTemperature = temperature

        display()
    }

    override fun display() {
        println("Avg/Max/Min temperature = ${formatTemperatureStats()}")
    }

    private fun formatTemperatureStats(): String {
        return when{
            (numberOfMeasurements == 0) -> "N/A"
            else -> "${avgTemperature}/$maxTemperature/$minTemperature"
        }
    }
}