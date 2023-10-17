package SoftEng1_LabAss5_commandPattern;

public class PowerOn implements Command
{
    private Devices devices;

    public PowerOn(Devices devices)
    {
        this.devices = devices;
    }

    @Override
    public void execute()
    {
        devices.switchOn();
    }
}
