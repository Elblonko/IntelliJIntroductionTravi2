package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Fahrenheit extends Temperature {
    public Fahrenheit(float t)
    {
        super(t);
    }



    public String toString()
    {
        // TODO: Complete this method
        return "";
    }

    @Override
    public Temperature toCelsius() {
        //setValue( (float)((getValue() -32 ) / 1.8));
        //return this;
        return null;
    }

    @Override
    public  Temperature toFahrenheit() {

        return null;
    }
}

