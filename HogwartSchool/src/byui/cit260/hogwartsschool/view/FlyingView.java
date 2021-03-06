/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.exceptions.SceneControlException;


/**
 *
 * @author Johnson
 */
public class FlyingView extends View{
    
     public FlyingView() {
        super("Welcome to flying menu veiw enter a string");
    }
   
    @Override
    public void display() {
        //DISPLAY prompt
        this.console.println(getPromptMessage());
        boolean done = false;
        String distance;
        String time;
        double distanceNum;
        double timeNum;

        do {
             distance = this.getInput();
            if (this.doAction(distance)) {
                distanceNum = Double.parseDouble(distance);
            } else {
                continue;
            }

            this.console.println("enter a valid Time: ");
            time = this.getInput();
            if (this.doAction(time)) {
                timeNum = Double.parseDouble(time);
            } else {
                continue;
            }

            this.Calculate(distanceNum, timeNum);
            done = true;

        } while (!done);
    }
  
    @Override 
    public boolean doAction(Object obj) {
        String input = (String)obj;
        double value; 
        //Check input
        //IF input is a number THEN Convert the string to a double
            if (input.matches("[0-9]+")){
                value = Double.parseDouble(input);
            }
            //ELSE IF the user did not input a value greater or equal to one THEN DISPLAY an invalid message and CONTINUE
            else{
                ErrorView.display(this.getClass().getName(),"*** Enter a number greater or equal to one. ***");
                return false;
            }
            
            //IF the user did not enter a number THEN DISPLAY an invalid input message
            if(value < 1){
                ErrorView.display(this.getClass().getName(),"*** Enter a number greater than one. ***");
                return false;
            }
            
        return true;
       
    }
    
    private void Calculate (double distance, double time){
         double calculate;
        try {
            calculate = byui.cit260.hogwartsschool.control.SceneControl.averageAcceleration(distance, time);
             //DISPLAY result
        this.console.println("Your speed is " + calculate + " miles per hour");
        } catch (SceneControlException ex) {
            ErrorView.display(this.getClass().getName(),ex.getMessage());
        }
        
       
    }
    
}

 
