import java.util.Scanner;
// Creating a class and object with Java
// public class MonitorApp
// {
//     public static void main(String[] args) throws Exception
//     {
//       Monitor monitor1 = new Monitor();         // Creating an object from the class created
//       TouchMonitor touch1 = new TouchMonitor();
//       Mouse mouse1 = new Mouse();
//       Scanner in = new Scanner(System.in);
//       int x = 0;
//       int y = 0;

//       System.out.println("Touch X?");
//       x = Integer.parseInt(in.nextLine());
//       System.out.println("Touch Y?");
//       y = Integer.parseInt(in.nextLine());
//       touch1.setTouchXY(x, y);
//       touch1.printData();

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

// class TouchMonitor extends Monitor
// {
//     private int touchX;
//     private int touchY;  
    
//     public TouchMonitor()
//     {
//       super();
//       touchX = 0;
//       touchY = 0;
//     }

//     @Override
//     public void printData()
//     {
//       super.printData();
//       System.out.println("TouchX: " + touchX + " TouchY: " + touchY);
//     }

//     public void setTouchXY(int x, int y)
//     {
//       touchX = x;
//       touchY = y;
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

// class CordlessVacuum extends Imuri
// {
//     public boolean recharge = false;

//     public CordlessVacuum()
//     {
//         // this.brand = brand;
//         // this.model = model;
//         // this.power = power;      // Since everything is in the same file, you need to call explicitly the constructor "Imuri" with "super"
//         // this.colour = colour;
//         // this.isOn = isOn;
//         super("", "", 0, "", true);
//         recharge = false;
//     }

//     public CordlessVacuum(String brand, String model, String colour, int power, boolean isOn, boolean recharge)
//     {
//         super(brand, model, power, colour, isOn);
//         this.recharge = recharge;
//     }

//     @Override
//     public void specs()
//     {
//         super.specs();
//         System.out.println("The device is charging:" + recharge);
//     }

//     @Override
//     public void setSpecs(Scanner in)
//     {
//         super.setSpecs(in);
//         System.out.println("Is it recharging? (true/false)");
//         String input = in.next();

//         if (input.equals("true") || input.equals("false"))
//         {
//             recharge = Boolean.parseBoolean(input);
//         }
//     }

//     public class lightSwitch
//     {
//         public boolean light = false;
//     }

//     private lightSwitch lightSwitch = new lightSwitch();

//     public void toggleLight()
//     {
//         lightSwitch.light = !lightSwitch.light;

//         if (lightSwitch.light)
//         {
//             System.out.println("Turning on the light");
//         } else
//         {
//             System.out.println("Turning off the light");
//         }
//     }
// }


// public class Main
// {
//     public static void main(String[] args) throws Exception
//     {
//         Auto auto1 = new Auto("Tesla", "XT-100", 100);

//         auto1.specs();
//         auto1.accelerate();
//         auto1.specs();
//         auto1.reFuel(20);

//         System.out.println("");

//         Auto auto2 = new Auto();
//         auto2.specs();
//     }
// }

// class Auto
// {
//     public String brand = "";
//     public String model = "";
//     public int remainingFuel = 0;


//     public Auto()
//     {
//         this.brand = "Toyota";
//         this.model = "CX-100";
//         this.remainingFuel = 100;
//     }

//     public Auto(String brand, String model, int remainingFuel)
//     {
//         this.brand = brand;
//         this.model = model;
//         this.remainingFuel = remainingFuel;
//     }

//     public void brake()
//     {
//         System.out.println("Car is breaking");
//     }

//     public void accelerate()
//     {
//         if (remainingFuel > 0)
//         {
//             System.out.println("Car is accelerating");
//             remainingFuel -= 1;
//         }
//     }

//     public void specs()
//     {
//         System.out.println("Brand: " + brand);
//         System.out.println("Model: " + model);
//         System.out.println("Amount of fuel: " + remainingFuel + "L");
//     }

//     public void reFuel(int fuel)
//     {
//         System.out.println("Remaining fuel: " + remainingFuel + "L");
//         System.out.println("Refueling: " + fuel + "L");

//         remainingFuel += fuel;
//         System.out.println("Fuel left after refueling: " + remainingFuel + "L");
//     }
// }


// public class App
// {
//   public static void main(String[] args) throws Exception
//   {
//       Lelu lelu1 = new Lelu("Madza", 100);
//       lelu1.printData();

//       Vieteriauto vieteriauto1 = new Vieteriauto("Toyota", 20, 20);
//       vieteriauto1.accelerate();
//       vieteriauto1.printData();

//       Polkuauto polkuauto1 = new Polkuauto("Audi", 20, 3);
//       polkuauto1.printData();
//   }
// }

// class Lelu
// {
//   public String name = "";
//   private int weight = 0;

  
//   public Lelu()
//   {
//       this.name = "";
//       this.weight = 0;
//   }

  
//   public Lelu(String name, int weight)
//   {
//       this.name = name;
//       this.weight = weight;
//   }

