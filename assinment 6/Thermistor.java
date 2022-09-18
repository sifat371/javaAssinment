public class Thermistor {

  final double B = 3969;
  final double R0 = 1075;
  final double T0 = 358;

  double resistance, temperature;

  public Thermistor(double resistance) {
    this.resistance = resistance;

    double eq1 = B * T0;
    double eq2 = (T0 * Math.log1p((resistance / R0) - 1)) + B;
    temperature = (eq1 / eq2) - 273;
  }

  public double getTemperature() {
    return temperature;
  }
}