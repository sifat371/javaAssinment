public class Humidity {
  final double A = 17.27;
  final double B = 237.7;

  double temp, rH, humidity;

  public Humidity(double temp, double rH) {
    this.temp = temp;
    this.rH = rH;

    double equ = (((A * temp) / (B + temp)) + Math.log1p((rH / 100.0) - 1));
    humidity = ((B * equ) / (A - equ));
  }

  public double getHumidity() {
    return humidity;
  }

}