package SoftEng1_LabAss5_commandPattern;

public class MusicPlayer implements Devices
{
    @Override
    public void switchOn()
    {
        System.out.println("MUSIC PLAYER is Switched-On!");
    }

    @Override
    public void switchOff()
    {
        System.out.println("MUSIC PLAYER is Switched-Off!");
    }

    @Override
    public void Increased()
    {
        System.out.println("The MUSIC PLAYER's Volume has been Increased!");
    }

    @Override
    public void Decreased()
    {
        System.out.println("The MUSIC PLAYER's Volume has been Decreased!");
    }

}
