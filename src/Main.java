// Creating a class and object with Java
// public class MonitorApp
// {
//     public static void main(String[] args) throws Exception
//     {
//       Monitor monitor1 = new Monitor();         // Creating an object from the class created
//       Mouse mouse1 =new Mouse();
      
//       monitor1.printData();

//       mouse1.onClick();                         // Calling the methods within the class
//       monitor1.shutDown();

//       if(monitor1.isOn)                         // Since the attribute "isOn" is boolean type, we don't need to add "== true".
//       {
//         System.out.println("Monitor is on.");
//       }
//       else
//       {
//         System.out.println("Monitor is off");   // We can use "else" here because when the value is either true or false, and if the value isn't true, it must be false.
//       }
//     }
// }// The MonitorApp class ends here. Remember that the java file name must match the class name for it to work. Everything will be done on this same java file for easier reading.

// // When creating classes you should make a new file for the class.
// class Monitor
// {
//     public boolean isOn;    // These are attributes for the class "Monitor"
//     public String brand;

//     public Monitor(String brand, boolean isOn)  // Inside the brackets is the parameters for the constructor. This is a constructor with parameters.
//     {
//         this.brand = brand;         // The prefix "this." tells the constructor to refer for the Attribute "brand" that was given for the class. After the equal sign "brand" refers to the constructors brand parameter.
//         this.isOn = isOn;      
//     }

//     public Monitor(String brand)    // Here is an example of making multiple constructors with only using some of the attributes. This is "Method Overloading"
//     {
//         this.brand = brand;
//     }

//     public Monitor()      // This is a parameterless constructor with chosen attributes. So here the attributes are hard coded. This can also be refered as a "Default constructor"
//     {
//         brand = "";
//         isOn = true;
//     }

//     public void start()     // This is a method for the class "Monitor"
//     {
//         isOn = true;
//     }

//     public void shutDown()
//     {
//         isOn = false;
//     }

//     public void printData()
//     {
//       System.out.println("Monitor");
//       System.out.println("Brand: " + brand);

//       if(isOn)
//       {
//         System.out.println("The monitor is on.");
//       }
//       else
//       {
//         System.out.println("The monitor is off.");
//       }
//     }
// }

// // Creating a mouse.
// class Mouse
// {
//     public void onClick()
//     {
//         System.out.println("Mouse is clicked.");
//     }
// }


// import java.util.Scanner;
// public class Main
// {
//     public static void main(String[] args) throws Exception {
//         Scanner in = new Scanner(System.in);
//         Imuri Imuri1 = new Imuri("Dyson", "TX-5001", 650, "Black", false);
//         Imuri Imuri2 = new Imuri(null, null, 0, null, false);
//         Imuri1.turnOn();
//         Imuri1.specs();
//         Imuri1.increasePower();

//         Imuri2.setSpecs(in);
//         Imuri2.turnOn();
//         Imuri2.increasePower();
//         Imuri2.increasePower();
//         Imuri2.increaseLenght();
//         Imuri2.specs();
//     }
// }

// // import java.util.Scanner;            // You would need to import scanner on the java file to use it. Since these are all in same file, importing it once works.

// class Imuri     // Normally this would go in it's own .java file with the prefix of "public".
// {
//     // Making the constructor do determinate the attributes.
//     public Imuri(String brand, String model, int power, String colour, boolean isOn)
//     {
//         this.brand = brand;
//         this.model = model;
//         this.power = power;
//         this.colour = colour;
//         this.isOn = isOn;
//     }

//     // Attributes for the vacuum.
//     public int adjustPower = 0;
//     public int length = 100;

//     public boolean isOn = false;

//     public String brand = "";
//     public String model = "";
//     public int power = 0;
//     public String colour = "";

//     // Method for the user to set the specs instead of prederminating them.
//     public void setSpecs(Scanner in)
//     {
//         System.out.println("What is the brand of the vacuum?");
//         brand = in.nextLine();
//         System.out.println("What is the model of the vacuum?");
//         model = in.nextLine();
//         System.out.println("What is the power of the vacuum?");
//         power = Integer.parseInt(in.nextLine());
//         System.out.println("What is the colour of the vacuum?");
//         colour = in.nextLine();
//         in.close();
//     }

//     // Method to print out the specs
//     public void specs()
//     {
//         System.out.println("Brand: " + brand);
//         System.out.println("Model: " + model);
//         System.out.println("Power: " + power + "W");
//         System.out.println("Colour: " + colour);
//         System.out.println("Handle lenght: " + length + "cm");

//         if (isOn == true)
//         {
//             System.out.println("Current power is: " + adjustPower + "%");
//         }
//     }

//     // Methods for the vacuum
//     public void turnOn()
//     {
//         isOn = true;
//         adjustPower = 20;
//     }

//     public void turnOff()
//     {
//         isOn = false;
//     }

//     public void increasePower()
//     {
//         if (adjustPower < 100)
//         {
//             adjustPower += 20;
//             System.out.println("Power increased to: " + adjustPower + "%");
//         }
//         else
//         {
//             System.out.println("Power is already at maximum!");
//         }
//     }

//     public void decreasePower()
//     {
//         if (adjustPower > 20)
//         {
//             adjustPower -= 20;
//             System.out.println("Power decreased to: " + adjustPower + "%");
//         } else
//         {
//             System.out.println("Power is already at minimum!");
//         }
//     }

//     public void increaseLenght()
//     {
//         if (length < 160)
//         {
//             length += 20;
//             System.out.println("Handle length increased to: " + length + "cm");
//         }
//         else
//         {
//             System.out.println("Handle length is already at maximum!");
//         }
//     }

//     public void decreaseLenght()
//     {
//         if (length > 100)
//         {
//             length -= 20;
//             System.out.println("Handle length decreased to: " + length + "cm");
//         }
//         else
//         {
//             System.out.println("Handle length is already at minimum!");
//         }
//     }

//     public void retractCord()
//     {
//         System.out.println("Reeling cord.");
//     }
// }


public class Main
{
    public static void main(String[] args) throws Exception
    {
        Auto auto1 = new Auto("Tesla", "XT-100", 100);

        auto1.specs();
        auto1.accelerate();
        auto1.specs();
        auto1.reFuel(20);

        System.out.println("");

        Auto auto2 = new Auto();
        auto2.specs();
    }
}

class Auto
{
    public String brand = "";
    public String model = "";
    public int remainingFuel = 0;


    public Auto()
    {
        this.brand = "Toyota";
        this.model = "CX-100";
        this.remainingFuel = 100;
    }

    public Auto(String brand, String model, int remainingFuel)
    {
        this.brand = brand;
        this.model = model;
        this.remainingFuel = remainingFuel;
    }

    public void brake()
    {
        System.out.println("Car is breaking");
    }

    public void accelerate()
    {
        if (remainingFuel > 0)
        {
            System.out.println("Car is accelerating");
            remainingFuel -= 1;
        }
    }

    public void specs()
    {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Amount of fuel: " + remainingFuel + "L");
    }

    public void reFuel(int fuel)
    {
        System.out.println("Remaining fuel: " + remainingFuel + "L");
        System.out.println("Refueling: " + fuel + "L");

        remainingFuel += fuel;
        System.out.println("Fuel left after refueling: " + remainingFuel + "L");
    }
}

