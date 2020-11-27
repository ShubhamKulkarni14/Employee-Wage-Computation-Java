class EmpWageComputation
{
    public static final int WAGE_PER_HR=20,PART_TIME=1,FULL_DAY=2,MONTH=20;
    public static void main(String[] args)
    {
        int salary=0,workingHr=0,day=0;
        int totalWorkingHrs=0,totalSalary=0;
        while(day<=MONTH)
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
            	salary=WAGE_PER_HR*workingHr;
            	totalWorkingHrs+=workingHr;
            	totalSalary+=salary;
            	day++;
        }
        System.out.println("EMPLOYEE WAGE : " + totalSalary);
    }
}
