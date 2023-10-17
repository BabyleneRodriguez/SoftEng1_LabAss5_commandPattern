package SoftEng1_LabAss5_commandPattern;
import java.util.Scanner;

public class ViewerApp
{
    public static void printName()
    {
        System.out.println("SOFTWARE ENGINEERING 1");
        System.out.print("LABORATORY ASSIGNMENT 5 - COMMAND PATTERN\n");
        System.out.print("RODRIGUEZ, BABYLENE G.\n");
        System.out.print("3-BSCS-1\n");
        System.out.println();
    }

    public static void main (String[] args)
    {
        CentralHub centralHub = new CentralHub();
        Devices light = new Light();
        Devices thermostat = new Thermostat();
        Devices musicPlayer = new MusicPlayer();

        printName();
        int option;

        while (true)
        {
            System.out.print("\n\nDEVICES\n");
            System.out.println("[1] Light");
            System.out.println("[2] Thermostat");
            System.out.println("[3] Music Player");
            System.out.println("[4] Exit Device");

            Scanner usersInput = new Scanner(System.in);
            System.out.print("\nSelect a Device: ");
            option = usersInput.nextInt();

            switch (option)
            {
                case 1:
                while (true)
                {
                   System.out.println("\nChosen Device: LIGHT");
                   System.out.println("\nLight's Command");
                   System.out.print("\n[1] Switch On" +
                                    "\n[2] Switch Off" +
                                    "\n[3] Increase Brightness" +
                                    "\n[4] Decrease Brightness" +
                                    "\n[5] Return to Selecting a Device" +
                                    "\n\nSelect Command: ");

                   Integer commandButton = usersInput.nextInt();

                   if (commandButton == 5)
                   {
                      System.out.println("The Light Device has been Deactivated...");
                      break;
                   }
                      System.out.println();
                      remoteControl(commandButton, light, centralHub);
                      System.out.println();
                }
                break;

                case 2:
                while (true)
                {
                   System.out.println("\nChosen Device: THERMOSTAT");
                   System.out.println("\nThermostat's Command");
                   System.out.print("\n[1] Switch On" +
                                    "\n[2] Switch Off" +
                                    "\n[3] Increase Temperature" +
                                    "\n[4] Decrease Temperature" +
                                    "\n[5] Return to Selecting a Device" +
                                    "\n\nSelect Command: ");

                   Integer commandButton = usersInput.nextInt();

                   if (commandButton == 5)
                   {
                      System.out.println("The Thermostat Device has been Deactivated...");
                      break;
                   }
                      System.out.println();
                      remoteControl(commandButton, thermostat, centralHub);
                      System.out.println();
                }
                break;

                case 3:
                while (true)
                {
                   System.out.println("\nChosen Device: MUSIC PLAYER");
                   System.out.println("\nMusic Players's Command");
                   System.out.print("\n[1] Switch On" +
                                    "\n[2] Switch Off" +
                                    "\n[3] Increase Volume" +
                                    "\n[4] Decrease Volume" +
                                    "\n[5] Return to Selecting a Device" +
                                    "\n\nSelect Command: ");

                   Integer commandButton = usersInput.nextInt();

                   if (commandButton == 5)
                   {
                      System.out.println("The Music Player Device has been Deactivated...");
                      break;
                   }
                      System.out.println();
                      remoteControl(commandButton, musicPlayer, centralHub);
                      System.out.println();

                }
                break;

                case 4:
                    System.out.println("\nEXITING DEVICES...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("This is not a valid Option! Please Select Another");
                    break;
            }

        }

    }
    public static void remoteControl(Integer commandButton, Devices devices, CentralHub centralHub)
    {
        switch (commandButton)
        {
            case 1:
                Command powerOnCommand = new PowerOn(devices);
                centralHub.addCommand(powerOnCommand);
                centralHub.clickButton();
                break;
            case 2:
                Command powerOffCommand = new PowerOff(devices);
                centralHub.addCommand(powerOffCommand);
                centralHub.clickButton();
                break;
            case 3:
                Command increasedCommand = new Increased(devices);
                centralHub.addCommand(increasedCommand);
                centralHub.clickButton();
                break;
            case 4:
                Command decreasedCommand = new Decreased(devices);
                centralHub.addCommand(decreasedCommand);
                centralHub.clickButton();
                break;
            default:
                System.out.println("This is not a valid Option! Please Select Another");
                break;
        }
    }
    }