//   public void printData()
//   {
//       System.out.println("Name: " + name);
//       System.out.println("Weight: " + weight);
//   }
// }

// class Polkuauto extends Lelu
// {
//   public int wheels = 3;

//   public Polkuauto()
//   {
//       super();
//       this.wheels = 3;
//   }

//   public Polkuauto(String name, int weight, int wheels)
//   {
//       super(name, weight);
//       this.wheels = wheels;
//   }

//   @Override
//   public void printData()
//   {
//       super.printData();
//       System.out.println("Wheels: " + wheels);
//   }
// }

// class Vieteriauto extends Lelu
// {
//   public int speed = 0;

//   public Vieteriauto()
//   {
//       super();
//       this.speed = 0;
//   }

//   public Vieteriauto(String name, int weight, int speed)
//   {
//       super(name, weight);
//       this.speed = speed;
//   }

//   public void accelerate()
//   {
//       speed++;
//   }

//   @Override
//   public void printData()
//   {
//       super.printData();
//       System.out.println("Speed: " + speed);
//   }
// }

// public class App
// {
//     public static void main(String[] args) throws Exception
//     {
//         Scanner in = new Scanner(System.in);
//         String input ="";
//         double radius = 0;
//         int pituus = 0;
//         int leveys = 0;
//         System.out.println("Calculate the area of a rectangle or a circle (r/c)");
//         input = in.nextLine();

//         if (input.equals("c"))
//             {
//                 System.out.println("Radius?");
//                 radius = Double.parseDouble(in.nextLine());
//                 System.out.printf("%.2f%n",Laskuri.laskePintaAla(radius));
//             }
//         else if (input.equals("r"))
//             {
//                 System.out.println("Leveys?");
//                 leveys = Integer.parseInt(in.nextLine());
//                 System.out.println("Pituus?");
//                 pituus = Integer.parseInt(in.nextLine());
//                 System.out.printf("%.2f%n",(double)Laskuri.laskePintaAla(pituus, leveys));
//             }
//         in.close();    
//     }
// }

// class Laskuri
// {
//     public static int laskePintaAla(int pituus, int leveys)
//     {
//         return pituus * leveys;
//     }

//     public static double laskePintaAla(double radius)
//     {
//         return Math.PI * Math.pow(radius, 2);
//     }
// }

// public class PacManApp
// {

// 	public static void main(String[] args)
//     {
//         Pacman pacman = new Pacman();
//         Fruit fruit1 = new Fruit();
//         Fruit fruit2 = new Fruit();
//         Fruit fruit3 = new Fruit();

//         pacman.eat(fruit1);

//         System.out.println(fruit1.isVisible);
//         System.out.println(fruit2.isVisible);
//         System.out.println(fruit3.isVisible);
// 	}

// }

// class Pacman
// {
//     public int points;
//     public int lives;

//     public Pacman()
//     {
//     	points = 0;
//         lives = 4;
//     }

//     public void printData()
//     {
//         System.out.println(points);
//         System.out.println(lives);
//     }

//     public void eat(Fruit eatenFruit)
//     {
//     	System.out.println("Pac-Man ate fruit");
//         eatenFruit.disappear();
//     }

//     public void vahennaElama()
//     {
//         System.out.println("Pacman syöty");
//         lives--;
//     }
// }


// class Fruit
// {
//     public boolean isVisible;

//     public Fruit()
//     {
//     	isVisible = true;
//     }

//     public void disappear()
//     {
//     	isVisible = false;
//         System.out.println("Fruit is hidden");
//     }
// }

// class Ghost
// {
//     public void syoPacman(Pacman pacmanKilled)
//     {
//         pacmanKilled.vahennaElama();       
//     }
// }

// public class AbstractExample
// {
//     public static void main(String[] args)
//     {
//         Square square1 = new Square(12);
//         square1.calcArea();
//         square1.printArea();
//     }
// }

// abstract class Shape
// {
//     public double area;

//     abstract public double calcArea();

//     public void printArea()
//     {
//         System.out.println(area);
//     }

// }

// class Square extends Shape
// {
//     private double side;

//     public Square (double side)
//     {
//         this.side = side;
//     }

//     @Override
//     public double calcArea()
//     {
//         area = side * side;
//         return area;
//     }
// }

public class InterfaceExample
{
    public static void main (String[] args) throws Exception
    {
        Square square1 = new Square(12);
        square1.calcArea();
        square1.printArea();

    }
}

interface Shape
{
    public double calcArea();
    public void printArea();
}

class Square implements Shape
{
    private double side;

    public Square (int side)
    {
        this.side = side;
    }
    
    @Override
    public double calcArea()
    {
        return side * side;
    }

    @Override
    public void printArea()
    {
        System.out.println(side*side);
    }
}