package flowControl;

public class switcch {
    public static void main(String[] arguments)
    {
        int number = 44;
        String size;

        switch (number) {
            case 29:
                size = "Small";
                break;

            case 42:
                size = "Medium";
                break;

            case 44:
                size = "Large";
                break;

            case 48:
                size = "Extra Large";
                break;

            default:  // doesn't match any case
                size = "Unknown";
                break;

        }
        
        System.out.println("Size: " + size);
    }
}
