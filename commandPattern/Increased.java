package SoftEng1_LabAss5_commandPattern;

public class Increased implements Command
{
    private Devices devices;

    public Increased (Devices devices)
    {

        this.devices = devices;
    }

    @Override
    public void execute(){
        devices.Increased();
    }
}
