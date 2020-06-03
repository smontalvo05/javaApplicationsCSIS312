//Time2 - This file is a class that holds the totalSeconds and uses set and get methods to calculate the correct time and format.
//CSIS 312- B02 
public class Time2 
{

       private int totalSeconds;//private variable instance to hold total seconds after calculation.

       // Time2 no-argument constructor: 
       // initializes each instance variable to zero
       public Time2()
       {
          this(0, 0, 0); // invoke constructor with three arguments
       } 

       // Time2 constructor: hour supplied, minute and second defaulted to 0
       public Time2(int hour) 
       { 
          this(hour, 0, 0); // invoke constructor with three arguments
       } 

       // Time2 constructor: hour and minute supplied, second defaulted to 0
       public Time2(int hour, int minute) 
       { 
          this(hour, minute, 0); // invoke constructor with three arguments
       } 

       // Time2 constructor: hour, minute and second supplied
       public Time2(int hour, int minute, int second) 
       { 
          if (hour < 0 || hour >= 24)
             throw new IllegalArgumentException("hour must be 0-23");

          if (minute < 0 || minute >= 60)
             throw new IllegalArgumentException("minute must be 0-59");

          if (second < 0 || second >= 60)
             throw new IllegalArgumentException("second must be 0-59");

          setHour(hour);
          setMinute(minute); 
          setSecond(second); 
          totalSeconds = (hour * 60 * 60) + (minute * 60) + second; //calculation to give the total amount of seconds
       } 

       // Time2 constructor: another Time2 object supplied
       public Time2(Time2 time)
       {
          // invoke constructor with three arguments
          this(time.getHour(), time.getMinute(), time.getSecond());
       } 

       // Set Methods
       // set a new time value using universal time; 
       // validate the data
       public void setTime(int hour, int minute, int second)
       {
          if (hour < 0 || hour >= 24)
             throw new IllegalArgumentException("hour must be 0-23");

          if (minute < 0 || minute >= 60)
             throw new IllegalArgumentException("minute must be 0-59");

          if (second < 0 || second >= 60)
             throw new IllegalArgumentException("second must be 0-59");

          setHour(hour);
          setMinute(minute); 
          setSecond(second); 
       } 

       // validate and set hour 
       public void setHour(int hour) 
       { 
          if (hour < 0 || hour >= 24)
             throw new IllegalArgumentException("hour must be 0-23");

          totalSeconds = totalSeconds-(getHour()*60*60);//calculation to subtract whole amount
          totalSeconds = totalSeconds +(hour*60*60);//calculation to add new amount
       } 

       // validate and set minute 
       public void setMinute(int minute) 
       { 
          if (minute < 0 || minute >= 60)
             throw new IllegalArgumentException("minute must be 0-59");

          totalSeconds = totalSeconds -(getMinute()*60);//calculation to subtract whole amount
          totalSeconds = totalSeconds+(minute*60);//calculation to add new amount
       } 

       // validate and set second 
       public void setSecond(int second) 
       { 
          if (second < 0 || second >= 60)
             throw new IllegalArgumentException("second must be 0-59");

           totalSeconds = totalSeconds -getSecond();//calculation to subtract whole amount
           totalSeconds = totalSeconds +second;//calculation to add new amount
       } 

       // Get Methods
       // get hour value
       public int getHour() 
       { 
          return totalSeconds/60/60; //calculation to find hour
       } 

       // get minute value
       public int getMinute() 
       { 
          return totalSeconds/60%60; //calculation to find minute
       } 

       // get second value
       public int getSecond() 
       { 
          return totalSeconds%60; //calculation to find seconds
       } 

       // convert to String in universal-time format (HH:MM:SS)
       public String toUniversalString()
       {
          return String.format(
             "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
       } 

       // convert to String in standard-time format (H:MM:SS AM or PM)
       public String toString()
       {
          return String.format("%d:%02d:%02d %s", 
             ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
             getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
       } 
}
