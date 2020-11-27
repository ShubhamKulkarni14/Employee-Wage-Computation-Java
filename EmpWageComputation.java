class EmpWageComputation
{
    public static final int WAGE_PER_HR=20,PART_TIME=1,FULL_DAY=2,MONTH=20,MAX_HRS=100;
    public static void main(String args[])
    {
        int salary=0,workingHr=0,day=0;
        int totalWorkingHrs=0,totalSalary=0;
        while(day<=MONTH && totalWorkingHrs<MAX_HRS)
        {
            int random = (int) Math.floor(Math.random() * 10) % 3;
            switch (random) 
		{
                	case FULL_DAY:
            		{
				workingHr = 8;
                   	 	break;
			}
                	case PART_TIME:
			{
                    		workingHr = 4;
                    		break;
        		}
			default:
                    	break;
            	}
            	if(totalWorkingHrs==96 || totalWorkingHrs == 98)
            	{
                	if (workingHr==8)
                    	break;
            	}
            	else if(totalWorkingHrs==98)
            	{
                	break;
            	}
            	salary=WAGE_PER_HR*workingHr;
            	totalWorkingHrs+=workingHr;
            	totalSalary+=salary;
            	day++;
        }
        System.out.println("EMPLOYEE WAGE : " + totalSalary);
        System.out.println("Days "+day+" Hours "+totalWorkingHrs);
    }
}
