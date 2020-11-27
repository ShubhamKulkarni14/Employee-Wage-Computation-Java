class EmpWageComputation
{
 	public static final int WAGE_PER_HR=20,PART_TIME=1,FULL_DAY=2;
    	public static void main(String args[])
	{
        	int random=(int)Math.floor(Math.random()*10)%3;
         	int workingHr=0,salary=0;
          	switch (random) 
	 	{
            	case FULL_DAY :
			{
                		System.out.println("EMPLOYEE PRESENT FOR FULL DAY");
                		workingHr=8;
                		break;
			}
            	case PART_TIME :
			{
                		System.out.println("EMPLOYEE PRESENT FOR HALF DAY");
                		workingHr=4;
                		break;
			}
            	default :
			{
                		System.out.println("EMPLOYEE IS ABSENT");
                		break;
        		}
        		salary=WAGE_PER_HR*workingHr;
        		System.out.println("EMPLOYEE WAGE : "+salary);
    		}
	}
}
