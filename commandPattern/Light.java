package SoftEng1_LabAss5_commandPattern;

public class Light implements Devices
{
    @Override
    public void switchOn()
    {
        System.out.println("LIGHT is Switched-On!");
    }

    @Override
    public void switchOff()
    {
        System.out.println("LIGHT is Switched-Off!");
    }

    @Override
    public void Increased()
    {
        System.out.println("The LIGHT's Brightness has been Increased!");
    }

    @Override
    public void Decreased()
    {
        System.out.println("The LIGHT's Brightness has been Decreased");
    }
}
