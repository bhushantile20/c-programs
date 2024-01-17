//Define a class patient (patient_name, patient_age, patient_oxy_level,patient_HRCT_report). Create an object of patient. Handle appropriate exception while patient oxygen level less than 95% and HRCT scan report greater than 10, then throw user defined Exception “Patient is Covid Positive(+) and Need to Hospitalized” otherwise display its information.

import java.io.*;
class checkoxygenhrct extends Exception
{
	checkoxygenhrct(String msg)
	{
		super(msg);
	}
}

class patient
{
	String patient_name;
	int patient_age, patient_oxy_level,patient_hrct;


	public static void main(String args[])throws Exception
	{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	  System.out.println("Enter patient name:");
         String patient_name=br.readLine();
			
         System.out.println("Enter Age:");
	 int patient_age=Integer.parseInt(br.readLine());
			
         System.out.println("Enter Oxyegen Level:");
	 int patient_oxy_level=Integer.parseInt(br.readLine());

         System.out.println("Enter HRCT:");
	 int patient_hrct=Integer.parseInt(br.readLine());

	try
	{
		if(patient_oxy_level<95 && patient_hrct>10)	
throw new checkoxygenhrct("Patient is Covid Positive(+) and Need to Hospitalized");
		else
			System.out.println("PAtient is Fine");
	}
	catch(checkoxygenhrct e)
	{
		 System.out.println("Alert:"+e.getMessage());
	}	
    }			
}
