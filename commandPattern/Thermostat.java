package SoftEng1_LabAss5_commandPattern;

public class Thermostat implements Devices
{
    @Override
    public void switchOn()
    {
        System.out.println("THERMOSTAT is Switched-On!");
    }

    @Override
    public void switchOff()
    {
        System.out.println("THERMOSTAT is Switched-Off!");
    }

    @Override
    public void Increased()
    {
        System.out.println("The THERMOSTAT's Temperature has been Increased!");
    }

    @Override
    public void Decreased()
    {
        System.out.println("The THERMOSTAT's Temperature has been Decreased!");
    }
}
