package Design_Patterns;



interface MobileAlertState  
{ 
    public void alert(AlertStateContext ctx); 
} 
  
class AlertStateContext  
{ 
    private MobileAlertState currentState; 
  
    public AlertStateContext()  
    { 
        currentState = new Vibration(); 
    } 
  
    public void setState(MobileAlertState state)  
    { 
        currentState = state; 
    } 
  
    public void alert()  
    { 
        currentState.alert(this); 
    } 
} 
  
class Vibration implements MobileAlertState  
{ 
   
    public void alert(AlertStateContext ctx)  
    { 
         System.out.println("vibration..."); 
    } 
  
} 
  
class Silent implements MobileAlertState 
{ 
    public void alert(AlertStateContext ctx)  
    { 
        System.out.println("silent..."); 
    } 
  
} 
  
class State_Demo 
{ 
    public static void main(String[] args)  
    { 
        AlertStateContext stateContext = new AlertStateContext(); 
        stateContext.alert(); 
        stateContext.alert(); 
        stateContext.setState(new Silent()); 
        stateContext.alert(); 
        stateContext.alert(); 
        stateContext.alert();         
    } 
} 


