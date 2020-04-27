package Week3.FRQ2;

public class Airplane {
    public boolean maintenanceNeeded(int currMonth, int currYear)
    {
        if(currYear - this.getYearMaintained >= 1)
            return false;
        else if(this.getMonthMaintained() > currMonth)
            return false;
        for (int i = flights.size() - 1; i <= flights.size() - 4; i--)
            return flights.get(i).hasMechanicalIssue();
    }
}
