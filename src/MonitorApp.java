// Creating a class and object with Java
public class MonitorApp
{
    public static void main(String[] args) throws Exception
    {
      Monitor monitor1 = new Monitor();         // Creating an object from the class created
      Mouse mouse1 =new Mouse();
      
      mouse1.onClick();                         // Calling the methods within the class
      monitor1.shutDown();

      if(monitor1.isOn)                         // Since the attribute "isOn" is boolean type, we don't need to add "== true".
      {
        System.out.println("Monitor is on.");
      }
      else
      {
        System.out.println("Monitor is off");   // We can use "else" here because when the value is either true or false, and if the value isn't true, it must be false.
      }
    }
}// The MonitorApp class ends here. Remember that the java file name must match the class name for it to work. Everything will be done on this same java file for easier reading.

// When creating classes you should make a new file for the class.
class Monitor
{
    public boolean isOn;    //This is an attribute for the class "Monitor"

    public void start()     //This is a method for the class "Monitor"
    {
        isOn = true;
    }

    public void shutDown()
    {
        isOn = false;
    }
}

// Creating a mouse.
class Mouse
{
    public void onClick()
    {
        System.out.println("Mouse is clicked.");
    }
}

