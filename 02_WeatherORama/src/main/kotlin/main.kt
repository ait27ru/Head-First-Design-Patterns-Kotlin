import displayElement.implementation.CurrentConditionsDisplay
import displayElement.implementation.ForecastDisplay
import displayElement.implementation.StatisticsDisplay

fun main() {

    val weatherData = WeatherData()

    CurrentConditionsDisplay(weatherData)
    StatisticsDisplay(weatherData)
    ForecastDisplay(weatherData)

    weatherData.setMeasurements(20f, 50f, 1200f)
    weatherData.setMeasurements(24f, 45f, 1250f)
    weatherData.setMeasurements(28f, 40f, 1150f)
}