import java.time.LocalDateTime;
import java.util.Random;

public class company {
    employee employees[];
    int WeekWorkerNum;
    int MonthWorkerNum;
    int YearWorkerNum;
    public company()
    {
        LocalDateTime seed = LocalDateTime.now();
        Random random = new Random(seed.getNano());
        this.WeekWorkerNum = random.nextInt(10);
        this.MonthWorkerNum = random.nextInt(10);
        this.YearWorkerNum = random.nextInt(10);
        this.employees = new employee[this.YearWorkerNum+this.MonthWorkerNum+this.WeekWorkerNum];
        for(int i = 0 ; i < this.WeekWorkerNum ; i++)
        {
            this.employees[i] = new WeekWorker();
        }
        for(int i = this.WeekWorkerNum ; i < this.WeekWorkerNum+this.MonthWorkerNum ; i++)
        {
            this.employees[i] = new MonthWorker();
        }
        for(int i = this.WeekWorkerNum+this.MonthWorkerNum ; i < this.WeekWorkerNum+this.MonthWorkerNum+this.YearWorkerNum ; i++)
        {
            this.employees[i] = new YearWorker();
        }
    }
    public int salariesPay()
    {
        int sum = 0;
        for(int i = 0 ;i < this.employees.length;i++)
        {
            sum += this.employees[i].earning();
        }
        return sum;
    }
}
