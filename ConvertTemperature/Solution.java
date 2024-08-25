package ConvertTemperature;

class Solution {
    public double[] convertTemperature(double celsius) {

        double[] res = new double[2];

        double kelvin = 0;
        double fahrenheit = 0;

        kelvin = celsius + 273.15;
        fahrenheit = celsius * 1.80 + 32.00;

        res[0] = kelvin;
        res[1] = fahrenheit;

        return res;

    }
}