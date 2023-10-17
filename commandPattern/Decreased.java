package SoftEng1_LabAss5_commandPattern;

public class Decreased implements Command
{
    private Devices devices;

    public Decreased (Devices devices)
    {

        this.devices = devices;
    }

    @Override
    public void execute()
    {
        devices.Decreased();
    }
}
