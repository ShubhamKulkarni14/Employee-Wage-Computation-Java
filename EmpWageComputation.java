public interface EmpWageComputation
{

	 public void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth);
	 public void computeEmpWage();
	 public int computeEmpWage(CompanyEmpWage companyEmpWage);
}
