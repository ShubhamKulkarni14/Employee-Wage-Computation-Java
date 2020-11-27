class EmpWageComputation
{
        public static final int WAGE_PER_HR=20,HALF_DAY=1,FULL_DAY=2;
        public static void main(String args[])
        {
                int random=(int)Math.floor(Math.random()*10)%3;
                int workingHr=0,salary=0;
                if(random == FULL_DAY)
                {
                        System.out.println("Employee is PRESENT for Full Day");
                        workingHr=8;
		}
                else
		{
                        System.out.println("employee is absent");
		}
                salary=WAGE_PER_HR*workingHr;
                System.out.println("Employee Wage: "+salary);
        }
}
