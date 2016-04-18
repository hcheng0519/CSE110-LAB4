package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Celsius extends Temperature {

        public Celsius(float t)
        {
            super(t);
        }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float tempo = this.getValue();
        tempo = ((tempo*9)/5) + 32;
        return new Fahrenheit(tempo);
    }


    public String toString()
        {
            // TODO: Complete this method
            return this.getValue() + " c";
        }
}
