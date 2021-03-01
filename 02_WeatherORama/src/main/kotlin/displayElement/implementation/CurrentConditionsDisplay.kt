package displayElement.implementation

import displayElement.*
import Observer
import Subject

class CurrentConditionsDisplay(weatherData: Subject) : Observer, DisplayElement {
    private var temperature = 0f
    private var humidity = 0f

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity

        display()
    }

    override fun display() {
        println("Current conditions: $temperature C degrees and $humidity% humidity")
    }
}