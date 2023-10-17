package SoftEng1_LabAss5_commandPattern;

public class PowerOff implements Command
{
    private Devices devices;

    public PowerOff(Devices devices)
    {

        this.devices = devices;
    }

    @Override
    public void execute()
    {
        devices.switchOff();
    }
}
